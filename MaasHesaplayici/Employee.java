package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax()
    {
        if (this.salary > 1000)
            return this.salary * 0.03;
        return 0;
    }

    double bonus()
    {
        if (workHours > 40)
            return (workHours-40) * 30;
        return 0;
    }

    double raiseSalary() {
        int yil = 2021;
        int calismayili = yil - this.hireYear;
        if (calismayili < 10)
        {
            if (calismayili >= 9)
                return this.salary * 0.1;
            return (this.salary * 0.05);
        }
        else if (calismayili < 20)
            return this.salary * 0.1;
        else if (calismayili > 19)
            return this.salary * 0.15;
        else
            return 0;
    }

    @Override
    public String toString()
    {
        return  "\n===============================================\nİsim : " + this.name
                + "\nMaaşı : " + this.salary
                +"\nÇalışma saati : " + this.workHours
                +"\nBaşlangıç yılı : " + this.hireYear
                +"\nVergi : "+this.tax()
                +"\nBonus : " + this.bonus()
                +"\nMaaş Artışı : " + raiseSalary()
                +"\nVergi ve Bonuslar ile birlikte maaş : : "+(this.salary+bonus()-tax())
                +"\nToplam Maaş : " + (this.salary +raiseSalary())
                +"\n===============================================\n";
    }
}
