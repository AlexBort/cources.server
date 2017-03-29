package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by User on 21.03.2017.
 */
@Entity
@Table(name = "contact_entity")
public class ContactEntity implements Serializable {

    @Column(name = "phone_number")
    private String[] phoneNumber;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
