package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.util.youtube.YoutubeJPGThumbnail;
import org.apache.http.ParseException;
import totalcross.json.JSONArray;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThumbnailUtil {
    public static YoutubeJPGThumbnail[] search(String searchTags) {
        return extractYoutubeThumbnailsFromHtml(fetchUrlContent("https://www.google.com/search?client=safari&num=21&gbv=1&tbm=vid&oq=&aqs=&q=site%3Ayoutube.com+" + encodeUrlParameter(searchTags)));
    }

    public static YoutubeJPGThumbnail[] getFromChannel(String channelId) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/@" + channelId + "/videos?disable_polymer=1"));
    }

    public static YoutubeJPGThumbnail[] getFromPlaylist(String playlistId) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/playlist?list=" + playlistId + "&disable_polymer=1"));
    }

    public static YoutubeJPGThumbnail[] extractYoutubeThumbnails(String htmlContent) {
        if (htmlContent.startsWith("[")) {
            try {
                JSONArray jsonArray = new JSONArray(htmlContent);
                htmlContent = jsonArray.getJSONObject(1).getJSONObject("body").getString("content");
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }

        ArrayList thumbnails = new ArrayList();
        String regex = "r\":\\{\"videoId\":\"(.{11})\"(.*?)\"text\":\"(.{1,100})\"\\}]";
        Pattern pattern = Pattern.compile("r\":\\{\"videoId\":\"(.{11})\"(.*?)\"text\":\"(.{1,100})\"\\}]", 8);
        Matcher matcher = pattern.matcher(htmlContent.replace("\n", "").replace("\r", ""));

        label36:
        while (matcher.find()) {
            for (Object var8 : thumbnails) {
                if (var8 instanceof YoutubeJPGThumbnail && ((YoutubeJPGThumbnail) var8).videoID.equals(matcher.group(1))) {
                    continue label36;
                }
            }

            thumbnails.add(new YoutubeJPGThumbnail(matcher.group(1), decodeAndUnescapeUrl(StringEscapeUtils.unescapeJava(matcher.group(3)))));
        }

        return (YoutubeJPGThumbnail[]) thumbnails.<YoutubeJPGThumbnail>toArray(new YoutubeJPGThumbnail[0]);
    }

    public static YoutubeJPGThumbnail[] extractYoutubeThumbnailsFromHtml(String htmlContent) {
        if (htmlContent.startsWith("[")) {
            try {
                JSONArray jsonArray = new JSONArray(htmlContent);
                htmlContent = jsonArray.getJSONObject(1).getJSONObject("body").getString("content");
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }

        ArrayList thumbnails = new ArrayList();
        String regexPattern = "<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>";
        Pattern pattern = Pattern.compile("<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>", 8);
        Matcher matcher = pattern.matcher(htmlContent.replace("\n", "").replace("\r", ""));

        label62:
        while (matcher.find()) {
            if (!matcher.group(5).contains("</") && !matcher.group(5).equals(" ") && matcher.group(5).length() != 0 && !matcher.group(1).contains("play-all")) {
                for (Object var8 : thumbnails) {
                    if (var8 instanceof YoutubeJPGThumbnail && ((YoutubeJPGThumbnail) var8).videoID.equals(matcher.group(2))) {
                        continue label62;
                    }
                }

                thumbnails.add(new YoutubeJPGThumbnail(matcher.group(2), decodeAndUnescapeUrl(matcher.group(5).replaceAll("<(.*?)>", ""))));
            }
        }

        return (YoutubeJPGThumbnail[]) thumbnails.<YoutubeJPGThumbnail>toArray(new YoutubeJPGThumbnail[0]);
    }

    private static String decodeAndUnescapeUrl(String url) {
        String fullUrl;

        try {
            fullUrl = StringEscapeUtils.unescapeHtml4(URLDecoder.decode(url, StandardCharsets.UTF_8.toString())).trim();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println(url);
            return "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        }

        return fullUrl;
    }

    private static String encodeUrlParameter(String url) {
        String fullUrl;

        try {
            fullUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException var5) {
            throw new RuntimeException(var5);
        }

        return fullUrl;
    }

    private static String fetchUrlContent(String url) {
        System.out.println(":" + url);
        CloseableHttpClient var3 = HttpClients.createDefault();
        HttpGet var4 = new HttpGet(url);
        if (url.contains("playlist")) {
            var4.addHeader("ChatCommandExecutor-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
        } else {
            var4.addHeader("ChatCommandExecutor-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
        }

        try {
            CloseableHttpResponse var5 = var3.execute(var4);
            Throwable var6 = null;

            String var9;
            try {
                HttpEntity var7 = var5.getEntity();
                if (var7 == null) {
                    return "";
                }

                String var8 = EntityUtils.toString(var7);
                var9 = var8;
            } catch (Throwable var20) {
                var6 = var20;
                throw var20;
            } finally {
                if (var5 != null) {
                    if (var6 != null) {
                        try {
                            var5.close();
                        } catch (Throwable var19) {
                            var6.addSuppressed(var19);
                        }
                    } else {
                        var5.close();
                    }
                }
            }

            return var9;
        } catch (IllegalStateException | IOException | ParseException var22) {
            var22.printStackTrace();
            return "";
        }
    }
}
