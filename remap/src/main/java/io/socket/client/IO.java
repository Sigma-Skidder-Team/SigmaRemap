// 
// Decompiled by Procyon v0.6.0
// 

package io.socket.client;

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
    public static int protocol;
    
    private IO() {
    }
    
    public static Socket socket(final String s) throws URISyntaxException {
        return socket(s, null);
    }
    
    public static Socket socket(final String str, final Options options) throws URISyntaxException {
        return socket(new URI(str), options);
    }
    
    public static Socket socket(final URI uri) {
        return socket(uri, null);
    }
    
    public static Socket socket(final URI uri, Options opts) {
        if (opts == null) {
            opts = new Options();
        }

        final URL url = Url.parse(uri);
        URI uri2;
        try {
            uri2 = url.toURI();
        }
        catch (final URISyntaxException cause) {
            throw new RuntimeException(cause);
        }
        final String id = Url.method35256(url);
        final String path = url.getPath();
        final boolean sameNamespace = IO.managers.containsKey(id) && IO.managers.get(id).nsps.containsKey(path);
        Manager class7662;
        if (opts.forceNew || opts.field30425 || sameNamespace) {
            if (IO.logger.isLoggable(Level.FINE)) {
                IO.logger.fine(String.format("ignoring socket cache for %s", uri2));
            }
            class7662 = new Manager(uri2, opts);
        }
        else {
            if (!IO.managers.containsKey(id)) {
                if (IO.logger.isLoggable(Level.FINE)) {
                    IO.logger.fine(String.format("new io instance for %s", uri2));
                }
                IO.managers.putIfAbsent(id, new Manager(uri2, opts));
            }
            class7662 = IO.managers.get(id);
        }
        final String query = url.getQuery();
        if (query != null && (opts.auth == null || opts.auth.isEmpty())) {
            opts.auth = query;
        }
        return class7662.method15063(url.getPath(), opts);
    }
    
    static {
        logger = Logger.getLogger(IO.class.getName());
        managers = new ConcurrentHashMap<String, Manager>();
        IO.protocol = 4;
    }
}
