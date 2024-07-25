package remapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public final class class_7925 extends ChannelInitializer<Channel> {
   public class_7925(class_5121 var1) {
      this.field_40545 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      var1.pipeline().addLast("packet_handler", this.field_40545);
   }
}
