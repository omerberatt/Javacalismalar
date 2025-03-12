public class Sayisal extends Aday{


    public Sayisal(int turkce, int matematik, int edebiyat, int fizik,String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puanhesapla() {

        return getTurkce()*4 + getMatematik()*5 + getFizik()*4 + getEdebiyat()*1;



    }
}
