package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CEnchantItemPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24556;
   private int field24557;
   private int field24558;

   public CEnchantItemPacket() {
   }

   public CEnchantItemPacket(int var1, int var2) {
      this.field24557 = var1;
      this.field24558 = var2;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processEnchantItem(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24557 = var1.readByte();
      this.field24558 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24557);
      var1.writeByte(this.field24558);
   }

   public int method17395() {
      return this.field24557;
   }

   public int method17396() {
      return this.field24558;
   }
}
