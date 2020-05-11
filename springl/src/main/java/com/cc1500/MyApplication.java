package com.cc1500;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author xingcloud
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MyApplication
{
    public static void main(String[] args)
    {
		System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(MyApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  星云启动成功   ლ(´ڡ`ლ)ﾞ  \n"
   
             );
    }

}
