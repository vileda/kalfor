package cc.vileda.kalfor;

import java.net.MalformedURLException;


public class Main {
    public static void main(String[] args) throws MalformedURLException {
        new Kalfor(new Endpoint("https://api.sipgate.com")).listen(8080);
    }
}
