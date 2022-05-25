package empat;

public class Vcd {
    private String judulFilm;
    private String namaAktor;
    private String namaSutradara;
    private String publisher;
    private String kategori ;

    public Vcd(String judulFilm, String namaAktor, String namaSutradara, String publisher, String kategori) {
        this.judulFilm = judulFilm;
        this.namaAktor = namaAktor;
        this.namaSutradara = namaSutradara;
        this.publisher = publisher;
        setKategori(kategori);
    }


    public String getJudulFilm() {
        return judulFilm;
    }

    public String getNamaAktor() {
        return namaAktor;
    }

    public String getNamaSutradara() {
        return namaSutradara;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getKategori() {
        return kategori;
    }




    private void setKategori(String kategori) {
        switch(kategori){
            case "D":
                this.kategori = "dewasa";
                break;

            case "R":
                this.kategori = "remaja";
                break;

            case "SU":
                this.kategori = "semua umur";
                break;

            case "A":
                this.kategori = "anak- anak";
                break;
        }
    }









}