package cn.com.smart;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import sun.applet.Main;

public class test {

    public static void main(String[] args) {
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version1);
    }

}
