// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class Class6819 extends ChannelInitializer<Channel>
{
    private static String[] field26767;
    public final /* synthetic */ Class7872 field26768;
    public final /* synthetic */ ServerData field26769;
    public final /* synthetic */ Class8115 field26770;
    
    public Class6819(final Class8115 field26770, final Class7872 field26771, final ServerData field26772) {
        this.field26770 = field26770;
        this.field26768 = field26771;
        this.field26769 = field26772;
    }
    
    public void initChannel(final Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (final ChannelException ex) {}
        channel.pipeline().addLast(new Class8224(this));
    }
}
