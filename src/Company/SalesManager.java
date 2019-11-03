package Company;

import java.io.IOException;

public class SalesManager extends Staff implements IncomeReceivable {

    private String profession;
    private final double FIX_SALARY_SALE_MANAGER = ((Math.random() * 20000) + 40000);
    private final double INCOME_PERCENT = 0.05;
    private double saleAmount = (Math.random() * 50000);
    private double bonusForSaleManager;


    public SalesManager(Company company) throws IOException {
        super(company.baseNames().get((int) (Math.random() * company.baseNames().size())), company);
//        profession = "SalesManager";
        setProfession("SalesManager");
        bonusForSaleManager = saleAmount * INCOME_PERCENT;
    }


//    @Override
//    public String getProfession() {
//        return profession;
//    }


    @Override
    public double getFixSalary() {
        return FIX_SALARY_SALE_MANAGER;
    }


    @Override
    public double getMonthSalary() {
        return getFixSalary() + bonusForSaleManager;
    }


    @Override
    public String getNameForDismiss() {
        return super.getName();
    }


    @Override
    public double getIncome() {
        return saleAmount;
    }
}

