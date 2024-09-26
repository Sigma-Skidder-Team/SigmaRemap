package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CKeepAlivePacket implements IPacket<IServerPlayNetHandler> {
    private long key;

   public CKeepAlivePacket() {
   }

   public CKeepAlivePacket(long var1) {
      this.key = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processKeepAlive(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.key = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.key);
   }

   public long getKey() {
      return this.key;
   }
}
