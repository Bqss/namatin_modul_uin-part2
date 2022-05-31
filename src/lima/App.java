package lima;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    Mahasiswa mahasiswa;
    private void addMahasiswa(){
        Scanner inp ;
        String [] dummy = {"Nama Mahasiswa","NIM Mahasiswa","Alamat Mahasiswa","Jurusan Mahasiswa (61-66)"};
        String [] data = new String[4];
        for(int i = 0 ; i< dummy.length ; i++){
            inp = new Scanner(System.in);
            System.out.print(" Masukkan "+ dummy[i] +"   : ");
            data[i] = inp.next();
        }
        mahasiswa = new Mahasiswa(data[0],data[1],data[2],data[3]);
        daftarMahasiswa.add(mahasiswa);

    }

    private void displayAllMhs(){
        daftarMahasiswa.forEach((mhs)->{
            System.out.printf("""
                    Nama mahasiswa : %s
                    Asal universitas : %s
                    Nim mahasiswa : %s
                    Alamat mahasiswa : %s
                    Jurusan : %s
                   """,mhs.getNama(), Universitas.getNamaUniv(),mhs.getNIM(),mhs.getAlamat(),mhs.getJurusan());
            System.out.println("\n");
        });

    }

    public void run(){
        Scanner inp = new Scanner(System.in);
        String opt ;
        boolean isNext = true;
        while(isNext){
            System.out.println("---------------\naplikasi entry data mahasiswa\n---------------");
            System.out.println("Menu aplikasi :\n1.masukkan data mahasiswa\n2.lihat data mahasiswa");
            System.out.print("pilihan anda : \n>");
            opt = inp.nextLine();
            System.out.println();
            switch (opt) {
                case "1" -> implementInputdata();
                case "2" -> displayAllMhs();
            }
            isNext = getYesOrNo("apakah anda ingin tetap melanjutkan ");
        }


    }
    void implementInputdata(){
        boolean isInput = true;
        String namaUniv  = Universitas.getNamaUniv();
        Scanner inp = new Scanner(System.in);
        if(namaUniv == null){
            System.out.print("Masukkan nama unversitas  : ");
            namaUniv = inp.nextLine();
            Mahasiswa.setNamaUniv(namaUniv);
        }
        while(isInput){
           addMahasiswa();
            isInput = getYesOrNo("apakah anda ingin menlanjutkan input data ");
        }
    }

    boolean getYesOrNo(String message){
        String res ;
        Scanner inp = new Scanner(System.in);
        System.out.print(message + " ? (y/n)");
        res = inp.next();
        System.out.println();
        return res.equals("y");
    }
}
