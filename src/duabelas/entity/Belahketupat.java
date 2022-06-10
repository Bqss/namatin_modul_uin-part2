package duabelas.entity;

public class Belahketupat extends Bentuk{

    public Belahketupat(double a , double b){
        this.b = b;
        this.a = a;
        this.setC();
    }
        protected void setC(){
            c = a* b *0.5;
        }
        public String cetak(){
            return "Luas belah ketupat : "+this.getC();
        }

}
