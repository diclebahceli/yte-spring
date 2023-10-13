package yte.intern.springweb;

import java.net.URI;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class RestTemplateTest {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    RestTemplate RestTemplate = new RestTemplate();

    @Test
    void getPosts(){
       URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .pathSegment("posts")
        .build()
        .toUri();


        RequestEntity<Void> request = RequestEntity.get(uri).build();
        ResponseEntity<Post[]> response = RestTemplate.exchange(request, Post[].class);
        System.out.println(Arrays.stream(response.getBody()).toString());
    }

    @Test
    void getPost(){
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .pathSegment("posts","2")
        .build()
        .toUri();

        RequestEntity<Void> request = RequestEntity.get(uri).build();
        ResponseEntity<Post> response = RestTemplate.exchange(request, Post.class);
        System.out.println(response.getBody()+"AAAAAAAAAAAAAAAAAA");


    }
}
