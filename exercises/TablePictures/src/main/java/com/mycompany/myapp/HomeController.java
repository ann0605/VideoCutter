package com.mycompany.myapp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.swing.text.TableView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(){
		return "uploadvideo";
	}
	
///*/*	public void getFilePath(){
//		String path = 
//	}*/
//	private static final String IMAGES = "images";
//    private static final String TOMCAT_HOME_PROPERTY = "catalina.home";
//    private static final String TOMCAT_HOME_PATH = System.getProperty(TOMCAT_HOME_PROPERTY);
//    private static final String IMAGES_PATH = TOMCAT_HOME_PATH + File.separator + IMAGES;
//
//    private static final File IMAGES_DIR = new File(IMAGES_PATH);
//    private static final String IMAGES_DIR_ABSOLUTE_PATH = IMAGES_DIR.getAbsolutePath() + File.separator;
//    private static final String FAILED_UPLOAD_MESSAGE = "You failed to upload [%s] because the file because %s";
//    private static final String SUCCESS_UPLOAD_MESSAGE = "You successfully uploaded file = [%s]";
//
//    
//
//    @RequestMapping(value = "/viewframes", method = RequestMethod.POST)
//    public ModelAndView uploadFileHandler(@RequestParam("name") String name,
//                                      @RequestParam("file") MultipartFile file) {
//        ModelAndView modelAndView = new ModelAndView("hardCodedHome");
//            createDirIfNeeded();
//            modelAndView.addObject("message", createImage(name, file));
//
//            modelAndView.addObject("path", IMAGES_DIR_ABSOLUTE_PATH + name +".jpg");
//
//            
//        return modelAndView;
//    }
//
//    private void createDirIfNeeded() {
//        if (!IMAGES_DIR.exists()) {
//        	IMAGES_DIR.mkdirs();
//        }
//    }
   /* private String createImage(String name, MultipartFile file) {
    	try {
            File image = new File(IMAGES_DIR_ABSOLUTE_PATH + name);
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(image));
            stream.write(file.getBytes());
            stream.close();

            return String.format(SUCCESS_UPLOAD_MESSAGE, name);
        } catch (Exception e) {
            return String.format(FAILED_UPLOAD_MESSAGE, name, e.getMessage());
        }
    	

  
        }*/

  /*  @RequestMapping(value = "/image/{imageName}")
    @ResponseBody
    public byte[] getImage(@PathVariable(value = "imageName") String imageName) throws IOException {
        createDirIfNeeded();

        File serverFile = new File(IMAGES_DIR_ABSOLUTE_PATH + imageName + ".jpg");

        return serverFile.getPath();
        //return Files.readAllBytes(serverFile.toPath());*/
    
    }
	
	/*public void sizeOfFile(){
		 String path = "source";
		 ModelAndView mv = new ModelAndView("/viewframes"); 
		 File f = new File("source");
		 File[] list = f.listFiles();
		 mv.addObject("size", Integer.toString(list.length));
		 mv.addObject("images", list);
		 //mv.addAttribute("size", Integer.toString(list.length));
		 
		 //Checking for the checkbox
		 List<BufferedImage> images = new ArrayList<BufferedImage>()
				 images.add(image);		}
	
*/	
	
