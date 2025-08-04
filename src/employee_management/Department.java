package employee_management;

import java.util.Set;

public class Department {
    private String departmentName;
    private Set<Employee> employees;

    public Department(String departmentName, Set<Employee> employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void showAllEmployeesInformation() {
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                System.out.println(employee + ", monthly salary: " + ((FullTimeEmployee) employee).getMonthlySalary());
            } else {
                System.out.println(employee + ", pay: " + employee.calculatePay());
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