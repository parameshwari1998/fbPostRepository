package com.project.postMicroservice.repository;

import com.project.postMicroservice.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends MongoRepository<Post,String> {
}
