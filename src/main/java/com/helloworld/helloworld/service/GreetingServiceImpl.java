/**
 * 
 */
package com.helloworld.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.helloworld.dao.GreetingDAO;

/**
 * @author admi
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {
	
	@Autowired
	private GreetingDAO greetingDao;
	
	@Override
	public String displayGreetings() {
		
		//String message = "Good Morning Everyone I am from Greeting Service";
		String message = greetingDao.displayGreetings();	
		return message;
	}

	@Override
	public String displayGreetingsWithNameAndOtherInfo() {
		
		String message = greetingDao.displayGreetingsWithNameAndOtherInfo();
		return message;
	}

}
