package Company;

import java.io.IOException;

public class TopManager extends Staff {

    private String profession;
    private final double FIX_SALARY_TOP_MANAGER = ((Math.random() * 20000) + 70000);
    private final double INCOME_FOR_BONUS = 1000000;
    private double bonusForTopManager = 50000;


    public TopManager(Company company) throws IOException {
        super(company.baseNames().get((int) (Math.random() * company.baseNames().size())), company);
        setProfession("TopManager");
//        profession = "TopManager";
    }


//    @Override
//    public String getProfession() {
//        return profession;
//    }


    @Override
    public double getFixSalary() {
        return FIX_SALARY_TOP_MANAGER;
    }


    @Override
    public double getMonthSalary() {
        if (getCompany().getIncomeCompany() > INCOME_FOR_BONUS) {
            return getFixSalary() + bonusForTopManager;
        }
        return getFixSalary();
    }


    @Override
    public String getNameForDismiss() {
        return super.getName();
    }
}
