package com.fpt.practice;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

//http://answers.opencv.org/question/12381/split-video-to-images-opencv-245/
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
public class Splitter {
	public void main(String[] args ){
		VideoCapture videoCapture = new VideoCapture("filename");
        //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		int fps = (int) cvGetCaptureProperty(capture, CV_CAP_PROP_FPS);
		System.out.printf("FPS:%d", fps);
		Mat frame = null;
		int frameNumber = 0;
		String fileName = "";
		ArrayList<BufferedImage> images = new ArrayList<BufferedImage> ();

		//convert mat frame into buffered image
		while (videoCapture!=empty){
			frame = cvQueryFrame(capture);
			MatOfByte bytemat = new MatOfByte();
			Highgui.imencode(".jpg", frame, bytemat);
			byte[] bytes = bytemat.toArray();
			InputStream in = new ByteArrayInputStream(bytes);
			BufferedImage img = ImageIO.read(in);
			images.add(img);
			fileName = "frame" + Integer.toString(frameNumber); 
			//save the file to a folder
			imwrite("/resources/processed/" + fileName);
			frameNumber++;
		}
		
	}
}
