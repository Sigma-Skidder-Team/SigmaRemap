package remapped;

public class class_5864 extends class_3333 {
   private static String[] field_29795;
   public static final class_4190 field_29796 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public class_5864(class_3073 var1) {
      super(var1);
   }

   private static boolean method_26718(Entity var0) {
      return var0 instanceof class_5834 || var0 instanceof AbstractMinecartEntity || var0 instanceof class_1356 || var0 instanceof BoatEntity;
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_29796;
   }

   @Override
   public void method_29263(World var1, BlockPos var2, Entity var3, float var4) {
      var3.method_37155(class_463.field_2469, 1.0F, 1.0F);
      if (!var1.field_33055) {
         var1.method_29587(var3, (byte)54);
      }

      if (var3.method_37270(var4, 0.2F)) {
         var3.method_37155(this.field_11819.method_21394(), this.field_11819.method_21395() * 0.5F, this.field_11819.method_21393() * 0.75F);
      }
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      if (this.method_26719(var3, var4)) {
         this.method_26717(var4, var3);
         this.method_26721(var4);
         this.method_26716(var2, var4);
      }

      super.method_10784(var1, var2, var3, var4);
   }

   private boolean method_26719(BlockPos var1, Entity var2) {
      if (var2.method_37360()) {
         return false;
      } else if (!(var2.method_37309() > (double)var1.method_12165() + 0.9375 - 1.0E-7)) {
         if (var2.method_37098().field_7333 >= -0.08) {
            return false;
         } else {
            double var5 = Math.abs((double)var1.method_12173() + 0.5 - var2.getPosX());
            double var7 = Math.abs((double)var1.method_12185() + 0.5 - var2.getPosZ());
            double var9 = 0.4375 + (double)(var2.method_37086() / 2.0F);
            return var5 + 1.0E-7 > var9 || var7 + 1.0E-7 > var9;
         }
      } else {
         return false;
      }
   }

   private void method_26717(Entity var1, BlockPos var2) {
      if (var1 instanceof class_9359 && var1.world.method_29546() % 20L == 0L) {
         class_8807.field_45061.method_33534((class_9359)var1, var1.world.method_28262(var2));
      }
   }

   private void method_26721(Entity var1) {
      class_1343 var4 = var1.method_37098();
      if (!(var4.field_7333 < -0.13)) {
         var1.method_37215(new class_1343(var4.field_7336, -0.05, var4.field_7334));
      } else {
         double var5 = -0.05 / var4.field_7333;
         var1.method_37215(new class_1343(var4.field_7336 * var5, -0.05, var4.field_7334 * var5));
      }

      var1.field_41706 = 0.0F;
   }

   private void method_26716(World var1, Entity var2) {
      if (method_26718(var2)) {
         if (var1.field_33033.nextInt(5) == 0) {
            var2.method_37155(class_463.field_2469, 1.0F, 1.0F);
         }

         if (!var1.field_33055 && var1.field_33033.nextInt(5) == 0) {
            var1.method_29587(var2, (byte)53);
         }
      }
   }

   public static void method_26720(Entity var0) {
      method_26723(var0, 5);
   }

   public static void method_26722(Entity var0) {
      method_26723(var0, 10);
   }

   private static void method_26723(Entity var0, int var1) {
      if (var0.world.field_33055) {
         class_2522 var4 = class_4783.field_23899.method_29260();

         for (int var5 = 0; var5 < var1; var5++) {
            var0.world
               .method_43361(new class_7110(class_3090.field_15325, var4), var0.getPosX(), var0.method_37309(), var0.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }
}
