package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CHeldItemChangePacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24592;
   private int field24593;

   public CHeldItemChangePacket() {
   }

   public CHeldItemChangePacket(int var1) {
      this.field24593 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24593 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeShort(this.field24593);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processHeldItemChange(this);
   }

   public int method17416() {
      return this.field24593;
   }
}
