package com.qyq.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Data
public class Dto<T> {
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
    private List<T> redata;
}
