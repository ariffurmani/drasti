package com.drasti.imagehandler;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageSize {
	public static Boolean checkSize(BufferedImage image) throws IOException {
      
      int height = image.getHeight();
      int width  = image.getWidth();
      
      if(height >= 1500 && width >=1100){
          return true;
      }else{
          return false;
      }
  }
  public static BufferedImage resize(BufferedImage img, int height, int width) throws IOException {
	  
      Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
      BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
      Graphics2D g2d = resized.createGraphics();
      g2d.drawImage(tmp, 0, 0, null);
      g2d.dispose();
      return resized;
  }
  

}
