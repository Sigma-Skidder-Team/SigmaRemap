package mapped;

import java.io.IOException;

public class Class5586 implements Packet<Class5116> {
   private static String[] field24789;
   private int field24790;

   public Class5586() {
   }

   public Class5586(int var1) {
      this.field24790 = var1;
   }

   public void method17180(Class5116 var1) {
      var1.method15710(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24790 = var1.readUnsignedByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24790);
   }
}
