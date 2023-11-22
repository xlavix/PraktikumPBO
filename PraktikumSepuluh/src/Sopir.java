public class Sopir {
    String nama;
    Mobil mobil;
    String tujuan;
    public Sopir(String nama, Mobil mobil, String tujuan){
        this.nama = nama;
        this.mobil = mobil;
        this.tujuan = tujuan;
    }

    public void mengemudi(){
        System.out.println(this.nama + " sedang mengendarai mobil menuju " + this.tujuan);
    }
}
