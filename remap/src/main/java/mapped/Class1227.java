// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;

public class Class1227 implements Runnable
{
    private static String[] field6674;
    public final /* synthetic */ ChannelHandler field6675;
    public final /* synthetic */ ByteBuf field6676;
    public final /* synthetic */ Class6108 field6677;
    
    public Class1227(final Class6108 field6677, final ChannelHandler field6678, final ByteBuf field6679) {
        this.field6677 = field6677;
        this.field6675 = field6678;
        this.field6676 = field6679;
    }
    
    @Override
    public void run() {
        Class6108.method18246(this.field6677).pipeline().context(this.field6675).writeAndFlush((Object)this.field6676);
    }
}
