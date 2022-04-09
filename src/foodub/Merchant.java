/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodub;

/**
 *
 * @author REGIN
 */
public class Merchant {
    
 private String namaMch;
    private String namaProduk;
    private double hargaMakanan;

    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan) {
        this.namaMch   = namaMch;
        this.namaProduk     = namaProduk;
        this.hargaMakanan   = hargaMakanan;
    }

    public String getNamaMerchant() {
        return namaMch;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMch = namaMch;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }


}

