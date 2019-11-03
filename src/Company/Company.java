package Company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {


    private ArrayList<Employee> staff = new ArrayList<>(); // ArrayList для храненния списка сотрудников


    double getIncomeCompany() { // метод получения прибыли компании, в котором проверяем является ли сотрудник "наследником" IncomeReceivable
        double income = 0.0;
        for (Employee employee : staff) {
            if (employee instanceof IncomeReceivable) {
                income += ((IncomeReceivable) employee).getIncome();
            }
        }
        return income;
    }


    public ArrayList<Employee> hireStaff(Employee employee) { // метод для найма сотрудников <Employee>
        staff.add(employee);
        return staff;
    }

    public void printAllStaff() { // метод для распечатки списка всего персонала
        Collections.sort(staff);
        staff.forEach(System.out::println);
    }


    public void dismissPerson(Employee employee) { // метод для увольнения сотрудника
        staff.remove(employee);
        System.out.println("Dismissed: " + employee.getNameForDismiss());
    }


    public void getLowerSalaryStaff(int count) { // распечатать заданное количество сотрудников с минимальными ЗП

        if (count > staff.size() || count < 0) {
            System.out.printf("%n%s MIN salary %n", "-");
            System.out.println("The company has " + staff.size() + " employees. You entered the number " + count + ". Enter the correct number of employees.");
            return;
        }

        Collections.sort(staff);
        System.out.printf("%n%d MIN salary %n", count);
        for (int i = 0; i < count; i++) {
            System.out.printf("%03d %s%n", i + 1, staff.get(i).toString());
        }
    }


    public void getTopSalaryStaff(int count) { // распечатать заданное количество сотрудников с максимальными ЗП
        if (count > staff.size() || count < 0) {
            System.out.printf("%n%s MAX salary %n", "-");
            System.out.println("The company has " + staff.size() + " employees. You entered the number " + count + ". Enter the correct number of employees.");
            return;
        }

        Collections.sort(staff);
        System.out.printf("%n%d MAX salary %n", count);
        for (int i = 0; i < count; i++) {
            System.out.printf("%03d %s%n", i + 1, staff.get(staff.size() - count + i).toString());
        }
    }



    ArrayList<String> baseNames() throws IOException { // создаем список имен (базу) сотрудников
        List<String> name = readNamesFromFile();
        return new ArrayList<>(name);
    }



    private List<String> readNamesFromFile() throws IOException { // метод для чтения информации из текстового файла
        return Files.readAllLines(Paths.get("data/names.txt"));
    }
}
