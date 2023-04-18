package com.retailapp.signupservice.dao;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.retailapp.signupservice.POJO.User;

@DataJpaTest
public class UserDaoTest {
	  
 @Mock
 private UserDao userDao;

 @Test
 public void findByEmailId() {
	 User user = new User();
	    user.setId(1);
	    user.setName("John");
	    user.setContactNumber("2345678");
	    user.setEmail("john@example.com");
	    user.setPassword("john");
	    userDao.save(user);

	    User retrievedUser = userDao.findByEmailId("john@example.com");
	    assertNotNull(retrievedUser);
	    assertEquals(user.getId(), retrievedUser.getId());
        assertEquals(user.getName(), retrievedUser.getName());
	    assertEquals(user.getContactNumber(), retrievedUser.getContactNumber());
	    assertEquals(user.getEmail(), retrievedUser.getEmail());
	    assertEquals(user.getPassword(), retrievedUser.getPassword());

	  }


}
