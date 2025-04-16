package com.mateo.inyecciondependencias.controller;

import com.mateo.inyecciondependencias.model.Post;
import com.mateo.inyecciondependencias.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    //asociamos el controlador con la interfaz y la interfaz se asocia con el repository
    @Autowired
    IPostRepository repo;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        //llamamos al metodo de la interfaz que devolvera la lista
        return repo.getPosts();
    }

}

