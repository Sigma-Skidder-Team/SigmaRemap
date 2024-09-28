package com.mentalfrostbyte.jello.unmapped;

import totalcross.json.JSONArray;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
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
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThumbnailUtil {
    public static YoutubeTrumbNail[] search(String searchTags) {
        return extractYoutubeThumbnailsFromHtml(fetchUrlContent("https://www.google.com/search?client=safari&num=21&gbv=1&tbm=vid&oq=&aqs=&q=site%3Ayoutube.com+" + encodeUrlParameter(searchTags)));
    }

    public static YoutubeTrumbNail[] getFromChannel(String channelId) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/channel/" + channelId + "/videos?disable_polymer=1"));
    }

    public static YoutubeTrumbNail[] getFromPlaylist(String playlistId) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/playlist?list=" + playlistId + "&disable_polymer=1"));
    }

    public static YoutubeTrumbNail[] extractYoutubeThumbnails(String response) {
        if (response.startsWith("[")) {
            try {
                JSONArray jsonArray = new JSONArray(response);
                response = jsonArray.getJSONObject(1).getJsonObject("body").getString("content");
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }

        List<YoutubeTrumbNail> thumbnails = new ArrayList<>();
        // Updated regex pattern to capture expected content correctly
        String regex = "\"videoId\":\"(.{11})\".*?\"title\":\"(.*?)\"";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(response.replace("\n", "").replace("\r", ""));

        while (matcher.find()) {
            String videoId = matcher.group(1);
            String title = matcher.group(2).replaceAll("<.*?>", "").trim();

            if (!title.isEmpty()) {
                boolean isDuplicate = thumbnails.stream().anyMatch(thumbnail -> thumbnail.videoID.equals(videoId));
                if (!isDuplicate) {
                    thumbnails.add(new YoutubeTrumbNail(videoId, decodeAndUnescapeUrl(title)));
                }
            }
        }

        System.out.println("[thumbnails] : " + thumbnails);
        return thumbnails.toArray(new YoutubeTrumbNail[0]);
    }

    public static YoutubeTrumbNail[] extractYoutubeThumbnailsFromHtml(String htmlContent) {
        if (htmlContent.startsWith("[")) {
            try {
                JSONArray jsonArray = new JSONArray(htmlContent);
                htmlContent = jsonArray.getJSONObject(1).getJsonObject("body").getString("content");
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }

        List<YoutubeTrumbNail> thumbnails = new ArrayList<>();
        // Updated regex pattern to match HTML correctly
        String regexPattern = "<a.*?href=\"/watch\\?v=(.{11})\".*?>(.*?) - YouTube</a>";
        Pattern pattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(htmlContent.replace("\n", "").replace("\r", ""));

        while (matcher.find()) {
            String videoId = matcher.group(1);
            String title = matcher.group(2).replaceAll("<.*?>", "").trim();

            if (!title.isEmpty() && !matcher.group(0).contains("play-all")) {
                boolean alreadyExists = thumbnails.stream().anyMatch(t -> t.videoID.equals(videoId));
                if (!alreadyExists) {
                    thumbnails.add(new YoutubeTrumbNail(videoId, decodeAndUnescapeUrl(title)));
                }
            }
        }

        System.out.println("[thumbnails from HTML] : " + thumbnails);
        return thumbnails.toArray(new YoutubeTrumbNail[0]);
    }

    private static String decodeAndUnescapeUrl(String url) {
        String fullUrl;

        try {
            fullUrl = StringEscapeUtils.unescapeHtml4(URLDecoder.decode(url, StandardCharsets.UTF_8.toString())).trim();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
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
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet get = new HttpGet(url);
            if (url.contains("playlist")) {
                get.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.70 Safari/537.36");
            } else {
                get.addHeader("User-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
            }

            // Execute the HTTP request
            try (CloseableHttpResponse httpResponse = httpClient.execute(get)) {
                HttpEntity entity = httpResponse.getEntity();
                if (entity == null) {
                    System.err.println("[fetchUrlContent] No content found for URL: " + url);
                    return "[fetchUrlContent] No content found for URL: " + url;
                }

                System.out.println("[fetchUrlContent] " + url + " -- " + entity);
                return EntityUtils.toString(entity);
            } catch (IOException e) {
                System.err.println("[fetchUrlContent] IOException while fetching content from: " + url);
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            System.err.println("[fetchUrlContent] Failed to create HTTP client or execute request: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
