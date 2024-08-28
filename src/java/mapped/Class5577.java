package mapped;

import java.io.IOException;

public class Class5577 implements Packet<Class5116> {
   private static String[] field24734;
   private long field24735;
   private long field24736;

   public Class5577() {
   }

   public Class5577(long var1, long var3, boolean var5) {
      this.field24735 = var1;
      this.field24736 = var3;
      if (!var5) {
         this.field24736 = -this.field24736;
         if (this.field24736 == 0L) {
            this.field24736 = -1L;
         }
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24735 = var1.readLong();
      this.field24736 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24735);
      var1.writeLong(this.field24736);
   }

   public void method17180(Class5116 var1) {
      var1.method15746(this);
   }

   public long method17514() {
      return this.field24735;
   }

   public long method17515() {
      return this.field24736;
   }
}
