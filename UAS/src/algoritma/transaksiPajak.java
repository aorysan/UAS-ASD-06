package algoritma;
public class transaksiPajak {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan kendaraan;

    transaksiPajak(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }

    public long pajak(int cc) {
        if (cc < 100) {
            return nominalBayar = 100000;
        } else if (cc >= 100 && kendaraan.cc <= 250) {
            return nominalBayar = 250000;
        } else if (cc > 250) {
            return nominalBayar = 500000;
        } else if (cc < 1000) {
            return nominalBayar = 750000;
        } else if (cc >= 1000 && kendaraan.cc < 2500) {
            return nominalBayar = 1000000;
        } else if (cc > 2500) {
            return nominalBayar = 1500000;
        }
        return nominalBayar;
    }

    void denda(int bulanBayar) {
        if (bulanBayar <= 3 && bulanBayar >= 1) {
            denda = 50000;
        } else if (bulanBayar > 3) {
            denda *= bulanBayar *= 50000;
        }
    }

}
