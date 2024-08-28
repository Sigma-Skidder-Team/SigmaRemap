package mapped;

import java.io.IOException;

public class Class5489 implements Packet<Class5112> {
   private static String[] field24375;
   private long field24376;

   public Class5489() {
   }

   public Class5489(long var1) {
      this.field24376 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24376 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24376);
   }

   public void method17180(Class5112 var1) {
      var1.method15689(this);
   }
}
