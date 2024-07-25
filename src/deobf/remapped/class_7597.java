package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_7597 extends class_2451 {
   public class_7597(class_317 var1) {
      super(var1);
   }

   @Override
   public boolean method_11252(ItemStack var1) {
      return true;
   }

   @Override
   public boolean method_11248(ItemStack var1) {
      return false;
   }

   public static class_3416 method_34501(ItemStack var0) {
      class_5734 var3 = var0.method_27990();
      return var3 == null ? new class_3416() : var3.method_25927("StoredEnchantments", 10);
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      super.method_11218(var1, var2, var3, var4);
      ItemStack.method_28029(var3, method_34501(var1));
   }

   public static void method_34503(ItemStack var0, class_9693 var1) {
      class_3416 var4 = method_34501(var0);
      boolean var5 = true;
      Identifier var6 = class_8669.field_44445.method_39797(var1.field_49312);

      for (int var7 = 0; var7 < var4.size(); var7++) {
         class_5734 var8 = var4.method_15764(var7);
         Identifier var9 = Identifier.method_21455(var8.method_25965("id"));
         if (var9 != null && var9.equals(var6)) {
            if (var8.method_25947("lvl") < var1.field_49313) {
               var8.method_25958("lvl", (short)var1.field_49313);
            }

            var5 = false;
            break;
         }
      }

      if (var5) {
         class_5734 var10 = new class_5734();
         var10.method_25941("id", String.valueOf(var6));
         var10.method_25958("lvl", (short)var1.field_49313);
         var4.add(var10);
      }

      var0.method_27994().method_25946("StoredEnchantments", var4);
   }

   public static ItemStack method_34502(class_9693 var0) {
      ItemStack var3 = new ItemStack(class_4897.field_24879);
      method_34503(var3, var0);
      return var3;
   }

   @Override
   public void method_11239(class_8230 var1, class_2831<ItemStack> var2) {
      if (var1 != class_8230.field_42264) {
         if (var1.method_37698().length != 0) {
            for (class_4382 var6 : class_8669.field_44445) {
               if (var1.method_37687(var6.field_21496)) {
                  var2.add(method_34502(new class_9693(var6, var6.method_20417())));
               }
            }
         }
      } else {
         for (class_4382 var9 : class_8669.field_44445) {
            if (var9.field_21496 != null) {
               for (int var7 = var9.method_20425(); var7 <= var9.method_20417(); var7++) {
                  var2.add(method_34502(new class_9693(var9, var7)));
               }
            }
         }
      }
   }
}
