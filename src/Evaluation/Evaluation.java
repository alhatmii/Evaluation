package Evaluation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Evaluation {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int counter = 0;

		boolean f = true;
		while (f) {

			System.out.println("1- Print 5 PDF Files.");
			System.out.println("2- Search (Empty).");
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
