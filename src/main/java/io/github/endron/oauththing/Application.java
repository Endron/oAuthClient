package io.github.endron.oauththing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.sso.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class Application {

    public static void main(final String... args) {
        SpringApplication.run(Application.class, args);
    }
}
