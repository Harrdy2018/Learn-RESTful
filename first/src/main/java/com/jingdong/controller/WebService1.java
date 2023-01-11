package com.jingdong.controller;

import com.jingdong.model.Student;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
为资源类或方法定义URI
@Path
除了支持静态URI还支持动态URI;
按照该示例的配置,要访问sayHello方法,需要请求的URI为:
http://localhost:8080/NoppoService/rest/webservice1/person/GikkiAres
其中,person匹配sub_path,GikkiAres匹配name;
会对动态部分进行验证,如果不符合[a-zA-Z0-9]的规则的话,就会返回404.


获取uri中的参数
@PathParam
获取请求uri中匹配的参数;

查询字符串中的参数
@DefaultValue("lucky") @QueryParam("description") String description)
DefaultValue表示,当查询字符串没有写description属性时,相当于默认传了一个值为lucky的参数;如果写了description属性,那么就使用description的值传入description参数中;

使用默认值示例:
http://localhost:8080/NoppoService/rest/webservice1/person/GikkiAres

指定值示例:
http://localhost:8080/NoppoService/rest/webservice1/person/GikkiAres?description=fat


表明请求方式
@GET,@POST,@PUT,@DELETE
指明了客户端要访问该资源方法时,需要使用的访问的类型;

定义媒体类型
@Produces
容器负责确认被调用的方法可以返回HTTP请求可以接受的媒体类型,否则返回406 Not Acceptable.
 */

@Path("/webservice1")
public class WebService1 {
    @Path("{sub_path:[a-zA-Z0-9]*}/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("sub_path") String resourceName,
                           @PathParam("name") String name,
                           @DefaultValue("lucky") @QueryParam("description") String description) {
        String str = String.format("This is webservice1,resourceName is %s,name is %s,description is %s", resourceName,name,description);
        return str;
    }

    @Path("{sub_path:[a-zA-Z0-9]*}/test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello2(@PathParam("sub_path") String resourceName,
                              @DefaultValue("lucky") @QueryParam("description") String description) {
        String str = String.format("This is webservice1,resourceName is %s,description is %s", resourceName,description);

        return Response.ok(new Student("oppo",18)).build();
    }
}
