package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {

    private final RestTemplate restTemplate;

    public CommentService() {
        this.restTemplate = new RestTemplate();
    }

    public List<Comment> getAllComments() {
        String url = "https://jsonplaceholder.typicode.com/comments";
        Comment[] commentsArray = restTemplate.getForObject(url, Comment[].class);
        return Arrays.asList(commentsArray);
    }
}
