package mapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import net.minecraft.network.*;

public final class channelInitializerReal extends ChannelInitializer<Channel> {
   public final NetworkManager networkManager;

   public channelInitializerReal(NetworkManager var1) {
      this.networkManager = var1;
   }

   public void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      var1.pipeline()
         .addLast("timeout", new ReadTimeoutHandler(30))
         .addLast("splitter", new NettyVarint21FrameDecoder())
         .addLast("decoder", new NettyPacketDecoder(PacketDirection.CLIENTBOUND))
         .addLast("prepender", new NettyVarint21FrameEncoder())
         .addLast("encoder", new NettyPacketEncoder(PacketDirection.SERVERBOUND))
         .addLast("packet_handler", this.networkManager);
   }
}
