package remapped;

import java.util.Random;

public class class_285 extends class_6414 {
   private static String[] field_1010;

   public class_285(class_3073 var1) {
      super(var1);
   }

   public int method_1266(Random var1) {
      if (this != class_4783.field_23867) {
         if (this != class_4783.field_23681) {
            if (this != class_4783.field_23463) {
               if (this != class_4783.field_23584) {
                  if (this != class_4783.field_23196) {
                     return this != class_4783.field_23249 ? 0 : MathHelper.nextInt(var1, 0, 1);
                  } else {
                     return MathHelper.nextInt(var1, 2, 5);
                  }
               } else {
                  return MathHelper.nextInt(var1, 2, 5);
               }
            } else {
               return MathHelper.nextInt(var1, 3, 7);
            }
         } else {
            return MathHelper.nextInt(var1, 3, 7);
         }
      } else {
         return MathHelper.nextInt(var1, 0, 2);
      }
   }

   @Override
   public void method_10765(class_2522 var1, class_6331 var2, BlockPos var3, ItemStack var4) {
      super.method_10765(var1, var2, var3, var4);
      if (class_2931.method_13423(class_3668.field_17870, var4) == 0) {
         int var7 = this.method_1266(var2.field_33033);
         if (var7 > 0) {
            this.method_29304(var2, var3, var7);
         }
      }
   }
}
