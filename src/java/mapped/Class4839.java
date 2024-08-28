package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class Class4839 extends Class4837 {
   private static String[] field22616;

   public Class4839(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, Class1655 var2) {
      Class8848 var5 = Class8848.field39973;
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         Class8848 var8 = var1.method3618(var7);
         if (!var8.method32105()) {
            if (!(var8.method32107() instanceof Class3277)) {
               if (!(var8.method32107() instanceof Class3321)) {
                  return false;
               }

               var6.add(var8);
            } else {
               if (!var5.method32105()) {
                  return false;
               }

               var5 = var8;
            }
         }
      }

      return !var5.method32105() && !var6.isEmpty();
   }

   public Class8848 method14962(Class926 var1) {
      ArrayList var4 = Lists.newArrayList();
      Class8848 var5 = Class8848.field39973;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         Class8848 var7 = var1.method3618(var6);
         if (!var7.method32105()) {
            Class3257 var8 = var7.method32107();
            if (!(var8 instanceof Class3277)) {
               if (!(var8 instanceof Class3321)) {
                  return Class8848.field39973;
               }

               var4.add((Class3321)var8);
            } else {
               if (!var5.method32105()) {
                  return Class8848.field39973;
               }

               var5 = var7.method32126();
            }
         }
      }

      return !var5.method32105() && !var4.isEmpty() ? Class3277.method11803(var5, var4) : Class8848.field39973;
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
