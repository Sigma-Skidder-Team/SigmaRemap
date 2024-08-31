package mapped;

import net.minecraft.network.Packet;

import java.io.IOException;

public class Class5521 implements Packet<Class5103> {
   private static String[] field24493;
   private int field24494;

   public Class5521() {
   }

   public Class5521(int var1) {
      this.field24494 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24494 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24494);
   }

   public void method17180(Class5103 var1) {
      var1.method15591(this);
   }

   public int method17358() {
      return this.field24494;
   }
}
