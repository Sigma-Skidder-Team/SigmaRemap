package mapped;

import java.io.IOException;

public class Class5554 implements Packet<Class5116> {
   private static String[] field24658;
   private long field24659;

   public Class5554() {
   }

   public Class5554(long var1) {
      this.field24659 = var1;
   }

   public void method17180(Class5116 var1) {
      var1.method15722(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24659 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24659);
   }

   public long method17471() {
      return this.field24659;
   }
}
