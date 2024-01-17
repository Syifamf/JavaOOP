import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("=================================");
            System.out.println("Sistem Order Makanan");
            System.out.println("=================================");

            System.out.print("Nama Pemesan      : ");
            String nama_pemesan = input.nextLine();

            System.out.println("Menu Makanan");
            System.out.println("1. Nasi Goreng (Rp.15.000,00)");
            System.out.println("2. Mie Ayam (Rp.10.000,00)");
            System.out.println("3. Bakso (Rp.13.000,00)");

            System.out.print("Masukan Pilihan   : ");
            int masukan_pilihan = input.nextInt();

            int harga = 0;
            String menu = "";

            switch (masukan_pilihan) {
                case 1:
                    harga = 15000;
                    menu = "Nasi Goreng";
                    break;
                case 2:
                    harga = 10000;
                    menu = "Mie Ayam";
                    break;
                case 3:
                    harga = 13000;
                    menu = "Bakso";
                    break;
                default:
                    System.out.println("=================================");
                    System.out.println("Maaf Pilihan Menu Tidak Tersedia!:(");
                    System.out.println("");
                    input.nextLine();
                    continue;
            }

            System.out.print("Jumlah Pesan      : ");
            int jumlah_pesan = input.nextInt();

            System.out.println("=================================");
            System.out.println("Nama Pemesan     : " + nama_pemesan);
            System.out.println("Pesanan          : " + menu);
            System.out.println("Harga            : " + harga);
            System.out.println("Jumlah Pesan     : " + jumlah_pesan);
            System.out.println("Total Bayar      : " + (harga * jumlah_pesan));
            System.out.println("=================================");

            System.out.print("Ingin memesan lagi? (y/n): ");
            String jawaban = input.next();

            input.nextLine();

            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println("");
        }

        System.out.println("Terima kasih atas pesanan Anda. Mohon ditunggu ya kak! :)");
        input.close();

        }
    }