package Owner;

import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import javax.swing.JFrame;

import controller.LoginController;
import model.GloabalVariables;
import model.HomeOwnerDetails;
import model.SelectedArea;
import view.LoginPage;

public class Client {	
	
	static HomeOwnerDetails home;
	public static HomeOwnerDetails getHome() {
		return home;
	}
	public static void setHome(HomeOwnerDetails home) {
		Client.home = home;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.getFrame().setVisible(true);
					if(home == null)
						home = new HomeOwnerDetails();
					GloabalVariables.homeG = home;
					LoginController lc = new LoginController(window, home);
					GloabalVariables.log();
					GloabalVariables.logger.info("Main");
					window.getFrame().addWindowListener(new WindowListener() {
						
						@Override
						public void windowOpened(WindowEvent e) {
							// TODO Auto-generated method stub
							// read the object from file
							
							try {
						         FileInputStream fileIn = new FileInputStream("homeOwnerDetails.ser");
						         ObjectInputStream in = new ObjectInputStream(fileIn);
						         home = (HomeOwnerDetails) in.readObject();
						         GloabalVariables.homeG = home;
						         in.close();
						         fileIn.close();
						      }catch(IOException i) {
						         i.printStackTrace();
						         return;
						      }catch(ClassNotFoundException c) {
						         
						         c.printStackTrace();
						         return;
						      }	  
							
							try {
						         FileInputStream fileIn = new FileInputStream("selectedArea.ser");
						         ObjectInputStream in = new ObjectInputStream(fileIn);
						         GloabalVariables.selectedAreaG = (SelectedArea) in.readObject();
						         //GloabalVariables.homeG = home;
						         in.close();
						         fileIn.close();
						      }catch(IOException i) {
						         i.printStackTrace();
						         return;
						      }catch(ClassNotFoundException c) {
						         
						         c.printStackTrace();
						         return;
						      }	  
							
						}
						
						@Override
						public void windowIconified(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void windowDeiconified(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void windowDeactivated(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void windowClosing(WindowEvent e) {
							// TODO Auto-generated method stub
							
							try {
						         FileOutputStream fileOut =
						         new FileOutputStream("homeOwnerDetails.ser");
						         ObjectOutputStream out = new ObjectOutputStream(fileOut);
						         out.writeObject(GloabalVariables.homeG);
						         out.close();
						         fileOut.close();
						        // System.out.printf("Serialized data is saved in /tmp/employee.ser");
						      }catch(IOException i) {
						         i.printStackTrace();
						      }
							
							
							try {
						         FileOutputStream fileOut =
						         new FileOutputStream("selectedArea.ser");
						         ObjectOutputStream out = new ObjectOutputStream(fileOut);
						         out.writeObject(GloabalVariables.selectedAreaG);
						         out.close();
						         fileOut.close();
						        // System.out.printf("Serialized data is saved in /tmp/employee.ser");
						      }catch(IOException i) {
						         i.printStackTrace();
						      }
						}
						
						@Override
						public void windowClosed(WindowEvent e) {
							
							// save file
							
							
							
						}
						
						@Override
						public void windowActivated(WindowEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
