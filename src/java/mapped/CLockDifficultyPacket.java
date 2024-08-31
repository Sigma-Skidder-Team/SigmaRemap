package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CLockDifficultyPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24389;
   private boolean field24390;

   public CLockDifficultyPacket() {
   }

   public CLockDifficultyPacket(boolean var1) {
      this.field24390 = var1;
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15654(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24390 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBoolean(this.field24390);
   }

   public boolean method17277() {
      return this.field24390;
   }
}
