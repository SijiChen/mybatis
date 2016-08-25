package com.spring.mapper;

import com.spring.common.SearchCriteria;
import com.spring.domain.CustomerProfile;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sjchen on 8/24/16.
 */

public interface CustomerMapper {
    /**
     * search by id
     * @param id
     * @return
     */
    CustomerProfile getById(@Param("abc") Long id);

    /**
     * insert a new row of customer profile
     * @param customerProfile
     */
    void createProfile(@Param("customerProfile") CustomerProfile customerProfile);

    /**
     * search with email, firstname, lastname; if email presents, regardless of firstand last name.
     * @param searchCriteria
     * @return
     */
    List<CustomerProfile> search(@Param("searchCriteria") SearchCriteria searchCriteria);

    List<CustomerProfile> getAll();

    /**
     * update row by id, provide new customer profile, if some fields is null, leave it as is.
     * @param id
     * @param customerProfile
     */
    void update(@Param("id") Long id, @Param("customerProfile") CustomerProfile customerProfile);
}
