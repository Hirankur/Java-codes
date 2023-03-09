public class Main {
    public static void main(String[] args) {
        Engine engine = new  Engine(40.5);
        Dashboard dashboard = new Dashboard(5.0);
        Volvo volvo = new Volvo(700,"2023","KHA123",engine,dashboard);
        volvo.drive();
        volvo.stop();
        volvo.changeFuel();
        volvo.checkBattery();
        volvo.model="SUV.CI89";
        volvo.company="Volvo";
    }
}