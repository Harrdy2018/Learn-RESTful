package com.jingdong.controller;

import com.jingdong.dto.QueryStudentDto;
import com.jingdong.model.Student;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path(value = "/queryStudent")
public class StudentController {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String display1(@Valid @BeanParam QueryStudentDto queryStudentDto , @Context HttpServletRequest request){
        // http://localhost:8080/NoppoService/rest/queryStudent?name=lukang&studentId=1234&sex=1
        Student studentModel = new Student();
        studentModel.setName(queryStudentDto.getName());
        studentModel.setStudentId(queryStudentDto.getStudentId());
        studentModel.setAge(queryStudentDto.getSex());
        return studentModel.toString();
    }
}
