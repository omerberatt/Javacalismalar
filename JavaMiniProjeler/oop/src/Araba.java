public class Araba {
    private String renk;
    private String motor;
    private String model;
    private int kapilar;
    private int tekerlekler;




    public String getModel() {
        return this.model;
    }
    public void setModel(String model){
        this.model=model;
    }




    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor){
        this.motor=motor;
    }





    public String getRenk() {
        return this.renk;
    }

    public void setRenk(String renk){
        this.renk=renk;
    }




    public int getKapilar() {
        return this.kapilar;
    }
    public void setKapilar(int kapilar){
        if(kapilar<0){
            System.out.println("Kapi sayısı 0'dan küçük olamaz!");
        }
        else{
            this.kapilar=kapilar;
        }

    }




    public int getTekerlekler() {
        return this.tekerlekler;
    }
    public void setTekerlekler(int tekerlekler){
        this.tekerlekler=tekerlekler;
    }






























}
