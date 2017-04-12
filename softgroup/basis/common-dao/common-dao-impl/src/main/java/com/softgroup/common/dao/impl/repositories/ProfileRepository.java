package com.softgroup.common.dao.impl.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.softgroup.common.dao.api.;


/**
 * Created by Odin on 03.03.2017.
 */
public interface ProfileRepository extends PagingAndSortingRepository<, String> {

    List<ProfileEntity> findByName(String s); // why it doesn't import??

    List<ProfileEntity> findByNameAndPhoneNumber(String s, String number);


    // FIXME: 12.04.2017 for what goal, I need this method?
    @Query("select p from ProfileEntity p where p.name = :name")
    List<ProfileEntity> findByNameQuery(@Param("name") String s);
}
