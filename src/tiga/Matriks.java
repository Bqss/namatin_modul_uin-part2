package tiga;

public class Matriks {
    private int [][] hasilJumlah;
    private double [][] hasilPerkalian;

    public int[][] getHasilJumlah() {
        return hasilJumlah;
    }

    public void setHasilJumlah(int [][] array1  , int [][] array2 ) {
        hasilJumlah = new int[array1.length][array1[0].length];
        for(int i = 0 ; i< array1.length ; i++){
            for(int j =0 ; j<array1[0].length ;j++){
                hasilJumlah[i][j] = array1[i][j] + array2[i][j];
            }
        }

    }

    public double[][] getHasilPerkalian() {
        return hasilPerkalian;
    }

    public void setHasilPerkalian(int[][] hasilpenjumlahan , double angkaPengali) {
        hasilPerkalian = new double [hasilpenjumlahan.length][hasilpenjumlahan[0].length];
        for(int i = 0 ; i< hasilpenjumlahan.length ; i++){
            for(int j =0 ; j < hasilpenjumlahan[0].length ; j++){
                hasilPerkalian[i][j] = hasilpenjumlahan[i][j]* angkaPengali;
            }
        }
    }

    public void displayArray(int [][] array){
        for(int i =0 ; i< array.length ; i++){
            System.out.print("|");
            for(int j =0 ; j < array[0].length ; j++){
                if(j ==0){
                    System.out.print(" "+array[i][j]+" ");
                }else {
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println("|");
        }
        System.out.println("");
    }
    public void displayArray(double [][] array){
        for(int i =0 ; i< array.length ; i++){
            System.out.print("|");
            for(int j =0 ; j < array[0].length ; j++){
                if(j ==0){
                    System.out.print(" "+array[i][j]+" ");
                }else {
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println("|");
        }
        System.out.println("");
    }





}
