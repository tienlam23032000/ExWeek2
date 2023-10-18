public class Director extends Employee {
    private double companyShare;
    // Lương 1 ngày của Giam đốc: 300.
    public Director(int employeeId, String fullName, String phoneNumber, int daysWorked, double companyShare) {
        super(employeeId, fullName, phoneNumber, daysWorked, 300, "Director"); // Lương 1 ngày của Giám đốc là 300, phương thức tính lương là "Fixed"
        this.companyShare = companyShare;
    }

    public double getCompanyShare() {
        return companyShare;
    }

    public void setCompanyShare(double companyShare) {
        this.companyShare = companyShare;
    }

    @Override
    public double calculateMonthlySalary() {
        return getDailySalary() * getDaysWorked(); // Lương = Lương 1 ngày * Số ngày làm việc
    }

    @Override
    public String toString() {
        return "Director{" +
                "employeeId=" + getEmployeeId() +
                ", fullName='" + getFullName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", daysWorked=" + getDaysWorked() +
                ", dailySalary=" + getDailySalary() +
                ", salaryCalculationMethod='" + getSalaryCalculationMethod() + '\'' +
//                ", companyShare=" + companyShare +
                '}';
    }

}
