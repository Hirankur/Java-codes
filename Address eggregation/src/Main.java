public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("abc","DHAKA","BANGLADESH");
        Address address2 = new Address("xyz","UP","INDIA");
        Employee employee1 = new Employee("Hira",20,address1);
        Employee employee2 = new Employee("Arun",20,address2);

        employee1.display();
        employee2.display();

    }
}