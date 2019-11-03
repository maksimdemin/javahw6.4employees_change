package Company;

public abstract class Staff implements Employee {


    private String name;
    private String profession;


    private double salary;
    private Company company;


    Staff(String name, Company company) {
        this.name = name;
        this.company = company;
    }


    void setProfession(String profession) {
        this.profession = profession;
    }


    Company getCompany() {
        return company;
    }


    String getName() {
        return name;
    }


    private String getProfession() {
        return profession;
    }



    public double getFixSalary() {
        return salary;
    }


    @Override
    public double getMonthSalary() {
        return getFixSalary();
    }


    public String toString() { // форматирование строки для вывода общей информации
        return String.format("%-35s %-15s %,.2f %s", getName(), getProfession(), getMonthSalary(), "rub");
    }





    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
