/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drasti.java;

/**
 *
 * @author F. Arif
 */
import java.io.IOException;
import java.io.PrintWriter;
public class Converter {

    public static String OCR(String st, String ct) throws InterruptedException, IOException {
    String input_file="D:\\Project\\PDrasti\\IMAGES\\"+st;
    String output_file="D:\\Project\\PDrasti\\IMAGES\\"+ct;
    String tesseract_install_path="C:\\Program Files (x86)\\Tesseract-OCR\\tesseract";
    String[] command =
    {
        "cmd",
    };
    Process p;
 
    p = Runtime.getRuntime().exec(command);
        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
        new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
        PrintWriter stdin = new PrintWriter(p.getOutputStream());
        stdin.println("\""+tesseract_install_path+"\" \""+input_file+"\" \""+output_file+"\" -l eng");
        stdin.close();
        p.waitFor();
        String str = Read_File.read_a_file(output_file+".txt");
        System.out.println(str);
        return str; 
  }
 
    public static void ImageToText(String a, String b, String c) throws InterruptedException, IOException {
         String st1 = "1.jpg", st2 = "2.jpg", st3 = "3.jpg", st4 = "4.jpg", st5 = "5.jpg";
         String ct1 = "1", ct2 = "2", ct3 = "3", ct4 = "4", ct5 = "5";
         
//         System.out.println(OCR(st1,ct1));
//         System.out.println(OCR(st2,ct2));
//         System.out.println(OCR(st3,ct3));
//         System.out.println(OCR(st4,ct4));
//         System.out.println(OCR(st5,ct5));

        String bar = OCR(st5, ct5);
        String name = OCR(st1, ct1);
        String fname = OCR(st2, ct2);
         
        a = bar;
        b = name;
        c = fname;

    }
}


