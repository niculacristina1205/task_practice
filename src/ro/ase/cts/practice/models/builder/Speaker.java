package ro.ase.cts.practice.models.builder;

public class Speaker extends AFeature {

    public Speaker(String name, int price) {
        super(name, price);
    }

    @Override
    public void useFeature() {
        System.out.println("Speaker used: " + name);
    }
}
