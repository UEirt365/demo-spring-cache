package ueirt.learing.springcache.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ueirt.learing.springcache.services.MainService;

@Controller
@RequestMapping("/api")
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/demo")
    public ResponseEntity<?> demo() {
        return ResponseEntity.ok(mainService.demoCache());
    }
}
