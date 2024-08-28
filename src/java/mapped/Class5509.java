package mapped;

import java.io.IOException;

public class Class5509 implements Packet<Class5116> {
   private static String[] field24454;
   private Hand field24455;

   public Class5509() {
   }

   public Class5509(Hand var1) {
      this.field24455 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24455 = var1.<Hand>method35712(Hand.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24455);
   }

   public void method17180(Class5116 var1) {
      var1.method15775(this);
   }

   public Hand method17327() {
      return this.field24455;
   }
}
