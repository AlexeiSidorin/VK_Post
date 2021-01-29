package domain;

import java.util.Date;
import java.util.List;

public class Post {

    private long id;
    private String name;
    private String iconLink;
    private Date dataCreated;
    private String mainText;
    private String mainPictureLink;
    private String postLink;
    private int likes;
    private String repostLink;
    private int view;
    private List<Comment> comments;



}
