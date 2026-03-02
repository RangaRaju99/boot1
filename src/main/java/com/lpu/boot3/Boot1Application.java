package com.lpu.boot3;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot1Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Boot1Application.class, args);
		
//		File file=new File("C:/Users/hp/Downloads/Servlet.pdf");
//	PDDocument document=PDDocument.load(file);
//	
//	PDFTextStripper stripper=new PDFTextStripper();
//	int totalPages=document.getNumberOfPages();
//	
//	for(int i=1;i<=totalPages;i++) {
//		
//		stripper.setStartPage(i);
//		stripper.setEndPage(i);
//		
//		String search="while we could";
//		String pageText=stripper.getText(document).toLowerCase();
//		
//		if(pageText.contains(search)) {
//			System.out.println("Found on page: "+i);
//		}
//	}
//	
//	document.close();
//	System.out.println("end");
//	
//	
	}

}
