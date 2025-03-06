//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sekil sekil;
        sekil = new Kare("kare2",6);
        sekil.alan_hesapla();
        sekil.cevre_hesapla();


        Kare kare1=new Kare("Kare1",5);
        Daire daire1=new Daire("Daire1",3);

        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesapla();
    }
}