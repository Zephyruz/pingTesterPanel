package painel;

import java.io.IOException;
import java.net.InetAddress;

public class Ping {
    String host;
    String result;
    
    public void pingar(String host){
        
        try{
            if(InetAddress.getByName(host).isReachable(5000))
                result = host+" OK";
            else {
                result = host+" FALHOU";
            }
        } catch(IOException e){
            result = host+" FALHOU";
        }
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    
}    
    
