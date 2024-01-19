package BelajarClassObject;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "fira";
        mahasiswa.nim = "G.111.20.0057";
        mahasiswa.jurusan = "Sistem Informasi";
        mahasiswa.IPK = 4.0;
        mahasiswa.umur = 18;

        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.nim);
        System.out.println(mahasiswa.jurusan);
        System.out.println(mahasiswa.IPK);
        System.out.println(mahasiswa.umur);
    }
}
