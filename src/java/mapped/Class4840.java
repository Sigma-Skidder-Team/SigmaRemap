package mapped;

import net.minecraft.util.ResourceLocation;

public class Class4840 extends Class4837 {
   private static String[] field22617;

   public Class4840(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, World var2) {
      int var5 = 0;
      ItemStack var6 = ItemStack.EMPTY;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         ItemStack var8 = var1.method3618(var7);
         if (!var8.isEmpty()) {
            if (var8.getItem() != Items.field37955) {
               if (var8.getItem() != Items.field38056) {
                  return false;
               }

               var5++;
            } else {
               if (!var6.isEmpty()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var6.isEmpty() && var5 > 0;
   }

   public ItemStack method14962(Class926 var1) {
      int var4 = 0;
      ItemStack var5 = ItemStack.EMPTY;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         ItemStack var7 = var1.method3618(var6);
         if (!var7.isEmpty()) {
            if (var7.getItem() != Items.field37955) {
               if (var7.getItem() != Items.field38056) {
                  return ItemStack.EMPTY;
               }

               var4++;
            } else {
               if (!var5.isEmpty()) {
                  return ItemStack.EMPTY;
               }

               var5 = var7;
            }
         }
      }

      if (!var5.isEmpty() && var4 >= 1) {
         ItemStack var8 = var5.copy();
         var8.method32180(var4 + 1);
         return var8;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28474;
   }
}
