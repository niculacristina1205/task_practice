package ro.ase.cts.practice.main;

import ro.ase.cts.practice.enums.ConnectionType;
import ro.ase.cts.practice.models.builder.Antenna;
import ro.ase.cts.practice.models.builder.Battery;
import ro.ase.cts.practice.interfaces.IGSMConnection;
import ro.ase.cts.practice.models.builder.Phone;
import ro.ase.cts.practice.models.multiton.GSMConnection;
import ro.ase.cts.practice.models.prototype.OS;
import ro.ase.cts.practice.models.prototype.OSPrototypeFactory;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 1. Build an OS and cache it
        OS osV1 = new OS(1);
        OSPrototypeFactory.loadOSVersion(1, osV1);

        // 2. Clone it later
        OS phone1OS = OSPrototypeFactory.getOSVersion(1);

        // 3. Create a phone
        Phone phone = new Phone.Builder("X123", "1.0")
                .addFeature(new Battery("Li-Ion 3000mAh", 150))
                .addFeature(new Antenna("5G Ready", 100))
                .build();

        phone.displayFeatures();

        // 4. Use GSM connection
        IGSMConnection conn = GSMConnection.getConnection(ConnectionType.EMERGENCY);
        conn.call();

        // 5. Test prototype again
        OS phone2OS = OSPrototypeFactory.getOSVersion(1);
        System.out.println("Phone2 OS Version: " + phone2OS.getVersion());
    }
}
