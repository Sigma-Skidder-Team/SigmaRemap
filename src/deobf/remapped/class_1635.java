package remapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

public class class_1635 extends ChannelInitializer<Channel> {
   private static String[] field_8503;

   public class_1635(class_7081 var1, class_8140 var2, class_2560 var3) {
      this.field_8501 = var1;
      this.field_8502 = var2;
      this.field_8500 = var3;
   }

   public void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      var1.pipeline().addLast(new ChannelHandler[]{new class_3182(this)});
   }
}
