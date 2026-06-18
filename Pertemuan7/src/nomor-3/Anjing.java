/* NIM  : 24060124140166
   Nama : Muhammad Farhan Abdul Azis
   Tanggal  : 27 April 2026
*/


// 3. Realisasi subkelas Anjing
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("melata");
    }

    @Override
    public void bersuara() {
        System.out.println("guk-guk");
    }
}
