package Company;

public interface Employee extends Comparable<Employee>{

    double getMonthSalary();

    String getNameForDismiss();

    @Override
    default int compareTo(Employee o) {
        return Double.compare(getMonthSalary(), o.getMonthSalary());
    }
}


