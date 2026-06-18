
// Nama File    : OperatorGenerik.java
// NIM          : 24060124140166
// Nama         : Muhammad Farhan Abdul Azis
// Tanggal      : 2 Mei 2026

public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}
