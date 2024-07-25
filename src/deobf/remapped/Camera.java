package remapped;

public class Camera {
   private static String[] field_46422;
   private boolean field_46421;
   private class_6163 field_46410;
   private Entity field_46419;
   private class_1343 field_46411 = class_1343.field_7335;
   private final class_2921 field_46414 = new class_2921();
   private final class_2426 field_46408 = new class_2426(0.0F, 0.0F, 1.0F);
   private final class_2426 field_46423 = new class_2426(0.0F, 1.0F, 0.0F);
   private final class_2426 field_46418 = new class_2426(1.0F, 0.0F, 0.0F);
   private float field_46415;
   private float field_46412;
   private final Quaternion field_46416 = new Quaternion(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean field_46417;
   private boolean field_46409;
   private float field_46413;
   private float field_46420;

   public void method_41643(class_6163 var1, Entity var2, boolean var3, boolean var4, float var5) {
      this.field_46421 = true;
      this.field_46410 = var1;
      this.field_46419 = var2;
      this.field_46417 = var3;
      this.field_46409 = var4;
      this.method_41637(var2.getYaw(var5), var2.getPitch(var5));
      this.method_41628(
         class_9299.method_42794((double)var5, var2.field_41767, var2.getPosX()),
         class_9299.method_42794((double)var5, var2.field_41698, var2.method_37309())
            + (double)class_9299.method_42795(var5, this.field_46420, this.field_46413),
         class_9299.method_42794((double)var5, var2.field_41725, var2.getPosZ())
      );
      if (!var3) {
         if (var2 instanceof class_5834 && ((class_5834)var2).method_26507()) {
            Direction var8 = ((class_5834)var2).method_26408();
            this.method_41637(var8 == null ? 0.0F : var8.method_1028() - 180.0F, 0.0F);
            this.method_41635(0.0, 0.3, 0.0);
         }
      } else {
         if (var4) {
            this.method_41637(this.field_46412 + 180.0F, -this.field_46415);
         }

         this.method_41635(-this.method_41647(4.0), 0.0, 0.0);
      }
   }

   public void method_41645() {
      if (this.field_46419 != null) {
         this.field_46420 = this.field_46413;
         this.field_46413 = this.field_46413 + (this.field_46419.method_37277() - this.field_46413) * 0.5F;
      }
   }

   private double method_41647(double var1) {
      for (int var5 = 0; var5 < 8; var5++) {
         float var6 = (float)((var5 & 1) * 2 - 1);
         float var7 = (float)((var5 >> 1 & 1) * 2 - 1);
         float var8 = (float)((var5 >> 2 & 1) * 2 - 1);
         var6 *= 0.1F;
         var7 *= 0.1F;
         var8 *= 0.1F;
         class_1343 var9 = this.field_46411.method_6214((double)var6, (double)var7, (double)var8);
         class_1343 var10 = new class_1343(
            this.field_46411.field_7336 - (double)this.field_46408.method_11057() * var1 + (double)var6 + (double)var8,
            this.field_46411.field_7333 - (double)this.field_46408.method_11061() * var1 + (double)var7,
            this.field_46411.field_7334 - (double)this.field_46408.method_11055() * var1 + (double)var8
         );
         class_9529 var11 = this.field_46410.method_28265(new class_972(var9, var10, class_3132.field_15552, class_9583.field_48747, this.field_46419));
         if (var11.method_33990() != class_1430.field_7721) {
            double var12 = var11.method_33993().method_6195(this.field_46411);
            if (var12 < var1 && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(CameraNoClipModule.class).method_42015()) {
               var1 = var12;
            }
         }
      }

      return var1;
   }

   public void method_41635(double var1, double var3, double var5) {
      double var9 = (double)this.field_46408.method_11057() * var1
         + (double)this.field_46423.method_11057() * var3
         + (double)this.field_46418.method_11057() * var5;
      double var11 = (double)this.field_46408.method_11061() * var1
         + (double)this.field_46423.method_11061() * var3
         + (double)this.field_46418.method_11061() * var5;
      double var13 = (double)this.field_46408.method_11055() * var1
         + (double)this.field_46423.method_11055() * var3
         + (double)this.field_46418.method_11055() * var5;
      this.method_41629(new class_1343(this.field_46411.field_7336 + var9, this.field_46411.field_7333 + var11, this.field_46411.field_7334 + var13));
   }

   public void method_41637(float var1, float var2) {
      this.field_46415 = var2;
      this.field_46412 = var1;
      this.field_46416.method_24650(0.0F, 0.0F, 0.0F, 1.0F);
      this.field_46416.method_24658(class_2426.field_12074.method_11074(-var1));
      this.field_46416.method_24658(class_2426.field_12080.method_11074(var2));
      this.field_46408.method_11065(0.0F, 0.0F, 1.0F);
      this.field_46408.method_11058(this.field_46416);
      this.field_46423.method_11065(0.0F, 1.0F, 0.0F);
      this.field_46423.method_11058(this.field_46416);
      this.field_46418.method_11065(1.0F, 0.0F, 0.0F);
      this.field_46418.method_11058(this.field_46416);
   }

   public void method_41628(double var1, double var3, double var5) {
      this.method_41629(new class_1343(var1, var3, var5));
   }

   public void method_41629(class_1343 var1) {
      this.field_46411 = var1;
      this.field_46414.method_13361(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public class_1343 method_41627() {
      return this.field_46411;
   }

   public BlockPos method_41630() {
      return this.field_46414;
   }

   public float method_41638() {
      return this.field_46415;
   }

   public float method_41640() {
      return this.field_46412;
   }

   public Quaternion method_41644() {
      return this.field_46416;
   }

   public Entity method_41633() {
      return this.field_46419;
   }

   public boolean method_41642() {
      return this.field_46421;
   }

   public boolean method_41648() {
      return this.field_46417;
   }

   public class_4774 method_41626() {
      if (!this.field_46421) {
         return class_8532.field_43673.method_10710();
      } else {
         class_4774 var3 = this.field_46410.method_28258(this.field_46414);
         return !var3.method_22001()
               && this.field_46411.field_7333 >= (double)((float)this.field_46414.method_12165() + var3.method_22008(this.field_46410, this.field_46414))
            ? class_8532.field_43673.method_10710()
            : var3;
      }
   }

   public class_2522 method_41636() {
      return this.field_46421 ? this.field_46410.method_28262(this.field_46414) : class_4783.field_23184.method_29260();
   }

   public void method_41639(float var1, float var2) {
      this.field_46412 = var1;
      this.field_46415 = var2;
   }

   public class_2522 method_41631() {
      if (this.field_46421) {
         class_2522 var3 = this.field_46410.method_28262(this.field_46414);
         if (class_7860.field_40199.method_3596()) {
            var3 = (class_2522)class_7860.method_35555(var3, class_7860.field_40199, this.field_46410, this.field_46414, this.field_46411);
         }

         return var3;
      } else {
         return class_4783.field_23184.method_29260();
      }
   }

   public final class_2426 method_41634() {
      return this.field_46408;
   }

   public final class_2426 method_41632() {
      return this.field_46423;
   }

   public void method_41641() {
      this.field_46410 = null;
      this.field_46419 = null;
      this.field_46421 = false;
   }
}
