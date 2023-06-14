public class Spider extends Animal{

    public Spider()
    {
        super(8);
        System.out.println("This is a spider and it has : "+super.legs+" legs.");
    }
    public void eat()
    {
        System.out.println("Spider eats small insects.");
    }
}
