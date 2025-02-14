package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.util.youtube.YoutubeJPGThumbnail;
import com.mentalfrostbyte.jello.util.youtube.YoutubeVideoData;
import com.mentalfrostbyte.jello.util.youtube.YoutubeContentType;

import java.util.ArrayList;
import java.util.List;

public class MusicVideoManager {
    public String displayName;
    public String id;
    public YoutubeContentType type;
    public List<YoutubeVideoData> youtubeVideos = new ArrayList<>();
    public boolean field44779 = false;

    public MusicVideoManager(String name, String id, YoutubeContentType type) {
        this.displayName = name;
        this.id = id;
        this.type = type;
    }

    public void updateVideos() {
        this.youtubeVideos = new ArrayList<>();
        YoutubeJPGThumbnail[] thumbnails = new YoutubeJPGThumbnail[0];
        if (this.type != YoutubeContentType.CHANNEL) {
            if (this.type == YoutubeContentType.PLAYLIST) {
                System.out.println("getting from playlist " + this.displayName);
                thumbnails = ThumbnailUtil.getFromPlaylist(this.id);
            }
        } else {
            System.out.println("getting from channel " + this.displayName);
            thumbnails = ThumbnailUtil.getFromChannel(this.id);
        }

        for (YoutubeJPGThumbnail thumbnail : thumbnails) {
            this.youtubeVideos.add(new YoutubeVideoData(thumbnail.videoID, thumbnail.title, thumbnail.fullUrl));
        }
    }

    @Override
    public boolean equals(Object thumbnail) {
        if (thumbnail != this) {
            if (thumbnail instanceof MusicVideoManager) {
                MusicVideoManager musicPlayerTrumnaheil = (MusicVideoManager) thumbnail;
                return musicPlayerTrumnaheil.id.equals(this.id);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
