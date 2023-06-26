package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class Network {
    public static void main( String[] args )
    {
        try{
            URL aSite = new URL("http://www.periodicoescuelaing.com:280/manual.html?codigo=2166218#address");
            System.out.println( "Protocol: " + aSite.getProtocol() );
            System.out.println( "Authority: " + aSite.getAuthority() );
            System.out.println( "Host: " + aSite.getHost() );
            System.out.println( "Port: " + aSite.getPort() );
            System.out.println( "Path: " + aSite.getPath() );
            System.out.println( "Query: " + aSite.getQuery() );
            System.out.println( "File: " + aSite.getFile() );
            System.out.println( "Ref: " + aSite.getRef() );

        }catch (MalformedURLException exception){
            Logger.getLogger(Network.class.getName()).log(Level.SEVERE, null, exception);
        }

    }
}
