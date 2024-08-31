package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import mapped.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CCreativeInventoryActionPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24464;
   private int field24465;
   private ItemStack field24466 = ItemStack.EMPTY;

   public CCreativeInventoryActionPacket() {
   }

   public CCreativeInventoryActionPacket(int var1, ItemStack var2) {
      this.field24465 = var1;
      this.field24466 = var2.copy();
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processCreativeInventoryAction(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24465 = var1.readShort();
      this.field24466 = var1.method35726();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeShort(this.field24465);
      var1.method35724(this.field24466);
   }

   public int method17336() {
      return this.field24465;
   }

   public ItemStack method17337() {
      return this.field24466;
   }
}
