import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Hangi Beybladeyi üretmek istiyorsunuz ?");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Sistemden çıkış yapılıyor");
                break;
            }
            else{
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeuret(islem);
                if(beyblade==null){
                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }


            }


        }

    }
}