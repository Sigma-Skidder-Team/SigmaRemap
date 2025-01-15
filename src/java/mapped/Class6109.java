// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpGet;
import java.io.IOException;
import org.apache.http.impl.client.HttpClients;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.apache.commons.lang3.StringEscapeUtils;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import org.apache.http.impl.client.CloseableHttpClient;

public class Class6109
{
    private static CloseableHttpClient field24784;
    
    public static Class7357[] method18247(final String s) {
        return method18250(method18253("https://www.youtube.com/results?sp=CAASAhAB&search_query=" + method18252(s)));
    }
    
    public static Class7357[] method18248(final String str) {
        return method18250(method18253("https://www.youtube.com/channel/" + str + "/videos?disable_polymer=1"));
    }
    
    public static Class7357[] method18249(final String str) {
        return method18250(method18253("https://www.youtube.com/playlist?list=" + str));
    }
    
    public static Class7357[] method18250(final String s) {
        final ArrayList list = new ArrayList();
        final Matcher matcher = Pattern.compile("<a(.*?)watch\\?v=(.{11})[\"&](.*?)>(.{1,100})<\\/a>", 8).matcher(s.replace("\n", "").replace("\r", ""));
    Label_0043:
        while (matcher.find()) {
            if (!matcher.group(4).contains("</")) {
                if (matcher.group(4).equals(" ")) {
                    continue;
                }
                if (matcher.group(4).length() == 0) {
                    continue;
                }
                if (matcher.group(1).contains("play-all")) {
                    continue;
                }
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (!((Class7357)iterator.next()).field28389.equals(matcher.group(2))) {
                        continue;
                    }
                    continue Label_0043;
                }
                list.add(new Class7357(matcher.group(2), method18251(matcher.group(4))));
            }
        }
        return list.toArray(new Class7357[0]);
    }
    
    private static String method18251(final String s) {
        String trim = s;
        try {
            trim = StringEscapeUtils.unescapeHtml4(URLDecoder.decode(s, StandardCharsets.UTF_8.toString())).trim();
        }
        catch (final Exception ex) {}
        return trim;
    }
    
    private static String method18252(final String s) {
        String encode = "";
        try {
            encode = URLEncoder.encode(s, StandardCharsets.UTF_8.toString());
        }
        catch (final UnsupportedEncodingException ex) {}
        return encode;
    }
    
    private static String method18253(final String s) {
        try {
            Class6109.field24784.close();
            Class6109.field24784 = HttpClients.createDefault();
        }
        catch (final IOException ex) {}
        final HttpGet httpGet = new HttpGet(s);
        httpGet.addHeader("User-Agent", "");
        try (final CloseableHttpResponse execute = Class6109.field24784.execute((HttpUriRequest)httpGet)) {
            final HttpEntity entity = execute.getEntity();
            if (entity != null) {
                return EntityUtils.toString(entity);
            }
            return "";
        }
        catch (final ParseException | IOException ex2) {
            ((Throwable)ex2).printStackTrace();
        }
        return "";
    }
    
    static {
        Class6109.field24784 = HttpClients.createDefault();
    }
}
