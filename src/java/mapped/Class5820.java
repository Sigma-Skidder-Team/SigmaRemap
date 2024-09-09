package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class5820 extends Container {
   private static String[] field25497;
   public final NonNullList<ItemStack> field25498 = NonNullList.<ItemStack>create();

   public Class5820(PlayerEntity var1) {
      super((ContainerType<?>)null, 0);
      PlayerInventory var4 = var1.inventory;

      for (int var5 = 0; var5 < 5; var5++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.addSlot(new Class5846(CreativeScreen.method2660(), var5 * 9 + var6, 9 + var6 * 18, 18 + var5 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.addSlot(new Slot(var4, var7, 9 + var7 * 18, 112));
      }

      this.method18176(0.0F);
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return true;
   }

   public void method18176(float var1) {
      int var4 = (this.field25498.size() + 9 - 1) / 9 - 5;
      int var5 = (int)((double)(var1 * (float)var4) + 0.5);
      if (var5 < 0) {
         var5 = 0;
      }

      for (int var6 = 0; var6 < 5; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            int var8 = var7 + (var6 + var5) * 9;
            if (var8 >= 0 && var8 < this.field25498.size()) {
               CreativeScreen.method2660().setInventorySlotContents(var7 + var6 * 9, this.field25498.get(var8));
            } else {
               CreativeScreen.method2660().setInventorySlotContents(var7 + var6 * 9, ItemStack.EMPTY);
            }
         }
      }
   }

   public boolean method18177() {
      return this.field25498.size() > 45;
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      if (var2 >= this.field25468.size() - 9 && var2 < this.field25468.size()) {
         Slot var5 = this.field25468.get(var2);
         if (var5 != null && var5.getHasStack()) {
            var5.putStack(ItemStack.EMPTY);
         }
      }

      return ItemStack.EMPTY;
   }

   @Override
   public boolean canMergeSlot(ItemStack var1, Slot var2) {
      return var2.field25578 != CreativeScreen.method2660();
   }

   @Override
   public boolean canDragIntoSlot(Slot var1) {
      return var1.field25578 != CreativeScreen.method2660();
   }
}
