import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik ve Fizik Problemleri Programına hoşgeldiniz...");
        String islemler="İşlemler....\n"
                +"1.Daire Alanı Hesaplama\n"
                +"2.Üçgen Çevresi Hesaplama\n"
                +"3. '2'Vektörün İç Çarpımını Hesaplama\n"
                +"Çıkış için q'ya Basın...\n";



        while(true){
            System.out.println(islemler);
            System.out.println("İşlem Seçiniz :");
            islemler= scanner.nextLine();


            if(islemler.equals("q")){
                System.out.println("Çıkış yapılıyor");
                break;
            }
            else if(islemler.equals("1")){
                System.out.println("Dairenin Yarıçapı: ");
                int yaricap= scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);

            }
            else if(islemler.equals("2")){
                System.out.println("Kenar 1 :");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 :");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3 :");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.ucgeninCevresi(kenar1,kenar2,kenar3);

            } else if (islemler.equals("3")) {
                Vec vec1= new Vec("Vektör 1");
                Vec vec2= new Vec("Vektör 2");

                Problem.Fizik.icCarpim(vec1,vec2);

            }

            else{
                System.out.println("Geçersiz işlem...");
            }

        }


    }
}