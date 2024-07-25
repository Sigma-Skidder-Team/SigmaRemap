package remapped;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.Random;

public class class_1061 extends class_3200<class_1941> {
   private static String[] field_5819;

   public class_1061(class_5390<class_1941> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_4661(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_1941 var7) {
      class_6631 var10 = class_6631.method_30492(this.field_15989);
      byte var11 = 5;
      byte var12 = 5;
      if (var10 != class_6631.field_34334) {
         if (var10 != class_6631.field_34338) {
            if (var10 == class_6631.field_34335) {
               var12 = -5;
            }
         } else {
            var11 = -5;
            var12 = -5;
         }
      } else {
         var11 = -5;
      }

      int var13 = (var4 << 4) + 7;
      int var14 = (var5 << 4) + 7;
      int var15 = var2.method_29819(var13, var14, class_3801.field_18598);
      int var16 = var2.method_29819(var13, var14 + var12, class_3801.field_18598);
      int var17 = var2.method_29819(var13 + var11, var14, class_3801.field_18598);
      int var18 = var2.method_29819(var13 + var11, var14 + var12, class_3801.field_18598);
      int var19 = Math.min(Math.min(var15, var16), Math.min(var17, var18));
      if (var19 >= 60) {
         BlockPos var20 = new BlockPos(var4 * 16 + 8, var19 + 1, var5 * 16 + 8);
         LinkedList var21 = Lists.newLinkedList();
         class_9404.method_43570(var3, var20, var10, var21, this.field_15989);
         this.field_15986.addAll(var21);
         this.method_14720();
      }
   }

   @Override
   public void method_14719(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6) {
      super.method_14719(var1, var2, var3, var4, var5, var6);
      int var9 = this.field_15988.field_48995;

      for (int var10 = var5.field_48996; var10 <= var5.field_48991; var10++) {
         for (int var11 = var5.field_48992; var11 <= var5.field_48994; var11++) {
            BlockPos var12 = new BlockPos(var10, var9, var11);
            if (!var1.method_22548(var12) && this.field_15988.method_44395(var12)) {
               boolean var13 = false;

               for (class_7060 var15 : this.field_15986) {
                  if (var15.method_32512().method_44395(var12)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  for (int var16 = var9 - 1; var16 > 1; var16--) {
                     BlockPos var17 = new BlockPos(var10, var16, var11);
                     if (!var1.method_22548(var17) && !var1.method_28262(var17).method_8362().method_24494()) {
                        break;
                     }

                     var1.method_7513(var17, class_4783.field_23808.method_29260(), 2);
                  }
               }
            }
         }
      }
   }
}
