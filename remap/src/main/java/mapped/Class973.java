// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class Class973 implements Runnable
{
    private static String[] field5184;
    public final /* synthetic */ ChannelHandlerContext field5185;
    public final /* synthetic */ ByteBuf field5186;
    public final /* synthetic */ Class6108 field5187;
    
    public Class973(final Class6108 field5187, final ChannelHandlerContext field5188, final ByteBuf field5189) {
        this.field5187 = field5187;
        this.field5185 = field5188;
        this.field5186 = field5189;
    }
    
    @Override
    public void run() {
        if (this.field5185 == null) {
            this.field5187.method18220().pipeline().fireChannelRead(this.field5186);
        }
        else {
            this.field5185.fireChannelRead(this.field5186);
        }
    }
}
