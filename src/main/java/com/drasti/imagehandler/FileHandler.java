package com.drasti.imagehandler;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileHandler {
//	String filepath = "";
	public String uploader(HttpServletRequest request,HttpServletResponse response, String filepath) {
		String filename = "";
		
		try {

			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload sf = new ServletFileUpload(factory);
			List<FileItem> fileitem = sf.parseRequest(request);
			
			for(FileItem file:fileitem) {
				filename = file.getName();
				file.write(new File(filepath+filename));
			}
			
			File file = new File(filepath+filename);
		} catch (Exception e) {
			System.out.println(e);
		}
		return filename;
	}

}
