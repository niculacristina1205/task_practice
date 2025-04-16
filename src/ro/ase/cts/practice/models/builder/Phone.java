package ro.ase.cts.practice.models.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
    private final String identifier;
    private final String version;
    private final List<AFeature> features;

    public Phone(Builder builder) {
        this.identifier = builder.identifier;
        this.version = builder.version;
        this.features = Collections.unmodifiableList(builder.features);
    }

    public static class Builder {
        private final String identifier;
        private final String version;
        private final List<AFeature> features = new ArrayList<>();

        public Builder(String identifier, String version) {
            this.identifier = identifier;
            this.version = version;
        }

        public Builder addFeature(AFeature feature) {
            this.features.add(feature);
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    public void displayFeatures() {
        System.out.println("Phone " + identifier + " v" + version + " has features:");
        for (AFeature f : features) {
            System.out.println("- " + f.name + " (" + f.price + " RON)");
        }
    }
}
