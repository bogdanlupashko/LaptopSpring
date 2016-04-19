package org.bl.spring.service;

import com.google.gson.Gson;
import org.bl.spring.impls.notebook.BaseModel;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.Map;

/**
 * Created by bl on 07.04.2016.
 */

@Path("/service")
@Controller
public class LaptopService {

    @Autowired
    private  Map<String, BaseModel> laptopMap;

//    public LaptopService() {
//    }
//
//    @Autowired
//    public LaptopService(Map<String, BaseModel> laptopMap) {
//        LaptopService.laptopMap = laptopMap;
//    }

    @GET
    @Produces("application/json")
    @Path("/bean-create")
    public String getLaptopInstance(@QueryParam("beanName") String beanName) {
        try {
            return new Gson().toJson(laptopMap);
        } catch (BeansException be) {
            return "{\"error\": \"beanName=" + beanName + "  not avaliable \"}";
        } catch (Exception e) {
            return "{\"error\" : \" some error\"}";
        }
    }

    public void setLaptopMap(Map laptopMap) {
        this.laptopMap = laptopMap;
    }
}
