package mapped;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class Class1261<C extends IInventory> extends Class1260<C> {
   private static String[] field6662;
   private boolean field6663;

   public Class1261(Class5828<C> var1) {
      super(var1);
   }

   @Override
   public void method5871(IRecipe<C> var1, boolean var2) {
      this.field6663 = this.field6661.method18222(var1);
      int var5 = this.field6659.method19125(var1, (IntList)null);
      if (this.field6663) {
         ItemStack var6 = this.field6661.getSlot(0).getStack();
         if (var6.isEmpty() || var5 <= var6.getCount()) {
            return;
         }
      }

      int var8 = this.method5872(var2, var5, this.field6663);
      IntArrayList var7 = new IntArrayList();
      if (this.field6659.method19124(var1, var7, var8)) {
         if (!this.field6663) {
            this.method5870(this.field6661.method18223());
            this.method5870(0);
         }

         this.method5876(var8, var7);
      }
   }

   @Override
   public void method5869() {
      this.method5870(this.field6661.method18223());
      super.method5869();
   }

   public void method5876(int var1, IntList var2) {
      IntListIterator var5 = var2.iterator();
      Slot var6 = this.field6661.getSlot(0);
      ItemStack var7 = Class6207.method19127((Integer)var5.next());
      if (!var7.isEmpty()) {
         int var8 = Math.min(var7.getMaxStackSize(), var1);
         if (this.field6663) {
            var8 -= var6.getStack().getCount();
         }

         for (int var9 = 0; var9 < var8; var9++) {
            this.method5873(var6, var7);
         }
      }
   }
}
