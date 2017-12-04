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
public class Cells {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private int numlayer;
    private int treasurelayer;
    private int hintlayer;
    private String hinttext;

    public Long getId() {
        return id;
    }
    public int getNumlayer() {
        return numlayer;
    }
    public int getTreasurelayer() {
        return treasurelayer;
    }
    public int getHintlayer() {
        return hintlayer;
    }




    public String getHinttext() {
        return hinttext;
    }

    public void setNumlayer(int numlayer) {
        this.numlayer = numlayer;
    }
    public void setTreasurelayer(int treasurelayer) {
        this.numlayer = numlayer;
    }
    public void setHintlayer(int hintlayer) {
        this.numlayer = numlayer;
    }

}
