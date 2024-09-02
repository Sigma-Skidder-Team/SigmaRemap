package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CCreativeInventoryActionPacket implements Packet<IServerPlayNetHandler> {
    private int slotId;
   private ItemStack stack = ItemStack.EMPTY;

   public CCreativeInventoryActionPacket() {
   }

   public CCreativeInventoryActionPacket(int var1, ItemStack var2) {
      this.slotId = var1;
      this.stack = var2.copy();
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processCreativeInventoryAction(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.slotId = var1.readShort();
      this.stack = var1.readItemStack();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeShort(this.slotId);
      var1.writeItemStack(this.stack);
   }

   public int getSlotId() {
      return this.slotId;
   }

   public ItemStack getStack() {
      return this.stack;
   }
}
