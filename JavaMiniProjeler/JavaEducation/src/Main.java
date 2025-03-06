import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu giriniz : ");
        int kilo = scanner.nextInt();
        System.out.print("Lütfen Boyunu giriniz (ÖRN:1,77) :");
        double boy = scanner.nextDouble();
        double indeks = kilo / (boy * boy)   ;

        if(indeks < 18.5)
        {
            System.out.print("Zayıfsınız");
        }
        else if(indeks >= 18.5 && indeks < 25)
        {
            System.out.print("Normal");
        }
        else if(indeks >= 25 && indeks < 30)
        {
            System.out.print("kilolusunuz");
        }
        else
        {
            System.out.print("Obezsiniz");
        }
        }




    }

