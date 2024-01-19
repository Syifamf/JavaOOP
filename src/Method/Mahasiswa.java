package Method;

public class Mahasiswa {

    //Property
    String nama;
    String nim;

    //Construstor
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Method tapi tanpa return dan tanpa parameter
    void  show(){
        System.out.println(" Nama :" + this.nama);
        System.out.println(" Nim  :" + this.nim);
    }

    //Method dengan return dan  parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //Method dengan return tapi tidak dengan parameter
    String getNama(){
        return this.nama;
    }

    String getNim(){
        return this.nim;
    }

    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }

}
