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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCropper {

	public static void cropping(BufferedImage originalImgage) {
		try {
			
//			System.out.println("Original Image Dimension: "+originalImgage.getWidth()+"x"+originalImgage.getHeight());

			BufferedImage SubImage1 = originalImgage.getSubimage(525, 455, 285, 35);
			BufferedImage SubImage2 = originalImgage.getSubimage(155, 495, 285, 35);
			BufferedImage SubImage3 = originalImgage.getSubimage(390, 540, 285, 35);
			BufferedImage SubImage4 = originalImgage.getSubimage(825, 500, 135, 35);
			BufferedImage SubImage5 = originalImgage.getSubimage(725, 185, 315, 35);
//			System.out.println("Cropped Image Dimension: "+SubImgage.getWidth()+"x"+SubImgage.getHeight());

			File outputfile1 = new File("D:/Project/PDrasti/IMAGES/1.jpg");
			ImageIO.write(SubImage1, "jpg", outputfile1);
                        
			File outputfile2 = new File("D:/Project/PDrasti/IMAGES/2.jpg");
			ImageIO.write(SubImage2, "jpg", outputfile2);
                        
			File outputfile3 = new File("D:/Project/PDrasti/IMAGES/3.jpg");
			ImageIO.write(SubImage3, "jpg", outputfile3);
                        
			File outputfile4 = new File("D:/Project/PDrasti/IMAGES/4.jpg");
			ImageIO.write(SubImage4, "jpg", outputfile4);
                        
			File outputfile5 = new File("D:/Project/PDrasti/IMAGES/5.jpg");
			ImageIO.write(SubImage5, "jpg", outputfile5);

//			System.out.println("Image cropped successfully: "+outputfile.getPath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
