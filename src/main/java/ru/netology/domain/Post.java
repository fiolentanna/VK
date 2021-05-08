package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerAccId;
    private String accountAvatar;
    private String text;
    private String postPicUrl;
    private int date;
    private String postType;


    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private LikesInfo likesinfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private Copyright copyright;
    private Viewsinfo viewsinfo;
    private Geo geo;
    private Donut donut;
    private PostSource postSource;









    // + getters/setters
}
