import java.util.Objects;

abstract class Employee {
    private int employeeId;
    private String fullName;
    private String phoneNumber;
    private int daysWorked;
    private double dailySalary; // luong 1 ngay
    private String salaryCalculationMethod; // phuong phap tinh luong

    //contructor
    public Employee(int employeeId, String fullName, String phoneNumber, int daysWorked, double dailySalary, String salaryCalculationMethod) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.daysWorked = daysWorked;
        this.dailySalary = dailySalary;
        this.salaryCalculationMethod = salaryCalculationMethod;
    }

    //setter getter

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public String getSalaryCalculationMethod() {
        return salaryCalculationMethod;
    }

    public void setSalaryCalculationMethod(String salaryCalculationMethod) {
        this.salaryCalculationMethod = salaryCalculationMethod;
    }

    // Abstract method
    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", daysWorked=" + daysWorked +
                ", dailySalary=" + dailySalary +
                ", salaryCalculationMethod='" + salaryCalculationMethod + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                daysWorked == employee.daysWorked &&
                Double.compare(employee.dailySalary, dailySalary) == 0 &&
                Objects.equals(fullName, employee.fullName) &&
                Objects.equals(phoneNumber, employee.phoneNumber) &&
                Objects.equals(salaryCalculationMethod, employee.salaryCalculationMethod);
    }
}
