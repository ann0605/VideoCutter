package com.fpt.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA_2_3.portable.OutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

@RequestMapping("/download.do")
public class DonwloadController {
private static final int BUFFER_SIZE = 4096;
private String filePath = "/downloads/";
@RequestMapping(method = RequestMethod.POST)
public void doDownload(HttpServletRequest request, HttpServletResponse response) throws IOException{
	
	ServletContext context = request.getSession().getServletContext();
	String path = context.getContextPath(); //path of the web application
	String fullPath = path + filePath;
	File downloadFile = new File(fullPath);
	FileInputStream fis = new FileInputStream(downloadFile); // where is the file coming from for the stream?
	
	//why should i get mime type? for the browser to understand the file type
	String mimeType = context.getMimeType(fullPath);
	response.setContentType(mimeType);
	String headerKey = "Content-Disposition";
	String headerValue = String.format("attachment; filename = \"%s\"", downloadFile.getName());
	response.setHeader(headerKey,headerValue);
	ServletOutputStream os = response.getOutputStream();
	byte[] buffer = new byte[BUFFER_SIZE];
	int bytesRead = -1;
	while( fis.read(buffer) != -1){
		os.write(buffer, 0, bytesRead);
	}
	fis.close();
	os.close();
	//also create spring confi
	
}

}
