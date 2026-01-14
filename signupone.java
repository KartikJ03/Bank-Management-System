
package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*; 
public class signupone extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField,EmailTextField,cityTextField,stateTextField,pinTextField,addressTextField;
    JButton next;
    JRadioButton male, female, Other, married, um, mo;
     JDateChooser dateChooser;
    
    signupone(){
        JLabel formno, personaldetails, name, fname, dob, gender, Email, marital, city, state, pin, address; 
        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()% 9000L)+1000L);
        
        formno = new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,36));
        formno.setBounds(150,20,600,40);
        add(formno);
        
        personaldetails = new JLabel("PAGE 1: PERSONAL DETAILS");
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        personaldetails.setBounds(260,80,400,30);
        add(personaldetails);
        
        name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300,145,400,25);
        add(nameTextField);
        
        fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        fnameTextField.setBounds(300,195,400,25);
        add(fnameTextField);
        
        dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 245, 400, 25);
        add(dateChooser);
        
        gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(425, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        Other = new JRadioButton("Not To Answer");
        Other.setBounds(550, 290, 120, 30);
        Other.setBackground(Color.WHITE);
        add(Other);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(Other);
        
        
        
        Email = new JLabel("Email Address :");
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(100,340,200,30);
        add(Email);
        
        EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Raleway", Font.BOLD,14));
        EmailTextField.setBounds(300,345,400,25);
        add(EmailTextField);
        
        marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        um = new JRadioButton("Unmarried");
        um.setBounds(425, 390, 100, 30);
        um.setBackground(Color.WHITE);
        add(um);
        
        mo = new JRadioButton("Other");
        mo.setBounds(550, 390, 120, 30);
        mo.setBackground(Color.WHITE);
        add(mo);
        
        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(married);
        statusGroup.add(um);
        statusGroup.add(mo);
        
        
        city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,440,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
        cityTextField.setBounds(300,445,400,25);
        add(cityTextField);
        
        state= new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
        stateTextField.setBounds(300,495,400,25);
        add(stateTextField);
        
        address = new JLabel("Current Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,540,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
        addressTextField.setBounds(300,545,400,25);
        add(addressTextField);
        
        pin = new JLabel("Postal Code :");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,590,200,30);
        add(pin);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
        pinTextField.setBounds(300,595,400,25);
        add(pinTextField);
        
        JButton next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
    String formno = "" +random;
    String name = nameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
        gender = "Female";
        }
        else if (Other.isSelected()){
        gender = "Other";
        }
        
    String Email = EmailTextField.getText();
    String marital = null;
        if (married.isSelected()){
         marital = "Married";   
        }else if(um.isSelected()){
        marital = "Unmarried";
        }
        else if (mo.isSelected()){
        marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try{
            if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Required");
            }else{
                 Conn c = new Conn();
                String query = "insert into signup value('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+Email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
            }
        
        }catch(Exception e){
        System.out.print(e);
        }
        
    }
     
   
    
    public static void main(String [] args){
    new signupone();
    }
    
}

