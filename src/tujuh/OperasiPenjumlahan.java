package tujuh;



public class OperasiPenjumlahan extends OperasiBilanganAbs {
    @Override
    protected double getA() {
        return this.a;
    }

    @Override
    protected void setA(double a) {
        this.a= a;
    }

    @Override
    protected double getB() {
       return this.b;
    }

    @Override
    protected void setB(double b) {
        this.b = b;
    }

    @Override
    protected double getC() {
        return this.c;
    }

    @Override
    protected void setC() {
        this.c = a + b;
    }

    @Override
    protected void tampil() {
        System.out.printf("Hasil %f + %f = %f ",a,b,c);
    }
}
