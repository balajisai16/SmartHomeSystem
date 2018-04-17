package model;

import java.awt.Container;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.JPanel;

import controller.GraphicViewController;
import view.ControlPanelView;
import view.GraphicalLayout;

public class GloabalVariables implements Serializable{

	public static Container container = null;
	public static JPanel mainPanelG = null;
	public static JPanel configPanelG= null;
	public static SelectedArea selectedAreaG = null;
	public static String selectedSchedule = null;
	public static int fireDetectCount=0;
	public static int intrusionDetectedCount = 0;
	public static HomeOwnerDetails homeG = null;
	public static GraphicViewController gContG = null;
	//public static ControlPanelView viewG =null;
	public static int fDetected =0;
	public static int iDetected = 0;
	public static Logger logger = Logger.getLogger("MyLog");  
    public static FileHandler fh;
	
	public static void log() {  
		  

	    try {  

	        // This block configure the logger with handler and formatter  
	        fh = new FileHandler("MyLogFile.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);  

	        // the following statement is used to log any messages  
	        //logger.info("My first log");  

	    } catch (SecurityException e1) {  
	        e1.printStackTrace();  
	    } catch (IOException e2) {  
	        e2.printStackTrace();  
	    }  

	    //logger.info("Hi How r u?"); 
		}
	
}
