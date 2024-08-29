package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public class Class4860 extends Class4837 {
   private static final Class120 field22658 = Class120.method339(
      Items.field38046,
      Items.field37839,
      Items.field37969,
      Items.field38058,
      Items.field38059,
      Items.field38062,
      Items.field38060,
      Items.field38063,
      Items.field38061
   );
   private static final Class120 field22659 = Class120.method339(Items.field37800);
   private static final Class120 field22660 = Class120.method339(Items.field37908);
   private static final Map<Item, Class2119> field22661 = Util.<Map<Item, Class2119>>make(Maps.newHashMap(), var0 -> {
      var0.put(Items.field38046, Class2119.field13808);
      var0.put(Items.field37839, Class2119.field13811);
      var0.put(Items.field37969, Class2119.field13809);
      var0.put(Items.field38058, Class2119.field13810);
      var0.put(Items.field38059, Class2119.field13810);
      var0.put(Items.field38062, Class2119.field13810);
      var0.put(Items.field38060, Class2119.field13810);
      var0.put(Items.field38063, Class2119.field13810);
      var0.put(Items.field38061, Class2119.field13810);
   });
   private static final Class120 field22662 = Class120.method339(Items.field37840);

   public Class4860(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, World var2) {
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;

      for (int var10 = 0; var10 < var1.method3629(); var10++) {
         ItemStack var11 = var1.method3618(var10);
         if (!var11.isEmpty()) {
            if (!field22658.test(var11)) {
               if (!field22660.test(var11)) {
                  if (!field22659.test(var11)) {
                     if (!field22662.test(var11)) {
                        if (!(var11.getItem() instanceof Class3321)) {
                           return false;
                        }

                        var6 = true;
                     } else {
                        if (var5) {
                           return false;
                        }

                        var5 = true;
                     }
                  } else {
                     if (var8) {
                        return false;
                     }

                     var8 = true;
                  }
               } else {
                  if (var9) {
                     return false;
                  }

                  var9 = true;
               }
            } else {
               if (var7) {
                  return false;
               }

               var7 = true;
            }
         }
      }

      return var5 && var6;
   }

   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = new ItemStack(Items.field38069);
      CompoundNBT var5 = var4.method32144("Explosion");
      Class2119 var6 = Class2119.field13807;
      ArrayList var7 = Lists.newArrayList();

      for (int var8 = 0; var8 < var1.method3629(); var8++) {
         ItemStack var9 = var1.method3618(var8);
         if (!var9.isEmpty()) {
            if (!field22658.test(var9)) {
               if (!field22660.test(var9)) {
                  if (!field22659.test(var9)) {
                     if (var9.getItem() instanceof Class3321) {
                        var7.add(((Class3321)var9.getItem()).method11876().method313());
                     }
                  } else {
                     var5.method115("Trail", true);
                  }
               } else {
                  var5.method115("Flicker", true);
               }
            } else {
               var6 = field22661.get(var9.getItem());
            }
         }
      }

      var5.method112("Colors", var7);
      var5.method100("Type", (byte)var6.method8800());
      return var4;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return new ItemStack(Items.field38069);
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28477;
   }
}
