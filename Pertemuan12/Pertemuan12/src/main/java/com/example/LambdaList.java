/**
 * File      : LambdaList.java
 * Nama      : Muhammad Farhan Abdul Azis
 * NIM       : 24060124140166
 * Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {

        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        System.out.println("=== Praktikum 3.2 - Ekspresi Lambda pada Collection ===");
        System.out.println("Daftar Nama Mahasiswa:");
        System.out.println("----------------------------------------------");

        // Lambda digunakan sebagai parameter pada forEach
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
