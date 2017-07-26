package com.xsgj.model;

import com.xsgj.model.enums.OrderType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ido on 2017/7/26.
 */
@Entity
@Table(name="recommend_order")
public class RecommendOrder implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private Date createDate;
    @Enumerated
    private OrderType orderType;
    private double price;
    private String oderDetail;
    @JoinColumn(name = "student_parent_id")
    @OneToOne
    private StudentParent parent;

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

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getOderDetail() {
        return oderDetail;
    }

    public void setOderDetail(String oderDetail) {
        this.oderDetail = oderDetail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public StudentParent getParent() {
        return parent;
    }

    public void setParent(StudentParent parent) {
        this.parent = parent;
    }
}
