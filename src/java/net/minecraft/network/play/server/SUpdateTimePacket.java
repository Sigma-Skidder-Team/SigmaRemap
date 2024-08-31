package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SUpdateTimePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24734;
   private long field24735;
   private long field24736;

   public SUpdateTimePacket() {
   }

   public SUpdateTimePacket(long var1, long var3, boolean var5) {
      this.field24735 = var1;
      this.field24736 = var3;
      if (!var5) {
         this.field24736 = -this.field24736;
         if (this.field24736 == 0L) {
            this.field24736 = -1L;
         }
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24735 = var1.readLong();
      this.field24736 = var1.readLong();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24735);
      var1.writeLong(this.field24736);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleTimeUpdate(this);
   }

   public long method17514() {
      return this.field24735;
   }

   public long method17515() {
      return this.field24736;
   }
}
