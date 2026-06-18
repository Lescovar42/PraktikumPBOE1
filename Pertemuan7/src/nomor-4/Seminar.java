/* NIM  : 24060124140166
   Nama : Muhammad Farhan Abdul Azis
   Tanggal  : 27 April 2026
*/

public class Seminar {
    private int banyakPeserta;
    private int kapasitas = 100;
    private CivitasAkademika[] pesertas;

    public Seminar() {
        this.pesertas = new CivitasAkademika[kapasitas];
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(CivitasAkademika peserta) {
        if (banyakPeserta < kapasitas) {
            this.pesertas[banyakPeserta] = peserta;
            this.banyakPeserta++;
        }
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor() + "; Nama: " + pesertas[i].getNama());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
