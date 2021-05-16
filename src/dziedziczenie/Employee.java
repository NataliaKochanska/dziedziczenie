package dziedziczenie;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;


    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public void setRaiseWage(double percent) {
        if (percent > 0) {
            this.wage = this.wage + (this.wage * percent) / 100;
            System.out.println("Nowa stawka godzinowa: " + this.wage);
        } else {
            System.out.println("Procent nie może być mniejszy od 0.");

        }

    }


}