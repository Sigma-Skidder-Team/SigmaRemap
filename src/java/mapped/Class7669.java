package mapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

public final class Class7669 extends ChannelInitializer<Channel> {
   public final NetworkManager field32862;

   public Class7669(NetworkManager var1) {
      this.field32862 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("splitter", new Class9573())
         .addLast("decoder", new Class8399(Class1975.CLIENTBOUND))
         .addLast("prepender", new Class8577())
         .addLast("encoder", new Class5623(Class1975.SERVERBOUND))
         .addLast("packet_handler", this.field32862);
   }
}
