public class Calisan {
    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim,int maas,String departman){
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
    }
    public void calis(){
        System.out.println("Çalışan çalışıyor....");

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void bilgilerigoster(){
        System.out.println("İsim: "+isim);
        System.out.println("maas: "+maas);
        System.out.println("departman: "+departman);

    }
    public void departmandegis(String yeni_departman){
        System.out.println("Departman değiştiriliyor...");
        this.departman=yeni_departman;
        System.out.println("Yeni departman: "+ yeni_departman);

    }


}
