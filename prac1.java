import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class prac1 extends JFrame implements ActionListener {
   JTextField display ;
   JTextField oper ;
   JButton zero ;
   JButton one ;
   JButton two ;
   JButton three ;
   JButton four ;
   JButton five ;
   JButton six ;
   JButton seven ;
   JButton eight ;
   JButton nine ;
   JButton plus ;
   JButton minus ;
   JButton mul ;
   JButton div ;
   JButton cls ;
   JButton eq ;
   static int cache , finalAns ;
    public prac1() {
        setTitle("Calculator");
        setSize(320, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        display = new JTextField();
        display.setText("");
        display.setBounds(25, 15, 205, 40);
		display.setFont(new Font("Montserrat", Font.BOLD, 18));
        display.setEditable(false);
        add(display);

        oper = new JTextField();
        oper.setText("");
        oper.setBounds(250, 15, 35, 40);
		oper.setFont(new Font("Montserrat", Font.BOLD, 18));
        oper.setEditable(false);
        add(oper);

        seven = new JButton("7");
        seven.setBounds(35, 75, 50,50);
		seven.setFont(new Font("Montserrat", Font.BOLD, 18));
        seven.addActionListener(this);
        add(seven);
        
        eight = new JButton("8");
        eight.setBounds(95, 75, 50,50);
		eight.setFont(new Font("Montserrat", Font.BOLD, 18));
        eight.addActionListener(this);
        add(eight);

        nine = new JButton("9");
        nine.setBounds(155, 75, 50,50);
		nine.setFont(new Font("Montserrat", Font.BOLD, 18));
        nine.addActionListener(this);
        add(nine);

        mul = new JButton("x");
        mul.setBounds(215, 75, 50,50);
		mul.setFont(new Font("Montserrat", Font.BOLD, 18));
        mul.addActionListener(this);
        add(mul);

        four = new JButton("4");
        four.setBounds(35, 135, 50,50);
		four.setFont(new Font("Montserrat", Font.BOLD, 18));
        four.addActionListener(this);
        add(four);
        
        five = new JButton("5");
        five.setBounds(95, 135, 50,50);
		five.setFont(new Font("Montserrat", Font.BOLD, 18));
        five.addActionListener(this);
        add(five);

        six = new JButton("6");
        six.setBounds(155, 135, 50,50);
		six.setFont(new Font("Montserrat", Font.BOLD, 18));
        six.addActionListener(this);
        add(six);

        minus = new JButton("-");
        minus.setBounds(215, 135, 50,50);
		minus.setFont(new Font("Montserrat", Font.BOLD, 18));
        minus.addActionListener(this);
        add(minus);

        one = new JButton("1");
        one.setBounds(35, 195, 50,50);
		one.setFont(new Font("Montserrat", Font.BOLD, 18));
        one.addActionListener(this);
        add(one);
        
        two = new JButton("2");
        two.setBounds(95, 195, 50,50);
		two.setFont(new Font("Montserrat", Font.BOLD, 18));
        two.addActionListener(this);
        add(two);

        three = new JButton("3");
        three.setBounds(155, 195, 50,50);
		three.setFont(new Font("Montserrat", Font.BOLD, 18));
        three.addActionListener(this);
        add(three);

        plus = new JButton("+");
        plus.setBounds(215, 195, 50, 110);
		plus.setFont(new Font("Montserrat", Font.BOLD, 18));
        plus.addActionListener(this);
        add(plus);

        cls = new JButton("C");
        cls.setBounds(35, 255, 50,50);
		cls.setFont(new Font("Montserrat", Font.BOLD, 18));
        cls.addActionListener(this);
        add(cls);
        
        zero = new JButton("0");
        zero.setBounds(95, 255, 50,50);
		zero.setFont(new Font("Montserrat", Font.BOLD, 18));
        zero.addActionListener(this);
        add(zero);

        div = new JButton("%");
        div.setBounds(155, 255, 50,50);
		div.setFont(new Font("Montserrat", Font.BOLD, 18));
        div.addActionListener(this);
        add(div);

        eq = new JButton("=");
        eq.setBounds(35, 315, 230, 50);
		eq.setFont(new Font("Montserrat", Font.BOLD, 18));
        eq.addActionListener(this);
        add(eq);

        setVisible(true);
    }

    public void actionPerformed (ActionEvent e){
        if (e.getSource() == one){
           String s = display.getText() + one.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == two){
            String s = display.getText() + two.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == three){
            String s = display.getText() + three.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == four){
            String s = display.getText() + four.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == five){
            String s = display.getText() + five.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == six){
            String s = display.getText() + six.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == seven){
            String s = display.getText() + seven.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == eight){
            String s = display.getText() + eight.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == nine){
            String s = display.getText() + nine.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == zero){
            String s = display.getText() + zero.getText();
           display.setText(s) ;
        }
        else if (e.getSource() == cls){
           clear();
           finalAns = 0 ;
        }
        else if (e.getSource() == plus){
           cacheUpdate();
           operSet(plus);
        }
        else if (e.getSource() == minus){
           cacheUpdate();
           operSet(minus);
        }
        else if (e.getSource() == mul){
           cacheUpdate();
           operSet(mul);
        }
        else if (e.getSource() == div){
           cacheUpdate();
           operSet(div);
        }
        else if (e.getSource() == eq){
           display.setText(Integer.toString(finalAns+eval()));
           oper.setText("") ;
        }
    }

    public void clear (){
        display.setText("") ;
        finalAns = 0 ;
    }

    public void operSet (JButton s){
        oper.setText(s.getText()) ;
        if (s.getText() == "+" || s.getText() == "-"){
        cache = 0 ;
        cache += Integer.parseInt(display.getText());
        }
        else if (s.getText() == "%" || s.getText() == "x"){
        cache = 1;
        cache *= Integer.parseInt(display.getText());
        }
        display.setText("") ;
    }

    public int eval (){
        int ans = 0 ;
        switch (oper.getText()) {
        case "+" :
            ans = cache + Integer.parseInt(display.getText());
           break;
        case "-" :
            ans = cache - Integer.parseInt(display.getText());
           break;
        case "x" :
            ans = cache * Integer.parseInt(display.getText());
           break;
        case "%" :
            ans = cache / Integer.parseInt(display.getText());
           break;
        }
        return ans ;
    }

    public void cacheUpdate (){
        finalAns = eval();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new prac1();
            }
        });
    }}
