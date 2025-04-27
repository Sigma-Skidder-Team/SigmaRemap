// 
// Decompiled by Procyon v0.6.0
// 

package io.socket.client;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URI;
import java.net.URL;
import java.util.regex.Pattern;

public class Url
{
    private static Pattern field40727;
    private static Pattern field40728;
    
    private Url() {
    }
    
    public static URL method35253(final String str) throws URISyntaxException {
        return parse(new URI(str));
    }
    
    public static URL parse(final URI uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.matches("^https?|wss?$")) {
            scheme = "https";
        }
        int port = uri.getPort();
        if (port == -1) {
            if (Url.field40727.matcher(scheme).matches()) {
                port = 80;
            }
            else if (Url.field40728.matcher(scheme).matches()) {
                port = 443;
            }
        }
        String rawPath = uri.getRawPath();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        final String rawUserInfo = uri.getRawUserInfo();
        final String rawQuery = uri.getRawQuery();
        final String rawFragment = uri.getRawFragment();
        try {
            return new URL(scheme + "://" + ((rawUserInfo != null) ? (rawUserInfo + "@") : "") + uri.getHost() + ((port != -1) ? (":" + port) : "") + rawPath + ((rawQuery != null) ? ("?" + rawQuery) : "") + ((rawFragment != null) ? ("#" + rawFragment) : ""));
        }
        catch (final MalformedURLException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public static String method35255(final String spec) throws MalformedURLException {
        return method35256(new URL(spec));
    }
    
    public static String method35256(final URL url) {
        final String protocol = url.getProtocol();
        int port = url.getPort();
        if (port == -1) {
            if (!Url.field40727.matcher(protocol).matches()) {
                if (Url.field40728.matcher(protocol).matches()) {
                    port = 443;
                }
            }
            else {
                port = 80;
            }
        }
        return protocol + "://" + url.getHost() + ":" + port;
    }
    
    static {
        Url.field40727 = Pattern.compile("^http|ws$");
        Url.field40728 = Pattern.compile("^(http|ws)s$");
    }
}
