package doubleLinkedList;
import algoritma.Kendaraan;
import algoritma.transaksiPajak;

public class doubleLinkedList {
    Kendaraan head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    void addFirst(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if(isEmpty()) {
            head = new Kendaraan(null, noTNKB, nama, jenis, cc, bulanHarusBayar, null);
        } else {
            Kendaraan newNode = new Kendaraan(null, noTNKB, nama, jenis, cc, bulanHarusBayar, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if(isEmpty()) {
            addFirst(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
        } else {
            Kendaraan current = head;
            while(current.next != null) {
                current = current.next;
            }

            Kendaraan newNode = new Kendaraan(current, noTNKB, nama, jenis, cc, bulanHarusBayar, null);
            current.next = newNode;
            size++;
        }
    }

    public void printKendaraan() {
        if(!isEmpty()) {
            Kendaraan tmp = head;
            
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("           Daftar Kendaraan           ");
            System.out.println("++++++++++++++++++++++++++++++++++++++");

            System.out.println("| no TNKB\t| Nama Pemilik\t| Jenis\t| CC Kendaraan\t| Tahun\t| Bulan Harus Bayar \t|");

            while(tmp != null) {
                System.out.print("| " + tmp.noTNKB + "\t| " + tmp.nama + "\t\t| " + tmp.jenis + "\t| " + tmp.cc + "\t\t| " + tmp.tahun + "\t| " + tmp.bulanHarusBayar + " \t\t|\n");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("List kosong");
        }
    }

    public void printPajak(String noTNKB) throws Exception {
        System.out.println("| Kode\t| Nominal\t| Denda\t| Bulan\t|");

        System.out.println("| " + noTNKB + "\t| " + transaksiPajak.pajak(get(noTNKB)) + "\t| " + 0 + "\t| " + 1 + "\t|");
    }

    public int get(String noTNKB) throws Exception {
        if(isEmpty()) {
            throw new Exception("Nilai index melebihi batas");
        }

        Kendaraan tmp = head;

        for(int i = 0; i < size; i++) {
            if(tmp.noTNKB.equals(noTNKB)) {
                return tmp.cc;
            }
        }

        return tmp.cc;
    }
}
