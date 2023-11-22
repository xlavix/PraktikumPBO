public class Mobil {
    public Mesin mesin;
    public Ban ban;
    public HeadUnit headunit;

    public Mobil(){}

    public void jalan(){
        System.out.println("Mobil sedang berjalan");
    }

    public void putarMusik(){
        headunit.putarMusik();
    }

    public class Mesin{
        int silinder;
        int tenagaKuda;
        Mesin(int silinder, int tenagaKuda){
            this.silinder = silinder;
            this.tenagaKuda = tenagaKuda;
        }
        public void hidupkan(){
            System.out.println("Mesin dinyalakan");
        }
    }

    public class Ban{
        String merekBan;
        int ukuranBan;
        public Ban(String merekBan, int ukuranBan){
            this.merekBan = merekBan;
            this.ukuranBan = ukuranBan;
        }
        public void putar(){
            System.out.println("Ban berputar");
        }
    }

    public class HeadUnit{
        String merekHeadUnit;
        int ukuranLayar;
        public HeadUnit(String merekHeadUnit, int ukuranLayar){
            this.merekHeadUnit = merekHeadUnit;
            this.ukuranLayar = ukuranLayar;
        }
        public void putarMusik(){
            System.out.println("Head Unit memutar musik");
        }
    }
}
