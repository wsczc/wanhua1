package com.qyq.pojo;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_company")
public class Company implements Serializable {

    private Integer id;
    private String short_name;
    private String full_name;
    private Integer is_famous;
    private Integer state;
    private String remark;
    private Date create_date;
    private  Integer city_id;
    private Integer user_id;
   // private Integer industry_id;
    private Integer order_no;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIs_famous() {
        return is_famous;
    }

    public void setIs_famous(Integer is_famous) {
        this.is_famous = is_famous;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

//    public Integer getIndustry_id() {
//        return industry_id;
//    }
//
//    public void setIndustry_id(Integer industry_id) {
//        this.industry_id = industry_id;
//    }

    public Integer getOrder_no() {
        return order_no;
    }

    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
    }

    public Company(Integer id, String short_name, String full_name, Integer is_famous, Integer state, String remark, Date create_date, Integer city_id, Integer user_id, Integer order_no) {
        this.id = id;
        this.short_name = short_name;
        this.full_name = full_name;
        this.is_famous = is_famous;
        this.state = state;
        this.remark = remark;
        this.create_date = create_date;
        this.city_id = city_id;
        this.user_id = user_id;
        //this.industry_id = industry_id;
        this.order_no = order_no;
    }

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", short_name='" + short_name + '\'' +
                ", full_name='" + full_name + '\'' +
                ", is_famous=" + is_famous +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                ", create_date=" + create_date +
                ", city_id=" + city_id +
                ", user_id=" + user_id +
                ", order_no=" + order_no +
                '}';
    }
}
