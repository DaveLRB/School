import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployees(Employee employee) {
        employees.remove(employee);
    }

    public long countEmployeesWithMoreThanNHouseYears(String department, int years) {
        return employees.stream()
                .filter(list -> list.getDepartment().equals(department) && list.getYearsOfWork() > years)
                .count();
    }

    public long countEmployeesWithLessThanNHouseYears(String department, int years) {
        return employees.stream()
                .filter(list -> list.getDepartment().equals(department) && list.getYearsOfWork() < years)
                .count();
    }

    public long countEmployeesWithNHouseYears(String department, int years) {
        return employees.stream()
                .filter(list -> list.getDepartment().equals(department) && list.getYearsOfWork() == years)
                .count();
    }

    public List<String> employeesSalaryOver(String department, int salary) {
        return employees.stream()
                .filter(list -> list.getDepartment().equals(department) && list.getSalary() > salary)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public List<String> employeesSalaryLess(String department, int salary) {
        return employees.stream()
                .filter(list -> list.getDepartment().equals(department) && list.getSalary() < salary)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public List<String> employeesSalary(String department, int salary) {
        return employees.stream()
                .filter(list -> list.getDepartment().equals(department) && list.getSalary() == salary)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public List<String> getOldestEmployeeName(int number) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .limit(number)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public String findFirstOlderThan(int age) {
        Employee employee = employees.stream()
                .filter(e -> e.getAge() > age)
                .findFirst()
                .orElse(null);
        return employee != null ? employee.getName() : null;


    }
    public List<String> findCommonNamesBetweenDepartments(String department1, String department2) {
        List<String> department1Names = employees.stream()
                .filter(e -> e.getDepartment().equals(department1))
                .map(Employee::getName)
                .collect(Collectors.toList());

        List<String> department2Names = employees.stream()
                .filter(e -> e.getDepartment().equals(department2))
                .map(Employee::getName)
                .collect(Collectors.toList());

        department1Names.retainAll(department2Names);
        return department1Names;
    }

    public double findAverageSalaryInDepartment(String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(department))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public double findMaxSalaryDepartment(String department){
        return employees.stream()
                .filter(list->list.getDepartment().equals(department))
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0.0);
    }

    public double findMinSalaryDepartment(String department){
        return employees.stream()
                .filter(list->list.getDepartment().equals(department))
                .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0.0);
    }

    public double findTotalSalaryDepartment(String department){
        return employees.stream()
                .filter(list->list.getDepartment().equals(department))
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    public double findTotalCompany(){
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}
