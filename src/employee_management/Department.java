package employee_management;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String departmentName, List<Employee> employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void showAllEmployeesPay() {
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                System.out.println(employee +
                        ", monthly salary: " + employee.calculatePay()
                );
            } else {
                System.out.println(employee +
                        ", pay: " + employee.calculatePay()
                );
            }
        }
    }

    public void showAllEmployeesInformations() {
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                System.out.println(employee +
                        ", monthly salary: " + employee.calculatePay()
                );
            } else if (employee instanceof PartTimeEmployee) {
                System.out.println(employee +
                        ", hourly rate: " + ((PartTimeEmployee) employee).getHourlyRate() +
                        ", hours worked: " + ((PartTimeEmployee) employee).getHoursWorked() +
                        ", pay: " + employee.calculatePay()
                );
            }
        }
    }

    public void addEmployee(Employee employee) {
        if (this.employees.contains(employee)) {
            System.out.println("Employee " + employee.getName() + " already exists");
        }else{
            this.employees.add(employee);
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}