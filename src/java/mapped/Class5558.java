package mapped;

import java.io.IOException;

public class Class5558 implements Packet<Class5110> {
   private static String[] field24668;
   private String field24669;

   public Class5558() {
   }

   public Class5558(String var1) {
      this.field24669 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24669 = var1.method35728(32767);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24669);
   }

   public void method17180(Class5110 var1) {
      var1.method15644(this);
   }

   public String method17477() {
      return this.field24669;
   }
}
