package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4838 extends Class4837 {
   private static String[] field22615;

   public Class4838(ResourceLocation var1) {
      super(var1);
   }

   public boolean matches(Class926 var1, World var2) {
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.getSizeInventory(); var7++) {
         ItemStack var8 = var1.getStackInSlot(var7);
         if (!var8.isEmpty()) {
            if (!(Block.method11537(var8.getItem()) instanceof ShulkerBoxBlock)) {
               if (!(var8.getItem() instanceof Class3321)) {
                  return false;
               }

               var6++;
            } else {
               var5++;
            }

            if (var6 > 1 || var5 > 1) {
               return false;
            }
         }
      }

      return var5 == 1 && var6 == 1;
   }

   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = ItemStack.EMPTY;
      Class3321 var5 = (Class3321) Items.field37918;

      for (int var6 = 0; var6 < var1.getSizeInventory(); var6++) {
         ItemStack var7 = var1.getStackInSlot(var6);
         if (!var7.isEmpty()) {
            Item var8 = var7.getItem();
            if (!(Block.method11537(var8) instanceof ShulkerBoxBlock)) {
               if (var8 instanceof Class3321) {
                  var5 = (Class3321)var8;
               }
            } else {
               var4 = var7;
            }
         }
      }

      ItemStack var9 = ShulkerBoxBlock.method11958(var5.method11876());
      if (var4.method32141()) {
         var9.setTag(var4.getTag().copy());
      }

      return var9;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28482;
   }
}
