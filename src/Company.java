
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
    private String companyName;
    private String taxID;
    private double monthlyRevenue;
    private List<EmployeeNormal> employees;

    //contructor
    public Company(String companyName, String taxID, double monthlyRevenue) {
        this.companyName = companyName;
        this.taxID = taxID;
        this.monthlyRevenue = monthlyRevenue;
        this.employees = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTaxID() {
        return taxID;
    }

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public void setMonthlyRevenue(double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    public List<EmployeeNormal> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeNormal> employees) {
        this.employees = employees;
    }

    public void addEmployee(EmployeeNormal employeeNormal) {
        employees.add(employeeNormal);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", taxNumber='" + taxID + '\'' +
                ", monthlyRevenue=" + monthlyRevenue +
                ", employees=" + employees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Double.compare(company.monthlyRevenue, monthlyRevenue) == 0 &&
                Objects.equals(companyName, company.companyName) &&
                Objects.equals(taxID, company.taxID);
    }
}
