package mapped;

import java.io.IOException;

public class Class5555 implements Packet<Class5110> {
   private static String[] field24660;
   private Class79 field24661;

   public Class5555() {
   }

   public Class5555(Class79 var1) {
      this.field24661 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24661 = var1.<Class79>method35712(Class79.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24661);
   }

   public void method17180(Class5110 var1) {
      var1.method15631(this);
   }

   public Class79 method17472() {
      return this.field24661;
   }
}
