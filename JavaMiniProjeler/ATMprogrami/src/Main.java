//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Hesap hesap=new Hesap("berat123","12345",5353,"Ömer Berat Yıldırım",52350);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor");




        }
    }
