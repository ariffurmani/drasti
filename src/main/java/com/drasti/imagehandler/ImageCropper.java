package com.drasti.imagehandler;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageCropper {
	public static void cropping(BufferedImage originalImgage, String filepath) {
		try {
			
//			System.out.println("Original Image Dimension: "+originalImgage.getWidth()+"x"+originalImgage.getHeight());

			BufferedImage SubImage1 = originalImgage.getSubimage(525, 455, 285, 35);
			BufferedImage SubImage2 = originalImgage.getSubimage(155, 495, 285, 35);
			BufferedImage SubImage3 = originalImgage.getSubimage(390, 540, 285, 35);
			BufferedImage SubImage4 = originalImgage.getSubimage(825, 500, 135, 35);
			BufferedImage SubImage5 = originalImgage.getSubimage(725, 185, 315, 35);
//			System.out.println("Cropped Image Dimension: "+SubImgage.getWidth()+"x"+SubImgage.getHeight());

			File outputfile1 = new File(filepath+"1.jpg");
			ImageIO.write(SubImage1, "jpg", outputfile1);
                        
			File outputfile2 = new File(filepath+"2.jpg");
			ImageIO.write(SubImage2, "jpg", outputfile2);
                        
			File outputfile3 = new File(filepath+"3.jpg");
			ImageIO.write(SubImage3, "jpg", outputfile3);
                        
			File outputfile4 = new File(filepath+"4.jpg");
			ImageIO.write(SubImage4, "jpg", outputfile4);
                        
			File outputfile5 = new File(filepath+"0.jpg");
			ImageIO.write(SubImage5, "jpg", outputfile5);

//			System.out.println("Image cropped successfully: "+outputfile1.getPath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
