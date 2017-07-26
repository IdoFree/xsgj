package com.xsgj.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ido on 2017/7/26.
 */
@Entity
@Table(name="address")
public class Address implements Serializable {
    @Id
    @Column(name = "id")
    private int id;
    private String adrsDetails;
    private String phone;
    private String recieverName;
    private String zipCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdrsDetails() {
        return adrsDetails;
    }

    public void setAdrsDetails(String adrsDetails) {
        this.adrsDetails = adrsDetails;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
