package empat;

public class RentalVcd extends Vcd  {
    int stock ;
    public int getStock() {
        return stock;
    }
    public RentalVcd(String judul , String aktor , String sutradara ,String publisher,String kategori , int stock){
        super(judul,aktor,sutradara,publisher,kategori);
    }


    public void setStock(int stock) {
        this.stock = stock;
    }



}
