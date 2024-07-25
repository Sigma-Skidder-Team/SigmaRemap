package remapped;

import java.util.Random;

public class class_6021 extends class_4749 {
   private static String[] field_30660;
   public static final class_7044 field_30661 = class_6023.field_30750;

   public class_6021(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_30661, Integer.valueOf(0)));
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      this.method_10797(var1, var2, var3, var4);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if ((var4.nextInt(3) == 0 || this.method_27460(var2, var3, 4))
         && var2.method_22573(var3) > 11 - var1.<Integer>method_10313(field_30661) - var1.method_8320(var2, var3)
         && this.method_27459(var1, var2, var3)) {
         class_2921 var7 = new class_2921();

         for (Direction var11 : Direction.values()) {
            var7.method_13371(var3, var11);
            class_2522 var12 = var2.method_28262(var7);
            if (var12.method_8350(this) && !this.method_27459(var12, var2, var7)) {
               var2.method_28968().method_14011(var7, this, class_9299.method_42824(var4, 20, 40));
            }
         }
      } else {
         var2.method_28968().method_14011(var3, this, class_9299.method_42824(var4, 20, 40));
      }
   }

   private boolean method_27459(class_2522 var1, World var2, BlockPos var3) {
      int var6 = var1.<Integer>method_10313(field_30661);
      if (var6 >= 3) {
         this.method_21930(var1, var2, var3);
         return true;
      } else {
         var2.method_7513(var3, var1.method_10308(field_30661, Integer.valueOf(var6 + 1)), 2);
         return false;
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      if (var4 == this && this.method_27460(var2, var3, 2)) {
         this.method_21930(var1, var2, var3);
      }

      super.method_10801(var1, var2, var3, var4, var5, var6);
   }

   private boolean method_27460(class_6163 var1, BlockPos var2, int var3) {
      int var6 = 0;
      class_2921 var7 = new class_2921();

      for (Direction var11 : Direction.values()) {
         var7.method_13371(var2, var11);
         if (var1.method_28262(var7).method_8350(this)) {
            if (++var6 >= var3) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_30661);
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return ItemStack.EMPTY;
   }
}
