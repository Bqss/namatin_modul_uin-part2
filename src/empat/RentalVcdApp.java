package empat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalVcdApp {
    List <RentalVcd> daftarCd = new ArrayList<>();
    public void tambahkanStok(){
        Scanner inp = new Scanner(System.in);
        String judulFilm ,kategori,aktor,sutradara,publisher;
        int stock;
        System.out.print("masukkan judul film : \n");
        judulFilm = inp.next();
        System.out.print("masukkan kategori film : \n");
        kategori = inp.nextLine();
        System.out.print("masukkan nama aktor film : \n");
        aktor = inp.nextLine();
        System.out.print("masukkan nama sutradara film : \n");
        sutradara= inp.nextLine();
        System.out.print("masukkan nama publisher film : \n");
        publisher = inp.nextLine();
        System.out.print("masukkan jumlah stck film");
        stock = inp.nextInt();

        daftarCd.add(new RentalVcd(judulFilm,aktor,sutradara,kategori,publisher,stock));
    }


}
