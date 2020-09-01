package cn.com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 系统模块启动器
 * @author Chill
 */
@SpringBootApplication
@ImportResource({"classpath*:applicationContext-snaker.xml", "classpath*:applicationContext.xml"})
public class FlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowApplication.class, args);
	}

}

