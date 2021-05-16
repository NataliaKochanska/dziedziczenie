package dziedziczenie;

public class SalariedEmployee extends Employee {
    final int monthlyHours = 190;
    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
        }

    public void setCalculatePayment(){
        this.wage = monthlyHours * this.wage;
        System.out.println("Wynagrodzenie miesięczne: " + this.wage);
    }
}
