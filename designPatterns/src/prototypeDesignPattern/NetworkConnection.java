package prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String Ip;
    private String importantData;
    private List<String> domains=new ArrayList<>();

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    public void loadImportantData() throws InterruptedException {
        // it will take 5 minutes to load
        this.importantData="Very very important data";
        domains.add("www.substrings.com");
        domains.add("www.shadow.com");
        Thread.sleep(2000);

    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "Ip='" + Ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // logic for deep cloning
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        for (String d:this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}
