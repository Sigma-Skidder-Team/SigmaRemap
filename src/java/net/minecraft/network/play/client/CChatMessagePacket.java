package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CChatMessagePacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24495;
   public String field24496;

   public CChatMessagePacket() {
   }

   public CChatMessagePacket(String var1) {
      if (var1.length() > 256) {
         var1 = var1.substring(0, 256);
      }

      this.field24496 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24496 = var1.readString(256);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.field24496);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processChatMessage(this);
   }

   public String method17359() {
      return this.field24496;
   }
}