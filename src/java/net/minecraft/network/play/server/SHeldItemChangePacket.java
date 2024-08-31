package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SHeldItemChangePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24889;
   private int field24890;

   public SHeldItemChangePacket() {
   }

   public SHeldItemChangePacket(int var1) {
      this.field24890 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24890 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24890);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleHeldItemChange(this);
   }

   public int method17633() {
      return this.field24890;
   }
}
