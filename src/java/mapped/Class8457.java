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

public final class Class8457 extends ChannelInitializer<Channel>
{
    public final /* synthetic */ Class3641 field34727;
    
    public Class8457(final Class3641 field34727) {
        this.field34727 = field34727;
    }
    
    public void initChannel(final Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (final ChannelException ex) {}
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("splitter", (ChannelHandler)new Class8588()).addLast("decoder", (ChannelHandler)new Class6965(Class2060.field11780)).addLast("prepender", (ChannelHandler)new Class9340()).addLast("encoder", (ChannelHandler)new Class8386(Class2060.field11779)).addLast("packet_handler", (ChannelHandler)this.field34727);
    }
}
