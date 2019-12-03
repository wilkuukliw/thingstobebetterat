package com.annamaria.thingstobebetteat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 *
 * @author anna maria
 */

@SpringBootApplication

public class ThingsApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(ThingsApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(ThingsApplication.class);
  }
}
