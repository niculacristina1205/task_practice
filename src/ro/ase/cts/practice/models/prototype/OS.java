package ro.ase.cts.practice.models.prototype;

public class OS implements Cloneable{
    private int version;

    public OS(int version) throws InterruptedException {
        this.version = version;
        System.out.println("Building the OS v" + this.version + ".");
        Thread.sleep(5000);
        System.out.println("OS build finished.");
    }

    @Override
    public OS clone() {
        try {
            return (OS) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getVersion() {
        return version;
    }
}
