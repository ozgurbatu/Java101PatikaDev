package maasHesaplama;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double tax;
    double bonus;
    double maasArtisi;
    double vergiBonus;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
           return tax;

        } else {
            tax = salary * 0.03;
          return tax;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
            return bonus;
        } else {
           return bonus;
        }
    }

    public double raiseSalary() {
        if (2021 - hireYear < 10) {
            maasArtisi = salary / 20;
            return maasArtisi;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            maasArtisi = salary / 10;
            return maasArtisi;
        } else {
            maasArtisi = salary * 3 / 20;
            return maasArtisi;
        }
    }

    @Override
    public String toString() {
        return "Name= "+ name +"\n"+"Salary= " + salary +"\n"+"WorkHours= " + workHours +"\n"+"HireYear= " + hireYear +
                "\n"+"Tax= " + tax +
                "\n"+"Bonus= " + bonus +
                "\n"+"MaasArtisi= " + maasArtisi +
                "\n"+"Vergi ve Bonus ile birlikte maas= "+(salary+bonus-tax)+
                "\n"+"ToplamMaas= " + (salary+maasArtisi) ;
    }
}
