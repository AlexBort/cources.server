package com.softgroup.common.dao.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by User on 21.03.2017.
 */
@Entity
@Table(name = "cursor_request")
public class CursorRequestEntity implements Serializable {

    @Column (name = "count")
    private Integer count;

    @Column(name = "offset")
    private Integer offset;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }


}
