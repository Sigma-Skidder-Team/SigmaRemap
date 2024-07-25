package remapped;

import java.util.Random;

public class class_3933 extends class_6414 {
   private static String[] field_19109;

   public class_3933(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_29286(World var1, BlockPos var2, Entity var3) {
      if (!var3.method_37087() && var3 instanceof LivingEntity && !class_2931.method_13407((LivingEntity)var3)) {
         var3.attackEntityFrom(DamageSource.field_31675, 1.0F);
      }

      super.method_29286(var1, var2, var3);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      class_6644.method_30519(var2, var3.method_6081(), true);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.field_817 && var3.method_8350(class_4783.field_23900)) {
         var4.method_43367().method_14011(var5, this, 20);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.method_6081();
      if (var2.method_28258(var3).method_22007(class_6503.field_33094)) {
         var2.method_43359(
            (PlayerEntity)null,
            var3,
            SoundEvents.field_2472,
            class_562.field_3322,
            0.5F,
            2.6F + (var2.field_33033.nextFloat() - var2.field_33033.nextFloat()) * 0.8F
         );
         var2.method_28957(
            class_3090.field_15319,
            (double)var7.getX() + 0.5,
            (double)var7.method_12165() + 0.25,
            (double)var7.method_12185() + 0.5,
            8,
            0.5,
            0.25,
            0.5,
            0.0
         );
      }
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      var2.method_43367().method_14011(var3, this, 20);
   }
}
