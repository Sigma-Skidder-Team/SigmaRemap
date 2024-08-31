package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class CMarkRecipeSeenPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24444;
   private ResourceLocation field24445;

   public CMarkRecipeSeenPacket() {
   }

   public CMarkRecipeSeenPacket(Class4843<?> var1) {
      this.field24445 = var1.method14964();
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24445 = var1.readResourceLocation();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeResourceLocation(this.field24445);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleRecipeBookUpdate(this);
   }

   public ResourceLocation method17320() {
      return this.field24445;
   }
}
