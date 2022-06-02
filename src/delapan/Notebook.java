package delapan;

public class Notebook extends   Komputer{
    @Override
    public void tekan_enter() {
        System.out.println("Keyboard Notebook : Tekan Enter...");
    }

    @Override
    void hidupkan_os() {
        System.out.println("OS Notebook : dihidupkan...");
    }

    @Override
    void matikan_os() {
        System.out.println("OS Notebook : dimatikan...");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Mouse Notebook : Klik Kanan...");
    }

    @Override
    public void kllik_kiri() {
        System.out.println("Mouse Notebook : Klik Kiri...");
    }


    @Override
    public void cetak_data() {
        System.out.println("Printer Notebook : Cetak data...");
    }
}
