import java.util.Objects;

public abstract class EmployeeNomal  extends Employee{
    private Manager manager; // attribute truong phong quan ly

    public EmployeeNomal(int employeeId, String fullName, String phoneNumber, int daysWorked, double dailySalary, String salaryCalculationMethod, Manager manager) {
        super(employeeId, fullName, phoneNumber, daysWorked, dailySalary, salaryCalculationMethod);
        //contructor
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    //Công thức tính lương tháng : lương 1 ngày * số ngày làm việc .Lương 1 ngày của nhân viên: 100.
    @Override
    public double calculateMonthlySalary() {
        return super.getDailySalary() * super.getDaysWorked();
    }

    @Override
    public String toString() {
        return super.toString() + "\nManager: " + (manager != null ? manager.getFullName() : "None");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        EmployeeNormal that = (EmployeeNormal) obj;
        return Objects.equals(manager, that.manager);
    }
}
