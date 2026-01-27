/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField nameTextField, fnameTextField,EmailTextField,aadhar,pan,pinTextField,addressTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JLabel additionalDetails, name, fname, dob, gender, Email, marital, city, state, pin, address; 
    JComboBox religion, category, income, education, occupation;
    String formno;
    String seniorcitezen;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        additionalDetails = new JLabel("PAGE 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(260,80,400,30);
        add(additionalDetails);
        
        name = new JLabel("Religion :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"}; 
        religion = new JComboBox(valReligion);
        religion.setBounds(300,145,400,25);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,195,400,25);
        category.setBackground(Color.WHITE);
        add(category);
        
        dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomecategory[] = {"Null", "<1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,245,400,25);
        income.setBackground(Color.WHITE);
        add(income);
                
        gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        Email = new JLabel("Qualification :");
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(100,315,200,30);
        add(Email);
        
        String educationvalues[] = {"Non-Graduate", "Graduate", "Post-graduation", "Doctrate", "Other"};
        education = new JComboBox(educationvalues); 
        education.setBounds(300,317,400,25);
        education.setBackground(Color.WHITE);
        add(education);
        
        marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String occupationval[] = {"Salaried", "Self-Emplyoed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationval); 
        occupation.setBounds(300,390,400,25);
        occupation.setBackground(Color.WHITE);
        add(occupation);
                        
        city = new JLabel("Adhar Number :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,440,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD,14));
        aadhar.setBounds(300,445,400,25);
        add(aadhar);
        
        state = new JLabel("PAN Number :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,200,30);
        add(state);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD,14));
        pan.setBounds(300,495,400,25);
        add(pan);
        
        address = new JLabel("Senior Citezen :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,540,200,30);
        add(address);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(425, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(syes);
        statusGroup.add(sno);
         
        
        pin = new JLabel("Existing User :");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,590,200,30);
        add(pin);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(425, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup eGroup = new ButtonGroup();
        eGroup.add(eyes);
        eGroup.add(eno);
        
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
    String sreligion = (String) religion.getSelectedItem();
    String scategory = (String)category.getSelectedItem(); 
    String sincome = (String) income.getSelectedItem();
    String seducation = (String) education.getSelectedItem();
    String soccupation = (String) occupation.getSelectedItem();
    String seniorcitizen = null;
        if(syes.isSelected()){
        seniorcitezen = "Yes";
        }
        else if(sno.isSelected()){
        seniorcitezen = "No";
        }
        
    
    String existingaccount = null;
        if (eyes.isSelected()){
         existingaccount = "Yes";   
        }else if(eno.isSelected()){
        existingaccount = "No";
        }
        
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try{
            
                 Conn c = new Conn();
                String query = "insert into SignupTwo value('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
            
        
        }catch(Exception e){
        System.out.print(e);
        }
        
    }
     
   
    
    public static void main(String [] args){
    new SignupTwo("");
    }
    
}


/*Kartik Jawanjal*/
public class SignupTwo {
    
}
