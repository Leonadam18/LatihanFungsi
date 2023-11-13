import java.util.Scanner;

public class latihanfungsi {
    // static void tampilnama(String nama){
    //     System.out.println("Hola de "+nama);
    // }
    // static void tampilkelas(){
    //     System.out.println("10 RPL 8");
    // }
    // static String tampil(){
    //     String nama="siswa";
    //     return nama;
    // }
    // public static void main(String[] args) {
    //     tampilnama("Sucipto");
    //     tampilkelas();
    //     tampilnama("Resha");
    //     tampilkelas();
    // }
    static void tampilnama(int id){
        String namapelanggan[]={"Ali","Budi","Dani","Edi","Umar"};
        System.out.println(namapelanggan[id-1]);
    }
    static void hitungtarif(int jumlahpakai){
        int harga=0;
        jumlahpakai=10;
        if (jumlahpakai>0 || jumlahpakai<10) {
            harga=jumlahpakai*2000;
        }
        else if (jumlahpakai>=11&&jumlahpakai<=20) {
            harga=jumlahpakai*3000;
        }
        else if (jumlahpakai>=21&&jumlahpakai<=30) {
            harga=jumlahpakai*4000;
        }
        else if(jumlahpakai>=31) {
            harga=jumlahpakai*5000;
        }
        harga+=10000;

        System.out.println("Jumlah Pemakaian: "+jumlahpakai);
        System.out.println("Tarif Pemakaian: Rp."+String.format("%, d", (harga-10000)));
        System.out.println("Tarif Pemakaian dengan Biaya Administrasi: Rp."+String.format("%, d", harga));
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int p=1;
            while (p==1) {
                System.out.print("Masukkan Nomor ID Pelanggan: ");
                int nomorid=scanner.nextInt();
                System.out.print("Masukkan Jumlah Pemakaian: ");
                int jumlahpakai=scanner.nextInt();
                tampilnama(nomorid);
                hitungtarif(jumlahpakai);
                System.out.println("Lanjutkan Program? (y/n): ");
                String lanjut=scanner.next();
                switch (lanjut) {
                    case "n":
                        p=0;
                        break;
                
                    default:
                        p=1;
                }
            }
        }
    }
}