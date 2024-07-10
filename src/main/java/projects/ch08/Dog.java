package projects.ch08;

public class Dog extends Pet {
    private Toy toy;

    public Dog(String name, Toy toy) {
        super(name);
        this.toy = toy;
    }

    public void stealToy(Dog d) {
        toy = d.toy;
        d.toy = null;
    }

    public String getToy() {
        if ( toy == null ) {
            return "";
        } else {
            return toy.getDescription();
        }
    }

    @Override
    public String toString() {
//        return String.format("This dog is %s. It has a toy: %s", this.name, getToy());
        return String.format("This dog is %s. It has a toy: %s", getName(), getToy());
    }
}
