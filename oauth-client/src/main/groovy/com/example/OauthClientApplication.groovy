package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso

@SpringBootApplication
@EnableOAuth2Sso
class OauthClientApplication {

	static void main(String[] args) {
		SpringApplication.run OauthClientApplication, args
	}
}
