package com.project.postMicroservice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Document(collection = LikeOnPost.LIKE_ON_POST_TABLE_NAME)
public class LikeOnPost {

    public static final String LIKE_ON_POST_TABLE_NAME="LIKE_ON_POST";



    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String likeOnPostId;
    private String postId ;
    private String likedId;
    private String likeDate;

}
