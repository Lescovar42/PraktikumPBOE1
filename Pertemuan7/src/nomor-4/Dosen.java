/* NIM  : 24060124140166
   Nama : Muhammad Farhan Abdul Azis
   Tanggal  : 27 April 2026
*/


public class Dosen extends CivitasAkademika {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    @Override
    public String getNomor() {
        return this.nip;
    }
}
