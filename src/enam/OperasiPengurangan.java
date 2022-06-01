package enam;

public class OperasiPengurangan extends OperasiBilangan {

    protected void setC(double a , double b ){
        this.c = a-b;    }

    protected void tampil(){
        System.out.printf("hasil %.2f - %.2f : %.2f \n" ,this.getA(),this.getB(),this.getC());
    }

}
