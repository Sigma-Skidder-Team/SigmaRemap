package mapped;

import java.io.IOException;

public class CClientStatusPacket implements Packet<Class5110> {
   private static String[] field24690;
   private CClientStatusPacketState field24691;

   public CClientStatusPacket() {
   }

   public CClientStatusPacket(CClientStatusPacketState var1) {
      this.field24691 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24691 = var1.<CClientStatusPacketState>method35712(CClientStatusPacketState.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24691);
   }

   public void method17180(Class5110 var1) {
      var1.processClientStatus(this);
   }

   public CClientStatusPacketState getStatus() {
      return this.field24691;
   }
}
