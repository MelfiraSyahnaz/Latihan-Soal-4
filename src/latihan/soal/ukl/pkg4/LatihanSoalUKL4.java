/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.soal.ukl.pkg4;

/**
 *
 * @author MOKLET-2
 */
public class LatihanSoalUKL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sukuPertama = 5; //nilai dari suku pertama
        int selisih = 5; // nilai beda atau selisih setiap sukunya
        int sukuTerakhir = 50; //nilai dari suku terakhir
        int updateNilai;
        int total = 0; // inisialisasi variabel total
        
        for (int i = 0; i < 5; i++) { //membuat perulangan menurun/vertikal
           for (int a = 0; a < i; a++){ //membuat perulangan menyamping/horizontal
               
               updateNilai = sukuPertama;
               sukuPertama += selisih;
               System.out.print ( " " +updateNilai);
           }
            System.out.println (" ");
        }
    }
    
}
