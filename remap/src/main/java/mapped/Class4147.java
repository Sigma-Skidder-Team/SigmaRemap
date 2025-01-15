// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class Class4147 extends ChannelInitializer<Channel>
{
    public final /* synthetic */ Class7639 field18474;
    
    public Class4147(final Class7639 field18474) {
        this.field18474 = field18474;
    }
    
    public void initChannel(final Channel channel) throws Exception {
        final Class3641 class3641 = new Class3641(Class2060.field11779);
        class3641.method11173(new Class5806(Class7639.method24069(this.field18474), class3641));
        Class7639.method24068(this.field18474).add(class3641);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)class3641);
    }
}
