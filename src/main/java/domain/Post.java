package domain;

import java.util.Date;
import java.util.List;

public class Post {
    /**
     * Мои поля.
     *
     */

    private long ownerId;
    private String name;
    private String iconLink;
    private Date dataCreated;
    private String mainText;
    private String mainPictureLink;
    private String postLink;
    //private int likes;
    private String repostLink;
    //private int view;
    private List<Comment> comments;

    /**
     * Поля которые я упустил
     */

    private int fromId;
    private int createdBy;
    private boolean friendOnly;
    private Copyright copyRight;
    private Like like;
    private Repost repost;
    private View view;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private List copyHistory;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;



}
