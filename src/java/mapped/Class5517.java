package mapped;

import net.minecraft.network.Packet;
import net.minecraft.world.Difficulty;

import java.io.IOException;

public class Class5517 implements Packet<IServerPlayNetHandler> {
   private static String[] field24479;
   private Difficulty field24480;

   public Class5517() {
   }

   public Class5517(Difficulty var1) {
      this.field24480 = var1;
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15653(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
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
