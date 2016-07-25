package com.example

import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.security.Principal

@RestController
class Controller {

    @RequestMapping("world")
    String hello(Principal user) {
        SecurityContextHolder.getContext().getAuthentication()
        return "O usuário é muito louco $user";
    }
}
