// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandler;
import io.netty.channel.Channel;

public class Class6542
{
    public Class9182 field25998;
    public Class9287 field25999;
    
    public Class6542(final Channel channel) {
        final Class6108 class6108 = new Class6108(channel);
        final Class5221 class6109 = new Class5221(class6108);
        channel.pipeline().addBefore("encoder", "via-encoder", (ChannelHandler)(this.field25998 = new Class9182(class6108)));
        channel.pipeline().addBefore("decoder", "via-decoder", (ChannelHandler)(this.field25999 = new Class9287(class6108)));
    }
    
    public void method19783(final Channel channel) {
        if (this.field25998 != null && this.field25999 != null) {
            if (channel.pipeline().get("via-encoder") != null) {
                channel.pipeline().remove("via-encoder");
            }
            if (channel.pipeline().get("via-decoder") != null) {
                channel.pipeline().remove("via-decoder");
            }
            channel.pipeline().addBefore("encoder", "via-encoder", (ChannelHandler)this.field25998);
            channel.pipeline().addBefore("decoder", "via-decoder", (ChannelHandler)this.field25999);
        }
    }
    
    public Class6542(final Class9182 field25998, final Class9287 field25999) {
        this.field25998 = field25998;
        this.field25999 = field25999;
    }
}
