package com.ivoronline.springboot_slf4j_properties.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RestController
public class MyController {

  //========================================================
  // HELLO
  //========================================================
  @RequestMapping("Hello")
  String hello() {

    //LOG
    log.error("Some error occured");
    log.warn ("Some warn  occured");
    log.info ("Some info  occured");
    log.debug("Some debug occured");
    log.trace("Some trace occured");

    //RETURN
    return "Hello from Controller";

  }

}



