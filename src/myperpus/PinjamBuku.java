/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myperpus;

import java.util.Scanner;
import static myperpus.TampilMenu.MenuPerpus;

/**
 *
 * @author harun, reza, rizal, seli, teguh, wisnu
 */

//outer class
//parent class
public class PinjamBuku {
    //deklarasi variabel
    int id, jenis;
 
    //inner class
    private class daftarMember {
        
    }
    
    
    //method menu utama
    public static void MenuPerpus() {
        //inisialisasi scanner
        Scanner scanner = new Scanner(System.in);
        
        //wrapper class
        Integer pilihmenu = new Integer(0);
        
        //menu utama yang ditampilkan pertama
        System.out.println("===========================================================");
        System.out.println("                     MENU MyPerpus                         ");
        System.out.println("===========================================================");
        System.out.println("1. Daftar Member ");
        System.out.println("2. Pinjam Buku");
        System.out.println("3. Kembali Buku");
        System.out.println("===========================================================");
        System.out.print("Pilih Menu: ");
        pilihmenu = scanner.nextInt();

        //percabangan pada menu
        switch (pilihmenu) {
            case 1:
                //memanggil method dari class TampilMenu.java (konsep polimorfisme)
                DaftarMember();
                break;
            case 2:
                //memanggil method dari class PinjamBuku.java (konsep polimorfisme)
                PinjamBuku pb = new PinjamBuku();
                pb.pinjamBuku();
                break;
            case 3:
                //memanggil method dari class PinjamBuku.java (konsep polimorfisme)
                PinjamBuku kb = new PinjamBuku();
                kb.kembaliBuku();
            default:
        }
    }
    
    //method Daftar Member
    public static void DaftarMember(){
        Scanner a = new Scanner(System.in);
        int id_member;
        String namaMember, emailMember, telpMember, alamatMember, pil;
        System.out.println("===========================================================");
        System.out.println("                   DAFTAR MEMBER BARU                      ");
        System.out.println("===========================================================");
        System.out.print("Masukkan ID Member         = ");
        id_member = a.nextInt();
        System.out.print("Masukkan Nama Member       = ");
        namaMember = a.next();
        System.out.print("Masukkan Email Member      = ");
        emailMember = a.next();
        System.out.print("Masukkan Telpon Member     = ");
        telpMember = a.next();
        System.out.print("Masukkan Alamat Member     = ");
        alamatMember = a.next();

        int _arr[] = new int[id_member];
        String nama_arr[] = new String[id_member];

        System.out.println("");
        System.out.println("==========================================================");
        System.out.println("                     DATA PEMINJAM                        ");
        System.out.println("==========================================================");
        System.out.println("ID Member                   = " + id_member);
        System.out.println("Nama Member                 = " + namaMember);
        System.out.println("Email Member                = " + emailMember);
        System.out.println("Telepon Member              = " + telpMember);
        System.out.println("Alamat Member               = " + alamatMember);

        System.out.println("==========================================================");

        System.out.print("Masuk Menu Lagi?(Y/N): ");
        pil = a.next();

        if (pil.equals("Y")) {
        Scanner scanner = new Scanner(System.in);
        int pilihmenu;
        System.out.println("Menu");
        System.out.println("1. Daftar Member ");
        System.out.println("2. Pinjam Buku");
        System.out.println("3. Kembali Buku");
        System.out.print("Pilih Menu: ");
        pilihmenu = scanner.nextInt();

        switch (pilihmenu) {
            case 1:
                DaftarMember();
                break;
            case 2:
                PinjamBuku pb = new PinjamBuku();
                pb.pinjamBuku();
                break;
            case 3:
                PinjamBuku.kembaliBuku();
                break;
            default:
        }
        } else if (pil.equals("N")) {
            System.out.println("terima kasih,kembali lagi nanti");
        } else {
            System.out.println("harap masukan pilihan yang benar");
            System.out.println("--------------------------------");
            System.out.print("Masuk Menu Lagi?(Y/N): ");
            pil = a.next();
        }
    }
    
    //method pinjam buku
    public static void pinjamBuku() {
        //inisialisasi scanner
        Scanner a = new Scanner(System.in);
        
        //wrapper class
        Integer id = new Integer(0); 
        Integer jenis = new Integer(0);
        String namaMember;
        
        //input form data peminjam
        System.out.println("===========================================================");
        System.out.println("INPUT DATA PEMINJAM");
        System.out.println("===========================================================");
        System.out.print("Masukkan Nama       = ");
        namaMember = a.nextLine();
        System.out.print("Masukkan No. Member = ");
        id = a.nextInt();
        System.out.print("Masukan Jumlah Buku = ");
        jenis = a.nextInt();
        System.out.println("==========================================================");

        //tentukan jumlah arraynya sebanyak nilai jenis
        int jenis_arr[] = new int[jenis];
        String judul_arr[] = new String[jenis];
        String pil;

        //lakukan pengulangan
        for (int b = 0; b < jenis; b++) {
            System.out.print("Masukan Judul Buku : ");
            judul_arr[b] = a.next();

        }
        
        //hasil input form pinjam buku
        System.out.println("");
        System.out.println("==========================================================");
        System.out.println("DATA PEMINJAM");
        System.out.println("==========================================================");
        System.out.println("Nama Member               = " + namaMember);
        System.out.println("ID Member                 = " + id);
        System.out.println("==========================================================");
        System.out.println("DAFTAR BUKU YANG DIPINJAM");
        System.out.println("==========================================================");
        
        //perulangan menghitung jumlah buku yang dipinjam
        for (int b = 0; b < jenis; b++) {
            System.out.println("Judul Buku Ke : " + b + ": " + judul_arr[b]);
        System.out.print("Kembali ke Menu? Y/N : ");
        pil = a.next();
        
        //percabangan ketika kita ingin ke menu lagi atau keluar program 
        if(pil.equals("Y")) {
            //ketika user input "Y" maka dialihkan ke method menuPerpus()
            MenuPerpus();
        } else {
            //ketika user input selain "Y" maka memunculkan pesan dibawah
            System.out.println("Terima kasih, kembali lagi nanti");
        }
        }
    }
    
    //method kembali buku
    public static void kembaliBuku(){
         Scanner a = new Scanner(System.in);
        int id, jenis;
        String namaMember, pil;
        
        //input form kembaliBuku
        System.out.println("===========================================================");
        System.out.println("INPUT DATA KEMBALI");
        System.out.println("===========================================================");
        System.out.print("Masukkan Nama       = ");
        namaMember = a.nextLine();
        System.out.print("Masukkan No. Member = ");
        id = a.nextInt();
        System.out.print("Masukan Jumlah Buku = ");
        jenis = a.nextInt();
        System.out.println("==========================================================");

        //tentukan jumlah arfraynya sebanyak nilai jenis
        int jenis_arr[] = new int[jenis];
        String judul_arr[] = new String[jenis];

        //lakukan pengulangan
        for (int b = 0; b < jenis; b++) {
            System.out.print("Masukan Judul Buku : ");
            judul_arr[b] = a.next();

        }
        
        //hasil input form peminjam
        System.out.println("");
        System.out.println("==========================================================");
        System.out.println("                       DATA PEMINJAM                      ");
        System.out.println("==========================================================");
        System.out.println("Nama Member               = " + namaMember);
        System.out.println("ID Member                 = " + id);
        System.out.println("==========================================================");
        System.out.println("DAFTAR BUKU YANG KEMBALIKAN");
        System.out.println("==========================================================");
        for (int b = 0; b < jenis; b++) {
            System.out.println("Judul Buku Ke : " + b + ": " + judul_arr[b]);
        System.out.print("Kembali ke Menu? Y/N : ");
        pil = a.next();
        //percabangan ketika kita ingin ke menu lagi atau keluar program 
        if(pil.equals("Y")) {
            MenuPerpus();
        } else {
            System.out.println("Terima kasih, kembali lagi nanti");
        }
        }
    }

}
