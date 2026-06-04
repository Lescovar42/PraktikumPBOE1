/**
 * File      : LambdaMap.java
 * Nama      : Muhammad Farhan Abdul Azis
 * NIM       : 24060124140166
 * Deskripsi : Menampilkan key (NIM) dan value (Nama) dari sebuah Map
 *             menggunakan ekspresi lambda.
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {

        // Membuat Map dengan key = NIM, value = Nama Mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124140166", "Muhammad Farhan Abdul Azis");
        mahasiswaMap.put("24060124140001", "Adi Nugroho");
        mahasiswaMap.put("24060124140002", "Bambang Setiawan");
        mahasiswaMap.put("24060124140003", "Cici Rahayu");
        mahasiswaMap.put("24060124140004", "Didi Prasetyo");

        System.out.println("=== Latihan - Lambda pada Map ===");
        System.out.println("Data Mahasiswa (NIM -> Nama):");
        System.out.println("--------------------------------------------------");

        // Lambda digunakan pada forEach Map dengan parameter key dan value
        mahasiswaMap.forEach((nim, nama) ->
            System.out.println("NIM : " + nim + " | Nama : " + nama)
        );

        System.out.println("--------------------------------------------------");
        System.out.println("Total mahasiswa: " + mahasiswaMap.size());
    }
}
