package com.bbva.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @Autowired
    private PruebaBean pruebaBean;

    @RequestMapping("/")
    public String home() {
        return pruebaBean.getName();
    }

}
