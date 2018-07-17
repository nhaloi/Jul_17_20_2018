package com.intuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		Door door = context.getBean("door",Door.class);
		door.open();
		door.close();
		
//		Door door = DoorFactory.getDoorWithSoundAlarm();
//		door.open();
//		door.close();
	}

}
