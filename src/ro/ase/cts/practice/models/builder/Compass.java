package ro.ase.cts.practice.models.builder;

public class Compass extends AFeature {

    public Compass(String name, int price) {
        super(name, price);
    }

    @Override
    public void useFeature() {
        System.out.println("Compass used: " + name);
    }
}
