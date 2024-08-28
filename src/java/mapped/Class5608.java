package mapped;

import java.io.IOException;

public class Class5608 implements Packet<Class5116> {
   private static String[] field24889;
   private int field24890;

   public Class5608() {
   }

   public Class5608(int var1) {
      this.field24890 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24890 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24890);
   }

   public void method17180(Class5116 var1) {
      var1.method15736(this);
   }

   public int method17633() {
      return this.field24890;
   }
}
