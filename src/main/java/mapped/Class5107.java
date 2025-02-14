package mapped;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.ServerLoginNetHandler;
import net.minecraft.util.text.ITextComponent;

public class Class5107 implements Class5105 {
   private static String[] field23208;
   private final MinecraftServer field23209;
   private final NetworkManager field23210;

   public Class5107(MinecraftServer var1, NetworkManager var2) {
      this.field23209 = var1;
      this.field23210 = var2;
   }

   @Override
   public void method15595(CHandshakePacket var1) {
      this.field23210.setConnectionState(var1.method17508());
      this.field23210.setNetHandler(new ServerLoginNetHandler(this.field23209, this.field23210));
   }

   @Override
   public void onDisconnect(ITextComponent var1) {
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.field23210;
   }
}
