/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5601;

/**
 *
 * @author wayan
 * TGL: 4/26/2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia johan =  new manusia();
        johan.warnakulit="brown";
        johan.SetWarnaRambut("Hitam");
        
        manusia yani = new manusia();
        yani.warnakulit="Merah";
        yani.SetWarnaRambut("Kuning");
    }
    
}

class manusia{
    public String warnakulit="";
    private String warnarambut="";
    
    public void SetWarnaRambut(String warna){
        //menambahkan kode idetifikasi
        this.warnarambut = warna;
    }
    
}
