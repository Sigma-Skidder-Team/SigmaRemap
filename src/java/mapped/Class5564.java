package mapped;

import java.io.IOException;

public class Class5564 implements Packet<Class5110> {
   private static String[] field24690;
   private Class2175 field24691;

   public Class5564() {
   }

   public Class5564(Class2175 var1) {
      this.field24691 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24691 = var1.<Class2175>method35712(Class2175.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24691);
   }

   public void method17180(Class5110 var1) {
      var1.method15612(this);
   }

   public Class2175 method17491() {
      return this.field24691;
   }
}
