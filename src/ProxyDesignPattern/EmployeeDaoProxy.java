package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        employeeDao=new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equalsIgnoreCase("ADMIN"))
        {
            employeeDao.create(client,employee);
            return;
        }
        throw new Exception("Acess denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN"))
        {
            employeeDao.delete(client,employeeId);
            return;
        }
        throw new Exception("Acess denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            return employeeDao.get(client, employeeId);
        }

        throw new Exception("Access denied");
    }
}
