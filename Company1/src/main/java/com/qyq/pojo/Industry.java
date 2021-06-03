package com.qyq.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "t_industry")
public class Industry implements Serializable {
    @Id
    private Integer in;
    private String name;
    private  String remark;
    private Integer order_no;

    @Override
    public String toString() {
        return "Industry{" +
                "in=" + in +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", order_no=" + order_no +
                '}';
    }

    public Integer getIn() {
        return in;
    }

    public void setIn(Integer in) {
        this.in = in;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrder_no() {
        return order_no;
    }

    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
    }

    public Industry(Integer in, String name, String remark, Integer order_no) {
        this.in = in;
        this.name = name;
        this.remark = remark;
        this.order_no = order_no;
    }

    public Industry() {
    }
}
