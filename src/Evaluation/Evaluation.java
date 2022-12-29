package Evaluation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
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
//					Creation of File Descriptor for input file
//					File SearchWord = new File("History Inputs.txt"); 

					File SearchWord = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Evaluation");

//					Intialize the word Array
					String[] Files = null;

//				    Creation of File Reader object
					FileReader fr = new FileReader(SearchWord);

//					Creation of BufferedReader object
					BufferedReader br = new BufferedReader(fr);

					String s;

					System.out.println("Please Enter the word you want to search:");
//				    Input word to be searched
					String WordInput = sc.next();

//				    Intialize the word to zero
					int count = 0;

//				    Reading Content from the file
					while ((s = br.readLine()) != null) {

//				   	Split the word using space
						Files = s.split(" ");

//				 	Search for the given word
						for (String word : Files) {
							if (word.equalsIgnoreCase(WordInput)) {
								count++;
							}
						}
					}

//				    Check for count not equal to zero
					if (count != 0) {
						System.out.println("\n");
						System.out.println("--------------------------------------------------");
						System.out.println(
								"The given word |" + WordInput + "| is present for (" + count + ") Times in the file");
						System.out.println("--------------------------------------------------");
						System.out.println("\n");

					} else {
						System.out.println("\n");
						System.out.println("--------------------------------------------------");
						System.out.println("The given word is not present in the file");
						System.out.println("--------------------------------------------------");
						System.out.println("\n");

					}

					fr.close();
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
