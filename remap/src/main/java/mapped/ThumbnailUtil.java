// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

import org.apache.http.impl.client.HttpClients;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.lang3.StringEscapeUtils;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

import org.apache.http.impl.client.CloseableHttpClient;

public class ThumbnailUtil {
    private static CloseableHttpClient client = HttpClients.createDefault();

    public static YoutubeJPGThumbnail[] search(String search) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/results?sp=CAASAhAB&search_query=" + encodeUrlParameter(search)));
    }

    public static YoutubeJPGThumbnail[] getFromChannel(String channelID) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/channel/" + channelID + "/videos?disable_polymer=1"));
    }

    public static YoutubeJPGThumbnail[] getFromPlaylist(String playlistID) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/playlist?list=" + playlistID));
    }

    public static YoutubeJPGThumbnail[] extractYoutubeThumbnails(String s) {
        List<YoutubeJPGThumbnail> thumbnails = new ArrayList<>();
        Matcher regex = Pattern.compile("<a(.*?)watch\\?v=(.{11})[\"&](.*?)>(.{1,100})</a>", Pattern.MULTILINE).matcher(s.replace("\n", "").replace("\r", ""));

        labelIDK:

        while (regex.find()) {
            if (!regex.group(4).contains("</")) {
                if (regex.group(4).equals(" ")) {
                    continue;
                }
                if (regex.group(4).isEmpty()) {
                    continue;
                }
                if (regex.group(1).contains("play-all")) {
                    continue;
                }
                for (YoutubeJPGThumbnail thumbnail : thumbnails) {
                    if (!thumbnail.field28389.equals(regex.group(2))) {
                        continue;
                    }
                    continue labelIDK;
                }
                thumbnails.add(new YoutubeJPGThumbnail(regex.group(2), decodeAndUnescapeUrl(regex.group(4))));
            }
        }

        return thumbnails.toArray(new YoutubeJPGThumbnail[0]);
    }

    private static String decodeAndUnescapeUrl(String url) {
        String trim = url;
        try {
            trim = StringEscapeUtils.unescapeHtml4(URLDecoder.decode(url, StandardCharsets.UTF_8.toString())).trim();
        } catch (Exception ignored) {
        }
        return trim;
    }

    private static String encodeUrlParameter(String param) {
        String encode = "";
        try {
            encode = URLEncoder.encode(param, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ignored) {
        }
        return encode;
    }

    private static String fetchUrlContent(String url) {
        try {
            ThumbnailUtil.client.close();
            ThumbnailUtil.client = HttpClients.createDefault();
        } catch (IOException ignored) {
        }

        HttpGet httpGet = new HttpGet(url);
        httpGet.addHeader("User-Agent", "");

        try (CloseableHttpResponse execute = ThumbnailUtil.client.execute(httpGet)) {
            HttpEntity entity = execute.getEntity();

            if (entity != null) {
                return EntityUtils.toString(entity);
            }

            return "";
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
