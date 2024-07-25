package remapped;

import java.util.Random;

public class class_5473 extends class_7060 {
   private static String[] field_27889;

   public class_5473(BlockPos var1) {
      super(class_2746.field_13416, 0);
      this.field_36435 = new class_9616(
         var1.getX(), var1.method_12165(), var1.method_12185(), var1.getX(), var1.method_12165(), var1.method_12185()
      );
   }

   public class_5473(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13416, var2);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      int var10 = var1.method_22562(class_3801.field_18591, this.field_36435.field_48996, this.field_36435.field_48992);
      class_2921 var11 = new class_2921(this.field_36435.field_48996, var10, this.field_36435.field_48992);

      while (var11.method_12165() > 0) {
         class_2522 var12 = var1.method_28262(var11);
         class_2522 var13 = var1.method_28262(var11.method_6100());
         if (var13 == class_4783.field_23459.method_29260()
            || var13 == class_4783.field_23644.method_29260()
            || var13 == class_4783.field_23271.method_29260()
            || var13 == class_4783.field_23695.method_29260()
            || var13 == class_4783.field_23440.method_29260()) {
            class_2522 var14 = !var12.method_8345() && !this.method_24885(var12) ? var12 : class_4783.field_23216.method_29260();

            for (Direction var18 : Direction.values()) {
               BlockPos var19 = var11.method_6098(var18);
               class_2522 var20 = var1.method_28262(var19);
               if (var20.method_8345() || this.method_24885(var20)) {
                  BlockPos var21 = var19.method_6100();
                  class_2522 var22 = var1.method_28262(var21);
                  if ((var22.method_8345() || this.method_24885(var22)) && var18 != Direction.field_817) {
                     var1.method_7513(var19, var13, 3);
                  } else {
                     var1.method_7513(var19, var14, 3);
                  }
               }
            }

            this.field_36435 = new class_9616(
               var11.getX(), var11.method_12165(), var11.method_12185(), var11.getX(), var11.method_12165(), var11.method_12185()
            );
            return this.method_32526(var1, var5, var4, var11, class_5931.field_30082, (class_2522)null);
         }

         var11.method_13367(0, -1, 0);
      }

      return false;
   }

   private boolean method_24885(class_2522 var1) {
      return var1 == class_4783.field_23900.method_29260() || var1 == class_4783.field_23811.method_29260();
   }
}
