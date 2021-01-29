package domain;

import java.util.Date;

public class Comment {

    /**
     * Мои поля
     */

    private long id;
    private String author;
    private String message;
    private Date dataComments;
    private Post post;

    /**
     * Поля vk которые я упустил.
     *
     */
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;



}
