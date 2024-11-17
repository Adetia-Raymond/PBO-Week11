/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.praktikumpbo_11;

/**
 *
 * @author Raymond
 */
public class PraktikumPBO_11 {

    public static void main(String[] args) {

//////////////////////PERPUSTAKAAN//////////////////////
        
        Pengarang p1 = new Pengarang("Budi");
        Pengarang p2 = new Pengarang("Andi");
        Pengarang p3 = new Pengarang("Siti");
                
        // Membuat objek-objek Buku
        Buku buku1 = new Buku("Pemrograman");
        Buku buku2 = new Buku("Algoritma");
        Buku buku3 = new Buku("Struktur Data");
        
        buku1.tambahPengarang(p1);
        buku1.tambahPengarang(p2);
        buku2.tambahPengarang(p2);
        buku3.tambahPengarang(p3);

        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi perpustakaan
        System.out.println("info Perpustakaan");
        perpustakaan.infoPerpustakaan();
        
//////////////////////KLUB//////////////////////
        
        // Membuat objek Anggota
        Anggota anggota1 = new Anggota("Andi");
        Anggota anggota2 = new Anggota("Budi");
        Anggota anggota3 = new Anggota("Cici");

        // Membuat objek Klub
        Klub klubBola = new Klub("Klub Sepak Bola");

        // Menambahkan anggota ke klub
        klubBola.tambahAnggota(anggota1);
        klubBola.tambahAnggota(anggota2);
        klubBola.tambahAnggota(anggota3);

        // Menampilkan informasi klub dan anggotanya
        klubBola.infoKlub();
        
    }
}
