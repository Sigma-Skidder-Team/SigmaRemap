// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelHandlerContext;

public abstract class Class6487 implements Class6477
{
    public abstract Object method19521();
    
    public abstract Object method19522();
    
    public void method19523(final Class6108 class6108) {
        final ChannelHandlerContext method28339 = Class8485.method28339("decoder", class6108.method18220().pipeline());
        if (method28339 != null) {
            if (!class6108.method18207(Class6653.class).method20225()) {
                method28339.fireChannelRead(this.method19521());
            }
            else {
                method28339.fireChannelRead(this.method19522());
            }
            class6108.method18207(Class6653.class).method20223();
        }
    }
}
