package mapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

public class Class7308 extends ChannelInitializer<Channel> {
   public final Class9021 field31334;

   public Class7308(Class9021 var1) {
      this.field31334 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var6) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("legacy_query", new Class6393(this.field31334))
         .addLast("splitter", new Class9573())
         .addLast("decoder", new Class8399(Class1975.SERVERBOUND))
         .addLast("prepender", new Class8577())
         .addLast("encoder", new Class5623(Class1975.CLIENTBOUND));
      int var4 = Class9021.method33406(this.field31334).method1349();
      Object var5 = var4 > 0 ? new Class8587(var4) : new NetworkManager(Class1975.SERVERBOUND);
      Class9021.method33407(this.field31334).add(var5);
      var1.pipeline().addLast("packet_handler", (ChannelHandler)var5);
      ((NetworkManager)var5).method30692(new Class5106(Class9021.method33406(this.field31334), (NetworkManager)var5));
   }
}
