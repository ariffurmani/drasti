/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drasti.java;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author F. Arif
 */
public class barco {
   public static String crackImage(String filePath) {  
    File imageFile = new File(filePath);  
    ITesseract instance = new Tesseract();  
    try {  
        String result = instance.doOCR(imageFile);  
        return result;  
    } catch (TesseractException e) {  
        System.err.println(e.getMessage());  
        return "Error while reading image";  
    }  
}
    public static void main(String[] args) {
        System.out.println(crackImage("D:\\Project\\cropped\\new.jpg"));
    }
    
}
