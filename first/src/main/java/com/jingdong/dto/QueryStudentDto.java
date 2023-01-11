package com.jingdong.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.ws.rs.QueryParam;

@Getter
@Setter
public class QueryStudentDto {
    @QueryParam(value = "name")
    @NotEmpty(message = "name cannot empty")
    private String name;

    @QueryParam(value = "studentId") // 必须得有参数对应
    @Max(1000)
    @Min(18)
    private Integer studentId;

    private Integer sex;
}
