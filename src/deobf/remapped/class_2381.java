package remapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

public final class class_2381 extends ChannelInitializer<Channel> {
   public class_2381(class_5121 var1) {
      this.field_11891 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("splitter", new class_8878())
         .addLast("decoder", new class_4479(class_4739.field_22962))
         .addLast("prepender", new class_5096())
         .addLast("encoder", new class_302(class_4739.field_22963))
         .addLast("packet_handler", this.field_11891);
   }
}
