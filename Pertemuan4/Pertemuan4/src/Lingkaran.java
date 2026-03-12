public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran() {
        // Lingkaran often represented as having 1 side (the circumference) or 0
        setJmlSisi(1);
    }

    public Lingkaran(double jariJari, String warna, String border) {
        super(1, warna, border);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
