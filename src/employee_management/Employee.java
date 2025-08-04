package employee_management;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Employee {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(String name) {
        this.employeeId = counter.incrementAndGet();
        this.name = name;
    }

    public abstract double calculatePay();

    public abstract double calculateTax();

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "employeeId=" + employeeId +
                ", name='" + name + "'"
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }
}
