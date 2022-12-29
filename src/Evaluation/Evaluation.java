package Evaluation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Evaluation {

	public static void main(String[] args) throws FileNotFoundException {
		int counter = 0;
		
		try {
//			for ()
			
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(counter + " Evaludwation.pdf"));
			document.open();
			document.add(new Paragraph("Hello World"));
			document.close();
			
			counter = counter + 1;

		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
