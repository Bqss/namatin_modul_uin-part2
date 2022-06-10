package duabelas.entity;

public class PersegiPanjang extends Bentuk {
    public PersegiPanjang(double a , double b){
        this.b = b;
        this.a = a;
        this.setC();
    }
    protected void setC(){
        c = a* b ;
    }
    public String cetak(){
        return "Luas persegi panjang : "+this.getC();
    }
}
