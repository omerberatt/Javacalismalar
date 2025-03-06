import java.util.LinkedList;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){
        ListIterator<String> iterator= gidilecek_yerler.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public static void sirali_ekle(LinkedList<String> gidilecek_yerler,String yeni){
        ListIterator<String> iterator= gidilecek_yerler.listIterator();

        while (iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);
                if(karsilastir==0){
                    //iki değer eşit
                    System.out.println("Listeniz bu eleman zaten var ");
                    return;
                }
                else if(karsilastir<0){
                        //yeni değer iterator.nextten daha büyük
                } else if (karsilastir>0) {
                    iterator.previous();
                    iterator.add(yeni);
                    return;
                }


        }

        iterator.add(yeni);


    }
    public static void main(String[] args) {
        LinkedList<String> gidilecek_yerler = new LinkedList<>();
        sirali_ekle(gidilecek_yerler,"Postane");
        sirali_ekle(gidilecek_yerler,"Market");
        sirali_ekle(gidilecek_yerler,"Ev");

        listeyi_bastir(gidilecek_yerler);


    }

}