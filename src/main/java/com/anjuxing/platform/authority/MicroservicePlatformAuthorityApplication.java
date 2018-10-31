package com.anjuxing.platform.authority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author xiongt
 * @Description
 */
@SpringBootApplication
@ServletComponentScan
public class MicroservicePlatformAuthorityApplication {

    public static void main (String [] args){
        SpringApplication.run(MicroservicePlatformAuthorityApplication.class,args);
    }
}
