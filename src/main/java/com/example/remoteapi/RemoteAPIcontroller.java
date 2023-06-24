package com.example.remoteapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("remote-api")
public class RemoteAPIcontroller {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get-details")
    public Object getMovie(){
        String url = "https://api.themoviedb.org/3/movie/11?api_key=9d5ece0ffae1d29c6520d64568509743";
        Object response = restTemplate.getForObject(url,Object.class);
        return response;
    }
}
