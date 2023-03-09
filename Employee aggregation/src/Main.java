public class Main {

    public static void main(String[] args) {

        AddressInfo addressInfo = new AddressInfo("College street","Khagrachari","Chittagong",
                "4400");
        InsuranceInfo insuranceInfo = new InsuranceInfo("Life Insurance",5918);
        Employee obj = new Employee("Hirankur",addressInfo,insuranceInfo);
        obj.display();
    }
}