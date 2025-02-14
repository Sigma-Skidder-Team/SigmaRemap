package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SHeldItemChangePacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24889;
   private int field24890;

   public SHeldItemChangePacket() {
   }

   public SHeldItemChangePacket(int var1) {
      this.field24890 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24890 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24890);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleHeldItemChange(this);
   }

   public int method17633() {
      return this.field24890;
   }
}
