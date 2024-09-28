package com.mentalfrostbyte.jello.unmapped;

import mapped.YoutubeType;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayerVideo {
    public String displayName;
    public String id;
    public YoutubeType type;
    public List<YoutubeVideoData> youtubeVideos = new ArrayList<>();
    public boolean field44779 = false;

    public MusicPlayerVideo(String name, String id, YoutubeType type) {
        this.displayName = name;
        this.id = id;
        this.type = type;
    }

    public void updateVideos() {
        this.youtubeVideos = new ArrayList<>();
        YoutubeJPGThumbnail[] thumbnails = new YoutubeJPGThumbnail[0];
        if (this.type != YoutubeType.CHANNEL) {
            if (this.type == YoutubeType.PLAYLIST) {
                thumbnails = ThumbnailUtil.getFromPlaylist(this.id);
            }
        } else {
            thumbnails = ThumbnailUtil.getFromChannel(this.id);
        }

        for (YoutubeJPGThumbnail thumbnail : thumbnails) {
            this.youtubeVideos.add(new YoutubeVideoData(thumbnail.videoID, thumbnail.title, thumbnail.fullUrl));
        }
    }

    @Override
    public boolean equals(Object thumbnail) {
        if (thumbnail != this) {
            if (thumbnail instanceof MusicPlayerVideo) {
                MusicPlayerVideo musicPlayerTrumnaheil = (MusicPlayerVideo) thumbnail;
                return musicPlayerTrumnaheil.id.equals(this.id);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
