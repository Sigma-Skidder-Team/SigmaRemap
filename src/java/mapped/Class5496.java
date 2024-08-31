package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5496 implements Packet<Class5103> {
   private int field24396;
   private ResourceLocation field24397;
   private PacketBuffer field24398;

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24396 = var1.method35714();
      this.field24397 = var1.method35731();
      int var4 = var1.readableBytes();
      if (var4 >= 0 && var4 <= 1048576) {
         this.field24398 = new PacketBuffer(var1.readBytes(var4));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24396);
      var1.method35732(this.field24397);
      var1.writeBytes(this.field24398.copy());
   }

   public void method17180(Class5103 var1) {
      var1.method15592(this);
   }

   public int method17282() {
      return this.field24396;
   }
}
