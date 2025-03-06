//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Resolution resolution=new Resolution(1920,1080);
            Monitor monitor=new Monitor("P248Q","ASUS","24,5inç",resolution);
            Kasa kasa = new Kasa("MSI-123","MSI","Temperli Cam");
            Anakart anakart=new Anakart("B550-Gaming","MSI",4,"Windows 11");

            Bilgisayar pc = new Bilgisayar(monitor,anakart,kasa);
            pc.getKasa().bilgisayari_ac();
            pc.getMonitor().monitoru_kapat();
            pc.getAnakart().isletim_sistemi_yukle("Ubuntu");
    }
}