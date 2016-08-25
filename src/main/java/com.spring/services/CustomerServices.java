package com.spring.services;

import com.spring.common.SearchCriteria;
import com.spring.domain.CustomerProfile;

import java.util.List;

/**
 * Created by sjchen on 8/24/16.
 */
public interface CustomerServices {
    CustomerProfile getById(Long id);
    void createProfile(CustomerProfile customerProfile);
    List<CustomerProfile> searchByCriteria(SearchCriteria searchCriteria);
    List<CustomerProfile> getAll();
    CustomerProfile update(Long id, CustomerProfile customerProfile);
}
