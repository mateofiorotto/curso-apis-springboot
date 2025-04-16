package com.mateo.inyecciondependencias.repository;

import com.mateo.inyecciondependencias.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository implements IPostRepository {

    @Override
    public List<Post> getPosts() {
        //Agregamos los posteos simulando una BD
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post(1L, "Post 1", "Author 1"));
        posts.add(new Post(2L, "Post 2", "Author 2"));
        posts.add(new Post(3L, "Post 3", "Author 3"));

        return posts;
    }

}
