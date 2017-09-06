package com.demon.soul.build;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.demon.soul.Application;
/** 定义此类作为web.xml使用 */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
       /** 设置启动类 */
		builder.sources(Application.class);
		/** 设置横幅模式 */
		builder.bannerMode(Mode.OFF);
		/** 返回SpringBoot应用启动对象 */
		return builder;
	}
}
