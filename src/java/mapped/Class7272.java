package mapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.ServerPinger;

public class Class7272 extends ChannelInitializer<Channel> {
   private static String[] field31194;
   public final Class9375 field31195;
   public final ServerData field31196;
   public final ServerPinger field31197;

   public Class7272(ServerPinger var1, Class9375 var2, ServerData var3) {
      this.field31197 = var1;
      this.field31195 = var2;
      this.field31196 = var3;
   }

   public void initChannel(Channel var1) throws Exception {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      var1.pipeline().addLast(new ChannelHandler[]{new Class7967(this)});
   }
}
