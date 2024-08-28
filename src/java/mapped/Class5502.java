package mapped;

import java.io.IOException;

public class Class5502 implements Packet<Class5116> {
   private static String[] field24427;
   private int field24428;

   public Class5502() {
   }

   public Class5502(int var1) {
      this.field24428 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24428 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24428);
   }

   public void method17180(Class5116 var1) {
      var1.method15778(this);
   }

   public int method17306() {
      return this.field24428;
   }
}
