package net.minecraft.network.play.server;

import mapped.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SSetSlotPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24423;
   private int field24424;
   private int field24425;
   private ItemStack field24426 = ItemStack.EMPTY;

   public SSetSlotPacket() {
   }

   public SSetSlotPacket(int var1, int var2, ItemStack var3) {
      this.field24424 = var1;
      this.field24425 = var2;
      this.field24426 = var3.copy();
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleSetSlot(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24424 = var1.readByte();
      this.field24425 = var1.readShort();
      this.field24426 = var1.method35726();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24424);
      var1.writeShort(this.field24425);
      var1.method35724(this.field24426);
   }

   public int method17303() {
      return this.field24424;
   }

   public int method17304() {
      return this.field24425;
   }

   public ItemStack method17305() {
      return this.field24426;
   }
}
