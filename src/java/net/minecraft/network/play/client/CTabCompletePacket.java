package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CTabCompletePacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24682;
   private int field24683;
   private String field24684;

   public CTabCompletePacket() {
   }

   public CTabCompletePacket(int var1, String var2) {
      this.field24683 = var1;
      this.field24684 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24683 = var1.readVarInt();
      this.field24684 = var1.readString(32500);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24683);
      var1.method35730(this.field24684, 32500);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processTabComplete(this);
   }

   public int method17485() {
      return this.field24683;
   }

   public String method17486() {
      return this.field24684;
   }
}
