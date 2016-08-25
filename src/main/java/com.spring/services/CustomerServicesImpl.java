package com.spring.services;

import com.spring.common.SearchCriteria;
import com.spring.domain.CustomerProfile;
import com.spring.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sjchen on 8/24/16.
 */
@Component("customerServices")
public class CustomerServicesImpl implements CustomerServices{
    @Autowired
    private CustomerMapper customerMapper;

    public CustomerProfile getById(Long id) {
        return customerMapper.getById(id);
    }

    @Override
    public void createProfile(CustomerProfile customerProfile) {
        System.out.println(customerProfile);
         customerMapper.createProfile(customerProfile);    }

    @Override
    public List<CustomerProfile> searchByCriteria(SearchCriteria searchCriteria) {
        return customerMapper.search(searchCriteria);
    }

    @Override
    public List<CustomerProfile> getAll() {
        return customerMapper.getAll();
    }

    @Override
    public CustomerProfile update(Long id, CustomerProfile customerProfile) {
        customerMapper.update(id ,customerProfile);
        return customerMapper.getById(id);
    }
}
