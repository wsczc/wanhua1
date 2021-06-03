package com.qyq.pojo;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "t_dict")
public class Dict implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer pid;
    private Integer data_type;
    private String data_code;
    private String data_value;
    private Integer data_tag;
    private String data_desc;
    private Integer order_no;


    public Integer getData_tag() {
        return data_tag;
    }

    public void setData_tag(Integer data_tag) {
        this.data_tag = data_tag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getData_type() {
        return data_type;
    }

    public void setData_type(Integer data_type) {
        this.data_type = data_type;
    }

    public String getData_code() {
        return data_code;
    }

    public void setData_code(String data_code) {
        this.data_code = data_code;
    }

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String data_value) {
        this.data_value = data_value;
    }

    public String getData_desc() {
        return data_desc;
    }

    public void setData_desc(String data_desc) {
        this.data_desc = data_desc;
    }

    public Integer getOrder_no() {
        return order_no;
    }

    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
    }

    public Dict(Integer pid, Integer data_type, String data_code, String data_value, Integer data_tag, String data_desc, Integer order_no) {
        this.pid = pid;
        this.data_type = data_type;
        this.data_code = data_code;
        this.data_value = data_value;
        this.data_tag = data_tag;
        this.data_desc = data_desc;
        this.order_no = order_no;
    }

    public Dict() {
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", pid=" + pid +
                ", data_type=" + data_type +
                ", data_code='" + data_code + '\'' +
                ", data_value='" + data_value + '\'' +
                ", data_tag=" + data_tag +
                ", data_desc='" + data_desc + '\'' +
                ", order_no=" + order_no +
                '}';
    }
}
