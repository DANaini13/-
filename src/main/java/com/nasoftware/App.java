package com.nasoftware;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            URL url = new URL("");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
