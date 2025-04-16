package ro.ase.cts.practice.models.multiton;

import ro.ase.cts.practice.enums.ConnectionType;
import ro.ase.cts.practice.interfaces.IGSMConnection;

import java.util.HashMap;
import java.util.Map;

public class GSMConnection implements IGSMConnection {

    private String name;

    public GSMConnection(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("Calling using " + name + " connection.");
    }

    private static final Map<ConnectionType, GSMConnection> connections = new HashMap<>();

    public static synchronized GSMConnection getConnection(ConnectionType type) {
        if (!connections.containsKey(type)) {
            switch (type) {
                case NORMAL -> connections.put(type, new GSMConnection("Normal"));
                case PRIORITY -> connections.put(type, new GSMConnection("Priority"));
                case EMERGENCY -> connections.put(type, new GSMConnection("Emergency"));
            }
        }
        return connections.get(type);
    }
}
