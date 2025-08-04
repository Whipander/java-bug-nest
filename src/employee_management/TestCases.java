package employee_management;

import java.util.ArrayList;
import java.util.List;

public class TestCases {
    public static FullTimeEmployee fullTimeEmployeeKoto() {
        return new FullTimeEmployee("Koto", 3_000_000);
    }

    public static PartTimeEmployee partTimeEmployeeLita() {
        return new PartTimeEmployee("Lita", 22, 11_750);
    }

    public static PartTimeEmployee partTimeEmployeeNjiva() {
        return new PartTimeEmployee("Njiva", 22, 11_750);
    }

    public static void main(String[] args) {
        FullTimeEmployee koto = TestCases.fullTimeEmployeeKoto();
        PartTimeEmployee lita = TestCases.partTimeEmployeeLita();
        PartTimeEmployee njiva = TestCases.partTimeEmployeeNjiva();

        koto.setMonthlySalary(6_000_000);
        lita.setHoursWorked(1_000);

        System.out.println("Details about Koto " + koto);
        System.out.println("Details about Lita " + lita);

        Department ITDepartment = new Department("IT", new ArrayList<Employee>());

        ITDepartment.addEmployee(koto);
        ITDepartment.addEmployee(lita);
        ITDepartment.addEmployee(lita);
        ITDepartment.addEmployee(njiva);

        ITDepartment.showAllEmployeesInformations();
        ITDepartment.showAllEmployeesPay();
    }
}
