package delapan;

public class KomputerCetak {
    public static void main(String[] args) {
        Komputer [] a =  {new PC(),new Laptop(),new Notebook()};
        for(Komputer b : a){
            b.hidupkan_os();
            b.klik_kanan();
            b.kllik_kiri();
            b.cetak_data();
            b.tekan_enter();
            b.cetak_data();
            b.matikan_os();
            System.out.println("\n");
        }
    }


}
