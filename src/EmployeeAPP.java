

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class EmployeeAPP {
    private static String[] args;
    private static String[] args2;
    /**
     * @param args
     */
    public static void main (String[]args){
         

        JFrame frame = new JFrame();
        JButton button = new JButton("Enter");
       
        button.setBounds(270,450,100,30); // Dimension
        
       
        //JLabel Settings

        JLabel employeeNolabel = new JLabel("Employee No:");
        employeeNolabel.setBounds(20,0,100,100);

        JLabel employeeNamelabel = new JLabel("Name:");
        employeeNamelabel.setBounds(20,30,100,100);

        JLabel jobTitlelabel = new JLabel("Job Title:");
        jobTitlelabel.setBounds(20,60,100,100);

        JLabel phoneNolabel = new JLabel("Phone No:");
        phoneNolabel.setBounds(20,90,100,100);

        JLabel birthDaylabel = new JLabel("Birthday:");
        birthDaylabel.setBounds(20,120,100,100);

        JLabel addresslabel = new JLabel("Address:");
        addresslabel.setBounds(20,150,100,100);

        JLabel attendancelabel = new JLabel("Attendance");
        attendancelabel.setBounds(20,215,100,100);

        JLabel hoursWorkedlabel = new JLabel("Hours Worked:");
        hoursWorkedlabel.setBounds(20,260,100,100);

        JLabel ratePerHourlabel = new JLabel("Rate/Hour:");
        ratePerHourlabel.setBounds(20,290,100,100);

        JLabel grossPaylabel = new JLabel("Gross Salary:");
        grossPaylabel.setBounds(20,320,100,100);

        JLabel benefitslabel = new JLabel("Benefits");
        benefitslabel.setBounds(350,-30,100,100);

        JLabel riceSubsidylabel = new JLabel("Rice Subsidy:");
        riceSubsidylabel.setBounds(350,0,100,100);

        JLabel phoneAllowancelabel = new JLabel("Phone Allowance:");
        phoneAllowancelabel.setBounds(350,30,150,100);
        
        JLabel clothingAllowancelabel = new JLabel("Clothing Allowance:");
        clothingAllowancelabel.setBounds(350,60,150,100);

        JLabel salarylabel = new JLabel("Salary");
        salarylabel.setBounds(350,120,100,100);
        
        JLabel netPaylabel = new JLabel("Net Pay:");
        netPaylabel.setBounds(350,150,100,100);

        JLabel deductionslabel = new JLabel("Deductions");
        deductionslabel.setBounds(350,210,100,100);

        JLabel ssslabel = new JLabel("SSS:");
        ssslabel.setBounds(350,235,100,100);

        JLabel pagIbiglabel = new JLabel("Pag Ibig:");
        pagIbiglabel.setBounds(350,265,100,100);

        JLabel philHealthlabel = new JLabel("PhilHealth:");
        philHealthlabel.setBounds(350,295,100,100);

        JLabel incomeTaxlabel = new JLabel("Income Tax:");
        incomeTaxlabel.setBounds(350,325,100,100);


        //JText Field Settings
        JTextField employeeNoText = new JTextField();
		employeeNoText.setBounds(110,35,150,25);

        JTextField employeeNameText = new JTextField();
		employeeNameText.setBounds(110,65,150,25);

        JTextField jobTitleText = new JTextField();
		jobTitleText.setBounds(110,95,150,25);

        JTextField phoneNoText = new JTextField();
		phoneNoText.setBounds(110,125,150,25);

        JTextField birthDayText = new JTextField();
		birthDayText.setBounds(110,155,150,25);

        JTextField addressText = new JTextField();
		addressText.setBounds(110,185,150,25);

               
        JTextField hoursWorkedText = new JTextField();
		hoursWorkedText.setBounds(110,295,150,25);

        JTextField ratePerHourText = new JTextField();
		ratePerHourText.setBounds(110,325,150,25);

        JTextField grossSalaryText = new JTextField();
		grossSalaryText.setBounds(110,355,150,25);

        JTextField phoneAllowanceText = new JTextField();
		phoneAllowanceText.setBounds(465,35,150,25);

        JTextField riceSubsidyText = new JTextField();
		riceSubsidyText.setBounds(465,65,150,25);

        JTextField clothingAllowanceText = new JTextField();
		clothingAllowanceText.setBounds(465,95,150,25);

        JTextField netPayText = new JTextField();
		netPayText.setBounds(465,185,150,25);

        JTextField sssText = new JTextField();
		sssText.setBounds(465,265,150,25);

        JTextField pagIbigText = new JTextField();
		pagIbigText.setBounds(465,295,150,25);

        JTextField philHealthText = new JTextField();
		philHealthText.setBounds(465,325,150,25);

        JTextField incomeTaxText = new JTextField();
		incomeTaxText.setBounds(465,355,150,25);

                                  

        //Frame Settings
        frame.setSize(700,600); // Dimension
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle( "MotorPh");


        // Add Label to frame
        frame.add(employeeNolabel);
        frame.add(employeeNamelabel);
        frame.add(jobTitlelabel);
        frame.add(phoneNolabel);
        frame.add(birthDaylabel);
        frame.add(addresslabel);
        frame.add(attendancelabel);
        frame.add(hoursWorkedlabel);
        frame.add(ratePerHourlabel);
        frame.add(grossPaylabel);
        frame.add(benefitslabel);
        frame.add(riceSubsidylabel);
        frame.add(phoneAllowancelabel);
        frame.add(clothingAllowancelabel);
        frame.add(salarylabel);
        frame.add(netPaylabel);
        frame.add(deductionslabel);
        frame.add(ssslabel);
        frame.add(pagIbiglabel);
        frame.add(philHealthlabel);
        frame.add(incomeTaxlabel);

        // Add Text Field to frame
        frame.add(employeeNoText);
        frame.add(employeeNameText);
        frame.add(jobTitleText);
        frame.add(phoneNoText);
        frame.add(birthDayText);
        frame.add(addressText);
        frame.add(hoursWorkedText);
        frame.add(ratePerHourText);
        frame.add(grossSalaryText);
        frame.add(riceSubsidyText);
        frame.add(phoneAllowanceText);
        frame.add(clothingAllowanceText);
        frame.add(netPayText);
        frame.add(sssText);
        frame.add(pagIbigText);
        frame.add(philHealthText);
        frame.add(incomeTaxText);
        
        frame.add(button);

        frame.setLayout(null);
    }
    



        

        

    }

