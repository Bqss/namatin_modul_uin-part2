package enam;

public class OperasiBilangancetak {
    private void tampilSemua(OperasiBilangan [] ob , double a, double b){
        for( OperasiBilangan obj : ob){
            obj.setA(a);
            obj.setB(b);
            obj.setC(a,b);
            obj.tampil();
        }
    }

    public static void main(String[] args) {
        OperasiBilangan[] ob = {new OperasiPenjumlahan() , new OperasiPerkalian(), new OperasiPengurangan() , new OperasiPembagian()};
        OperasiBilangancetak a = new OperasiBilangancetak();
        a.tampilSemua(ob,1,2);
    }

}
