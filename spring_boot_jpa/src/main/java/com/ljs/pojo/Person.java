package com.ljs.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // 声明 类为实体或者是表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id // 主键
    @GeneratedValue     // 可以自动向数据库中田间属性
    private Integer id;

    @Column(name="name",nullable=true,length = 20)
    private String name;

    @Column(name = "age",nullable = true,length = 10)
    private String age;
}
