package com.softgroup.common.dao.api.entities;

import sun.java2d.cmm.Profile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by User on 21.03.2017.
 */


@Entity
@Table(name = "conversation_details")
public class ConversationDetailsEntity implements Serializable {

    @Id
    @Column (name = "id", unique = true)
    private String id;

    private Profile [] members; // FIXME: 21.03.2017 что за тип Profile??? и где его прописывать?!

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
