import java.util.ArrayList;
import java.util.Objects;

public abstract class EmployeeNormal  extends Employee{
    private Manager manager; // attribute truong phong quan ly


     //Lương 1 ngày của nhân viên: 100
    public EmployeeNormal(int employeeId, String fullName, String phoneNumber, int daysWorked, Manager manager) {
        super(employeeId, fullName, phoneNumber, daysWorked, 100, "EmployeeNormal");
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    //Công thức tính lương tháng : lương 1 ngày * số ngày làm việc
    @Override
    public double calculateMonthlySalary() {
        return getDailySalary() * getDaysWorked();
    }
    @Override
    public String toString() {
        return "EmployeeNormal{" +
                "employeeId=" + getEmployeeId() +
                ", fullName='" + getFullName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", daysWorked=" + getDaysWorked() +
                ", dailySalary=" + getDailySalary() +
                ", salaryCalculationMethod='" + getSalaryCalculationMethod() + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmployeeNormal that = (EmployeeNormal) o;
        return Objects.equals(manager, that.manager);
    }
}