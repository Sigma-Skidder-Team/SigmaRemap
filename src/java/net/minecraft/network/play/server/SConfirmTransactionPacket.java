package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SConfirmTransactionPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24600;
   private int field24601;
   private short field24602;
   private boolean field24603;

   public SConfirmTransactionPacket() {
   }

   public SConfirmTransactionPacket(int var1, short var2, boolean var3) {
      this.field24601 = var1;
      this.field24602 = var2;
      this.field24603 = var3;
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleConfirmTransaction(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24601 = var1.readUnsignedByte();
      this.field24602 = var1.readShort();
      this.field24603 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24601);
      var1.writeShort(this.field24602);
      var1.writeBoolean(this.field24603);
   }

   public int method17421() {
      return this.field24601;
   }

   public short method17422() {
      return this.field24602;
   }

   public boolean method17423() {
      return this.field24603;
   }
}
