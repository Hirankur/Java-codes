public class Fish extends Animal implements Pet{

String name;

public Fish()
{
    super(0);
    System.out.println("This is a fish and it has : "+super.legs+" legs.");
}
    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
    public void play()
    {
        System.out.println("She doesn't like to play.");
    }
    public void eat()
    {
        System.out.println("She eats smaller fishes and algae.");
    }
}
