import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap){
        Login login=new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz.......");
        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*****************************");
        int girishakki=3;

        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else {
                System.out.println("Giriş Başarısız...");
                girishakki-=1;
                System.out.println("Kalan Giriş Hakkı..."+girishakki);
            }
            if(girishakki==0){
                System.out.println("Giriş hakkınız bitmiştir...");
                return;
            }
        }
        System.out.println("***********************************");
        String islemler ="1.Bakiye Görüntüle\n"+"2.Para Yatırma\n"+"3.Para Çekme\n";
        System.out.println(islemler);
        System.out.println("***********************************");

        while(true){
            System.out.println("İşlemi seçiniz:\n1.Bakiye Görüntüle\n"+"2.Para Yatırma\n"+"3.Para Çekme\n"+"Çıkış için 'q'ya basın.\n ");
            String islem = scanner.nextLine();

            if(islem.equals("q"))
            {
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.println("Bakiyeniz :"+hesap.getBakiye());

            }
            else if(islem.equals("2"))
            {
                System.out.println("Yatırmak istediğiniz istediğiniz miktarı giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.parayatirma(tutar);
            }
            else if(islem.equals("3"))
            {
                System.out.println("Çekmek istediğiniz miktarı giriniz : ");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap.paracekme(tutar);
            }
            else
            {
                System.out.println("Geçersiz işlem...");
            }

        }


    }

}
