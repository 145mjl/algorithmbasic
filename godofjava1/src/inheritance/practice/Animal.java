package inheritance.practice;

public class Animal {
    public String name;
    public int size;
    public boolean isMamal;
    public int legCount;
    public String habitat;

    public void cry(){
        System.out.println("Animal - cry()");
    }

    public void eatFood(){
        System.out.println("Animal - eatFood()");
    }

    public void move(){
        System.out.println("Animal - move()");
    }
}
