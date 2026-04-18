package com.training.externalapi.controller;

import com.training.externalapi.dto.Post;
import com.training.externalapi.service.ExternalApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/external")
public class ExternalApiController {

    @Autowired
    private  ExternalApiService service;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return service.getPosts();
    }
}