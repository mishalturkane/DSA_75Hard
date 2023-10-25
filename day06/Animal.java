package day06;

public interface Animal {
    void eat();
}
class Elephent implements Animal{


    @Override
    public void eat() {
        System.out.println("Main kahata hu ghas");
    }
}
class Lion implements Animal{
    @Override
    public void eat() {
        System.out.println("Main kahata hu matan");
    }
}
class UseAnimal{
    public static void main(String[] args) {
        Animal ami;
        ami=new Elephent();
        ami.eat();
    }
}