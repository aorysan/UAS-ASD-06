package doubleLinkedList;
import algoritma.Kendaraan;
import algoritma.transaksiPajak;

public class doubleLinkedList {
    Kendaraan head;
    transaksiPajak tp;
    int size;
    int kode;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    void addFirst(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if(isEmpty()) {
            head = new Kendaraan(null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
        } else {
            Kendaraan newNode = new Kendaraan(null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, head);
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

            Kendaraan newNode = new Kendaraan(current, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
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

            System.out.println("| no TNKB\t| Nama Pemilik\t| Jenis\t| CC Kendaraan  | Tahun\t| Bulan Harus Bayar |");

            while(tmp != null) {
                System.out.print("| " + tmp.noTNKB + "\t| " + tmp.nama + "\t\t| " + tmp.jenis + "\t| " + tmp.cc + "\t\t| " + tmp.tahun + "\t\t| " + tmp.bulanHarusBayar + "\t\t   |\n");
                tmp = tmp.next;
            }
        } else {
            System.out.println("List kosong");
        }
    }

    public void printPajak(String noTNKB) throws Exception {
        if(isEmpty()) {
            throw new Exception("Melebihi batas");
        }

        Kendaraan tmp = head;

        while (tmp != null) {
            if(tmp.noTNKB.equalsIgnoreCase(noTNKB)) {
                break;
            } else {
                tmp = tmp.next;
            }
        }

        System.out.println("| Kode\t| TNKB\t| Nama\t| Nominal\t| Denda \t|");

        String nama = getNama(noTNKB);
        String tnkb = getTNKB(noTNKB);
        int cc = getCC(noTNKB);
        long pajak = tp.pajak(cc);
        long denda = tp.denda(tmp.bulanHarusBayar);
        kode++;

        System.out.println("| " + kode + "\t| " + tmp.noTNKB + "\t| " + tmp.nama + "\t| " + pajak + "\t| " + denda + "\t\t|");
    }

    public int getCC(String noTNKB) throws Exception {
        if(isEmpty()) {
            throw new Exception("Melebihi batas");
        }

        Kendaraan tmp = head;

        while (tmp != null) {
            if(tmp.noTNKB.equalsIgnoreCase(noTNKB)) {
                return tmp.cc;
            } else {
                tmp = tmp.next;
            }
        }

        return 0;
    }

    public String getNama(String noTNKB) throws Exception {
        if(isEmpty()) {
            throw new Exception("Melebihi batas");
        }

        Kendaraan tmp = head;

        while (tmp != null) {
            if(tmp.noTNKB.equalsIgnoreCase(noTNKB)) {
                return tmp.nama;
            } else {
                tmp = tmp.next;
            }
        }
        return null;
        }
        
        public String getTNKB(String noTNKB) throws Exception {
            if(isEmpty()) {
            throw new Exception("Melebihi batas");
            }

        Kendaraan tmp = head;
        while (tmp != null) {
            if(tmp.noTNKB.equalsIgnoreCase(noTNKB)) {
                return tmp.noTNKB;
                } else {
                    tmp = tmp.next;
            }
        }
        
        return null;
    }
}
                