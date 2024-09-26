package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class SUpdateChunkPositionPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24744;
   private int field24745;
   private int field24746;

   public SUpdateChunkPositionPacket() {
   }

   public SUpdateChunkPositionPacket(int var1, int var2) {
      this.field24745 = var1;
      this.field24746 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24745 = var1.readVarInt();
      this.field24746 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24745);
      var1.writeVarInt(this.field24746);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleChunkPositionPacket(this);
   }

   public int method17522() {
      return this.field24745;
   }

   public int method17523() {
      return this.field24746;
   }
}
