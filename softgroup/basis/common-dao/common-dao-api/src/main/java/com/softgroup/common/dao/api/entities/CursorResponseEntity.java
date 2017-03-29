package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by User on 21.03.2017.
 */
@Entity
@Table(name = "cursor_response")
public class CursorResponseEntity implements Serializable {

    @Column(name = "is_more_exists")
    private Boolean isMoreExists;

    public Boolean getMoreExists() {
        return isMoreExists;
    }

    public void setMoreExists(Boolean moreExists) {
        isMoreExists = moreExists;
    }
    /*	Boolean	наличие данных ещё*/

}
