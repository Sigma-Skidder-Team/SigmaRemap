package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.network.play.server.SJoinGamePacket;
import net.minecraft.network.play.server.SRespawnPacket;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PacketThreadUtil {
   private static final Logger field39629 = LogManager.getLogger();
   public static RegistryKey<World> field39630 = null;

   public static <T extends INetHandler> void checkThreadAndEnqueue(Packet<T> var0, T var1, ServerWorld var2) throws Class2466 {
      method31780(var0, var1, var2.getServer());
   }

   public static <T extends INetHandler> void method31780(Packet<T> var0, T var1, Class318<?> var2) throws Class2466 {
      if (var2.isOnExecutionThread()) {
         method31781(var0);
      } else {
         var2.execute(() -> {
            method31781(var0);
            if (!var1.getNetworkManager().isChannelOpen()) {
               field39629.debug("Ignoring packet due to disconnection: " + var0);
            } else {
               var0.processPacket(var1);
            }
         });
         throw Class2466.field16549;
      }
   }

   public static void method31781(Packet var0) {
      if (var0 instanceof SPlayerPositionLookPacket) {
         Minecraft.getInstance().worldRenderer.method932();
      }

      if (!(var0 instanceof SRespawnPacket)) {
         if (!(var0 instanceof SJoinGamePacket)) {
            field39630 = null;
         } else {
            SJoinGamePacket var3 = (SJoinGamePacket)var0;
            field39630 = var3.method17295();
         }
      } else {
         SRespawnPacket var4 = (SRespawnPacket)var0;
         field39630 = var4.method17433();
      }
   }
}
