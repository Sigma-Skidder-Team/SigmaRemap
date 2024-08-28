package mapped;

import java.io.IOException;

public class Class5562 implements Packet<Class5110> {
   private static String[] field24682;
   private int field24683;
   private String field24684;

   public Class5562() {
   }

   public Class5562(int var1, String var2) {
      this.field24683 = var1;
      this.field24684 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24683 = var1.method35714();
      this.field24684 = var1.method35728(32500);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24683);
      var1.method35730(this.field24684, 32500);
   }

   public void method17180(Class5110 var1) {
      var1.method15640(this);
   }

   public int method17485() {
      return this.field24683;
   }

   public String method17486() {
      return this.field24684;
   }
}
