import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class Myclass implements ActionListener   
{
    // Sabko outside the constructor define kiya maine
    JLabel r,l1,l2,l3;
    JTextField t1 ,t2 ;
    JButton add, sub , div , mul ;

    Myclass()// Prev It was MYClass but it is MyClass 
    {
        JFrame f = new JFrame("SIMPLE CALCULATOR");
        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result");
        t1 = new JTextField();
        t2 = new JTextField();
        add = new JButton("+");
        sub = new JButton("-");
        div = new JButton("/");
        mul = new JButton("*");
        r = new JLabel("Result");
        l1.setBounds(10, 20, 100, 20);
        l2.setBounds(10, 50, 100, 20);
        t1.setBounds(120, 20, 100, 20);
        t2.setBounds(120, 50, 100, 20);
        add.setBounds(10, 80, 50, 30);
        sub.setBounds(70, 80, 50, 30);
        mul.setBounds(130, 80, 50, 30);
        div.setBounds(190, 80, 50, 30);
        r.setBounds(10, 120, 150, 20);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(r);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) // getSource is a method , therefore it is followed by a ()
            // idar ; kyu tha
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            r.setText("Result is:" + c);
        }
        if (e.getSource() == sub)
            // idar ; kyu tha
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            r.setText("Result is:" + c);
        }
        if (e.getSource() == mul)
            // idar ; kyu tha
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a * b;
            r.setText("Result is:" + c);
        }
        if (e.getSource() == div)
            // idar ; kyu tha
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a / b;
            r.setText("Result is:" + c);
        }
    }
}

class simpleCounter {
    public static void main(String[] args) {
        Myclass x = new Myclass();
    }
}