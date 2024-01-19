package Method;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Cipa", "B.111.25.0046");
        mahasiswa.show();
        mahasiswa.setNama("Maria");
        mahasiswa.show();

        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getNim());

        String data = mahasiswa.sayHi("Cantik");
        System.out.println(data);
    }
}
