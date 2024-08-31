package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5541 implements Packet<IServerPlayNetHandler> {
   private static String[] field24598;
   private int field24599;

   public Class5541() {
   }

   public Class5541(int var1) {
      this.field24599 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24599 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24599);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.method15647(this);
   }

   public int method17420() {
      return this.field24599;
   }
}
