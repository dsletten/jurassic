package projects.ch08;

public class PlanetTest {
    public static void main(String[] args) {
        double earthWeight = 180;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}
