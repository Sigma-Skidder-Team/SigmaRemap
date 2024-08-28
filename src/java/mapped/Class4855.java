package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class Class4855 extends Class4837 {
   private static final Class120 field22652 = Class120.method339(Class8514.field38069);

   public Class4855(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      boolean var5 = false;
      boolean var6 = false;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         ItemStack var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            if (!(var8.method32107() instanceof Class3321)) {
               if (!field22652.test(var8)) {
                  return false;
               }

               if (var6) {
                  return false;
               }

               var6 = true;
            } else {
               var5 = true;
            }
         }
      }

      return var6 && var5;
   }

   public ItemStack method14962(Class926 var1) {
      ArrayList var4 = Lists.newArrayList();
      ItemStack var5 = null;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         ItemStack var7 = var1.method3618(var6);
         Class3257 var8 = var7.method32107();
         if (!(var8 instanceof Class3321)) {
            if (field22652.test(var7)) {
               var5 = var7.copy();
               var5.method32180(1);
            }
         } else {
            var4.add(((Class3321)var8).method11876().method313());
         }
      }

      if (var5 != null && !var4.isEmpty()) {
         var5.method32144("Explosion").method112("FadeColors", var4);
         return var5;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28478;
   }
}
