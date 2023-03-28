package com.example.springbootprometheus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  
  @GetMapping("endPoint1")
  public String endpoint1() {
    return "Metrics for endPoint1";
  }

  @GetMapping("endPoint2")
  public String endpoint2() {
    return "Metrics for endPoint2";
  }
}
