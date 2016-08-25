package com.spring.test;


import com.spring.common.SearchCriteria;
import com.spring.domain.CustomerProfile;
import com.spring.services.CustomerServicesImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by sjchen on 8/24/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/mybatis-config.xml"})
public class CustomerServicesImplTest{
    @Autowired
    private CustomerServicesImpl customerServices;

    @Test
    public void testGetById()  {
        CustomerProfile profile = customerServices.getById(1L);
        System.out.println(profile);
        Assert.notNull(profile);

    }

    @Test
    public  void testCreateProfile(){
        CustomerProfile customerProfile = new CustomerProfile();
        customerProfile.setFirstName("Another");
        customerProfile.setLastName("People");
        customerProfile.setEmail("asgeg@soidgj.com");
        customerServices.createProfile(customerProfile);

    }

    @Test
    public  void testSearchByCriteria(){
        SearchCriteria searchCriteria = new SearchCriteria();
        searchCriteria.setFirstName("sijis");

        searchCriteria.setEmail("sijichen@gmail.com");

        List<CustomerProfile> profiles  =  customerServices.searchByCriteria(searchCriteria);
        System.out.println(profiles);
        Assert.notNull(profiles);
    }

    @Test
    public void testGetAll(){
        System.out.println(customerServices.getAll());
    }

    @Test
    public void testUpdate(){
        CustomerProfile customerProfile = new CustomerProfile();
        //customerProfile.setEmail("sijichen6@gmail.com");
        //customerProfile.setFirstName("Siji6");
        customerProfile.setLastName("Chen6");

        System.out.println("the new profile is"+customerProfile);
        System.out.println(customerServices.update(2L,customerProfile));


    }
}