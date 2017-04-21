package com.softgroup.common.dao.api.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message_status")
public class MessageStatus {

    @Id
    @Column(name = "id")
    private String id;


    @Column(name = "message_id")
    private String messageId;


    @Column(name = "status")
    private Integer status;


    @Column(name = "status_update_date")
    private Long statusUpdateDate;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "sender_id")
    private String senderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Long statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
