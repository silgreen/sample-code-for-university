package JavaSrc.question.Lection13.intefaces;

public class Dog extends Animals implements IsPet {
    public void speak() {
        System.out.println("Woof");
    }
}
