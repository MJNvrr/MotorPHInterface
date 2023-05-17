import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EmployeeLeaveApplication {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Employee Leave Application");
        System.out.println("==========================");
        
        System.out.print("Enter Employee Number: ");
        String employeeNo = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employ Birthday: ");
        String birthday = scanner.nextLine();

        System.out.print("Enter leave start date (DD/MM/YYYY): ");
        String startDateStr = scanner.nextLine();
        
        System.out.print("Enter leave end date (DD/MM/YYYY): ");
        String endDateStr = scanner.nextLine();
        
        System.out.print("Enter leave reason: ");
        String reason = scanner.nextLine();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date startDate = dateFormat.parse(startDateStr);
            Date endDate = dateFormat.parse(endDateStr);
            
            long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());
            long leaveDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS) + 1;
            
            System.out.println("\nLeave Application Details");
            System.out.println("=========================");
            System.out.println("Employee Name: " + employeeNo);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Name: " + birthday);

            System.out.println("Start Date: " + startDateStr);
            System.out.println("End Date: " + endDateStr);
            System.out.println("Leave Days: " + leaveDays);
            System.out.println("Reason: " + reason);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the dates in DD/MM/YYYY format.");
        }
    }
    
}


