package mapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public class Class7985 extends ChannelInitializer<Channel> {
   public final Class9021 field34311;

   public Class7985(Class9021 var1) {
      this.field34311 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      Class8586 var4 = new Class8586(Class1975.SERVERBOUND);
      var4.method30692(new Class5107(Class9021.method33406(this.field34311), var4));
      Class9021.method33407(this.field34311).add(var4);
      var1.pipeline().addLast("packet_handler", var4);
   }
}
