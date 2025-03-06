public class Account {
    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

        public Account(String isim,String email,String telefonNo){

            this("Bilgi yok",0.0,isim,email,telefonNo);
        }



        public Account(String hesapno,double bakiye,String isim,String email,String telefonNo)
        {
            this.hesapno=hesapno;
            this.bakiye=bakiye;
            this.isim=isim;
            this.email=email;
            this.telefonNo=telefonNo;

        }


    public void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println("Yeni bakiyeniz : "+ bakiye);

    }
    public void paraCekme(double miktar){
        if(miktar > 1500){
            System.out.println("Günlük para çekme limitiniz 1500'ü geçemez");
        }
        if(bakiye-miktar<0){
            System.out.println("yeterli bakiyeniz bulunmamaktadır.");
        }
        else{
            bakiye-=miktar;
            System.out.println("Mevcut Bakiyeniz :"+bakiye);
        }
    }




    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
