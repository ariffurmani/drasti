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

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ResizeImage{

    public static Boolean ImageSize(File file) throws IOException {

//        File input = new File("D:\\Project\\demo.jpg"); //Take Image as Input
        BufferedImage image = ImageIO.read(file);
        
        int height = image.getHeight();
        int width  = image.getWidth();
        
        if(height >= 1500 && width >=1100){
            return true;
        }else{
            return false;
        }
    }
    public static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }
    
    
    

}
//        String[] barcodes = BarcodeScanner.Scan("D:\\Project\\0001.jpg", BarcodeType.Code39);
//        System.out.print(barcodes);