package dziedziczenie;

public class Main01 {
    public static void main(String[] args) {
        Employee employee01 = new Employee(1, "JAN", "KOWALSKI", 100.00);
        employee01.setRaiseWage(20);

        HourlyEmployee employee02 = new HourlyEmployee(1, "JAN", "NOWAK", 1000);
        employee02.setCalculatePayment(2);

        SalariedEmployee employee03 = new SalariedEmployee(3, "JAN", "JANOWSKI", 10);
        employee03.setCalculatePayment();

    }
}
