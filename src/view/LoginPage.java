package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.GloabalVariables;

public class LoginPage {

	private JFrame frame;
    private JTextField userNameLabel;
    private JTextField passwordLabel;
    private JButton btnLogin;
    private Container container; 
    private JPanel mainPanel;
	
	
    
	public JPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public JTextField getUserNameLabel() {
		return userNameLabel;
	}

	public void setUserNameLabel(JTextField userNameLabel) {
		this.userNameLabel = userNameLabel;
	}

	public JTextField getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(JTextField passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	JTextField textFieldCustomerName,textFieldAddress,textFieldContact1,textFieldContact2,textFieldCustomerPhone;
	JButton buttonRegisterCustomer;
	
	
	
	public JTextField getTextFieldCustomerName() {
		return textFieldCustomerName;
	}

	public void setTextFieldCustomerName(JTextField textFieldCustomerName) {
		this.textFieldCustomerName = textFieldCustomerName;
	}

	public JTextField getTextFieldAddress() {
		return textFieldAddress;
	}

	public void setTextFieldAddress(JTextField textFieldAddress) {
		this.textFieldAddress = textFieldAddress;
	}

	public JTextField getTextFieldContact1() {
		return textFieldContact1;
	}

	public void setTextFieldContact1(JTextField textFieldContact1) {
		this.textFieldContact1 = textFieldContact1;
	}

	public JTextField getTextFieldContact2() {
		return textFieldContact2;
	}

	public void setTextFieldContact2(JTextField textFieldContact2) {
		this.textFieldContact2 = textFieldContact2;
	}

	public JTextField getTextFieldCustomerPhone() {
		return textFieldCustomerPhone;
	}

	public void setTextFieldCustomerPhone(JTextField textFieldCustomerPhone) {
		this.textFieldCustomerPhone = textFieldCustomerPhone;
	}

	public JButton getButtonRegisterCustomer() {
		return buttonRegisterCustomer;
	}

	public void setButtonRegisterCustomer(JButton buttonRegisterCustomer) {
		this.buttonRegisterCustomer = buttonRegisterCustomer;
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	 
	private void initialize() {
		
        frame = new JFrame();
        frame.setBounds(100, 100, 921, 581);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GloabalVariables.container = frame.getContentPane();
        GloabalVariables.container.setLayout(new BoxLayout( GloabalVariables.container, BoxLayout.X_AXIS));

        mainPanel = new JPanel();
        GloabalVariables.mainPanelG = mainPanel;
        mainPanel.setBackground(new Color(175, 238, 238));
        mainPanel.setBounds(100, 100, 921, 581);
        GloabalVariables.container.add(mainPanel);
        mainPanel.setLayout(null);

        JLabel lblWelcomeToSo = new JLabel("Welcome to SoSafe Security System");
        lblWelcomeToSo.setBackground(new Color(255, 255, 255));
        lblWelcomeToSo.setForeground(new Color(105, 105, 105));
        lblWelcomeToSo.setFont(new Font("Heiti TC", Font.BOLD, 24));
        lblWelcomeToSo.setBounds(140, 6, 477, 40);
        mainPanel.add(lblWelcomeToSo);

        JLabel lblUserName = new JLabel("User Name");
        lblUserName.setFont(new Font("Heiti TC", Font.PLAIN, 18));
        lblUserName.setForeground(new Color(105, 105, 105));
        lblUserName.setBounds(58, 108, 111, 29);
        mainPanel.add(lblUserName);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(new Color(105, 105, 105));
        lblPassword.setFont(new Font("Heiti TC", Font.PLAIN, 18));
        lblPassword.setBounds(58, 218, 111, 29);
        mainPanel.add(lblPassword);

        userNameLabel = new JTextField();
        userNameLabel.setBounds(233, 110, 130, 26);
        mainPanel.add(userNameLabel);
        userNameLabel.setColumns(10);

        passwordLabel = new JTextField();
        passwordLabel.setBounds(233, 218, 130, 26);
        mainPanel.add(passwordLabel);
        passwordLabel.setColumns(10);

        btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Heiti TC", Font.BOLD, 15));
        btnLogin.setForeground(new Color(105, 105, 105));
        btnLogin.setBounds(151, 318, 117, 29);
        mainPanel.add(btnLogin);
        
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_2.setBackground(new Color(224, 255, 255));
        panel_2.setBounds(447, 56, 466, 497);
        mainPanel.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblCustomerName = new JLabel("Customer Name");
        lblCustomerName.setForeground(new Color(105, 105, 105));
        lblCustomerName.setFont(new Font("Heiti TC", Font.PLAIN, 15));
        lblCustomerName.setBounds(32, 89, 145, 27);
        panel_2.add(lblCustomerName);

        JLabel lblAddress = new JLabel("Address of the Property");
        lblAddress.setForeground(new Color(105, 105, 105));
        lblAddress.setFont(new Font("Heiti TC", Font.PLAIN, 15));
        lblAddress.setBounds(32, 152, 185, 34);
        panel_2.add(lblAddress);

        JLabel lblContactNumber1 = new JLabel("Contact Number 1");
        lblContactNumber1.setFont(new Font("Heiti TC", Font.PLAIN, 15));
        lblContactNumber1.setForeground(new Color(105, 105, 105));
        lblContactNumber1.setBounds(32, 226, 163, 27);
        panel_2.add(lblContactNumber1);

        JLabel lblContactNumber2 = new JLabel("Contact Number 2");
        lblContactNumber2.setFont(new Font("Heiti TC", Font.PLAIN, 15));
        lblContactNumber2.setForeground(new Color(105, 105, 105));
        lblContactNumber2.setBounds(32, 297, 145, 27);
        panel_2.add(lblContactNumber2);

        JLabel lblCustomerPhone = new JLabel("Customer Phone ");
        lblCustomerPhone.setFont(new Font("Heiti TC", Font.PLAIN, 15));
        lblCustomerPhone.setForeground(new Color(105, 105, 105));
        lblCustomerPhone.setBounds(32, 378, 132, 27);
        panel_2.add(lblCustomerPhone);

        textFieldCustomerName = new JTextField();
        textFieldCustomerName.setBounds(256, 89, 130, 26);
        panel_2.add(textFieldCustomerName);
        textFieldCustomerName.setColumns(10);

        textFieldAddress = new JTextField();  
        textFieldAddress.setBounds(256, 156, 130, 26);
        panel_2.add(textFieldAddress);
        textFieldAddress.setColumns(10);

        textFieldContact1 = new JTextField();
        textFieldContact1.setBounds(256, 226, 130, 26);
        panel_2.add(textFieldContact1);
        textFieldContact1.setColumns(10);

        textFieldContact2 = new JTextField();
        textFieldContact2.setBounds(256, 297, 130, 26);
        panel_2.add(textFieldContact2);
        textFieldContact2.setColumns(10);

        textFieldCustomerPhone = new JTextField();
        textFieldCustomerPhone.setBounds(256, 378, 130, 26);
        panel_2.add(textFieldCustomerPhone);
        textFieldCustomerPhone.setColumns(10);

        JLabel lblCustomerInformation = new JLabel("Customer Information");
        lblCustomerInformation.setForeground(new Color(105, 105, 105));
        lblCustomerInformation.setFont(new Font("Heiti TC", Font.BOLD, 19));
        lblCustomerInformation.setBounds(123, 0, 200, 34);
        panel_2.add(lblCustomerInformation);

        buttonRegisterCustomer = new JButton("Register");
        buttonRegisterCustomer.setForeground(new Color(105, 105, 105));
        buttonRegisterCustomer.setFont(new Font("Heiti TC", Font.BOLD, 15));
        buttonRegisterCustomer.setBounds(146, 436, 117, 29);
        panel_2.add(buttonRegisterCustomer);
        
       
        
//        btnRegister.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				panel.setVisible(false);
//				
//				 frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
//				
//				 frame.getContentPane().add(new ConfigView());
//				
//			}
//		});
		
	}
}
