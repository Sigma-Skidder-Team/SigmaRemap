// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public final class Class7681 extends ChannelInitializer<Channel>
{
    public final /* synthetic */ NetworkManager field30508;
    
    public Class7681(final NetworkManager field30508) {
        this.field30508 = field30508;
    }
    
    public void initChannel(final Channel channel) throws Exception {
        channel.pipeline().addLast("packet_handler", (ChannelHandler)this.field30508);
    }
}
