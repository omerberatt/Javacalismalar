public class ComplexUserCheckService implements IUserCheckService{
    public boolean checkUser(User user){
        if(user.getAge()>=18 && user.getName().startsWith("Öm")){
            return true;
        }
        return false;


    }
}
