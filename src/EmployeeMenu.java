import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EmployeeMenu {
    public static void main(String[]  args) {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    
    frame.setSize(400,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    panel.setLayout(null);
    
    
   
    JButton employeeSystemButton = new JButton("Employee System");
    employeeSystemButton.setBounds(90,30,200,40);
    panel.add(employeeSystemButton);


    JButton payrollSystemButton = new JButton("Payroll System");
    payrollSystemButton.setBounds(90,100,200,40);
    panel.add(payrollSystemButton);

    JButton backButton = new JButton("Back");
    backButton.setBounds(130,180,100,40);
    panel.add(backButton);


    
   


    frame.setVisible(true);
}
}
