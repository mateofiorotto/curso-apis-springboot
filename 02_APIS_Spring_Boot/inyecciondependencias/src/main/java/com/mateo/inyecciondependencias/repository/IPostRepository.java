package com.mateo.inyecciondependencias.repository;

import com.mateo.inyecciondependencias.model.Post;

import java.util.List;

public interface IPostRepository {
    //metodo que debera implementar postrepository
    public List<Post> getPosts();
}
