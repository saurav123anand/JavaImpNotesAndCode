package prototypeDesignPattern;

public class NetworkConnection implements Cloneable{
    private String Ip;
    private String importantData;

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    public void loadImportantData() throws InterruptedException {
        // it will take 5 minutes to load
        this.importantData="Very very important data";
        Thread.sleep(2000);

    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "Ip='" + Ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
