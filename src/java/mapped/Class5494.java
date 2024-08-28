package mapped;

import java.io.IOException;

public class Class5494 implements Packet<Class5110> {
   private static String[] field24389;
   private boolean field24390;

   public Class5494() {
   }

   public Class5494(boolean var1) {
      this.field24390 = var1;
   }

   public void method17180(Class5110 var1) {
      var1.method15654(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24390 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBoolean(this.field24390);
   }

   public boolean method17277() {
      return this.field24390;
   }
}
