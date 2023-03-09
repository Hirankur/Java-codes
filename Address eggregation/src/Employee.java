public class Employee {
    public String name;
    public int age;
    Address address;

    public Employee(String name,int age,Address address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void display(){
        System.out.println("Employee Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Address : "+address.city+","+address.state+","+address.country);
    }
}
