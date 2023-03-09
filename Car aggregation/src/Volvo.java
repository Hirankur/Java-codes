public class Volvo extends Car{
    public double price;
    public String productionYear,registrationNumber;
    Engine engine;
    Dashboard dashboard;
    public Volvo(double price,String productionYear,String registrationNumber,
                 Engine engine,Dashboard dashboard) {
        this.price = price;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.engine = engine;
        this.dashboard = dashboard;
    }

        public void changeFuel()
    {
        System.out.println("Changing Fuel");
    }
    public void checkBattery(){
        System.out.println("Checking Battery");
    }

    }

