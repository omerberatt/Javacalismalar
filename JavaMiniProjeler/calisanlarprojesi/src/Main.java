import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        String islemler = "İşlemler...\n1. Yazılımcı İşlemleri\n2. Yönetici İşlemleri\nÇıkış İçin q'ya basın";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");

        while(true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                return;
            }

            if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Mustafa Murat", "Coşkun", 567, "Python,C,Java");
                String yazilimci_islem = "1. Format At\n2. Bilgileri Göster\nÇıkış için q'ya basın";
                System.out.println(yazilimci_islem);

                while(true) {
                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }

                    if (y_islem.equals("1")) {
                        System.out.print("İşletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgilerigoster();
                    } else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }
                }
            } else if (!islem.equals("2")) {
                System.out.println("Geçersiz İşlem....");
            } else {
                Yonetici yonetici = new Yonetici("Serhat", "Say", 123, 10);
                String yonetici_islem = "Yönetici İşlemleri\n1. Zam Yap\n2. Bilgileri Göster\nÇıkış için q'ya basın";
                System.out.println(yonetici_islem);

                while(true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    }

                    if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    } else if (y_islem.equals("2")) {
                        yonetici.bilgilerigoster();
                    } else {
                        System.out.println("Geçersiz Yönetici İşlemi....");
                    }
                }
            }
        }
    }
}