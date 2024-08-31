package mapped;

import net.minecraft.network.Packet;

import java.io.IOException;

public class Class5506 implements Packet<IServerPlayNetHandler> {
   private static String[] field24444;
   private ResourceLocation field24445;

   public Class5506() {
   }

   public Class5506(Class4843<?> var1) {
      this.field24445 = var1.method14964();
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24445 = var1.method35731();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35732(this.field24445);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15637(this);
   }

   public ResourceLocation method17320() {
      return this.field24445;
   }
}
