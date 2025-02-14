package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CCloseWindowPacket implements IPacket<IServerPlayNetHandler> {
   private int windowId;

   public CCloseWindowPacket() {
   }

   public CCloseWindowPacket(int var1) {
      this.windowId = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processCloseWindow(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.windowId = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.windowId);
   }
}
