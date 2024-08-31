package mapped;

import net.minecraft.network.Packet;

import java.io.IOException;

public class Class5557 implements Packet<IServerPlayNetHandler> {
   private static String[] field24666;
   private Class2066 field24667;

   public Class5557() {
   }

   public Class5557(Class2066 var1) {
      this.field24667 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24667 = var1.<Class2066>method35712(Class2066.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24667);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15633(this);
   }
}
