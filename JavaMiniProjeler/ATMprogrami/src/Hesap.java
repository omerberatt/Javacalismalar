public class Hesap {


    private String kullaniciadi;
    private String parola;
    private int hesapno ;
    private String isim;
    private double bakiye;

    public Hesap(String kullaniciadi, String parola, int hesapno, String isim, int bakiye) {
        this.kullaniciadi = kullaniciadi;
        this.parola = parola;
        this.hesapno = hesapno;
        this.isim = isim;
        this.bakiye = bakiye;
    }

    public void paracekme(double miktar){
        if(bakiye-miktar<0){
            System.out.println("Yetersiz bakiye, Mevcut Bakiyeniz :" + getBakiye());
        }
        else {
            bakiye-=miktar;
            System.out.println("İşlem Başarılı! Mevcut Bakiyeniz : "+ getBakiye());
        }

    }
    public void parayatirma(double miktar) {
        bakiye+=miktar;
        System.out.println("İşlem Başarılı! Mevcut Bakiyeniz: "+getBakiye());

    }

        public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getHesapno() {
        return hesapno;
    }

    public void setHesapno(int hesapno) {
        this.hesapno = hesapno;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
