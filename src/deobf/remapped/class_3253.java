package remapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class class_3253 extends ChannelInitializer<Channel> {
   public class_3253(class_6712 var1) {
      this.field_16148 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      class_5121 var4 = new class_5121(class_4739.field_22963);
      var4.method_23495(new class_5391(class_6712.method_30823(this.field_16148), var4));
      class_6712.method_30826(this.field_16148).add(var4);
      var1.pipeline().addLast("packet_handler", var4);
   }
}
