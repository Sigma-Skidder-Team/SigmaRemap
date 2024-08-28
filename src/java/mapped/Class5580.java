package mapped;

import java.io.IOException;

public class Class5580 implements Packet<Class5110> {
   private static String[] field24747;
   private int field24748;

   public Class5580() {
   }

   public Class5580(int var1) {
      this.field24748 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24748 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24748);
   }

   public void method17180(Class5110 var1) {
      var1.method15636(this);
   }

   public int method17524() {
      return this.field24748;
   }
}
