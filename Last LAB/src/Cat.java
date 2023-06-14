public class Cat extends Animal implements Pet{

    String name;

    public Cat()
    {
        super(4);
        System.out.println("This is a cat and it has : "+super.legs+" legs.");

    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
    public void eat()
    {
        System.out.println("She loves eating fishes.");
    }
    public void play()
    {
        System.out.println("She likes to play.");
    }

}
