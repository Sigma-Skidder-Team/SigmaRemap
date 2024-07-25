package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class class_5314 extends class_9260 {
   private static String[] field_27115;
   private static final List<class_2451> field_27114 = ImmutableList.of(class_4897.field_24621, class_4897.field_24883);

   @Override
   public void method_42665(class_6331 var1, class_7666 var2) {
      Optional var5 = var2.method_26525().<class_8150>method_5138(class_6044.field_30883);
      if (var5.isPresent()) {
         class_8150 var6 = (class_8150)var5.get();
         class_2522 var7 = var1.method_28262(var6.method_37409());
         if (var7.method_8350(class_4783.field_23274)) {
            this.method_24246(var2);
            this.method_24247(var1, var2, var6, var7);
         }
      }
   }

   private void method_24247(class_6331 var1, class_7666 var2, class_8150 var3, class_2522 var4) {
      class_1331 var7 = var3.method_37409();
      if (var4.<Integer>method_10313(class_7689.field_39050) == 8) {
         var4 = class_7689.method_34839(var4, var1, var7);
      }

      int var8 = 20;
      byte var9 = 10;
      int[] var10 = new int[field_27114.size()];
      class_4657 var11 = var2.method_2017();
      int var12 = var11.method_31505();
      class_2522 var13 = var4;

      for (int var14 = var12 - 1; var14 >= 0 && var8 > 0; var14--) {
         ItemStack var15 = var11.method_31498(var14);
         int var16 = field_27114.indexOf(var15.method_27960());
         if (var16 != -1) {
            int var17 = var15.method_27997();
            int var18 = var10[var16] + var17;
            var10[var16] = var18;
            int var19 = Math.min(Math.min(var18 - 10, var8), var17);
            if (var19 > 0) {
               var8 -= var19;

               for (int var20 = 0; var20 < var19; var20++) {
                  var13 = class_7689.method_34840(var13, var1, var15, var7);
                  if (var13.<Integer>method_10313(class_7689.field_39050) == 7) {
                     this.method_24245(var1, var4, var7, var13);
                     return;
                  }
               }
            }
         }
      }

      this.method_24245(var1, var4, var7, var13);
   }

   private void method_24245(class_6331 var1, class_2522 var2, class_1331 var3, class_2522 var4) {
      var1.method_43364(1500, var3, var4 == var2 ? 0 : 1);
   }

   private void method_24246(class_7666 var1) {
      class_4657 var4 = var1.method_2017();
      if (var4.method_31504(class_4897.field_24456) <= 36) {
         int var5 = var4.method_31504(class_4897.field_24813);
         byte var6 = 3;
         byte var7 = 3;
         int var8 = Math.min(3, var5 / 3);
         if (var8 != 0) {
            int var9 = var8 * 3;
            var4.method_21547(class_4897.field_24813, var9);
            ItemStack var10 = var4.method_21542(new ItemStack(class_4897.field_24456, var8));
            if (!var10.method_28022()) {
               var1.method_37311(var10, 0.5F);
            }
         }
      }
   }
}
