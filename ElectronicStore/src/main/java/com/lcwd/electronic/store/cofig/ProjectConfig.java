package com.lcwd.electronic.store.cofig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
   public ModelMapper mapper(){
       return  new ModelMapper();
   // this modelmapper la autowired kel userservice madhe tr je dtotoentity and entitytodto hot tya sati ji lendhi process ny karaychi garaj .direct autowird te implement krun get dependency
    }


}
