package com.wu.fund.doc;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.docx4j.convert.out.pdf.PdfConversion;
import org.docx4j.convert.out.pdf.viaXSLFO.PdfSettings;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.junit.Test;

public class DocxPdfConverter {

	@Test
	public void test() {
		
		createPDF();
	}
	
	private static void createPDF() {
        try {
            long start = System.currentTimeMillis();
            String docPath = "D:\\temp\\doc\\aa.docx";
            String pdfPath = "D:\\temp\\doc\\bb.pdf";
            // 1) Load DOCX into WordprocessingMLPackage
//            InputStream is = new FileInputStream(new File(
//                    "docx/HelloWorld.docx"));
            InputStream is = new FileInputStream(new File(
            		docPath));
            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage
                    .load(is);
 
            // 2) Prepare Pdf settings
            PdfSettings pdfSettings = new PdfSettings();
 
            // 3) Convert WordprocessingMLPackage to Pdf
//            OutputStream out = new FileOutputStream(new File(
//                    "pdf/HelloWorld.pdf"));
            OutputStream out = new FileOutputStream(new File(
            		pdfPath));            
            PdfConversion converter = new org.docx4j.convert.out.pdf.viaXSLFO.Conversion(
                    wordMLPackage);
            converter.output(out, pdfSettings);
 
            System.err.println("Generate pdf/HelloWorld.pdf with "
                    + (System.currentTimeMillis() - start) + "ms");
 
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
