package mapped;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import net.minecraft.network.NetworkManager;

public final class Class9317 extends ChannelInitializer<Channel> {
   public final NetworkManager networkmanager;

   public Class9317(NetworkManager networkmanager) {
      this.networkmanager = networkmanager;
   }

   public void initChannel(Channel p_initChannel_1_) {
      p_initChannel_1_.pipeline().addLast("packet_handler", this.networkmanager);
   }
}
