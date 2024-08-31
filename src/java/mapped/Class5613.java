package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class Class5613 implements Packet<IServerPlayNetHandler> {
   private static String[] field24909;
   private int field24910;
   private ResourceLocation field24911;
   private boolean field24912;

   public Class5613() {
   }

   public Class5613(int var1, Class4843<?> var2, boolean var3) {
      this.field24910 = var1;
      this.field24911 = var2.method14964();
      this.field24912 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24910 = var1.readByte();
      this.field24911 = var1.readResourceLocation();
      this.field24912 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24910);
      var1.writeResourceLocation(this.field24911);
      var1.writeBoolean(this.field24912);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.method15617(this);
   }

   public int method17641() {
      return this.field24910;
   }

   public ResourceLocation method17642() {
      return this.field24911;
   }

   public boolean method17643() {
      return this.field24912;
   }
}
