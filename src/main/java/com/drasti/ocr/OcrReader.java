package com.drasti.ocr;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OcrReader {

	public static String[] ocrReader(String inputFilePath) {
		String[] fulltext = new String[5];
		try {
			Tesseract tesseract = new Tesseract();
			tesseract.setDatapath("D:\\Tesseract");
			for(int i=0; i<=4; i++) {
				String filename = i+".jpg";
				fulltext[i] = tesseract.doOCR(new File(inputFilePath+filename));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return fulltext;
	}

}
