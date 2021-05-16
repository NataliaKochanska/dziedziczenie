package dziedziczenie;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public void setCalculatePayment(int hours) {
        this.wage = this.wage * hours;
        System.out.println("Wynagrodzenie za przepracowane godziny: " + this.wage);

    }
}

