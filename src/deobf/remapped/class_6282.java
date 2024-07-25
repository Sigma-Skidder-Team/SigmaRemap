package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class class_6282 {
   private final class_3765[] field_32109;
   private final class_7279[] field_32112;
   private final Predicate<class_2792> field_32114;
   private final class_2913[] field_32107;
   private final BiFunction<ItemStack, class_2792, ItemStack> field_32110;
   private final class_3254 field_32111;
   private final class_7986 field_32108;

   private class_6282(class_3765[] var1, class_7279[] var2, class_2913[] var3, class_3254 var4, class_7986 var5) {
      this.field_32109 = var1;
      this.field_32112 = var2;
      this.field_32114 = class_5110.<class_2792>method_23432(var2);
      this.field_32107 = var3;
      this.field_32110 = class_5116.method_23457(var3);
      this.field_32111 = var4;
      this.field_32108 = var5;
   }

   private void method_28632(Consumer<ItemStack> var1, class_2792 var2) {
      Random var5 = var2.method_12693();
      ArrayList var6 = Lists.newArrayList();
      MutableInt var7 = new MutableInt();

      for (class_3765 var11 : this.field_32109) {
         var11.method_4277(var2, var3 -> {
            int var6x = var3.method_10528(var2.method_12691());
            if (var6x > 0) {
               var6.add(var3);
               var7.add(var6x);
            }
         });
      }

      int var12 = var6.size();
      if (var7.intValue() != 0 && var12 != 0) {
         if (var12 != 1) {
            int var13 = var5.nextInt(var7.intValue());

            for (class_2283 var15 : var6) {
               var13 -= var15.method_10528(var2.method_12691());
               if (var13 < 0) {
                  var15.method_10529(var1, var2);
                  return;
               }
            }
         } else {
            ((class_2283)var6.get(0)).method_10529(var1, var2);
         }
      }
   }

   public void method_28635(Consumer<ItemStack> var1, class_2792 var2) {
      if (this.field_32114.test(var2)) {
         Consumer var5 = class_2913.method_13320(this.field_32110, var1, var2);
         Random var6 = var2.method_12693();
         int var7 = this.field_32111.method_14868(var6) + MathHelper.floor(this.field_32108.method_36244(var6) * var2.method_12691());

         for (int var8 = 0; var8 < var7; var8++) {
            this.method_28632(var5, var2);
         }
      }
   }

   public void method_28637(class_4737 var1) {
      for (int var4 = 0; var4 < this.field_32112.length; var4++) {
         this.field_32112[var4].method_12680(var1.method_21888(".condition[" + var4 + "]"));
      }

      for (int var5 = 0; var5 < this.field_32107.length; var5++) {
         this.field_32107[var5].method_12680(var1.method_21888(".functions[" + var5 + "]"));
      }

      for (int var6 = 0; var6 < this.field_32109.length; var6++) {
         this.field_32109[var6].method_17436(var1.method_21888(".entries[" + var6 + "]"));
      }
   }

   public static class_349 method_28631() {
      return new class_349();
   }
}
