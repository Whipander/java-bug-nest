package employee_management;

public class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }else {
            System.out.println("Hours worked is invalide: " + hoursWorked);
            System.out.println("Hours worked will be set to: 0");
            hoursWorked = 0;
        }

    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate > 0) {
            this.hourlyRate = hourlyRate;
        }else{
            System.out.println("Hourly rate is invalide: " + hourlyRate);
            System.out.println("Hourly rate will be set to: 20");
            hourlyRate = 20;
        }
    }


    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public double calculateTax() {
        return calculatePay() * 0.15;
    }
}

