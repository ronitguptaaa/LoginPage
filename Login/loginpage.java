package Login;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginpage implements ActionListener {

    JFrame frame= new JFrame();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDlabel = new JLabel("userID");
    JLabel userPasslabel = new JLabel("Password:");
    JLabel msgLabel = new JLabel();


      HashMap<String,String> logininfo = new HashMap<String,String>();

    public loginpage(HashMap<String,String> logininfooriginal){
        logininfo = logininfooriginal;

        userIDlabel.setBounds(50, 100, 75, 25);
        userPasslabel.setBounds(50, 150, 75, 25);

        msgLabel.setBounds(125, 250, 250, 35);
        msgLabel.setFont(new Font(null));

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(userIDlabel);
        frame.add(userPasslabel);
        frame.add(msgLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
          
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==resetButton){
           userIDField.setText("");
           userPasswordField.setText("");
       }

       if(e.getSource()==loginButton){
           String userid = userIDField.getText();
           String pass = String.valueOf(userPasswordField.getPassword());

           if(logininfo.containsKey(userid)){
               if(logininfo.get(userid).equals(pass)){
                   msgLabel.setForeground(Color.GREEN);
                   msgLabel.setText("Login Success");
                   frame.dispose();
                   welcome welcome = new welcome(userid);
               }else{
                   msgLabel.setForeground(Color.RED);
                   msgLabel.setText("Wrong Password");
               }
           }

           else{
               msgLabel.setForeground(Color.RED);
               msgLabel.setText("UserName Not Found");
           }
       }
    }

   
}
    

