public class Main {
    public static void main(String[] args) {

    class Alan{
        public void daire_alan(int yaricap){
            System.out.println("Dairenin Alanı : "+(yaricap*yaricap*Math.PI));
        }
    }
            Alan alan = new Alan();
            Alan alan2 = new Alan();

            alan.daire_alan(10);
    }
}