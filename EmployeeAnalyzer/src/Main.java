
public class Main {
    public static void main(String[] args) {

        Company mindera = new Company();

        mindera.addEmployees(new Employee("David Barrela",26,18,1666, "corpops"));
        mindera.addEmployees(new Employee("Pedro Tavares",21,20,1555, "corpops"));
        mindera.addEmployees(new Employee("Bruna Taketsuma",25,12,1400, "devops"));
        mindera.addEmployees(new Employee("Fátima Azevedo",22,18,1600, "devops"));
        mindera.addEmployees(new Employee("Francisco Silva",29,22,1800, "devops"));
        mindera.addEmployees(new Employee("Tiago Padrão",18,15,1525, "devops"));
        mindera.addEmployees(new Employee("Marco Silva",23,18,1750, "manops"));
        mindera.addEmployees(new Employee("Rodrigo Gregório",21,7,1350, "manops"));
        mindera.addEmployees(new Employee("Ricardo Silva",19,9,1300, "devops"));
        mindera.addEmployees(new Employee("Paulo Barbosa",23,2,1150, "hr"));
        mindera.addEmployees(new Employee("Fábio Gonçalves",22,5,1100, "facilities"));
        mindera.addEmployees(new Employee("David Barrela",26,7,1500,"manops"));

        System.out.println(mindera.getOldestEmployeeName(1));
        System.out.println( mindera.countEmployeesWithLessThanNHouseYears("devops",15));
        System.out.println(mindera.countEmployeesWithMoreThanNHouseYears("devops",10));
        System.out.println(mindera.countEmployeesWithNHouseYears("devops",18));
        System.out.println(mindera.employeesSalary("hr",1150));
        System.out.println(mindera.employeesSalaryLess("manops",1400));
        System.out.println(mindera.employeesSalaryOver("devops",1475));
        System.out.println(mindera.findFirstOlderThan(22));
        System.out.println(mindera.findCommonNamesBetweenDepartments("corpops","manops"));
        System.out.println(mindera.findAverageSalaryInDepartment("devops"));
        System.out.println(mindera.findMaxSalaryDepartment("manops"));
        System.out.println(mindera.findMinSalaryDepartment("devops"));
        System.out.println(mindera.findTotalSalaryDepartment("corpops"));
        System.out.println(mindera.findTotalCompany());


    }
    }
