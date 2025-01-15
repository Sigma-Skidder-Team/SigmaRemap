// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class Class8041 extends ChannelInitializer<Channel>
{
    public final /* synthetic */ Class7639 field33107;
    
    public Class8041(final Class7639 field33107) {
        this.field33107 = field33107;
    }
    
    public void initChannel(final Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (final ChannelException ex) {}
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new Class9503(this.field33107)).addLast("splitter", (ChannelHandler)new Class8588()).addLast("decoder", (ChannelHandler)new Class6965(Class2060.field11779)).addLast("prepender", (ChannelHandler)new Class9340()).addLast("encoder", (ChannelHandler)new Class8386(Class2060.field11780));
        final NetworkManager class3641 = new NetworkManager(Class2060.field11779);
        Class7639.method24068(this.field33107).add(class3641);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)class3641);
        class3641.method11173(new Class5805(Class7639.method24069(this.field33107), class3641));
    }
}
