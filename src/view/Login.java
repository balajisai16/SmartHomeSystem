package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Login {

        private JFrame frame;
        private JTextField textFieldUserName;
        private JTextField textFieldPassword;
        private JTextField textFieldCustomerName;
        private JTextField textFieldAddress;
        private JTextField textFieldContact1;
        private JTextField textFieldContact2;
        private JTextField textFieldCustomerPhone;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        Login window = new Login();
                                        window.frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        /**
         * Create the application.
         */
        public Login() {
                initialize();
        }

        /**
         * Initialize the contents of the frame.
         */
        private void initialize() {
                frame = new JFrame();
                frame.setBounds(100, 100, 921, 581);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

                JPanel panel = new JPanel();
                panel.setBackground(new Color(224, 255, 255));
                frame.getContentPane().add(panel);
                panel.setLayout(null);

                JLabel lblWelcomeToSo = new JLabel("Welcome ");
                lblWelcomeToSo.setBackground(new Color(255, 255, 255));
                lblWelcomeToSo.setForeground(new Color(105, 105, 105));
                lblWelcomeToSo.setFont(new Font("Heiti TC", Font.BOLD, 24));
                lblWelcomeToSo.setBounds(89, 56, 235, 29);
                panel.add(lblWelcomeToSo);

                JLabel lblUserName = new JLabel("User Name");
                lblUserName.setFont(new Font("Heiti TC", Font.PLAIN, 18));
                lblUserName.setForeground(new Color(105, 105, 105));
                lblUserName.setBounds(28, 141, 111, 29);
                panel.add(lblUserName);

                JLabel lblPassword = new JLabel("Password");
                lblPassword.setForeground(new Color(105, 105, 105));
                lblPassword.setFont(new Font("Heiti TC", Font.PLAIN, 18));
                lblPassword.setBounds(28, 241, 111, 29);
                panel.add(lblPassword);

                textFieldUserName = new JTextField();
                textFieldUserName.setBounds(212, 143, 130, 26);
                panel.add(textFieldUserName);
                textFieldUserName.setColumns(10);

                textFieldPassword = new JTextField();
                textFieldPassword.setBounds(212, 243, 130, 26);
                panel.add(textFieldPassword);
                textFieldPassword.setColumns(10);

                JButton btnLogin = new JButton("Login");
                btnLogin.setFont(new Font("Heiti TC", Font.BOLD, 15));
                btnLogin.setForeground(new Color(105, 105, 105));
                btnLogin.setBounds(111, 303, 117, 29);
                panel.add(btnLogin);

                JLabel lblNewUser = new JLabel("New User?");
                lblNewUser.setForeground(new Color(105, 105, 105));
                lblNewUser.setFont(new Font("Heiti TC", Font.PLAIN, 14));
                lblNewUser.setBounds(61, 381, 77, 21);
                panel.add(lblNewUser);

                JButton btnRegister = new JButton("Register");
                btnRegister.setForeground(new Color(105, 105, 105));
                btnRegister.setFont(new Font("Heiti TC", Font.BOLD, 15));
                btnRegister.setBounds(174, 378, 117, 29);
                panel.add(btnRegister);

                JPanel panel_1 = new JPanel();
                panel_1.setBackground(new Color(128, 128, 128));
                panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(95, 158, 160), null, null, null));
                panel_1.setBounds(0, 0, 913, 44);
                panel.add(panel_1);

                JLabel label = new JLabel("SoSafe Home Security System");
                label.setForeground(new Color(255, 250, 250));
                label.setFont(new Font("Heiti TC", Font.BOLD, 24));
                panel_1.add(label);

                JPanel panel_2 = new JPanel();
                panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
                panel_2.setBackground(new Color(224, 255, 255));
                panel_2.setBounds(447, 56, 466, 497);
                panel.add(panel_2);
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

                JButton buttonRegisterCustomer = new JButton("Register");
                buttonRegisterCustomer.setForeground(new Color(105, 105, 105));
                buttonRegisterCustomer.setFont(new Font("Heiti TC", Font.BOLD, 15));
                buttonRegisterCustomer.setBounds(146, 436, 117, 29);
                panel_2.add(buttonRegisterCustomer);
        }
}
