package Constructor;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Fia", "A.111.22.0025", "Psikologi");
        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.nim);
        System.out.println(mahasiswa.jurusan);
    }
}
