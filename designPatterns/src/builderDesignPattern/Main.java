package builderDesignPattern;

public class Main {
    public static void main(String[] args) {
       User user=new User.UserBuilder().setEmailId("fake@gmail.com")
               .setUserId("123")
               .setUserName("scooby").build();
        System.out.println(user);

    }
}
