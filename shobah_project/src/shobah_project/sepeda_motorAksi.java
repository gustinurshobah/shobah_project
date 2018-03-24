/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shobah_project;

/**
 *
 * @author ASUS
 */
public class sepeda_motorAksi {
    public static void main(String[] args) {
        sepeda_motor honda = new sepeda_motor();
        sepeda_motor yamaha = new sepeda_motor();
        sepeda_motor suzuki = new sepeda_motor();
        
        honda.type="scoopy";
        honda.merk="honda";
        honda.warna="brown";
        honda.harga="18950500";
        honda.nopol="DA 5321 BCF";
        
        yamaha.type="NMX";
        yamaha.merk="yamaha";
        yamaha.warna="putih";
        yamaha.harga="40000000";
        yamaha.nopol="DA 6564 PBB";
        
        suzuki.type="GSX-R150";
        suzuki.merk="suzuki";
        suzuki.warna="merah hitam";
        suzuki.harga="27500000";
        suzuki.nopol="DA 6323 KAB";
    }
    
}
