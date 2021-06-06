package com.qyq.pojo;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "t_catalog")
public class Catalog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "status")
    private Integer status;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "course_id")
    private Integer course_id;
    @Column(name = "order_no")
    private Integer order_no;


}
