public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());
        signUpManager.signUp(new User(1,"Berat",23));
    }
}