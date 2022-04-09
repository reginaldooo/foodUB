/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foodub;
import java.util.Scanner;
/**
 *
 * @author REGIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama    : Muhammad Farrel Reginaldo Ahnaf");
        System.out.println("NIM     : 215150607111017");
        System.out.println(" ");
                
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        System.out.println("Masukkan Nama Merchant, Nama Produk, Harga Makanan : ");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(in.nextLine(), in.nextLine(), in.nextDouble()));
        DataMerchant.tampilData();

    }
    
}
