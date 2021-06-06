package com.qyq.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_tag")
public class Tag implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "icon")
    private String icon;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "is_show")
    private Integer is_show;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "order_no")
    private Integer order_no;
}
