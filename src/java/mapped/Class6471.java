package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

public final class Class6471 implements Class6466<ItemStack> {
   private static String[] field28418;

   public void method19646(PacketBuffer var1, ItemStack var2) {
      var1.writeItemStack(var2);
   }

   public ItemStack method19645(PacketBuffer var1) {
      return var1.readItemStack();
   }

   public ItemStack method19644(ItemStack var1) {
      return var1.copy();
   }
}
