package maasHesaplama;

public class Main {
    public static void main(String[] args) {
        Employee isci1 = new Employee("Kemal", 2000, 45, 1985);
        isci1.tax();
        isci1.bonus();
        isci1.raiseSalary();
        System.out.println(isci1);
    }
}
