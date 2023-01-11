package com.jingdong.model;

import lombok.Data;

@Data
public class Student {
    private String name;

    private Integer studentId;

    private Integer age;

    private Integer sex;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
