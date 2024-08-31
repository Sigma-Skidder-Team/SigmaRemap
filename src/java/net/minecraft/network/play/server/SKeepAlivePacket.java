package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SKeepAlivePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24658;
   private long field24659;

   public SKeepAlivePacket() {
   }

   public SKeepAlivePacket(long var1) {
      this.field24659 = var1;
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleKeepAlive(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24659 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24659);
   }

   public long method17471() {
      return this.field24659;
   }
}
