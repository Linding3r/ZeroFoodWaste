package com.example.zerofoodwaste2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


  @GetMapping("/index")
  public String index() { return "index"; }
  @GetMapping("/contact")
  public String contactSite() {
    return "contact";
  }
  @GetMapping("/toGood")
  public String tooGood(){
    return "toGood";
  }
}


