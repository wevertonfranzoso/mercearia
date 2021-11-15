package com.franzoso.mercearia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mercearia")
public class MerceariaController {

    @RequestMapping("hello")
    public String mensagem() {
        return "Hello Word Java!";
    }

}
