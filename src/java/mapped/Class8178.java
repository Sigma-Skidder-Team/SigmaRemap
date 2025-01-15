// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.Proxy;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;

public abstract class Class8178<T extends Class8178<T>>
{
    public HttpURLConnection field33685;
    private boolean field33686;
    public String field33687;
    
    public Class8178(final String spec, final int connectTimeout, final int readTimeout) {
        try {
            this.field33687 = spec;
            final Proxy method26496 = Class8076.method26496();
            if (method26496 != null) {
                this.field33685 = (HttpURLConnection)new URL(spec).openConnection(method26496);
            }
            else {
                this.field33685 = (HttpURLConnection)new URL(spec).openConnection();
            }
            this.field33685.setConnectTimeout(connectTimeout);
            this.field33685.setReadTimeout(readTimeout);
        }
        catch (final MalformedURLException ex) {
            throw new Class2356(ex.getMessage(), ex);
        }
        catch (final IOException ex2) {
            throw new Class2356(ex2.getMessage(), ex2);
        }
    }
    
    public void method27077(final String s, final String s2) {
        method27078(this.field33685, s, s2);
    }
    
    public static void method27078(final HttpURLConnection httpURLConnection, final String s, final String s2) {
        final String requestProperty = httpURLConnection.getRequestProperty("Cookie");
        if (requestProperty != null) {
            httpURLConnection.setRequestProperty("Cookie", requestProperty + ";" + s + "=" + s2);
        }
        else {
            httpURLConnection.setRequestProperty("Cookie", s + "=" + s2);
        }
    }
    
    public int method27079() {
        return method27080(this.field33685);
    }
    
    public static int method27080(final HttpURLConnection httpURLConnection) {
        final String headerField = httpURLConnection.getHeaderField("Retry-After");
        try {
            return Integer.valueOf(headerField);
        }
        catch (final Exception ex) {
            return 5;
        }
    }
    
    public int method27081() {
        try {
            this.method27085();
            return this.field33685.getResponseCode();
        }
        catch (final Exception ex) {
            throw new Class2356(ex.getMessage(), ex);
        }
    }
    
    public String method27082() {
        try {
            this.method27085();
            String s;
            if (this.method27081() >= 400) {
                s = this.method27083(this.field33685.getErrorStream());
            }
            else {
                s = this.method27083(this.field33685.getInputStream());
            }
            this.method27084();
            return s;
        }
        catch (final IOException ex) {
            throw new Class2356(ex.getMessage(), ex);
        }
    }
    
    private String method27083(final InputStream in) throws IOException {
        if (in != null) {
            final InputStreamReader inputStreamReader = new InputStreamReader(in, "UTF-8");
            final StringBuilder sb = new StringBuilder();
            for (int i = inputStreamReader.read(); i != -1; i = inputStreamReader.read()) {
                sb.append((char)i);
            }
            return sb.toString();
        }
        return "";
    }
    
    private void method27084() {
        final byte[] array = new byte[1024];
        try {
            final InputStream inputStream = this.field33685.getInputStream();
            while (inputStream.read(array) > 0) {}
            inputStream.close();
        }
        catch (final Exception ex) {
            try {
                final InputStream errorStream = this.field33685.getErrorStream();
                if (errorStream != null) {
                    while (errorStream.read(array) > 0) {}
                    errorStream.close();
                }
            }
            catch (final IOException ex2) {}
        }
        finally {
            if (this.field33685 != null) {
                this.field33685.disconnect();
            }
        }
    }
    
    public T method27085() {
        if (!this.field33686) {
            final Class8178<T> method27076 = (Class8178<T>)this.method27076();
            this.field33686 = true;
            return (T)method27076;
        }
        return (T)this;
    }
    
    public abstract T method27076();
    
    public static Class8178<?> method27086(final String s) {
        return new Class8180(s, 5000, 60000);
    }
    
    public static Class8178<?> method27087(final String s, final int n, final int n2) {
        return new Class8180(s, n, n2);
    }
    
    public static Class8178<?> method27088(final String s, final String s2) {
        return new Class8179(s, s2, 5000, 60000);
    }
    
    public static Class8178<?> method27089(final String s, final String s2, final int n, final int n2) {
        return new Class8179(s, s2, n, n2);
    }
    
    public static Class8178<?> method27090(final String s) {
        return new Class8181(s, 5000, 60000);
    }
    
    public static Class8178<?> method27091(final String s, final String s2) {
        return new Class8177(s, s2, 5000, 60000);
    }
    
    public static Class8178<?> method27092(final String s, final String s2, final int n, final int n2) {
        return new Class8177(s, s2, n, n2);
    }
    
    public String method27093(final String s) {
        return method27094(this.field33685, s);
    }
    
    public static String method27094(final HttpURLConnection httpURLConnection, final String name) {
        try {
            return httpURLConnection.getHeaderField(name);
        }
        catch (final Exception ex) {
            return "";
        }
    }
}
