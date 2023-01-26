package com.drasti.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drasti.dao.DBConnector;
import com.drasti.imagehandler.FileHandler;
import com.drasti.imagehandler.ImageCropper;
import com.drasti.imagehandler.ImageSize;
import com.drasti.ocr.OcrReader;

/**
 * Servlet implementation class UploadController
 */
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		// Getting filepath from ServletContext
		ServletContext ctx = getServletContext();
		String filepath = ctx.getInitParameter("filepath");
		String croppedfilepath = ctx.getInitParameter("croppedfilepath");

		// Uploading File using FileHandler
		FileHandler fp = new FileHandler();
		String filename = fp.uploader(request, response, filepath);

		// Taking file as input
		File file = new File(filepath + filename);

		BufferedImage image = ImageIO.read(file);

		// Checking minimum size of the file
		if (ImageSize.checkSize(image)) {

			// Set new size for Image processing
			BufferedImage resizedImage = ImageSize.resize(image, 1500, 1100);

			// Cropping the image
			ImageCropper.cropping(resizedImage, croppedfilepath);

			// Extracting text using OCR
			String data[] = OcrReader.ocrReader(croppedfilepath);

			// Validating data from database
			if (DBConnector.checkData(data)) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Match Found');");
				out.println("location='index.jsp';");
				out.println("</script>");
			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Match Not Found');");
				out.println("location='index.jsp';");
				out.println("</script>");
			}

		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Invalid image size');");
			out.println("location='index.jsp';");
			out.println("</script>");
		}

	}

}