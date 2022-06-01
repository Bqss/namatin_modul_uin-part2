package tujuh;



public final class OperasiBilanganAbsCetak {


    public static void main(String[] args) {
        OperasiBilanganAbs [] ob = {new OperasiPenjumlahan(),new OperasiPengurangan(),new OperasiPerkalian(),new OperasiPembagian()};
        OperasiBilanganAbsCetak n = new OperasiBilanganAbsCetak();
        n.cetakSemua(ob,6.5,0.5);


    }
    private void cetakSemua(OperasiBilanganAbs [] ob , double a , double b){
        for (OperasiBilanganAbs m : ob){
            m.setA(a);
            m.setB(b);
            m.setC();
            m.tampil();
        }
    }

}
