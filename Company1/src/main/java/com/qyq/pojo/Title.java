package com.qyq.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
@Document(collection = "titlee")
public class Title implements Serializable {
    @Id

    private Integer id;
    private Integer readCount;
    private Integer status;
    private Integer user_id;
    private String tltleName;
    private String titleValue;
    private Date create_date;
}
