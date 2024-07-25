package remapped;

public class class_3921 extends Module {
   private double field_19049;
   private float field_19046;
   private float field_19048;
   private boolean field_19044;
   public double field_19045;

   public class_3921() {
      super(Category.MOVEMENT, "Strafe", "Strafe in mid air");
   }

   @EventListen
   public void method_18146(class_7767 var1) {
      if (this.method_42015()) {
         this.field_19049 = class_8865.method_40775();
         float var4 = class_8865.method_40773()[1];
         float var5 = class_8865.method_40773()[2];
         float var6 = class_8865.method_40785();
         double var7 = Math.cos(Math.toRadians((double)var6));
         double var9 = Math.sin(Math.toRadians((double)var6));
         double var11 = Math.sqrt(var1.method_35234() * var1.method_35234() + var1.method_35231() * var1.method_35231());
         if (!class_8865.method_40772()) {
            var11 = 0.0;
         }

         float var13 = 0.2F;
         if (!(var11 > this.field_19045 + 0.1F)) {
            this.field_19045 = var11;
            if (var11 != 0.0) {
               var11 = Math.max(var11, class_8865.method_40775());
            }

            var1.method_35232(var1.method_35234() * (double)(1.0F - var13) + var11 * var7 * (double)var13);
            var1.method_35229(var1.method_35231() * (double)(1.0F - var13) + var11 * var9 * (double)var13);
            if (class_8865.method_40772()) {
            }
         } else {
            this.field_19045 = var11;
         }
      }
   }
}
