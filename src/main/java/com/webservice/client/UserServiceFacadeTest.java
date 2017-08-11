package com.webservice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webservice.dao.User;
import com.webservice.service.UserServiceFacade;

public class UserServiceFacadeTest {

	public static void main(String[] args) {

		// 加载Spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext-client.xml");
		// 从Spring容器中获取对象
		UserServiceFacade userService = context.getBean("userWsClient",
				UserServiceFacade.class);
		// 远程调用接口
		User u = userService.getUserByName("张三");
		if (u != null) {
			System.out.println(u);
		}
	}

}
