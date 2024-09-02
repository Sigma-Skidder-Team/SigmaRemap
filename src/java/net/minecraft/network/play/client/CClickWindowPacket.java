package net.minecraft.network.play.client;

import net.minecraft.inventory.container.ClickType;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CClickWindowPacket implements Packet<IServerPlayNetHandler> {
   private int windowId;
   private int slotId;
   private int packedClickData;
   private short actionNumber;
   private ItemStack clickedItem = ItemStack.EMPTY;
   private ClickType mode;

   public CClickWindowPacket() {
   }

   public CClickWindowPacket(int var1, int var2, int var3, ClickType var4, ItemStack var5, short var6) {
      this.windowId = var1;
      this.slotId = var2;
      this.packedClickData = var3;
      this.clickedItem = var5.copy();
      this.actionNumber = var6;
      this.mode = var4;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processClickWindow(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.windowId = var1.readByte();
      this.slotId = var1.readShort();
      this.packedClickData = var1.readByte();
      this.actionNumber = var1.readShort();
      this.mode = var1.<ClickType>readEnumValue(ClickType.class);
      this.clickedItem = var1.readItemStack();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.windowId);
      var1.writeShort(this.slotId);
      var1.writeByte(this.packedClickData);
      var1.writeShort(this.actionNumber);
      var1.writeEnumValue(this.mode);
      var1.writeItemStack(this.clickedItem);
   }

   public int getWindowId() {
      return this.windowId;
   }

   public int getSlotId() {
      return this.slotId;
   }

   public int getUsedButton() {
      return this.packedClickData;
   }

   public short getActionNumber() {
      return this.actionNumber;
   }

   public ItemStack getClickedItem() {
      return this.clickedItem;
   }

   public ClickType getClickType() {
      return this.mode;
   }
}
