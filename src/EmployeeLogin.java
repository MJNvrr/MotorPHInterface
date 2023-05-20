import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class EmployeeLogin implements ActionListener {
    
    public static void main(String[] args)  {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Employee Log In");
        frame.setSize(400,250); // Frame Dimension
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.setLayout(null);


        // Label Settings
        JLabel employeeNoLabel = new JLabel("Employee No");
        employeeNoLabel.setBounds(50,30,80,25);
        panel.add(employeeNoLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,80,80,25);
        panel.add(passwordLabel);

        // TextField Settings
        JTextField employeeNoText = new JTextField();
        employeeNoText.setBounds(130,30,165,25);
        panel.add(employeeNoText);

        JTextField passwordText = new JTextField();
        passwordText.setBounds(130,80,165,25);
        panel.add(passwordText);


        JButton enterbutton = new JButton("Enter");
        enterbutton.setBounds(150,150,80,25);
        enterbutton.addActionListener(new EmployeeLogin());
        panel.add(enterbutton); 

        JLabel success = new JLabel();
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);
              
   
        
    }
    private AbstractButton employeeNoText;
    private Object passwordText;
    private AbstractButton success;
    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        String employeeNo = employeeNoText.getText();
        String password = passwordText.getText();
        System.out.println(employeeNo + "," + password);

        if (employeeNo.equals("10001") && password.equals("MMDC@2023")) {
            
    }
}
}
   
    
    
    


