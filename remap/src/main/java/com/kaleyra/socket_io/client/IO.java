// 
// Decompiled by Procyon v0.6.0
// 

package com.kaleyra.socket_io.client;

import mapped.*;

import java.net.URL;
import java.util.logging.Level;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class IO
{
    private static final Logger logger;
    private static final ConcurrentHashMap<String, Manager> managers;
    public static int field26155;
    
    public static void method20035(final Class2311 field21356) {
        Manager.field21356 = field21356;
    }
    
    public static void method20036(final Class2310 field21357) {
        Manager.field21357 = field21357;
    }
    
    private IO() {
    }
    
    public static Class4960 method20037(final String s) throws URISyntaxException {
        return method20038(s, null);
    }
    
    public static Class4960 method20038(final String str, final Class7661 class7661) throws URISyntaxException {
        return method20040(new URI(str), class7661);
    }
    
    public static Class4960 method20039(final URI uri) {
        return method20040(uri, null);
    }
    
    public static Class4960 method20040(final URI uri, Class7661 class7661) {
        if (class7661 == null) {
            class7661 = new Class7661();
        }
        final URL method35254 = Class9471.method35254(uri);
        URI uri2;
        try {
            uri2 = method35254.toURI();
        }
        catch (final URISyntaxException cause) {
            throw new RuntimeException(cause);
        }
        final String method35255 = Class9471.method35256(method35254);
        final String path = method35254.getPath();
        final boolean b = IO.managers.containsKey(method35255) && IO.managers.get(method35255).field21378.containsKey(path);
        Manager class7662;
        if (class7661.field30424 || class7661.field30425 || b) {
            if (IO.logger.isLoggable(Level.FINE)) {
                IO.logger.fine(String.format("ignoring socket cache for %s", uri2));
            }
            class7662 = new Manager(uri2, class7661);
        }
        else {
            if (!IO.managers.containsKey(method35255)) {
                if (IO.logger.isLoggable(Level.FINE)) {
                    IO.logger.fine(String.format("new io instance for %s", uri2));
                }
                IO.managers.putIfAbsent(method35255, new Manager(uri2, class7661));
            }
            class7662 = IO.managers.get(method35255);
        }
        final String query = method35254.getQuery();
        if (query != null && (class7661.field30412 == null || class7661.field30412.isEmpty())) {
            class7661.field30412 = query;
        }
        return class7662.method15063(method35254.getPath(), class7661);
    }
    
    static {
        logger = Logger.getLogger(IO.class.getName());
        managers = new ConcurrentHashMap<String, Manager>();
        IO.field26155 = 4;
    }
}
