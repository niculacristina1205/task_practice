package ro.ase.cts.practice.models.builder;

public class Battery extends AFeature {
    public Battery(String name, int price) {
        super(name, price);
    }

    @Override
    public void useFeature() {
        System.out.println("Battery used: " + name);
    }
}
