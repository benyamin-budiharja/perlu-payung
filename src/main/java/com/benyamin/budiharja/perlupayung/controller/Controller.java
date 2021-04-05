package com.benyamin.budiharja.perlupayung.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

  @GetMapping("/")
  public Mono<String> index() {
    return Mono.just("Haii!");
  }
}
