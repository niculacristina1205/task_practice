package ro.ase.cts.practice.models.prototype;

import java.util.HashMap;
import java.util.Map;

public class OSPrototypeFactory {
    private static final Map<Integer, OS> osVersions = new HashMap<>();

    public static void loadOSVersion(int version, OS os) {
        osVersions.put(version, os);
    }

    public static OS getOSVersion(int version) {
        return osVersions.get(version).clone();
    }
}
