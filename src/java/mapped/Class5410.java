package mapped;

import io.netty.channel.ChannelHandlerContext;

public abstract class Class5410 implements Class5402 {
   public abstract Object method16996();

   public abstract Object method16997();

   public void method16998(Class7161 var1) {
      ChannelHandlerContext var4 = Class8190.method28487("decoder", var1.method22464().pipeline());
      if (var4 != null) {
         if (!var1.<Class6042>method22438(Class6042.class).method18706()) {
            var4.fireChannelRead(this.method16996());
         } else {
            var4.fireChannelRead(this.method16997());
         }

         var1.<Class6042>method22438(Class6042.class).method18704();
      }
   }
}
