// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.client.DnsResolver;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.net.InetAddress;
import java.util.List;

public final class Class7688 implements DnsResolver
{
    @Override
    public List<InetAddress> resolve(final String host) throws UnknownHostException {
        if (host != null) {
            return Arrays.asList(InetAddress.getAllByName(host));
        }
        throw new UnknownHostException("hostname == null");
    }
}
