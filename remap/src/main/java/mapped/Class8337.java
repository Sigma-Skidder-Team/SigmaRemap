// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Class8337
{
    private static String field34230;
    public static final String field34231 = "http://s.optifine.net";
    public static final String field34232 = "http://optifine.net";
    
    public static byte[] method27787(final String s) throws IOException {
        URLConnection urlConnection = null;
        byte[] array;
        try {
            urlConnection = new URL(s).openConnection(Minecraft.method5277().method5289());
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(false);
            urlConnection.connect();
            if (((HttpURLConnection)urlConnection).getResponseCode() / 100 != 2) {
                if (((HttpURLConnection)urlConnection).getErrorStream() != null) {
                    Config.method28961(((HttpURLConnection)urlConnection).getErrorStream());
                }
                throw new IOException("HTTP response: " + ((HttpURLConnection)urlConnection).getResponseCode());
            }
            final InputStream inputStream = urlConnection.getInputStream();
            final byte[] b = new byte[urlConnection.getContentLength()];
            int off = 0;
            while (true) {
                final int read = inputStream.read(b, off, b.length - off);
                if (read < 0) {
                    throw new IOException("Input stream closed: " + s);
                }
                off += read;
                if (off >= b.length) {
                    array = b;
                    break;
                }
            }
        }
        finally {
            if (urlConnection != null) {
                ((HttpURLConnection)urlConnection).disconnect();
            }
        }
        return array;
    }
    
    public static String method27788(final String spec, final Map map, final byte[] b) throws IOException {
        HttpURLConnection httpURLConnection = null;
        String string;
        try {
            httpURLConnection = (HttpURLConnection)new URL(spec).openConnection(Minecraft.method5277().method5289());
            httpURLConnection.setRequestMethod("POST");
            if (map != null) {
                for (final String key : map.keySet()) {
                    httpURLConnection.setRequestProperty(key, "" + map.get(key));
                }
            }
            httpURLConnection.setRequestProperty("Content-Type", "text/plain");
            httpURLConnection.setRequestProperty("Content-Length", "" + b.length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            final OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(b);
            outputStream.flush();
            outputStream.close();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "ASCII"));
            final StringBuffer sb = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append('\r');
            }
            bufferedReader.close();
            string = sb.toString();
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return string;
    }
    
    public static synchronized String method27789() {
        if (Class8337.field34230 == null) {
            try {
                if (Config.method28935(System.getProperty("player.models.local"), false)) {
                    Class8337.field34230 = new File(Minecraft.method5277().field4652, "playermodels").toURI().toURL().toExternalForm();
                }
            }
            catch (final Exception ex) {
                Config.warn("" + ex.getClass().getName() + ": " + ex.getMessage());
            }
            if (Class8337.field34230 == null) {
                Class8337.field34230 = "http://s.optifine.net";
            }
        }
        return Class8337.field34230;
    }
    
    static {
        Class8337.field34230 = null;
    }
}
