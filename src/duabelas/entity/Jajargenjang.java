package duabelas.entity;

public class Jajargenjang extends Bentuk{

    public Jajargenjang(double a , double b){
        this.b = b;
        this.a = a;
        this.setC();
    }
    protected void setC(){
        c = a* b ;
    }
    public String cetak(){
        return "Luas jajar genjang : "+this.getC();
    }
}
