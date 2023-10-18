import java.util.List;
import java.util.Objects;

public class Manager extends Employee {
    private List<EmployeeNormal> subordinates;

    // Lương 1 ngày của quan ly: 200
    public Manager(int employeeId, String fullName, String phoneNumber, int daysWorked, List<EmployeeNormal> subordinates) {
        super(employeeId, fullName, phoneNumber, daysWorked, 200, "Manager");
        this.subordinates = subordinates;
    }

    public List<EmployeeNormal> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<EmployeeNormal> subordinates) {
        this.subordinates = subordinates;
    }
    // lương 1 ngày * số ngày làm việc + 100 * số lượng nhân viên dưới quyền.
    //Ví dụ, nếu một người quản lý làm việc 20 ngày trong tháng và có 5 nhân viên dưới quyền,
    // và lương hàng ngày của họ là 200,
    // công thức trên sẽ tính lương hàng tháng như sau: monthlySalary = 200 * 20 + 100 * 5 = 4000 + 500 = 4500.
    @Override
    public double calculateMonthlySalary() {
        int daysWorked = getDaysWorked(); // lay so ngay lam viec cua manager
        double dailySalary = getDailySalary(); //lay luong hang ngay cua quan ly
        int numberOfSubordinates = subordinates.size(); // dem so luong nhan vien duoi quyen quan ly

        double monthlySalary = dailySalary * daysWorked + 100 * numberOfSubordinates;
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employeeId=" + getEmployeeId() +
                ", fullName='" + getFullName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", daysWorked=" + getDaysWorked() +
                ", dailySalary=" + getDailySalary() +
                ", salaryCalculationMethod='" + getSalaryCalculationMethod() + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return getEmployeeId() == manager.getEmployeeId() &&
                getDaysWorked() == manager.getDaysWorked() &&
                Double.compare(manager.getDailySalary(), getDailySalary()) == 0 &&
                Objects.equals(getFullName(), manager.getFullName()) &&
                Objects.equals(getPhoneNumber(), manager.getPhoneNumber()) &&
                Objects.equals(getSalaryCalculationMethod(), manager.getSalaryCalculationMethod()) &&
                Objects.equals(subordinates, manager.subordinates);
    }
}
