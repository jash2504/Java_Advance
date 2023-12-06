package Factorydesign.pattern;

/**
 *
 * @author hp pavailion
 */
interface Employee {

    int getSalary();
}

class AndroidDeveloper implements Employee {

    public int getSalary() {
        System.out.println("Getting android developer salary");
        return 5000;
    }
}

class WebDeveloper implements Employee {

    public int getSalary() {
        System.out.println("Getting Web developer salary");
        return 7000;
    }
}

class EmployeeFactory {
//get employee

    public static Employee getEmployee(String empType) {

        if (empType.equals("AD")) {
            return new AndroidDeveloper();
        } else if (empType.equals("WD")) {
            return new WebDeveloper();

        } else {
            return null;
        }
    }
}

public class DesignPattern {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("WD");
        int s = employee.getSalary();
        System.out.println(s);
    }

}
