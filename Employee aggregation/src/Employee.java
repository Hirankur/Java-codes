public class Employee {
    public String name;
    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;

    public Employee(String name,AddressInfo addressInfo,
    InsuranceInfo insuranceInfo)
    {
       this.name=name;
       this.addressInfo=addressInfo;
       this.insuranceInfo=insuranceInfo;
    }
    public void display()
    {
        System.out.println("Name of Employee : "+this.name);
        System.out.println("Address of Employee : "+addressInfo.street+","
                +addressInfo.city+","+addressInfo.state+","+addressInfo.postalCode);
        System.out.println("Insurance Information : "+insuranceInfo.policyName+","
                +insuranceInfo.policyId);
        System.out.println();
        System.out.println();
    }
}
