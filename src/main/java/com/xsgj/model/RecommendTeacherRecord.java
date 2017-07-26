package com.xsgj.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ido on 2017/7/26.
 */
@Entity
@Table(name="recommend_teacher_record")
public class RecommendTeacherRecord implements Serializable {
    @Id
    @GeneratedValue
    private int id ;
    private Date recommendDate;
    @ManyToOne
    @JoinColumn(name ="recommend_user_id")
    private User recommendUser;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
