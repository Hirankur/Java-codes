class Main{
    public static void main(String[] args)
    {
        Cat c1=new Cat();
        c1.setName("MEOW");
        System.out.println("Her name is : "+c1.getName());
        c1.play();
        c1.eat();


        Fish f1=new Fish();
        f1.setName("Dory");
        System.out.println("Her name is : "+f1.getName());
        f1.play();
        f1.eat();


        Spider s1=new Spider();
        s1.eat();
    }
}