package lima;

public class Mahasiswa extends Universitas{
    private final String NIM,nama,alamat;
    private String jurusan;
    public Mahasiswa( String nama,String NIM, String alamat, String jurusan) {

        this.NIM = NIM;
        this.nama = nama;
        this.alamat = alamat;
        switch(jurusan){
            case "61"-> this.jurusan = "Matematika";
            case "62" -> this.jurusan = "Biologi";
            case "63" -> this.jurusan = "KIMIA";
            case "64" -> this.jurusan = "Fisika";
            case "65" -> this.jurusan = "Teknik Informatika";
            case "66" -> this.jurusan = "Teknik Arsitektur";
        }
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        return jurusan;
    }



}
