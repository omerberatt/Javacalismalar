import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void islemleri_bastir(){


        System.out.println("0 - İşlemleri Görüntüle...");
        System.out.println("1 - Bir sonraki şehire git...");
        System.out.println("2 - Bir önceki şehire git...");
        System.out.println("3 - Uygulamadan Çık...");
    }

    public static void sehirleri_turla(LinkedList<String> sehirler){
        ListIterator<String>iterator= sehirler.listIterator();
        int islem;
        islemleri_bastir();
        Scanner scanner = new Scanner(System.in);

        if(!iterator.hasNext()){
            System.out.println("Hwegangi bir şehir bulunmuyor.");
        }

        boolean cikis=false;
        boolean ileri=true;

        while(!cikis){
            System.out.println("Bir işlem seçiniz:");

            islem= scanner.nextInt();

            switch (islem){
                case 0 :
                    islemleri_bastir();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Şehre gidiliyor :"+iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı...");
                        ileri=true;

                    }
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Şehre Dönülüyor : "+iterator.previous());
                    }
                    else{
                        System.out.println("Şehir turu başladı...");

                    }
                    break;
                case 3:
                    cikis=true;
                    System.out.println("Uygulamadan Çıkılıyor");
                    break;

            }



        }
    }
    public static void main(String[] args) {
        LinkedList<String> sehirler= new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Rize");
        sehirler.add("İzmir");
        sehirler.add("Antalya");
        sehirler.add("Kahramanmaraş");
        sehirler.add("Hakkari");


        sehirleri_turla(sehirler);

    }
}