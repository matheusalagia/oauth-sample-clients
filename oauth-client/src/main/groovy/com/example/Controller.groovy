package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.oauth2.client.OAuth2RestTemplate
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.security.Principal

@RestController
class Controller {
    @Autowired
    OAuth2RestTemplate restTemplate2

    @RequestMapping("hello")
    String hello(Principal user) {
        def details =  SecurityContextHolder.getContext().getAuthentication().getDetails() as OAuth2ProtectedResourceDetails
        def r = restTemplate2.getForObject("http://localhost:8090/world", String.class)
        return "$r";
    }
}
