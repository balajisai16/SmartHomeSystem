package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GloabalVariables;
import model.HomeOwnerDetails;
import model.SelectedArea;
import view.ConfigView;
import view.LoginPage;

public class LoginController {
	
	LoginPage login;
	HomeOwnerDetails home;
	String password ="";
	boolean isValidated;
	ConfigView cv;
	public LoginController(LoginPage l ,HomeOwnerDetails h) {
		
		login = l;
		home = h;
		initController();
		
	}

	private void initController() {
		
		login.getUserNameLabel().addActionListener(e->getUserName());
		login.getPasswordLabel().addActionListener(e->getPassword());
		login.getBtnLogin().addActionListener(e->validateUser());
//		login.getTextFieldAddress().addActionListener(e->home.setAddress(login.getTextFieldAddress().getText()));
//		login.getTextFieldCustomerName().addActionListener(e->home.setName(login.getTextFieldCustomerName().getText()));
//		login.getTextFieldContact1().addActionListener(e->home.setContactNumber1(login.getTextFieldContact1().getText()));
//		login.getTextFieldContact2().addActionListener(e->home.setContactNumber2(login.getTextFieldContact2().getText()));
//		login.getTextFieldCustomerPhone().addActionListener(e->home.setCustomerPhoneNumber(login.getTextFieldCustomerPhone().getText()));
		login.getButtonRegisterCustomer().addActionListener(e->resgister());
	}

	
	
	private void resgister() {
		
		home.setAddress(login.getTextFieldAddress().getText());
		home.setName(login.getTextFieldCustomerName().getText());
		home.setContactNumber1(login.getTextFieldContact1().getText());
		home.setContactNumber2(login.getTextFieldContact2().getText());
		home.setCustomerPhoneNumber(login.getTextFieldCustomerPhone().getText());
		
		System.out.println("Register");
		
	}

	private void validateUser() {
		
		password = login.getPasswordLabel().getText();
		isValidated = home.userValidate(password);
		
		System.out.println(isValidated);
		if(isValidated)
		{
			login.getMainPanel().setVisible(false);
			//login.getContainer().add(new ConfigView());
			cv  = new ConfigView();
			SelectedArea s;
			if(GloabalVariables.selectedAreaG == null)
				 s = new SelectedArea();
			else
				 s = GloabalVariables.selectedAreaG;
			
			GloabalVariables.container.add(cv);
			ConfigControl cc= new ConfigControl(s,cv);
		}
	}
	

	private void getPassword() {
		
		password =login.getPasswordLabel().getText();
		home.setUserName(password);
		System.out.println(password);
		
	}

	private void getUserName() {
		
		home.setPassword(login.getUserNameLabel().getText());
	}
	
	

}
