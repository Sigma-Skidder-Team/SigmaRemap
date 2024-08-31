package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CCloseWindowPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24343;
   private int field24344;

   public CCloseWindowPacket() {
   }

   public CCloseWindowPacket(int var1) {
      this.field24344 = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processCloseWindow(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24344 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24344);
   }
}
