import Company.Clerk;
import Company.Company;
import Company.Employee;
import Company.SalesManager;
import Company.TopManager;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Company company = new Company();

        ArrayList<Employee> listStaff = new ArrayList<>();

        for (int i = 0; i < 270; i++) {
            if (i <= 150) {
                listStaff = company.hireStaff(new Clerk(company));
            }
            else if (i < 220) {
                listStaff = company.hireStaff(new SalesManager(company));
            }
            else listStaff = company.hireStaff(new TopManager(company));
        }

        company.printAllStaff(); // печать всего списка сотрудников

        company.getLowerSalaryStaff(2);
        company.getTopSalaryStaff(2);

        company.dismissPerson(listStaff.get(200));
    }
}
