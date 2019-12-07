package com.tensquare.base.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author haomingp
 * @Description: TODO
 * @date 2019/12/4 20:03
 */
@Entity
@Table(name = "td_label")
@Data
public class Label implements Serializable {
    @Id
    private String id;
    private String labelName;
    private String state;
    private Long count;
    private Long fans;
    private String recommend;
}
