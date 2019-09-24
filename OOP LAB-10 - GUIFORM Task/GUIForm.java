package OOP.Lab.GUI;

import javax.swing.*;
import java.awt.*;

class GUIForm extends JFrame{
    
    private static final long serialVersionUID = 1L;
    // TEXT FIELDS
    JTextArea addressBox = new JTextArea();
    JTextField nameBox = new JTextField(8);
    JTextField phoneBox = new JTextField(15);
    JTextField emailBox = new JTextField(20);
    JPasswordField passwordBox = new JPasswordField(10);
    JComboBox cityBox;
    
    //BUTTONS
    JButton save,clear;
    JRadioButton male,female;
	
	//LAYOUT
    BoxLayout b;
    
    public GUIForm()
    {
        initGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        pack();
        
    }
    
     public void initGUI()
     {
         JPanel mainPanel = new JPanel();
         getContentPane().add(mainPanel);
         b = new BoxLayout(mainPanel,BoxLayout.Y_AXIS);
         mainPanel.setLayout(b);
         
         JPanel formPanel = new JPanel(new GridBagLayout());
         
         mainPanel.add(formPanel);
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.insets = new Insets(10,0,0,0);
         
         gbc.gridx = 0;
         gbc.gridy = 0;
         gbc.anchor = GridBagConstraints.LINE_END;
         formPanel.add(new JLabel("Name:  "),gbc);
         gbc.gridy++;
         formPanel.add(new JLabel("Phone:  "),gbc);
         gbc.gridy++;
         formPanel.add(new JLabel("Email:  "),gbc);
         gbc.gridy++;
         formPanel.add(new JLabel("Address:  "),gbc);
         gbc.gridy++;
         formPanel.add(new JLabel("Password:  "),gbc);
         gbc.gridy++;
         formPanel.add(new JLabel("City:  "),gbc);
         gbc.gridy++;
         formPanel.add(new JLabel("Gender:  "),gbc);
         gbc.gridx = 1;
         gbc.gridy = 0;
         gbc.anchor = GridBagConstraints.LINE_START;
         formPanel.add(nameBox,gbc);
         gbc.gridy++;
         formPanel.add(phoneBox,gbc);
         gbc.gridy++;
         formPanel.add(emailBox,gbc);
         gbc.gridy++;
         addressBox.setPreferredSize(new Dimension(150,50));
         formPanel.add(addressBox,gbc);
         gbc.gridy++;
         formPanel.add(passwordBox,gbc);
         gbc.gridy++;
         String[] cities={"Karachi","Hyderabad","Islamabad","Gawadar"};
         cityBox = new JComboBox(cities);
         formPanel.add(cityBox,gbc);
         gbc.gridy++;
         male = new JRadioButton("Male");
         female = new JRadioButton("female");
         ButtonGroup group = new ButtonGroup();
         group.add(male); 
         group.add(female);
         formPanel.add(male,gbc);

         gbc.anchor = GridBagConstraints.CENTER;
         formPanel.add(female,gbc);
         
         JPanel buttonPanel = new JPanel(new GridLayout());
         mainPanel.add(buttonPanel);
         save = new JButton("Save");
         clear = new JButton("Clear");
         buttonPanel.add(save);
         buttonPanel.add(clear);       
            
     }
     
     public static void main(String args[])
     {
        GUIForm g= new GUIForm();
        g.setVisible(true);
     }
    
}