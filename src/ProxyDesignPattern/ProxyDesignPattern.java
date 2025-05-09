package ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {

        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
//		 empTableObj.create("USER", new EmployeeDo());  // since 'user' is trying to create so will print("access denied)".

            empTableObj.create("ADMIN", new Employee(1));
            System.out.println("Operation successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
