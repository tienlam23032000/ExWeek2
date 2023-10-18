import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Company company;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("Company Management System Menu:");
            System.out.println("1. Enter Company Information");
            System.out.println("2. Allocate Employee To Manager");
            System.out.println("3. Add employee");
            System.out.println("4. Remove employee");
            System.out.println("5. Display list employees");
            System.out.println("6. Calculate total salary for the company");
            System.out.println("7. Find the employee with the highest salary");
            System.out.println("8. Find the manager with the most subordinates");
            System.out.println("9. Sort employees alphabetically");
            System.out.println("10. Sort employees by descending salary");
            System.out.println("11. Find the Director with the most company shares");
            System.out.println("12. Calculate and list the total income for each Director");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    enterCompanyInformation();
                    break;
                case 2:
                    allocateEmployeeToManager();
                    break;
                case 3:
                    addEmployee();
                    break;
                case 4:
                    removeEmployee();
                    break;
                case 5:
                    displayListEmployees();
                    break;
                case 6:
                    calculateTotalSalaryCompany();
                    break;
                case 7:
                    findEmployeeHighestSalary();
                    break;
                case 8:
                    findManagerWithMostSubordinates();
                    break;
                case 9:
                    sortEmployeesByAlphabet();
                    break;
                case 10:
                    sortEmployeesBySalaryDescending();
                    break;
                case 11:
                    findDirectorWithMostCompanyShares();
                    break;
                case 12:
                    calculateAndDisplayDirectorIncomes();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);
    }
    private static void enterCompanyInformation() {
        System.out.print("Enter Company Name: ");
        String companyName = scanner.nextLine();
        System.out.print("Enter Tax ID: ");
        String taxID = scanner.nextLine();
        System.out.print("Enter Monthly Revenue: ");
        double monthlyRevenue = scanner.nextDouble();
        company = new Company(companyName, taxID, monthlyRevenue);
        System.out.println("Company information has been entered.");
    }


    // Từ case 2 trở đi em chưa làm được
    private static void allocateEmployeeToManager() {
        if (company != null) {
            // Implement logic to add employees here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void addEmployee() {
        if (company != null) {
            // Implement logic to add employees here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void removeEmployee() {
        if (company != null) {
            // Implement logic to remove employees here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void displayListEmployees() {
        if (company != null) {
            System.out.println(company);
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void calculateTotalSalaryCompany() {
        if (company != null) {
            // Implement logic to calculate the total salary for the entire company here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void  findEmployeeHighestSalary() {
        if (company != null) {
            // Implement logic to find the highest-paid employee here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void findManagerWithMostSubordinates() {
        if (company != null) {
            // Implement logic to find the manager with the most subordinates here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void sortEmployeesByAlphabet() {
        if (company != null) {
            // Implement logic to sort employees by name here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void sortEmployeesBySalaryDescending() {
        if (company != null) {
            // Implement logic to sort employees by salary in descending order here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void findDirectorWithMostCompanyShares() {
        if (company != null) {
            // Implement logic to find the director with the most company shares here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }

    private static void calculateAndDisplayDirectorIncomes() {
        if (company != null) {
            // Implement logic to calculate and display director incomes here
        } else {
            System.out.println("Company information is not available. Please enter it first.");
        }
    }
}