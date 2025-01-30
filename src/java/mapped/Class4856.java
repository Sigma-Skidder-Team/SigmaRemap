package mapped;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4856 extends Class4837 {
   private static String[] field22653;

   public Class4856(ResourceLocation var1) {
      super(var1);
   }

   public boolean matches(Class926 var1, World var2) {
      if (var1.method3671() == 3 && var1.method3670() == 3) {
         for (int var5 = 0; var5 < var1.method3671(); var5++) {
            for (int var6 = 0; var6 < var1.method3670(); var6++) {
               ItemStack var7 = var1.getStackInSlot(var5 + var6 * var1.method3671());
               if (var7.isEmpty()) {
                  return false;
               }

               Item var8 = var7.getItem();
               if (var5 == 1 && var6 == 1) {
                  if (var8 != Items.field38118) {
                     return false;
                  }
               } else if (var8 != Items.ARROW) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = var1.getStackInSlot(1 + var1.method3671());
      if (var4.getItem() == Items.field38118) {
         ItemStack var5 = new ItemStack(Items.field38117, 8);
         PotionUtils.addPotionToItemStack(var5, PotionUtils.getPotionFromItem(var4));
         PotionUtils.method38188(var5, PotionUtils.getFullEffectsFromItem(var4));
         return var5;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28479;
   }
}
