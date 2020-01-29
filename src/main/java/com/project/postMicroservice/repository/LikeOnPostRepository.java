package com.project.postMicroservice.repository;

import com.project.postMicroservice.entity.LikeOnPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LikeOnPostRepository extends MongoRepository<LikeOnPost,String> {
}
