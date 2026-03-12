public class MBangunDatar {
    public static void main(String[] args) {
        // Objek Persegi 1
        Persegi p1 = new Persegi(5.0, "Merah", "Hitam");
        System.out.println("Informasi Objek Persegi 1:");
        p1.printInfo();
        
        System.out.println();

        // Objek Persegi 2
        Persegi p2 = new Persegi();
        p2.setSisi(10.0);
        p2.setWarna("Kuning");
        p2.setBorder("Biru");
        System.out.println("Informasi Objek Persegi 2:");
        p2.printInfo();
        
        System.out.println();

        // Objek Lingkaran 1
        Lingkaran l1 = new Lingkaran(7.0, "Biru", "Putih");
        System.out.println("Informasi Objek Lingkaran 1:");
        l1.printInfo();

        System.out.println();

        // Objek Lingkaran 2
        Lingkaran l2 = new Lingkaran();
        l2.setJariJari(14.0);
        l2.setWarna("Hijau");
        l2.setBorder("Merah");
        System.out.println("Informasi Objek Lingkaran 2:");
        l2.printInfo();

        System.out.println();

        // Mencoba panggil method-method lain secara langsung
        System.out.println("Detail tambahan:");
        System.out.println("Luas Persegi 2: " + p2.hitungLuas());
        System.out.println("Keliling Lingkaran 2: " + String.format("%.2f", l2.hitungKeliling()));
    }
}
