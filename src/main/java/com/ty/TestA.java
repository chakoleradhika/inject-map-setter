package com.ty;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Shop shop = (Shop)context.getBean("myShop");
		System.out.println("shop name : "+shop.getName());
		System.out.println("========List of items============");
		
		//fetching the map from the shop
		Map<String,Double> items = shop.getItems();
		for(Map.Entry<String, Double> entry : items.entrySet())
		{
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
	}

}
