/* NIM  : 24060124140166
   Nama : Muhammad Farhan Abdul Azis
   Tanggal  : 27 April 2026
*/


// 3. Realisasi subkelas Burung
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("cuit");
    }
}
