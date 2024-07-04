    package com.devbook.formattech.entity;

    // que tiene que llevar aquí
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
    @Table(name = "comment")
    public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private int id;
        private String comm_content;
        private String comm_media_url;
        private String comm_picture_url;

    //    @Timestamp
    //    private Date created_at;
    //    @Timestamp
    //    private Date updated_at;
    //    @ManyToOne
    //    @JoinColumn(name = "post_id", nullable = false) o table
    //    private Post post;
    //    @ManyToOne
    //    @JoinColumn(name = "user_id", nullable = false)
    //    private User user;
    //
    }
