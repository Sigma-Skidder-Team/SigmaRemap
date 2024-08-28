package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Class4858 extends Class4837 {
   private static String[] field22654;

   public Class4858(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, World var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         ItemStack var7 = var1.method3618(var6);
         if (!var7.method32105()) {
            var5.add(var7);
            if (var5.size() > 1) {
               ItemStack var8 = (ItemStack)var5.get(0);
               if (var7.method32107() != var8.method32107() || var8.method32179() != 1 || var7.method32179() != 1 || !var8.method32107().method11712()) {
                  return false;
               }
            }
         }
      }

      return var5.size() == 2;
   }

   public ItemStack method14962(Class926 var1) {
      ArrayList var4 = Lists.newArrayList();

      for (int var5 = 0; var5 < var1.method3629(); var5++) {
         ItemStack var6 = var1.method3618(var5);
         if (!var6.method32105()) {
            var4.add(var6);
            if (var4.size() > 1) {
               ItemStack var7 = (ItemStack)var4.get(0);
               if (var6.method32107() != var7.method32107() || var7.method32179() != 1 || var6.method32179() != 1 || !var7.method32107().method11712()) {
                  return ItemStack.EMPTY;
               }
            }
         }
      }

      if (var4.size() == 2) {
         ItemStack var16 = (ItemStack)var4.get(0);
         ItemStack var17 = (ItemStack)var4.get(1);
         if (var16.method32107() == var17.method32107() && var16.method32179() == 1 && var17.method32179() == 1 && var16.method32107().method11712()) {
            Class3257 var18 = var16.method32107();
            int var8 = var18.method11711() - var16.method32117();
            int var9 = var18.method11711() - var17.method32117();
            int var10 = var8 + var9 + var18.method11711() * 5 / 100;
            int var11 = var18.method11711() - var10;
            if (var11 < 0) {
               var11 = 0;
            }

            ItemStack var12 = new ItemStack(var16.method32107());
            var12.method32118(var11);
            HashMap var13 = Maps.newHashMap();
            Map<Class6069, Integer> var14 = Class7858.method26312(var16);
            Map<Class6069, Integer> var15 = Class7858.method26312(var17);
            Registry.field16073.method9192().filter(Class6069::method18825).forEach(var3 -> {
               int var6x = Math.max(var14.getOrDefault(var3, 0), var15.getOrDefault(var3, 0));
               if (var6x > 0) {
                  var13.put(var3, var6x);
               }
            });
            if (!var13.isEmpty()) {
               Class7858.method26314(var13, var12);
            }

            return var12;
         }
      }

      return ItemStack.EMPTY;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28484;
   }
}
