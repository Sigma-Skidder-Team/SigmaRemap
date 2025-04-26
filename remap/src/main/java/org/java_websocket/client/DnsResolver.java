// 
// Decompiled by Procyon v0.6.0
// 

package org.java_websocket.client;

import java.net.URI;
import java.net.UnknownHostException;
import java.net.InetAddress;

public interface DnsResolver {

    /**
     * Resolves the IP address for the given URI.
     * <p>
     * This method should never return null. If it's not able to resolve the IP address then it should
     * throw an UnknownHostException
     *
     * @param uri The URI to be resolved
     * @return The resolved IP address
     * @throws UnknownHostException if no IP address for the <code>uri</code> could be found.
     */
    InetAddress resolve(URI uri) throws UnknownHostException;

}
