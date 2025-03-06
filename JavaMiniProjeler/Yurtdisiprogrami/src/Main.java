//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz!....");
        String sartlar = "********** Yurtdışı Çıkış Kuralları **********\n"+
                         "1.Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.\n"+
                         "2.150TL harç bedelinizi tam olarak yatırmanız gerekmektedir.\n"+
                         "3.Gideceğiniz ülkeye vizenizin bulunması gerekiyor...\n";
        String message = "Yurtdışı şartlarının hepsini sağlamanız gerekiyor";

        while(true){
            System.out.println("*************************************");
            System.out.println(sartlar);



            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor.....");

            Thread.sleep(3000);
            if(yolcu.yurtdisiHarciKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor....");
            Thread.sleep(3000);
            if(yolcu.siyasiYasakKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor....");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam! Yurtdışına çıkabilirsiniz...");
            break;

        }

    }
}