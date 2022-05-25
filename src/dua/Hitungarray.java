package dua;

public class Hitungarray {

    private double average;
    private int max;
    private int min;

    public double getAverage(){
        return this.average;
    }
    public void setAverage(int[] array) {
        double total = 0 ;
        for(int num : array){
            total += num;
        }

        this.average = total/array.length;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int [] data) {
        int maximal = -100000;
        for (int number : data){
            maximal = number > maximal? number : maximal;
        }
        this.max = maximal;
    }

    public int getMin() {

        return min;
    }

    public void setMin(int [] min) {
        int minimal = 10000000;
        for(int a : min){
            minimal = minimal > a ? a : minimal;

        }

        this.min = minimal;
    }
    public int binarSearch(int [] data , int number){

        for(int i =0 ; i< data.length ; i++){
            if(data[i]==number){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Hitungarray satu = new Hitungarray();
        int [] data = {-5,-3,-6,-3,-4};
        int angka = -3;
        satu.setAverage(data);
        satu.setMax(data);
        satu.setMin(data);

        System.out.println("rata rata dari data adalah : "+satu.getAverage());
        System.out.println("angka terbesar dari data adalah : "+satu.getMax());
        System.out.println("angka terkecil dari data adalah : "+satu.getMin());
        System.out.println("angka "+angka+" dari data berada pada indeks : "+satu.binarSearch(data,angka ));
    }

}
