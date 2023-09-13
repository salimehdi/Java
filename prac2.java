import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;

public class prac2 extends JFrame implements ActionListener {
    JLabel nameLabel , genderLabel,langLabel,outputLabel , fav_placeLabel;
    JButton ok,reset ;
    JTextField nameField ;
    JTextArea output  ;
    JCheckBox js,html,css,mongodb ;
    JRadioButton male,female ;
    ButtonGroup genderGroup ;
    JComboBox<String> fav_placeBox;
    
        

    prac2 (String s) {
        setTitle(s);
        getContentPane().setBackground(Color.lightGray);

        nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(20, 20, 80, 20);
		add(nameLabel);

		nameField = new JTextField(20);
		nameField.setBounds(110, 20, 160, 20);
		add(nameField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20,60,80,20);
        add(genderLabel);


        male = new JRadioButton("Male");
        male.setBounds(110 , 60 , 60 , 20 );
        male.setBackground(Color.lightGray);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(180 , 60 , 80 , 20 );
        female.setBackground(Color.lightGray);
        add(female);

        genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);

        langLabel 
        = new 
        JLabel
        ("Fav. Lang:")
        ;
        langLabel.setBounds(20,100,80,20);
        add(langLabel);

        js = new JCheckBox("JS");
        js.setBounds(110 , 100 ,60 , 20);
        js.setBackground(Color.lightGray);
        add(js);

        html = new JCheckBox("HTML");
        html.setBounds(110 , 140 ,60 , 20);
        html.setBackground(Color.lightGray);
        add(html);
        
        css = new JCheckBox("Css");
        css.setBounds(110 , 180 ,60 , 20);
        css.setBackground(Color.lightGray);
        add(css);
        
        mongodb = new JCheckBox("MDB");
        mongodb.setBounds(110 , 220 ,60 , 20);
        mongodb.setBackground(Color.lightGray);
        add(mongodb);
        
        fav_placeLabel = new JLabel("Fav Place: ");
		fav_placeLabel.setBounds(20,260 ,80 , 20 );
		add(fav_placeLabel);
        
		fav_placeBox = new JComboBox<String>();
		fav_placeBox.setBounds(110, 260, 160, 20);
		fav_placeBox.addItem("Not Selected");
		fav_placeBox.addItem("India");
		fav_placeBox.addItem("USA");
		fav_placeBox.addItem("China");
		fav_placeBox.addItem("Bhutan");
		fav_placeBox.addItem("Japan");
		fav_placeBox.addItem("Australia");
		fav_placeBox.addItem("UK");
		add(fav_placeBox);

        outputLabel = new JLabel("Output:");
        outputLabel.setBounds(20,280,80,20);
        add(outputLabel);
        
        output = new JTextArea();
        output.setBounds(20,300,250,180);
        output.setEditable(false);
        add(output);
        
        ok = new JButton("OK");
        ok.setBounds(60 ,490 , 60 ,20);
        ok.addActionListener(this);
        add(ok);

        reset = new JButton("Reset");
        reset.setBounds(140 ,490 , 70 ,20);
        reset.addActionListener(this);
        add(reset);

        setSize(300, 560);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok && nameField.getText() != ""){
            String tempName = (nameField.getText() != "")?nameField.getText():"NotSelected"; 
            String tempGen = ""; 
            if (male.isSelected())
            tempGen = "Male";
            else if (female.isSelected())
            tempGen = "Female";

            String tempLang = ""; 
            if (js.isSelected())
            tempLang += "JS";
            if (html.isSelected())
            tempLang += " html";
            if (css.isSelected())
            tempLang += " css";
            if (mongodb.isSelected())
            tempLang += " mongodb";
            String fav_place = "";
            
            fav_place = fav_placeBox.getItemAt(fav_placeBox.getSelectedIndex()).toString();
            output.setText("Name: " +tempName +"\n"+ "Gender: " +tempGen + "\n"+"Fav.Lang: "+tempLang +"\nFav_Place: "+fav_place );
        }
        else if (e.getSource() == reset){
           nameField.setText(""); 
           genderGroup.clearSelection();
           js.setSelected(false); 
           html.setSelected(false); 
           css.setSelected(false); 
           mongodb.setSelected(false); 
           output.setText("");
           fav_placeBox.setSelectedIndex(0);
        }
    }

    public void allGood (){
        System.out.println("All Good!");
    }

    public static void main(String[] args) {
        prac2 a = new prac2("Form");
        a.allGood();
    }
}