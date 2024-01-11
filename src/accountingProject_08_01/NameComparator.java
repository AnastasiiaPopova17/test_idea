package accountingProject_08_01;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        int employeesName = e1.getName().compareTo(e2.getName());
        int employeesId = employeesName == 0 ? Integer.compare(e1.getId(), e2.getId()) : employeesName;
        return employeesId;
    }
}
