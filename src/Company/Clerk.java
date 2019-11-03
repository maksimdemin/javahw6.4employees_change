package Company;

import java.io.IOException;

public class Clerk extends Staff {

    private String profession;
    private final double FIX_SALARY_CLERK = (Math.random() * 10000) + 30000;

    public Clerk(Company company) throws IOException {
        super(company.baseNames().get((int) (Math.random() * company.baseNames().size())), company);
//        profession = "Clerk";
        setProfession("Clerk");
    }


//    @Override
//    public String getProfession() {
//        return profession;
//    }


    @Override
    public double getFixSalary() {
        return FIX_SALARY_CLERK;
    }



    @Override
    public String getNameForDismiss() {
        return super.getName();
    }


    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
