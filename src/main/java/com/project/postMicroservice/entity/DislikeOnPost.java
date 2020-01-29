package com.project.postMicroservice.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Document(collection=DislikeOnPost.DISLIKE_ON_POST_TABLE_NAME)
public class DislikeOnPost {

    public static final String DISLIKE_ON_POST_TABLE_NAME="DISLIKE_ON_POST";

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )

    private String dislikeOnPostId;
    private String postId ;
    private String dislikedId;
    private String dislikeDate;
}
