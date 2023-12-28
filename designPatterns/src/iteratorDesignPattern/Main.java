package iteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement=new UserManagement();
        userManagement.addUser(new User("123","saurav"));
        userManagement.addUser(new User("342","Scooby"));
        userManagement.addUser(new User("65476","Keshav"));

        // want to traverse
        MyIterator myIterator=userManagement.getIterator();
        while (myIterator.hasNext()){
            User user=(User) myIterator.next();
            System.out.println(user);
        }
    }
}
