package projeto.sistema.funcionario;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;        

public class Login extends JFrame implements ActionListener {
    
    JTextField tfusuario, tfsenha;
    
    Login(){
    
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 
        
        JLabel lblusuario = new JLabel("Usuário: "); 
        lblusuario.setBounds(40, 20, 100, 30); 
        add(lblusuario);
        
        tfusuario = new JTextField(); 
        tfusuario.setBounds(150, 20, 150, 30);
        add(tfusuario); 
        
        
        JLabel lblsenha = new JLabel("Senha: "); 
        lblsenha.setBounds(40, 70, 100, 30); 
        add(lblsenha); 
        
        tfsenha = new JTextField(); 
        tfsenha.setBounds(150, 70, 150, 30);
        add(tfsenha); 
        
        JButton login = new JButton("LOGIN"); 
        login.setBounds(150, 140, 150, 30); 
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login); 
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel image = new JLabel(i3); 
        image.setBounds(350,0,200,200); 
        add(image); 
        
        setSize(600, 300);
        setLocation(450, 200); 
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        try{
            String usuario = tfusuario.getText();
            String senha = tfsenha.getText(); 
       
            Conn c = new Conn(); 
            String query = "select * from login where usuario = '"+ usuario+"' AND senha = '" + senha + "' "; 
            ResultSet rs = c.s.executeQuery(query); 
  
       
        if(rs.next()){
            setVisible(false); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalido"); 
            setVisible(false); 
        }
        
         
         } catch (Exception e){
            e.printStackTrace(); 
        }
        
    }
    
    
    public static void main(String[] args){
        new Login();
    }
}
