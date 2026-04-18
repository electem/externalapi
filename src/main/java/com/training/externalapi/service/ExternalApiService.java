package com.training.externalapi.service;

import com.training.externalapi.dto.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ExternalApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Post> getPosts() {

        String url = "https://jsonplaceholder.typicode.com/posts";

        ResponseEntity<Post[]> response =
                restTemplate.getForEntity(url, Post[].class);

        Post[] postsArray = response.getBody();

        return Arrays.asList(postsArray);
    }
}
