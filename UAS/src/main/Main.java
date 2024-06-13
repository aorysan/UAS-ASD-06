package main;
import java.util.Scanner;

import doubleLinkedList.doubleLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        doubleLinkedList kendaraan = new doubleLinkedList();

        kendaraan.addLast("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        kendaraan.addLast("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        kendaraan.addLast("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        kendaraan.addLast("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        Scanner sci = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        int pilih;
        do {
            menu();
            pilih = sci.nextInt();
            switch (pilih) {
                case 1:
                    kendaraan.printKendaraan();
                    break;
                case 2:
                    System.out.println("--------------------------");
                    System.out.println(" Masukkan data pembayaran ");
                    System.out.println("--------------------------");

                    System.out.print("Nomor TNKB: ");
                    String tnkb = scs.next();

                    System.out.print("Bulan pembayaran: ");
                    int bulan = sci.nextInt();

                    kendaraan.printPajak(tnkb);
                    break;
                case 3:
                    System.out.println("Tampilkan seluruh transaksi");
                    break;
                case 4:
                    System.out.println("Urutkan transaksi");
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan yang anda masukkan salah");
            }
        } while (pilih != 5);
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Daftar kendaraan");
        System.out.println("2. Bayar pajak");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkan transaksi");
        System.out.println("5. Keluar");
        System.out.print("Silahkan pilih menu: ");
    }
}
