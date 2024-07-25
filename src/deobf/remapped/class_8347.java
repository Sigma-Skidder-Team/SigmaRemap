package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public class class_8347 extends class_7157 {
   private static final class_8137 field_42754 = class_8137.method_37019(
      class_4897.field_24352,
      class_4897.field_24922,
      class_4897.field_24659,
      class_4897.field_24880,
      class_4897.field_24563,
      class_4897.field_25069,
      class_4897.field_24749,
      class_4897.field_24540,
      class_4897.field_24349
   );
   private static final class_8137 field_42753 = class_8137.method_37019(class_4897.field_24481);
   private static final class_8137 field_42752 = class_8137.method_37019(class_4897.field_24777);
   private static final Map<class_2451, class_3917> field_42755 = Util.<Map<class_2451, class_3917>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put(class_4897.field_24352, class_3917.field_19031);
      var0.put(class_4897.field_24922, class_3917.field_19027);
      var0.put(class_4897.field_24659, class_3917.field_19029);
      var0.put(class_4897.field_24880, class_3917.field_19025);
      var0.put(class_4897.field_24563, class_3917.field_19025);
      var0.put(class_4897.field_25069, class_3917.field_19025);
      var0.put(class_4897.field_24749, class_3917.field_19025);
      var0.put(class_4897.field_24540, class_3917.field_19025);
      var0.put(class_4897.field_24349, class_3917.field_19025);
   });
   private static final class_8137 field_42751 = class_8137.method_37019(class_4897.field_24581);

   public class_8347(Identifier var1) {
      super(var1);
   }

   public boolean method_38437(class_6946 var1, World var2) {
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;

      for (int var10 = 0; var10 < var1.method_31505(); var10++) {
         ItemStack var11 = var1.method_31498(var10);
         if (!var11.method_28022()) {
            if (!field_42754.test(var11)) {
               if (!field_42752.test(var11)) {
                  if (!field_42753.test(var11)) {
                     if (!field_42751.test(var11)) {
                        if (!(var11.method_27960() instanceof class_239)) {
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

   public ItemStack method_38436(class_6946 var1) {
      ItemStack var4 = new ItemStack(class_4897.field_24554);
      CompoundNBT var5 = var4.method_27978("Explosion");
      class_3917 var6 = class_3917.field_19023;
      ArrayList var7 = Lists.newArrayList();

      for (int var8 = 0; var8 < var1.method_31505(); var8++) {
         ItemStack var9 = var1.method_31498(var8);
         if (!var9.method_28022()) {
            if (!field_42754.test(var9)) {
               if (!field_42752.test(var9)) {
                  if (!field_42753.test(var9)) {
                     if (var9.method_27960() instanceof class_239) {
                        var7.add(((class_239)var9.method_27960()).method_1015().method_41793());
                     }
                  } else {
                     var5.method_25934("Trail", true);
                  }
               } else {
                  var5.method_25934("Flicker", true);
               }
            } else {
               var6 = field_42755.get(var9.method_27960());
            }
         }
      }

      var5.method_25968("Colors", var7);
      var5.method_25921("Type", (byte)var6.method_18131());
      return var4;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public ItemStack method_41044() {
      return new ItemStack(class_4897.field_24554);
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14713;
   }
}
