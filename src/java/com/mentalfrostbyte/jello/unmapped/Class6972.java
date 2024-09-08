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

public class Class6972 {
    public static YoutubeTrumbNail[] method21516(String var0) {
        return method21520(doSomethingWithAnURL("https://www.google.com/search?client=safari&num=21&gbv=1&tbm=vid&oq=&aqs=&q=site%3Ayoutube.com+" + method21522(var0)));
    }

    public static YoutubeTrumbNail[] method21517(String var0) {
        return method21519(doSomethingWithAnURL("https://www.youtube.com/channel/" + var0 + "/videos?disable_polymer=1"));
    }

    public static YoutubeTrumbNail[] method21518(String var0) {
        return method21519(doSomethingWithAnURL("https://www.youtube.com/playlist?list=" + var0 + "&disable_polymer=1"));
    }

    public static YoutubeTrumbNail[] method21519(String var0) {
        if (var0.startsWith("[")) {
            try {
                JSONArray var3 = new JSONArray(var0);
                var0 = var3.getJSONObject(1).method21769("body").getString("content");
            } catch (Exception var9) {
            }
        }

        List<YoutubeTrumbNail> var10 = new ArrayList<>();
        String var4 = "r\":\\{\"videoId\":\"(.{11})\"(.*?)\"text\":\"(.{1,100})\"\\}]";
        Pattern var5 = Pattern.compile("r\":\\{\"videoId\":\"(.{11})\"(.*?)\"text\":\"(.{1,100})\"\\}]", 8);
        Matcher var6 = var5.matcher(var0.replace("\n", "").replace("\r", ""));

        label36:
        while (var6.find()) {
            for (YoutubeTrumbNail var8 : var10) {
                if (var8.field33683.equals(var6.group(1))) {
                    continue label36;
                }
            }

            var10.add(new YoutubeTrumbNail(var6.group(1), method21521(StringEscapeUtils.unescapeJava(var6.group(3)))));
        }

        return var10.toArray(new YoutubeTrumbNail[0]);
    }

    public static YoutubeTrumbNail[] method21520(String var0) {
        if (var0.startsWith("[")) {
            try {
                JSONArray var3 = new JSONArray(var0);
                var0 = var3.getJSONObject(1).method21769("body").getString("content");
            } catch (Exception var9) {
            }
        }

        List<YoutubeTrumbNail> var10 = new ArrayList<>();
        String var4 = "<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>";
        Pattern var5 = Pattern.compile("<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>", 8);
        Matcher var6 = var5.matcher(var0.replace("\n", "").replace("\r", ""));

        label62:
        while (var6.find()) {
            if (!var6.group(5).contains("</") && !var6.group(5).equals(" ") && var6.group(5).length() != 0 && !var6.group(1).contains("play-all")) {
                for (YoutubeTrumbNail var8 : var10) {
                    if (var8.field33683.equals(var6.group(2))) {
                        continue label62;
                    }
                }

                var10.add(new YoutubeTrumbNail(var6.group(2), method21521(var6.group(5).replaceAll("<(.*?)>", ""))));
            }
        }

        return var10.toArray(new YoutubeTrumbNail[0]);
    }

    private static String method21521(String var0) {
        String var3 = var0;

        try {
            var3 = StringEscapeUtils.unescapeHtml4(URLDecoder.decode(var0, StandardCharsets.UTF_8.toString())).trim();
        } catch (Exception var5) {
        }

        return var3;
    }

    private static String method21522(String var0) {
        String var3 = "";

        try {
            var3 = URLEncoder.encode(var0, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException var5) {
        }

        return var3;
    }

    private static String doSomethingWithAnURL(String var0) {
        System.out.println(":" + var0);
        CloseableHttpClient var3 = HttpClients.createDefault();
        HttpGet var4 = new HttpGet(var0);
        if (var0.contains("playlist")) {
            var4.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.70 Safari/537.36");
        } else {
            var4.addHeader("User-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
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
