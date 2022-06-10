package duabelas.entity;

public class LayangLayang extends Bentuk{

    public LayangLayang(double a , double b){
        this.b = b;
        this.a = a;
        this.setC();
    }
    protected void setC(){
        c = a* b * 0.5 ;
    }
    public String cetak(){
        return "Luas layang-layang : "+this.getC();
    }
}
