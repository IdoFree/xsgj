package com.xsgj.model;

import com.xsgj.model.enums.ProfitType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ido on 2017/7/26.
 */
@Entity
@Table(name="profit")
public class Profit implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private Date createDate;
    private double money;
    private String details;
    @Enumerated
    private ProfitType type;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ProfitType getType() {
        return type;
    }

    public void setType(ProfitType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
