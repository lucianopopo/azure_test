package br.com.lucianopopo.azuretest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test")
  public String getTest(){
    return "Teste de endpoint";
  }
}
