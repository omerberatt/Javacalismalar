
public class Main {
    public static void main(String[] args) {

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);
            String[] tecrube={};
            String[] referans={"Mustafa bey","ömer berat","Enes özsarı"};

        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.76));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();





    }
}