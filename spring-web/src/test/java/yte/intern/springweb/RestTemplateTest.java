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

    // @Test
    // void getPosts(){
    //     System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    //    URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
    //     .pathSegment("posts")
    //     .build()
    //     .toUri();


    //     RequestEntity<Void> request = RequestEntity.get(uri).build();
    //     ResponseEntity<Post[]> response = RestTemplate.exchange(request, Post[].class);
    //     System.out.println(Arrays.stream(response.getBody()).toList());
    // }

    @Test
    void getPost(){
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .pathSegment("posts","2")
        .build()
        .toUri();

        RequestEntity<Void> request = RequestEntity.get(uri).build();
        ResponseEntity<Post> response = RestTemplate.exchange(request, Post.class);
        System.out.println(response.getBody()+"AAAAAAAAAAAAAAAAAA");


    }

    @Test
    void addPost(){
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .pathSegment("posts")
        .build()
        .toUri();

        RequestEntity<Post> request = RequestEntity.post(uri).body(new Post(1L,null,"title","body"));
        ResponseEntity<Post> response = RestTemplate.exchange(request, Post.class);
        System.out.println(response.getBody());
    }

    @Test
    void getPostById(){
        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .pathSegment("posts")
        .queryParam("userId","2")
        .build()
        .toUri();

        RequestEntity<Void> request = RequestEntity.get(uri).build();
        ResponseEntity<Post[]> response = RestTemplate.exchange(request, Post[].class);
        System.out.println(Arrays.stream(response.getBody()).toList());
    }

    @Test
    void updatePost(){
        System.out.print("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEe");
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .pathSegment("posts","5")
        .build()
        .toUri();

        RequestEntity<Post> request = RequestEntity.put(uri).body(new Post(1L,1L,"title","body"));
        ResponseEntity<Post> response = RestTemplate.exchange(request, Post.class);
        System.out.println(response.getBody());
    }

    @Test
    void delete(){
        System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .pathSegment("posts","5")
        .build()
        .toUri();

        RequestEntity<Void> request = RequestEntity.delete(uri).build();
        ResponseEntity<Void> response = RestTemplate.exchange(request, Void.class);
        System.out.println(response.getStatusCode());
    }
}
