// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.net.InetAddress;
import java.util.List;

public final class Class7688 implements Class7687
{
    @Override
    public List<InetAddress> method24408(final String host) throws UnknownHostException {
        if (host != null) {
            return Arrays.asList(InetAddress.getAllByName(host));
        }
        throw new UnknownHostException("hostname == null");
    }
}
