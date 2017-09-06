package com.demon.soul;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication//代表未springboot应用的运行主类
public class Application {
	public static void main(String[] args) {
		/** 运行springboot应用*/
//		SpringApplication.run(Application.class, args);
		
		/** 运行springboot第二种用法*/
		/**创建springApplication应用对象*/
		SpringApplication springApplication = new SpringApplication(Application.class);
		/**设置横幅模式(关闭)*/
		springApplication.setBannerMode(Banner.Mode.OFF);
		/**运行*/
		springApplication.run(args);
	}
}
