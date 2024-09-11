package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SUpdateTimePacket implements Packet<IClientPlayNetHandler> {
    private long totalWorldTime;
   private long worldTime;

   public SUpdateTimePacket() {
   }

   public SUpdateTimePacket(long totalWorldTimeIn, long worldTimeIn, boolean doDaylightCycle) {
      this.totalWorldTime = totalWorldTimeIn;
      this.worldTime = worldTimeIn;

      if (!doDaylightCycle)
      {
         this.worldTime = -this.worldTime;

         if (this.worldTime == 0L)
         {
            this.worldTime = -1L;
         }
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.totalWorldTime = var1.readLong();
      this.worldTime = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.totalWorldTime);
      var1.writeLong(this.worldTime);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleTimeUpdate(this);
   }

   public long getTotalWorldTime() {
      return this.totalWorldTime;
   }

   public long getWorldTime() {
      return this.worldTime;
   }
}
