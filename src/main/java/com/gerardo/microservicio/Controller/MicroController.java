package com.gerardo.microservicio.Controller;

import com.gerardo.microservicio.Util.MicroServiceUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class MicroController {
    @Autowired
    MicroServiceUtil microServiceUtil;

    @GetMapping()
    public String getAllProductos(){
        return microServiceUtil.getAll();
    }
}
