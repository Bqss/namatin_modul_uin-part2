package empat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    List <RentalVcd> daftarCd = new ArrayList<>();
    private void tambahkanStok(){
        Scanner inp ;
        String [] data = new String[5];
        String [] dummy = {"judul film","kategori film (D , R , SU , A )"," nama aktor film" ,"nama sutradara film","nama publisher film" };
        int stock;
        for (int i =0 ; i< data.length; i++){
            inp = new Scanner(System.in);
            System.out.printf("masukkan %s  : ",dummy[i]);
            data[i] = inp.next();
        }
        inp = new Scanner(System.in);
        System.out.print("Masukkan jumlah stock : ");
        stock = inp.nextInt();
        daftarCd.add(new RentalVcd(data[0],data[2],data[3],data[4],data[1],stock));
        System.out.println();
    }

    private void displayAllCD(){
        daftarCd.forEach((cd)->{
            System.out.printf("""
                    Nama judul film : %s
                    Kategori film : %s
                    nama aktor film : %s
                    nama sutradara : %s
                    nama publisher : %s
                    jumlah stock : %d""",cd.getJudulFilm(),cd.getKategori(),cd.getNamaAktor(),cd.getNamaSutradara(),cd.getPublisher(),cd.getStock());
            System.out.println("\n");
        });

    }
    public void run(){
        Scanner inp = new Scanner(System.in);
        String opt ;
        boolean isNext = true;
        while(isNext){
            System.out.println("---------------\naplikasi Rental VCD\n---------------");
            System.out.println("Menu aplikasi :\n1.masukkan data vcd\n2.masukkan data");
            System.out.print("pilihan anda : \n>");
            opt = inp.next();
            switch (opt) {
                case "1" -> implementInputdata(true);
                case "2" -> displayAllCD();
            }
            isNext = getYesOrNo("apakah anda ingin tetap melanjutkan ");
        }


    }
    void implementInputdata(boolean isInput){
        while(isInput){
            tambahkanStok();
            isInput = getYesOrNo("apakah anda ingin menlanjutkan ");
        }
    }

    boolean getYesOrNo(String message){
        String res ;
        Scanner inp = new Scanner(System.in);
        System.out.print(message + " ? (y/n)");
        res = inp.next();
        return res.equals("y");
    }



}
