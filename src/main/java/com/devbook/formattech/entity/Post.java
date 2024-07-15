package com.devbook.formattech.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.Text;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String post_content;
    private String post_media_url;
    private String post_picture_url;

//    @Timestamp
//    private Date created_at;
//    @Timestamp
//    private Date updated_at;
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//


}
