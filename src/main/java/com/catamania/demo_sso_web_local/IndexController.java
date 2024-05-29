package com.catamania.demo_sso_web_local;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class IndexController {

    @GetMapping("index")
    @PreAuthorize("hasAuthority('APPROLE_INNOVA_DEFAULT_ROLE')")
    public String index() {
        return "Some message";
    }
}