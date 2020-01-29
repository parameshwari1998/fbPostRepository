package com.project.postMicroservice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Document(collection = EmojiOnPost.EMOJI_ON_POST_TABLE_NAME)
public class EmojiOnPost {

    public static final String EMOJI_ON_POST_TABLE_NAME="EMOJI_ON_POST";


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String emojiOnPostId;
    private String userId;
    private String postId ;
    private String emojiId;
}
