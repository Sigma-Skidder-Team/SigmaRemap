package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CTabCompletePacket implements Packet<IServerPlayNetHandler> {
   private int transactionId;
   private String command;

   public CTabCompletePacket() {
   }

   public CTabCompletePacket(int var1, String var2) {
      this.transactionId = var1;
      this.command = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.transactionId = var1.readVarInt();
      this.command = var1.readString(32500);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.transactionId);
      var1.writeString(this.command, 32500);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processTabComplete(this);
   }

   public int getTransactionId() {
      return this.transactionId;
   }

   public String getCommand() {
      return this.command;
   }
}
