package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.Difficulty;

import java.io.IOException;

public class CSetDifficultyPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24479;
   private Difficulty field24480;

   public CSetDifficultyPacket() {
   }

   public CSetDifficultyPacket(Difficulty var1) {
      this.field24480 = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_217263_a(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24480 = Difficulty.method8907(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24480.method8905());
   }

   public Difficulty method17348() {
      return this.field24480;
   }
}
