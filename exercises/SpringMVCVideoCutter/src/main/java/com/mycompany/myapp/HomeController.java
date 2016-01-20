package com.mycompany.myapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
/*public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@
	@RequestMapping(value = "/uploadVideo", method = RequestMethod.POST)
	pubic ModelAndView main(){
		return new ModelAndView()
	}
	public void uploadVideo(ServletContextEvent servletContextEvent){
		String rootPath = System.getProperty("catalina.home");
		ServletContext ctx = servletContextEvent.getServletContext();
		String relativePath = ctx.getInitParameter("tempfile.dir");
		File file = new File(rootPath + File.separator + relativePath);
		ctx.setAttribute("FILES_DIR_FILE", file);
		ctx.setAttribute("FILES_DIR", rootPath + File.separator + relativePath);
		
		DiskFileItemFactory fileFactory = new DiskFileItemFactory();
		File filesDir = (File) getServletContext().getAttribute("FILES_DIR_FILE");
		fileFactory.setRepository(filesDir);
		this.uploader = new ServletFileUpload(fileFactory);
	}
	
	//the video is saved to a folder uploads?
	
	/*public String save(HttpServletRequest request) {
		
		try{
			String path = request.getRealPath("/uploadVideo");
			path = path.substring(0,path.indexOf("\\build"));
			path = path + ("\\uploads");
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			// Parse the request
			FileItem video = (FileItem) upload.parseRequest(request);
			video.write(new File(path + "/" + "uploads"));
		} catch (Exception e){
				e.printStackTrace();
		}
		return path + System.out.println;

		//@RequestMapping(value = "/pickFrames")
		//OpenCV Integration
		
		//@RequestMapping(value = "/addBorder")
		//
	}
	
/*	
		@RequestMapping(method = RequestMethod.POST)
		public String create(Upload uploadItem, HttpServletRequest request,HttpServletResponse response,HttpSession session )
		{ 
			try {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
				factory.setRepository(repository);				
				ServletFileUpload upload = new ServletFileUpload(factory);

				// Parse the request
				List<FileItem> items = upload.parseRequest(request);
				
				/*MultipartFile file = uploadItem.getFileData();
				//potentially rename uploadItem to video
							InputStream inputStream = null;
							OutputStream outputStream = null;
							if (file.getSize() > 0) {
							inputStream = file.getInputStream();
							// File realUpload = new File("C:/");
							outputStream = new FileOutputStream(path + "/" + file.getOriginalFilename());
							outputStream.close();
							inputStream.close();
							session.setAttribute("uploadFile", path + file.getOriginalFilename());
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
		return "redirect/uploadProcessed";
			
		}
		
	} */
				
} 
