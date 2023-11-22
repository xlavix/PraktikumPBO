public class Main {
    public static void main(String[] args) {
        Mobil bmw = new Mobil();

        Mobil.Mesin v8 = bmw.new Mesin(4, 200);
        Mobil.Ban ban1 = bmw.new Ban("Michelin", 185/75);
        Mobil.Ban ban2 = bmw.new Ban("Michelin", 185/75);
        Mobil.Ban ban3 = bmw.new Ban("Michelin", 185/75);
        Mobil.Ban ban4 = bmw.new Ban("Michelin", 185/75);
        Mobil.HeadUnit HU = bmw.new HeadUnit("LG", 20);

        Sopir supri = new Sopir("Supri", bmw, "Bandung");

        v8.hidupkan();
        ban1.putar();
        ban2.putar();
        ban3.putar();
        ban4.putar();

        supri.mengemudi();
    }
}