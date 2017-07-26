package com.xsgj.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ido on 2017/7/26.
 */
@Entity
@Table(name="recommend_parent_record")
public class RecommendParentRecord implements Serializable {
    @Id
    @GeneratedValue
    private int id ;
    private Date recommendDate;
    @ManyToOne
    @JoinColumn(name="recommend_user_id")
    private User recommendUser;
    @OneToOne
    @JoinColumn(name="recommend_parent_id")
    private StudentParent recommendParent;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRecommendDate() {
        return recommendDate;
    }

    public void setRecommendDate(Date recommendDate) {
        this.recommendDate = recommendDate;
    }

    public User getRecommendUser() {
        return recommendUser;
    }

    public void setRecommendUser(User recommendUser) {
        this.recommendUser = recommendUser;
    }

    public StudentParent getRecommendParent() {
        return recommendParent;
    }

    public void setRecommendParent(StudentParent recommendParent) {
        this.recommendParent = recommendParent;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
