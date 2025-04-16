package ro.ase.cts.practice.models.builder;

public abstract class AFeature {
    String name;
    int price;

    public AFeature(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract void useFeature();
}
