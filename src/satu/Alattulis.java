package satu;

public class Alattulis {
    private String nama ;
    private int stock;
    private int hargaSatuan;
    private int harga;
    private int toalUangyangditerima ;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga() {
        this.harga = stock*hargaSatuan;
    }
    public void setTotalHarga(Alattulis ...list){

        for(Alattulis a : list){
            toalUangyangditerima += a.harga;
        }


    }

    public int toalUangyangditerima(){
        return this.toalUangyangditerima;
    }

    public void displayData(){
        System.out.printf("Nama alat tulis : %s\nJumlah stok : %d\nHarga satuan : %d\nHarga semua %s : %d\n\n",this.nama,this.stock,this.hargaSatuan,this.nama,this.harga);
    }


}
