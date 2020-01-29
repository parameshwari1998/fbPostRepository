package com.project.postMicroservice.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Document(collection = Post.POST_TABLE_NAME)
public class Post {

    public static final String POST_TABLE_NAME="POST";


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String postId;
    private Boolean isBusinessProfilePost;
    private String postDescription;
    private String postImageUrl;
    private String postVideoUrl;
    private String userId;
    private String postDate;
    private Integer counterOfLikes;
    private Integer counterOfDislilkes;
    private Integer counterOfEmojis;
    private Integer counterOfComments;
    private String parentPostId;
    private List<String> postVisibleTo;

}
