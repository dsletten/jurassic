package projects.ch08;

public class Pets {
    public static void main(String[] args) {
        Dog d1 = new Dog("Fido", new Toy("bone"));
        Dog d2 = new Dog("Rover", null);

        System.out.println(d1);
        System.out.println(d2);

        d2.stealToy(d1);

        System.out.println(d1);
        System.out.println(d2);
    }
}
