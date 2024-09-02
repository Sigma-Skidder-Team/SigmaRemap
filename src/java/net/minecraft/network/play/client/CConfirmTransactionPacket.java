package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CConfirmTransactionPacket implements Packet<IServerPlayNetHandler> {
   private int windowId;
   private short uid;
   private boolean accepted;

   public CConfirmTransactionPacket() {
   }

   public CConfirmTransactionPacket(int var1, short var2, boolean var3) {
      this.windowId = var1;
      this.uid = var2;
      this.accepted = var3;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processConfirmTransaction(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.windowId = var1.readByte();
      this.uid = var1.readShort();
      this.accepted = var1.readByte() != 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.windowId);
      var1.writeShort(this.uid);
      var1.writeByte(!this.accepted ? 0 : 1);
   }

   public int getWindowId() {
      return this.windowId;
   }

   public short getUid() {
      return this.uid;
   }
}
