package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5568 implements Packet<IServerPlayNetHandler> {
   private static String[] field24702;
   private int field24703;

   public Class5568() {
   }

   public Class5568(int var1) {
      this.field24703 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24703 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24703);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15643(this);
   }

   public int method17494() {
      return this.field24703;
   }
}
