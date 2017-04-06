package com.softgroup.common.dao.api.entities.for_authorization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "conversation")
public class ConversationEntity {


    // FIXME: 06.04.2017 to understand what type of the field  is_exist?

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "admin_id")
    private String adminId;

    @Column(name = "logo_image_uri")
    private String logoImageUri;


    @Column(name = "type")
    private Integer type;

    @Column(name = "create_date")
   private long createDate;         // FIXME: 06.04.2017 DEFINE certain type of this field


    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoImageUri() {
        return logoImageUri;
    }

    public void setLogoImageUri(String logoImageUri) {
        this.logoImageUri = logoImageUri;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }



}
