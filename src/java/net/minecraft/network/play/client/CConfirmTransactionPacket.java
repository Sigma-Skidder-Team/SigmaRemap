package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CConfirmTransactionPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24385;
   private int field24386;
   private short field24387;
   private boolean field24388;

   public CConfirmTransactionPacket() {
   }

   public CConfirmTransactionPacket(int var1, short var2, boolean var3) {
      this.field24386 = var1;
      this.field24387 = var2;
      this.field24388 = var3;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processConfirmTransaction(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24386 = var1.readByte();
      this.field24387 = var1.readShort();
      this.field24388 = var1.readByte() != 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24386);
      var1.writeShort(this.field24387);
      var1.writeByte(!this.field24388 ? 0 : 1);
   }

   public int method17275() {
      return this.field24386;
   }

   public short method17276() {
      return this.field24387;
   }
}
