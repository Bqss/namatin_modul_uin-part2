package duabelas.entity;

public class Segitiga extends Bentuk {

        public Segitiga(double a , double b){
            this.b = b;
            this.a = a;
            this.setC();
        }
        protected void setC(){
            c = a* b*0.5 ;
        }
        public String cetak(){
            return "Luas Segitiga : "+this.getC();
        }

}
