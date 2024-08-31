package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5559 implements Packet<IServerPlayNetHandler> {
   private static String[] field24670;
   private int field24671;
   private int field24672;

   public Class5559() {
   }

   public Class5559(int var1, int var2) {
      this.field24671 = var1;
      this.field24672 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24671 = var1.method35714();
      this.field24672 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24671);
      var1.writeVarInt(this.field24672);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15649(this);
   }

   public int method17478() {
      return this.field24671;
   }

   public int method17479() {
      return this.field24672;
   }
}
