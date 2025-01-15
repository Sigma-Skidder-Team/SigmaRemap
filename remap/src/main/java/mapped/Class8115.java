// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.bootstrap.Bootstrap;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;
import com.google.common.base.Splitter;

public class Class8115
{
    private static final Splitter field33448;
    private static final Logger field33449;
    private final List<NetworkManager> field33450;
    
    public Class8115() {
        this.field33450 = Collections.synchronizedList((List<NetworkManager>)Lists.newArrayList());
    }
    
    public void method26694(final Class9575 class9575) throws UnknownHostException {
        final Class7872 method25494 = Class7872.method25494(class9575.field41613);
        final NetworkManager method25495 = NetworkManager.method11183(InetAddress.getByName(method25494.method25492()), method25494.method25493(), false);
        this.field33450.add(method25495);
        class9575.field41615 = Class8822.method30773("multiplayer.status.pinging", new Object[0]);
        class9575.field41616 = -1L;
        class9575.field41620 = null;
        method25495.method11173(new Class5812(this, method25495, class9575));
        try {
            method25495.method11174(new Class4398(method25494.method25492(), method25494.method25493(), Class2208.field13456));
            method25495.method11174(new Class4392());
        }
        catch (final Throwable t) {
            Class8115.field33449.error((Object)t);
        }
    }
    
    private void method26695(final Class9575 class9575) {
        final Class7872 method25494 = Class7872.method25494(class9575.field41613);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup) NetworkManager.field16894.method29528())).handler((ChannelHandler)new Class6819(this, method25494, class9575))).channel((Class)NioSocketChannel.class)).connect(method25494.method25492(), method25494.method25493());
    }
    
    public void method26696() {
        synchronized (this.field33450) {
            final Iterator<NetworkManager> iterator = this.field33450.iterator();
            while (iterator.hasNext()) {
                final NetworkManager class3641 = iterator.next();
                if (class3641.method11187()) {
                    class3641.method11179();
                }
                else {
                    iterator.remove();
                    class3641.method11193();
                }
            }
        }
    }
    
    public void method26697() {
        synchronized (this.field33450) {
            final Iterator<NetworkManager> iterator = this.field33450.iterator();
            while (iterator.hasNext()) {
                final NetworkManager class3641 = iterator.next();
                if (class3641.method11187()) {
                    iterator.remove();
                    class3641.method11181(new Class2259("multiplayer.status.cancelled", new Object[0]));
                }
            }
        }
    }
    
    static {
        field33448 = Splitter.on('\0').limit(6);
        field33449 = LogManager.getLogger();
    }
}
