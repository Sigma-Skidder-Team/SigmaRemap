package remapped;

import java.util.Random;

public class class_6050 extends class_4314 {
   private static String[] field_30944;
   public static final class_6720[] field_30943 = new class_6720[]{class_6023.field_30697, class_6023.field_30700, class_6023.field_30727};
   public static final class_4190 field_30945 = class_3370.method_15530(
      class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), class_6414.method_29292(7.0, 0.0, 7.0, 9.0, 14.0, 9.0)
   );

   public class_6050(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_30943[0], Boolean.valueOf(false))
            .method_10308(field_30943[1], Boolean.valueOf(false))
            .method_10308(field_30943[2], Boolean.valueOf(false))
      );
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5678();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_30945;
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (!var2.field_33055) {
         class_3757 var9 = var2.method_28260(var3);
         if (var9 instanceof class_5678) {
            var4.method_3152((class_5678)var9);
            var4.method_3209(class_6234.field_31842);
         }

         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, LivingEntity var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_5678) {
            ((class_5678)var8).method_38432(var5.method_28008());
         }
      }
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.getX() + 0.4 + (double)var4.nextFloat() * 0.2;
      double var9 = (double)var3.getY() + 0.7 + (double)var4.nextFloat() * 0.3;
      double var11 = (double)var3.getZ() + 0.4 + (double)var4.nextFloat() * 0.2;
      var2.method_43361(class_3090.field_15376, var7, var9, var11, 0.0, 0.0, 0.0);
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_5678) {
            class_1573.method_7104(var2, var3, (class_5678)var8);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, BlockPos var3) {
      return class_4088.method_18863(var2.method_28260(var3));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_30943[0], field_30943[1], field_30943[2]);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
