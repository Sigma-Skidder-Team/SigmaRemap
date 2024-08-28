package mapped;

import java.io.IOException;

public class Class5511 implements Packet<Class5110> {
   private static String[] field24459;
   private Class79 field24460;

   public Class5511() {
   }

   public Class5511(Class79 var1) {
      this.field24460 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24460 = var1.<Class79>method35712(Class79.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24460);
   }

   public void method17180(Class5110 var1) {
      var1.method15610(this);
   }

   public Class79 method17330() {
      return this.field24460;
   }
}
