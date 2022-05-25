package satu;

public class Main {
    public static void main(String[] args) {
        Alattulis bulpoint = new Alattulis();
        bulpoint.setHargaSatuan(2000);
        bulpoint.setNama("Bolpoint");
        bulpoint.setStock(10);
        bulpoint.setHarga();

        Alattulis pensil = new Alattulis();
        pensil.setHargaSatuan(1000);
        pensil.setNama("Pensil");
        pensil.setStock(10);
        pensil.setHarga();

        Alattulis penghapus = new Alattulis();
        penghapus.setHargaSatuan(500);
        penghapus.setNama("penghapus");
        penghapus.setStock(10);
        penghapus.setHarga();

        bulpoint.displayData();
        pensil.displayData();
        penghapus.displayData();

        bulpoint.setTotalHarga(bulpoint,penghapus,pensil);
        int ttal = bulpoint.toalUangyangditerima();
        System.out.println("total harga : "+ttal);





    }
}
