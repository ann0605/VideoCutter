package com.mycompany.myapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
	private static File video = null;
	@RequestMapping(value = "/uploadvideo",method = RequestMethod.POST)
	public @ResponseBody void uploadVideo( HttpServletRequest request, HttpServletResponse response){
		
	
	//ServletContextEvent servletContextEvent,HttpServletRequest request, HttpServletResponse response){
		try{
			//CREATE A FILE DIRECTORY FOR STORAGRE OF THE UPLOADED VIDEOS
			final String filesDir = "webapps/uploads";
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(filesDir);
			//
			/*ServletFileUpload uploader = new ServletFileUpload(factory);
			List<FileItem> fileItemsList = upload.parseRequest(request);
			File uploadedFile = new File()
			//List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request));
			/*String root = System.getProperty("catalina.home");
			ServletContext context = servletContextEvent.getServletContext();
			String path = context.getInitParameter("tempfile.dir");
			//where you will put the file 
			File file  = new File(root + File.separator + path);
			context.setAttribute("FILES_DIR_FILE", file); //file itself?
			context.setAttribute("FILES_DIR", root + File.separator + path);
			*/

			//Save the file
			//File video = null;
			String fileName = null;
			ServletFileUpload uploader = new ServletFileUpload(factory);
			List<FileItem> fileItemsList = uploader.parseRequest(request);
			for (FileItem fileItem : fileItemsList){
				 fileName = fileItem.getName();
				 video = new File(filesDir + File.separator + fileName);
				 fileItem.write(video);
			}
			
	
			//OUTPUT THE FILE 
			InputStream fis = new FileInputStream(video);
			response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
			response.setHeader("Content-Disposition", "attachment; filename=\" " + fileName);
	        IOUtils.copy(fis, response.getOutputStream());
	        response.flushBuffer();
		} catch (Exception e){
				e.printStackTrace();
		}
	}
	//WHAT HAPPENS WHEN YOU CLICK UPLOAD
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public void viewFrames(){
		//process using openCV
		
		
	}
}