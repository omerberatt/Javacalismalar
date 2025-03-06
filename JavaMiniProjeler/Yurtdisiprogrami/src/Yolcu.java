import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız Harç Bedeli :");
        this.harc= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hergangi bir siyasi yasağınız bulunuyor mu ?(evet ya da hayır)");
        String cevap = scanner.nextLine();
        if(cevap.equals("evet")){
            this.siyasiYasak=true;
        }
        else{
            this.siyasiYasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu ?");
         String cevap2 = scanner.nextLine();
         if(cevap2.equals("evet")){

             this.vizeDurumu=true;

         }
         else{
             this.vizeDurumu=false;
         }

    }
    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc<15){
            System.out.println("Lütfen Yurtdışı harcini tam yatırın '150TL'");
            return false;
        }
        else{
            System.out.println("Yurtdışı harcı ödenmiş.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak==true){

            System.out.println("Siyasi yasağınız bulunuyor,yurtdışına çıkış işlemi yapamazsınız!");
            return false;
        }
        else{
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;

        }

    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu==true){
            System.out.println("vize işlemler tamam!");
            return true;
        }
        else{
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır...");
            return false;
        }
    }
}
