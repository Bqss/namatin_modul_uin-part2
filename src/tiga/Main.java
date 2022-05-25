package tiga;

public class Main {
    public static void main(String[] args) {
        Matriks a = new Matriks();
        int [][] array1 = {
                {1,2},
                {3,5},
                {6,7}
        };
        int [][] array2 = {
                {8 , 9},
                {10,11},
                {12,13}
        };

        a.setHasilJumlah(array1,array2);
        int[][] hasilPenjumlahan = a.getHasilJumlah();
        a.displayArray(hasilPenjumlahan);
        a.setHasilPerkalian(hasilPenjumlahan,0.5);
        double [][] hasilPerkalian = a.getHasilPerkalian();
        a.displayArray(hasilPerkalian);

    }
}
