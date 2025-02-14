package com.mentalfrostbyte.jello.util.youtube;

public class YoutubeJPGThumbnail {
    public final String videoID;
    public final String title;
    public final String fullUrl;

    public YoutubeJPGThumbnail(String videoID, String title) {
        this.videoID = videoID;
        this.title = title;
        this.fullUrl = "https://i.ytimg.com/vi/" + this.videoID + "/mqdefault.jpg";
    }
}
