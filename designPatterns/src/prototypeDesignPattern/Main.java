package prototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
       NetworkConnection networkConnection=new NetworkConnection();
       networkConnection.setIp("192.128.1.1");
       networkConnection.loadImportantData();
        System.out.println(networkConnection);

        // we want new object of NetworkConnection
        NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();
        networkConnection2.setIp("167.89.90.6");
        System.out.println(networkConnection2);
    }
}
