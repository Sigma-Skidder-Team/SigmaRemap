package net.minecraft.network.play.server;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;
import java.util.List;

public class SWindowItemsPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24913;
   private int field24914;
   private List<ItemStack> field24915;

   public SWindowItemsPacket() {
   }

   public SWindowItemsPacket(int var1, NonNullList<ItemStack> var2) {
      this.field24914 = var1;
      this.field24915 = NonNullList.<ItemStack>method68(var2.size(), ItemStack.EMPTY);

      for (int var5 = 0; var5 < this.field24915.size(); var5++) {
         this.field24915.set(var5, ((ItemStack)var2.get(var5)).copy());
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24914 = var1.readUnsignedByte();
      short var4 = var1.readShort();
      this.field24915 = NonNullList.<ItemStack>method68(var4, ItemStack.EMPTY);

      for (int var5 = 0; var5 < var4; var5++) {
         this.field24915.set(var5, var1.readItemStack());
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24914);
      var1.writeShort(this.field24915.size());

      for (ItemStack var5 : this.field24915) {
         var1.writeItemStack(var5);
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleWindowItems(this);
   }

   public int method17644() {
      return this.field24914;
   }

   public List<ItemStack> method17645() {
      return this.field24915;
   }
}
