package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CPickItemPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24702;
   private int field24703;

   public CPickItemPacket() {
   }

   public CPickItemPacket(int var1) {
      this.field24703 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24703 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24703);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processPickItem(this);
   }

   public int method17494() {
      return this.field24703;
   }
}
