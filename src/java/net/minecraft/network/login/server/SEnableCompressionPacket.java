package net.minecraft.network.login.server;

import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class SEnableCompressionPacket implements IPacket<IClientLoginNetHandler> {
    private int compressionThreshold;

   public SEnableCompressionPacket() {
   }

   public SEnableCompressionPacket(int var1) {
      this.compressionThreshold = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.compressionThreshold = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.compressionThreshold);
   }

   public void processPacket(IClientLoginNetHandler var1) {
      var1.handleEnableCompression(this);
   }

   public int getCompressionThreshold() {
      return this.compressionThreshold;
   }
}
