package com.project.postMicroservice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Document(collection = Comment.COMMENT_TABLE_NAME)
public class Comment {

    public static final String COMMENT_TABLE_NAME = "COMMENT";

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String commentId;
    private String commentDescription;
    private String PostId;
    private String userId;
    private String commentingUserId;
    private String commentDate;
    private String parentCommentId;

}
