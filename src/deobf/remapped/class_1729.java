package remapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

public class class_1729 extends ChannelInitializer<Channel> {
   public class_1729(class_6712 var1) {
      this.field_8917 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var6) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("legacy_query", new class_616(this.field_8917))
         .addLast("splitter", new class_8878())
         .addLast("decoder", new class_4479(class_4739.field_22963))
         .addLast("prepender", new class_5096())
         .addLast("encoder", new class_302(class_4739.field_22962));
      int var4 = class_6712.method_30823(this.field_8917).method_1700();
      Object var5 = var4 > 0 ? new class_7644(var4) : new class_5121(class_4739.field_22963);
      class_6712.method_30826(this.field_8917).add(var5);
      var1.pipeline().addLast("packet_handler", (ChannelHandler)var5);
      ((class_5121)var5).method_23495(new class_3147(class_6712.method_30823(this.field_8917), (class_5121)var5));
   }
}
