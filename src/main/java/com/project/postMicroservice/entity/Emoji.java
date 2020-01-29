package com.project.postMicroservice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Document(collection = Emoji.EMOJI_TABLE_NAME)
public class Emoji {

    public static final String EMOJI_TABLE_NAME="EMOJI";

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String emojiId;
    private String emojiName;

}
