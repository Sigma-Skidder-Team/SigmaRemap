package mapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;

public final class Class9317 extends ChannelInitializer<Channel> {
   public final NetworkManager field43255;

   public Class9317(NetworkManager var1) {
      this.field43255 = var1;
   }

   public void initChannel(Channel var1) throws Exception {
      var1.pipeline().addLast("packet_handler", this.field43255);
   }
}
