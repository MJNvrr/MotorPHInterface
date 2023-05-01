

public class EmployeeFullData {
   String employeeNo;
   String Name;
   String jobTitle;
   String phoneNo;
   String birthDay;
   String address;
  private Double riceSubsidy;
  private Double phoneAllowance;
  private Double clothingAllowance;
  private Double hoursWorked;
  private Double ratePerHour;
  private Double grossSalary;
  private Double sss;
  private Double pagIbig;
  private Double philHealth;
  private Double incomeTax;
  private Double netPay;

EmployeeFullData(String employeeNo, String Name, String jobTitle, String phoneNo, String birthDay, String address,
 Double riceSubsidy, Double phoneAllowance, Double clothingAllowance, Double hoursWorked, 
 Double ratePerHour, Double grossSalary, Double sss, Double pagIbig, Double philHealth, Double incomeTax, Double netPay) {
  
    this.employeeNo = employeeNo;
    this.Name = Name;
    this.phoneNo = phoneNo;
    this.birthDay = birthDay;
    this.address = address;
    this.riceSubsidy = riceSubsidy;
    this.phoneAllowance = phoneAllowance;
    this.clothingAllowance = clothingAllowance;
    this.hoursWorked = hoursWorked;
    this.grossSalary = grossSalary;
    this.sss = sss;
    this.pagIbig = pagIbig;
    this.philHealth = philHealth;
    this.incomeTax = incomeTax;
    this.netPay = netPay;





}

public String getEmployeeNo() {
    return employeeNo;
}

public void setEmployeeNo(String employeeNo) {
    this.employeeNo = employeeNo;
}

public String getName() {
    return Name;
}

public void setName(String name) {
    Name = name;
}

public String getJobTitle() {
    return jobTitle;
}

public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
}

public String getPhoneNo() {
    return phoneNo;
}

public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
}

public String getBirthDay() {
    return birthDay;
}

public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public Double getRiceSubsidy() {
    return riceSubsidy;
}

public void setRiceSubsidy(Double riceSubsidy) {
    this.riceSubsidy = riceSubsidy;
}

public Double getPhoneAllowance() {
    return phoneAllowance;
}

public void setPhoneAllowance(Double phoneAllowance) {
    this.phoneAllowance = phoneAllowance;
}

public Double getClothingAllowance() {
    return clothingAllowance;
}

public void setClothingAllowance(Double clothingAllowance) {
    this.clothingAllowance = clothingAllowance;
}

public Double getHoursWorked() {
    return hoursWorked;
}

public void setHoursWorked(Double hoursWorked) {
    this.hoursWorked = hoursWorked;
}

public Double getRatePerHour() {
    return ratePerHour;
}

public void setRatePerHour(Double ratePerHour) {
    this.ratePerHour = ratePerHour;
}

public Double getGrossSalary() {
    return grossSalary;
}

public void setGrossSalary(Double grossSalary) {
    this.grossSalary = grossSalary;
}

public Double getSss() {
    return sss;
}

public void setSss(Double sss) {
    this.sss = sss;
}

public Double getPagIbig() {
    return pagIbig;
}

public void setPagIbig(Double pagIbig) {
    this.pagIbig = pagIbig;
}

public Double getPhilHealth() {
    return philHealth;
}

public void setPhilHealth(Double philHealth) {
    this.philHealth = philHealth;
}

public Double getIncomeTax() {
    return incomeTax;
}

public void setIncomeTax(Double incomeTax) {
    this.incomeTax = incomeTax;
}

public Double getNetPay() {
    return netPay;
}

public void setNetPay(Double netPay) {
    this.netPay = netPay;
}

public class EmployeeAPP  {
    EmployeeAPP e = new EmployeeAPP();
}

}