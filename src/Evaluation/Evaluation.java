package Evaluation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Evaluation {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int counter = 0;

		boolean f = true;
		while (f) {

			System.out.println("1- Print 5 PDF Files.");
			System.out.println("2- Read from existing pdf file.");
			System.out.println("3- Empty.");
			System.out.println("4- Exit");

			int choice = sc.nextInt();

			if (choice == 1) {

				try {
					for (int i = 0; i < 5; i++) {
						System.out.println(i);
						Document document = new Document();
						PdfWriter.getInstance(document, new FileOutputStream(counter + " Evaluation.pdf"));
						document.open();
						document.add(new Paragraph("Hello World"));
						document.add(new Paragraph(" "));
						document.add(new Paragraph("This File is number: " + counter));
						System.out.println("Please, Write Desired Sentence:");
						String Write = sc.next();
						document.add(new Paragraph(Write));
						document.close();

						counter = counter + 1;
					}
				} catch (DocumentException e) {
					e.printStackTrace();

				}
			}

			else if (choice == 2) {
				try {
				
					// Create PdfReader instance.
					PdfReader pdfReader = new PdfReader(
							"C:\\Users\\Lenovo\\eclipse-workspace\\Evaluation\\0 Evaluation.pdf");

					// Get the number of pages in pdf.
					int pages = pdfReader.getNumberOfPages();

					
					// Iterate the pdf through pages.
					for (int i = 1; i <= pages; i++) {
						// Extract the page content using PdfTextExtractor.
						String pageContent = PdfTextExtractor.getTextFromPage(pdfReader, i);

						System.out.println("\n");
						// Print the page content on console.
						System.out.println("Content on Page " + i + ": " + pageContent);
						System.out.println("\n");
					}

					// Close the PdfReader.
					pdfReader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			else if (choice == 3) {

				
			}

//			 Exiting the menu:
			else if (choice == 4) {
				f = false;

				System.out.println("See you next time!");
			}

//			 When Entering larger value:
			else {
				System.out.println("Re-Enter the right value.");
			}
		}
	}
}
