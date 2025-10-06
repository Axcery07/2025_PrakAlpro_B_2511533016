package Pekan4;

import java.util.Scanner;

public class Tugaspekan4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Nama Pengirim : ");
        String nama = input.nextLine();
        System.out.print("Berat Paket : ");
        double berat = input.nextDouble();
        System.out.print("Jarak Pengiriman Dalam KM : ");
        int jarak = input.nextInt();
        System.out.print("Jenis Layanan (1=Reguler, 2=Express, 3=Same Day ) : ");
        int layanan = input.nextInt();
        System.out.print("Jenis Paket (1=Dokumen, 2=Barang Biasa, 3=Barang Elektronik) : ");
        int paket = input.nextInt();
        
        int hargaDasar = 10000;
        int biayaberat = (int) (berat * 5000);
        int biayajarak = jarak * 2000;
        
        int biayalayanan = 0;
        String jenislayanan = "";
        switch (layanan) {
            case 1: biayalayanan = 10000; jenislayanan = "Regular"; 
            break;
            case 2: biayalayanan = 20000; jenislayanan = "Express"; 
            break;
            case 3: biayalayanan = 40000; jenislayanan = "Same Day"; 
            break;
            
        }
        
        int biayapaket = 0;
        String jenispaket = "";
        switch (paket) {
            case 1: biayapaket = 10000; jenispaket = "Dokumen"; 
            break;
            case 2: biayapaket = 15000; jenispaket = "Barang Biasa"; 
            break;
            case 3: biayapaket = 50000;jenispaket = "Barang Elektornik"; 
            break;
        }
 
        int subtotal = hargaDasar + biayaberat + biayajarak;
        
        double diskonlayanan = biayalayanan * 0.5;
        
        double totalsebelumdiskon = diskonlayanan + biayapaket + subtotal ;
        
        double diskon = 0;
        if (jarak >= 20) {
            diskon = 0.2 * totalsebelumdiskon;
        } else diskon = 0;
        
        double totalbayar = totalsebelumdiskon - diskon;
        
        
        System.out.println("===== BIAYA PENGIRIMAN PAKET =====");
        System.out.println("Nama Pembeli     : " + nama);
        System.out.println("Jumlah berat     : " + berat  + " Kg");
        System.out.println("Jarak Pengiriman : " + jarak + " Km");
        System.out.println("Jenis Paket      : " + (paket==1?"Dokumen":(paket==2?"Barang Biasa":"Barang Elektronik")));
        System.out.println("Jenis layanan    : " + jenislayanan);
        System.out.println("-----------------------------------");
        System.out.println("Harga Dasar              : Rp " + hargaDasar);
        System.out.println("Harga Jarak              : Rp " + biayajarak);
        System.out.println("Subtotal                 : Rp " + subtotal);
        System.out.println("Harga Layanan (50 % )    : Rp " + diskonlayanan);
        System.out.println("Harga Jenis Paket        : Rp " + biayapaket);
        System.out.println("Harga Total Sebelum Disc : Rp " + totalsebelumdiskon);
        System.out.println("Diskon                   : Rp " + diskon);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BAYAR              : Rp " + (int)totalbayar);
        
        }
	}


          
