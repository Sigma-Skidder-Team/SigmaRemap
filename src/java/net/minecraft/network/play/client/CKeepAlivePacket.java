package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CKeepAlivePacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24852;
   private long field24853;

   public CKeepAlivePacket() {
   }

   public CKeepAlivePacket(long var1) {
      this.field24853 = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processKeepAlive(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24853 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24853);
   }

   public long method17608() {
      return this.field24853;
   }
}
