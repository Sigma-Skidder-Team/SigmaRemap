package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5580 implements Packet<IServerPlayNetHandler> {
   private static String[] field24747;
   private int field24748;

   public Class5580() {
   }

   public Class5580(int var1) {
      this.field24748 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24748 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24748);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.method15636(this);
   }

   public int method17524() {
      return this.field24748;
   }
}
