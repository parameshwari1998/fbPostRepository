package com.project.postMicroservice.repository;

import com.project.postMicroservice.entity.EmojiOnPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmojiOnPostRepository extends MongoRepository<EmojiOnPost,String> {
}
