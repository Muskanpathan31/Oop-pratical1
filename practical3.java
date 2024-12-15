class Employee {
    String empName;
    int empId;
    String address;
    String mailId;
    String mobileNo;

    Employee(String empName, int empId, String address, String mailId, String mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }
}

class Programmer extends Employee {
    double basicPay;

    Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        System.out.println("Programmer: " + empName + ", Gross Salary: " + grossSalary + ", Net Salary: " + netSalary);
    }
}

class TeamLead extends Employee {
    double basicPay;

    TeamLead(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        System.out.println("Team Lead: " + empName + ", Gross Salary: " + grossSalary + ", Net Salary: " + netSalary);
    }
}

class AssistantProjectManager extends Employee {
    double basicPay;

    AssistantProjectManager(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        System.out.println("Assistant Project Manager: " + empName + ", Gross Salary: " + grossSalary + ", Net Salary: " + netSalary);
    }
}

class ProjectManager extends Employee {
    double basicPay;

    ProjectManager(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        System.out.println("Project Manager: " + empName + ", Gross Salary: " + grossSalary + ", Net Salary: " + netSalary);
    }
}

public class EmployeePaySlip {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Alice", 101, "123 Street", "alice@example.com", "9876543210", 50000);
        TeamLead teamLead = new TeamLead("Bob", 102, "456 Avenue", "bob@example.com", "9876543211", 70000);
        AssistantProjectManager apm = new AssistantProjectManager("Charlie", 103, "789 Road", "charlie@example.com", "9876543212", 80000);
        ProjectManager pm = new ProjectManager("David", 104, "101 Boulevard", "david@example.com", "9876543213", 90000);

        programmer.generatePaySlip();
        teamLead.generatePaySlip();
        apm.generatePaySlip();
        pm.generatePaySlip();
    }
}
