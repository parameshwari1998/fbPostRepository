package com.project.postMicroservice.repository;

import com.project.postMicroservice.entity.DislikeOnPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DislikeOnPostRepository extends MongoRepository<DislikeOnPost,String> {
}
