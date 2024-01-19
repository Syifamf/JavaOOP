package Latihan;

public class Main {

    String ucup;
    String otong;
    public static void main(String[] args) {
        Player ucup = new Player("Ucup", 100.0, "Pedang", 15.0, "Baju besi", 10.0);
        ucup.show();
        System.out.println();
        Player otong = new Player("Otong", 50.0, "Ketapel", 1.0, "Kaos", 0.0);
        otong.show();

    }
}
