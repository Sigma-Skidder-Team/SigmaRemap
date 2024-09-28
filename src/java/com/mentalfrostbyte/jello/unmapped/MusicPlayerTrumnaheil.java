package com.mentalfrostbyte.jello.unmapped;

import mapped.YoutubeType;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayerTrumnaheil {
    public String displayName;
    public String id;
    public YoutubeType type;
    public List<YoutubeThumbnail> thumbnailList = new ArrayList<>();
    public boolean field44779 = false;

    public MusicPlayerTrumnaheil(String name, String id, YoutubeType type) {
        this.displayName = name;
        this.id = id;
        this.type = type;
    }

    public void method37195() {
        this.thumbnailList = new ArrayList<>();
        YoutubeTrumbNail[] thumbnails = new YoutubeTrumbNail[0];
        if (this.type != YoutubeType.CHANNEL) {
            if (this.type == YoutubeType.PLAYLIST) {
                thumbnails = ThumbnailUtil.getFromPlaylist(this.id);
            }
        } else {
            thumbnails = ThumbnailUtil.getFromChannel(this.id);
        }

        for (YoutubeTrumbNail thumbnail : thumbnails) {
            this.thumbnailList.add(new YoutubeThumbnail(thumbnail.videoID, thumbnail.field33684, thumbnail.fullUrl));
        }
    }

    @Override
    public boolean equals(Object thumbnail) {
        if (thumbnail != this) {
            if (thumbnail instanceof MusicPlayerTrumnaheil) {
                MusicPlayerTrumnaheil musicPlayerTrumnaheil = (MusicPlayerTrumnaheil) thumbnail;
                return musicPlayerTrumnaheil.id.equals(this.id);
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
