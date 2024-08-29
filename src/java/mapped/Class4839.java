package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class Class4839 extends Class4837 {
   private static String[] field22616;

   public Class4839(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, World var2) {
      ItemStack var5 = ItemStack.EMPTY;
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         ItemStack var8 = var1.method3618(var7);
         if (!var8.isEmpty()) {
            if (!(var8.getItem() instanceof Class3277)) {
               if (!(var8.getItem() instanceof Class3321)) {
                  return false;
               }

               var6.add(var8);
            } else {
               if (!var5.isEmpty()) {
                  return false;
               }

               var5 = var8;
            }
         }
      }

      return !var5.isEmpty() && !var6.isEmpty();
   }

   public ItemStack method14962(Class926 var1) {
      ArrayList var4 = Lists.newArrayList();
      ItemStack var5 = ItemStack.EMPTY;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         ItemStack var7 = var1.method3618(var6);
         if (!var7.isEmpty()) {
            Item var8 = var7.getItem();
            if (!(var8 instanceof Class3277)) {
               if (!(var8 instanceof Class3321)) {
                  return ItemStack.EMPTY;
               }

               var4.add((Class3321)var8);
            } else {
               if (!var5.isEmpty()) {
                  return ItemStack.EMPTY;
               }

               var5 = var7.copy();
            }
         }
      }

      return !var5.isEmpty() && !var4.isEmpty() ? Class3277.method11803(var5, var4) : ItemStack.EMPTY;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28472;
   }
}
