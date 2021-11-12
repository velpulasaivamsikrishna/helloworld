/**
 * 
 */
package com.helloworld.helloworld.dao;

import org.springframework.stereotype.Component;

/**
 * @author admi
 *
 */
@Component
public class GreetingDAOImpl implements GreetingDAO {

	@Override
	public String displayGreetings() {
		String message = "Good Morning Everyone I am from Greeting Service";
		
		return message;
	}

	@Override
	public String displayGreetingsWithNameAndOtherInfo() {
		
		String message="How are you?";
		return message;
	}

}
