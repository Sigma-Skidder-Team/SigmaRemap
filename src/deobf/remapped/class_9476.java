package remapped;

import java.util.Optional;
import java.util.Random;

public abstract class class_9476 extends class_6414 {
   private final float field_48306;
   public static final class_4190 field_48307 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public class_9476(class_3073 var1, float var2) {
      super(var1);
      this.field_48306 = var2;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return method_43768(var1.method_21862(), var1.method_21858());
   }

   public static class_2522 method_43768(class_6163 var0, BlockPos var1) {
      BlockPos var4 = var1.method_6100();
      class_2522 var5 = var0.method_28262(var4);
      return !class_1754.method_7846(var5.method_8360()) ? ((class_1878)class_4783.field_23877).method_8413(var0, var1) : class_4783.field_23311.method_29260();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_48307;
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(24) == 0) {
         var2.method_29527(
            (double)var3.getX() + 0.5,
            (double)var3.getY() + 0.5,
            (double)var3.getZ() + 0.5,
            SoundEvents.field_2810,
            class_562.field_3322,
            1.0F + var4.nextFloat(),
            var4.nextFloat() * 0.7F + 0.3F,
            false
         );
      }

      BlockPos var7 = var3.method_6100();
      class_2522 var8 = var2.method_28262(var7);
      if (!this.method_43770(var8) && !var8.method_8308(var2, var7, Direction.field_817)) {
         if (this.method_43770(var2.method_28262(var3.method_6108()))) {
            for (int var16 = 0; var16 < 2; var16++) {
               double var21 = (double)var3.getX() + var4.nextDouble() * 0.1F;
               double var26 = (double)var3.getY() + var4.nextDouble();
               double var31 = (double)var3.getZ() + var4.nextDouble();
               var2.method_43361(class_3090.field_15319, var21, var26, var31, 0.0, 0.0, 0.0);
            }
         }

         if (this.method_43770(var2.method_28262(var3.method_6090()))) {
            for (int var17 = 0; var17 < 2; var17++) {
               double var22 = (double)(var3.getX() + 1) - var4.nextDouble() * 0.1F;
               double var27 = (double)var3.getY() + var4.nextDouble();
               double var32 = (double)var3.getZ() + var4.nextDouble();
               var2.method_43361(class_3090.field_15319, var22, var27, var32, 0.0, 0.0, 0.0);
            }
         }

         if (this.method_43770(var2.method_28262(var3.method_6094()))) {
            for (int var18 = 0; var18 < 2; var18++) {
               double var23 = (double)var3.getX() + var4.nextDouble();
               double var28 = (double)var3.getY() + var4.nextDouble();
               double var33 = (double)var3.getZ() + var4.nextDouble() * 0.1F;
               var2.method_43361(class_3090.field_15319, var23, var28, var33, 0.0, 0.0, 0.0);
            }
         }

         if (this.method_43770(var2.method_28262(var3.method_6073()))) {
            for (int var19 = 0; var19 < 2; var19++) {
               double var24 = (double)var3.getX() + var4.nextDouble();
               double var29 = (double)var3.getY() + var4.nextDouble();
               double var34 = (double)(var3.getZ() + 1) - var4.nextDouble() * 0.1F;
               var2.method_43361(class_3090.field_15319, var24, var29, var34, 0.0, 0.0, 0.0);
            }
         }

         if (this.method_43770(var2.method_28262(var3.method_6081()))) {
            for (int var20 = 0; var20 < 2; var20++) {
               double var25 = (double)var3.getX() + var4.nextDouble();
               double var30 = (double)(var3.getY() + 1) - var4.nextDouble() * 0.1F;
               double var35 = (double)var3.getZ() + var4.nextDouble();
               var2.method_43361(class_3090.field_15319, var25, var30, var35, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int var9 = 0; var9 < 3; var9++) {
            double var10 = (double)var3.getX() + var4.nextDouble();
            double var12 = (double)var3.getY() + var4.nextDouble() * 0.5 + 0.5;
            double var14 = (double)var3.getZ() + var4.nextDouble();
            var2.method_43361(class_3090.field_15319, var10, var12, var14, 0.0, 0.0, 0.0);
         }
      }
   }

   public abstract boolean method_43770(class_2522 var1);

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      if (!var4.method_37087()) {
         var4.method_37164(var4.method_37230() + 1);
         if (var4.method_37230() == 0) {
            var4.method_37178(8);
         }

         var4.attackEntityFrom(DamageSource.field_31678, this.field_48306);
      }

      super.method_10784(var1, var2, var3, var4);
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360())) {
         if (method_43767(var2)) {
            Optional var8 = class_2018.method_9378(var2, var3, class_9249.field_47215);
            if (var8.isPresent()) {
               ((class_2018)var8.get()).method_9377();
               return;
            }
         }

         if (!var1.method_8309(var2, var3)) {
            var2.method_7508(var3, false);
         }
      }
   }

   private static boolean method_43767(World var0) {
      return var0.method_29545() == World.field_33048 || var0.method_29545() == World.field_33029;
   }

   @Override
   public void method_29265(World var1, BlockPos var2, class_2522 var3, PlayerEntity var4) {
      if (!var1.method_22567()) {
         var1.method_43365((PlayerEntity)null, 1009, var2, 0);
      }
   }

   public static boolean method_43769(World var0, BlockPos var1, Direction var2) {
      class_2522 var5 = var0.method_28262(var1);
      return !var5.method_8345() ? false : method_43768(var0, var1).method_8309(var0, var1) || method_43771(var0, var1, var2);
   }

   private static boolean method_43771(World var0, BlockPos var1, Direction var2) {
      if (!method_43767(var0)) {
         return false;
      } else {
         class_2921 var5 = var1.method_6089();
         boolean var6 = false;

         for (Direction var10 : Direction.values()) {
            if (var0.method_28262(var5.method_13364(var1).method_13368(var10)).method_8350(class_4783.field_23881)) {
               var6 = true;
               break;
            }
         }

         return var6 && class_2018.method_9378(var0, var1, var2.method_1053().method_1029()).isPresent();
      }
   }
}
