/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raymond
 */

class Pengarang{
    private String namaPengarang;
    
    public Pengarang(String namaPengarang){
        this.namaPengarang = namaPengarang;
    }
    
    public void infoPengarang() {
    System.out.println("Nama Pengarang: " + namaPengarang);
    }
}

class Buku {
    private String judul;
    private List<Pengarang> listPengarang;
    
    public Buku(String judul) {
    this.judul = judul;
    this.listPengarang = new ArrayList<>();
    }
    
    public void tambahPengarang(Pengarang pengarang) {
    listPengarang.add(pengarang);
    }
    
    public void infoBuku() {
    System.out.println("Judul Buku: " + judul);
        for (Pengarang pengarang : listPengarang) {
            pengarang.infoPengarang();
        }
    }
}

class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
    this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
    bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
