package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CChatMessagePacket implements IPacket<IServerPlayNetHandler> {
    public String message;

   public CChatMessagePacket() {
   }

   public CChatMessagePacket(String messageIn) {
      if (messageIn.length() > 256) {
         messageIn = messageIn.substring(0, 256);
      }

      this.message = messageIn;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.message = buf.readString(256);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.message);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processChatMessage(this);
   }

   public String getMessage() {
      return this.message;
   }
}
