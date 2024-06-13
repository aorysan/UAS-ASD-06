package algoritma;
public class Kendaraan {
    public String noTNKB;
    public String nama;
    public String jenis;
    public int cc;
    public int tahun;
    public int bulanHarusBayar;
    public Kendaraan prev;
    public Kendaraan next;


    public Kendaraan(Kendaraan prev, String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar, Kendaraan next){
        this.prev = prev;
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
        this.next = next;
    }

}
