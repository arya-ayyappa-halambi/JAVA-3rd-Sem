package MyPack;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        this.name = n;
        this.bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.print("--> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
