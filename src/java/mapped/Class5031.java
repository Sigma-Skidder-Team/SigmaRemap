// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.StringUtils;
import java.text.Normalizer;
import java.net.URLConnection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.net.URL;
import java.io.IOException;
import java.io.Reader;

public class Class5031
{
    public static String method15312(int n) {
        if (n < 0) {
            n = 0;
        }
        if (n <= 3600) {
            return n / 60 + ":" + ((n % 60 >= 10) ? "" : "0") + n % 60;
        }
        return n / 3600 + ":" + ((n / 60 % 60 >= 10) ? "" : "0") + n / 60 % 60 + ":" + ((n % 60 >= 10) ? "" : "0") + n % 60;
    }
    
    public static String method15313(final Reader reader) throws IOException {
        final StringBuilder sb = new StringBuilder();
        int read;
        while ((read = reader.read()) != -1) {
            sb.append((char)read);
        }
        return sb.toString();
    }
    
    public static Class4405 method15314(final String spec) throws IOException, JSONException {
        final InputStream openStream = new URL(spec).openStream();
        try {
            return new Class4405(method15313(new BufferedReader(new InputStreamReader(openStream, Charset.forName("UTF-8")))));
        }
        finally {
            openStream.close();
        }
    }
    
    public static Class4405 method15315(final String s) {
        return new Class4405(s);
    }
    
    public static String method15316(final String spec, final boolean b) throws IOException {
        final URLConnection openConnection = new URL(spec).openConnection();
        openConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Safari/604.1.38");
        if (b) {
            openConnection.setRequestProperty("Accept", "application/json");
        }
        String s;
        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openConnection.getInputStream(), StandardCharsets.UTF_8))) {
            s = bufferedReader.lines().collect(Collectors.joining("\n"));
        }
        return s;
    }
    
    public static URL method15317(final String str) {
        try {
            return new URL("https://www.youtube.com/watch?v=" + str);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static URL method15318(final String str) {
        try {
            return new URL("https://i.ytimg.com/vi/" + str + "/mqdefault.jpg");
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static String method15319(final URL url) {
        return url.toString().replace("https://www.youtube.com/watch?v=", "");
    }
    
    public static String method15320(String src) {
        src = src.replaceAll("\\(.*\\)", "");
        src = src.replaceAll("\\[.*\\]", "");
        src = Normalizer.normalize(src, Normalizer.Form.NFD);
        src = src.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return src;
    }
    
    public static String method15321(final String s) {
        final String[] split = s.split(" - ");
        if (split.length <= 1) {
            return method15320(StringUtils.substringBefore(split[0], ","));
        }
        return method15320(StringUtils.substringBefore(split[1], "ft."));
    }
    
    public static String method15322(final String s) {
        final String[] split = s.split(" - ");
        if (split.length <= 1) {
            return "";
        }
        return method15320(StringUtils.substringBefore(StringUtils.substringBefore(split[0], " & "), ","));
    }
}
