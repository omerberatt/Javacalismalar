public class Yonetici extends Calisan {

    private int sorumlu_kisi;


    public Yonetici(String isim,int maas,String departman,int sorumlu_kisi){

        super(isim,maas,departman);
        this.sorumlu_kisi=sorumlu_kisi;

    }

    public void bilgilerigoster(){
        System.out.println("İsim: "+getIsim());
        System.out.println("maas: "+getMaas());
        System.out.println("departman: "+getDepartman());
        System.out.println("Sorumlukisisayisi: "+this.sorumlu_kisi);

    }

}
