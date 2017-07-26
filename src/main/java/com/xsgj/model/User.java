package com.xsgj.model;

import com.xsgj.model.enums.UserType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;

/**
 * Created by Ido on 2017/7/26.
 */
@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String gender;
    private String openId;
    @Enumerated
    private UserType type;// 游客，管家，规划师
    private String phone;
    @ManyToOne
    @JoinColumn(name="parent_id")
    private User parent;//用户的注册推荐人
    @OneToMany(mappedBy = "parent")
    private List<User> children;//用户推荐的所有已经注册的人
    private Date registerDate;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;

    @OneToMany(mappedBy = "recommendUser", fetch = FetchType.EAGER)
    @OrderBy("recommendDate desc")
    private SortedSet<RecommendTeacherRecord> recommendTeacherRecords;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getChildren() {
        return children;
    }

    public void setChildren(List<User> children) {
        this.children = children;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public SortedSet<RecommendTeacherRecord> getRecommendTeacherRecords() {
        return recommendTeacherRecords;
    }

    public void setRecommendTeacherRecords(SortedSet<RecommendTeacherRecord> recommendTeacherRecords) {
        this.recommendTeacherRecords = recommendTeacherRecords;
    }
}
