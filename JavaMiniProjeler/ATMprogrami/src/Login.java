import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap){

        Scanner scanner = new Scanner(System.in);
        String kullaniciadi;
        String parola;

        System.out.println("Kullanıcı adı :");
        kullaniciadi=scanner.nextLine();
        System.out.println("Parola :");
        parola =scanner.nextLine();

        if(hesap.getKullaniciadi().equals(kullaniciadi) && hesap.getParola().equals(parola))
        {
            return true;
        }

        else
        {
            return false;
        }

    }

}
