package ro.ase.cts.practice.models.builder;

public class Antenna extends AFeature {

    public Antenna(String name, int price) {
        super(name, price);
    }

    @Override
    public void useFeature() {
        System.out.println("Antenna signal: " + name);
    }
}
