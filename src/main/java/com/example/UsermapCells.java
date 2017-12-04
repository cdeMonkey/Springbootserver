package com.example;

/**
 * Created by abdirahmanahmed on 12/4/17.
 */

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by abdirahmanahmed on 12/1/17.
 */


@Entity
public class UsermapCells {




    @NotEmpty

    private int userid;
    private int currentlayerid;
    private int cellid;

    public int getUserid() { return userid; }
    public int getCurrentlayerid() { return currentlayerid; }
    public int getCellid() { return cellid; }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    public void setCurrentlayerid(int currentlayerid) {
        this.currentlayerid = currentlayerid;
    }
    public void setCellid(int cellid) {
        this.cellid = cellid;
    }
}
