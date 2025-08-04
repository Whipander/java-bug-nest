package employee_management;

import java.util.Set;

public class Department {
    private String departmentName;
    private Set<Employee> employees;

    public Department(String departmentName, Set<Employee> employees) {
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}