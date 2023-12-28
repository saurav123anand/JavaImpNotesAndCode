package prototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
       NetworkConnection networkConnection=new NetworkConnection();
       networkConnection.setIp("192.128.1.1");
       networkConnection.loadImportantData();
        // we want new object of NetworkConnection
        NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();
        networkConnection2.setIp("167.89.90.6");
        networkConnection.getDomains().remove(0);
        System.out.println(networkConnection);
        System.out.println(networkConnection2);
    }
}
