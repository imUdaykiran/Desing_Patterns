package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) {
        System.out.println("created new row in the employee table");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("deleted new row in the employee table");
    }

    @Override
    public Employee get(String client, int employeeId) {
        System.out.println("fetching data from employee table");
        return new Employee(1);
    }
}
