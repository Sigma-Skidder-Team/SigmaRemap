package remapped;

public class class_3948 extends class_6017 {
   private static String[] field_19163;
   private static final class_4931 field_19165 = new class_4931().method_22607(150.0);
   private final class_4931 field_19162;
   private int field_19164;

   public class_3948(class_2770 var1) {
      super(var1);
      this.field_19162 = new class_4931().method_22607(20.0).method_22606(var1x -> Math.abs(var1x.method_37309() - var1.method_37309()) <= 10.0);
   }

   @Override
   public void method_23473() {
      this.field_19164++;
      PlayerEntity var3 = this.field_9479
         .world
         .method_25860(this.field_19162, this.field_9479, this.field_9479.getPosX(), this.field_9479.method_37309(), this.field_9479.getPosZ());
      if (var3 == null) {
         if (this.field_19164 >= 100) {
            var3 = this.field_9479
               .world
               .method_25860(field_19165, this.field_9479, this.field_9479.getPosX(), this.field_9479.method_37309(), this.field_9479.getPosZ());
            this.field_9479.method_12611().method_29422(class_8978.field_46003);
            if (var3 != null) {
               this.field_9479.method_12611().method_29422(class_8978.field_46002);
               this.field_9479
                  .method_12611()
                  .<class_3317>method_29420(class_8978.field_46002)
                  .method_15243(new class_1343(var3.getPosX(), var3.method_37309(), var3.getPosZ()));
            }
         }
      } else if (this.field_19164 <= 25) {
         class_1343 var4 = new class_1343(var3.getPosX() - this.field_9479.getPosX(), 0.0, var3.getPosZ() - this.field_9479.getPosZ())
            .method_6213();
         class_1343 var5 = new class_1343(
               (double) MathHelper.sin(this.field_9479.rotationYaw * (float) (Math.PI / 180.0)),
               0.0,
               (double)(-MathHelper.cos(this.field_9479.rotationYaw * (float) (Math.PI / 180.0)))
            )
            .method_6213();
         float var6 = (float)var5.method_6206(var4);
         float var7 = (float)(Math.acos((double)var6) * 180.0F / (float)Math.PI) + 0.5F;
         if (var7 < 0.0F || var7 > 10.0F) {
            double var8 = var3.getPosX() - this.field_9479.field_13542.getPosX();
            double var10 = var3.getPosZ() - this.field_9479.field_13542.getPosZ();
            double var12 = MathHelper.clamp(
               MathHelper.wrapDegrees(180.0 - MathHelper.atan2(var8, var10) * 180.0F / (float)Math.PI - (double)this.field_9479.rotationYaw),
               -100.0,
               100.0
            );
            this.field_9479.field_13546 *= 0.8F;
            float var14 = MathHelper.sqrt(var8 * var8 + var10 * var10) + 1.0F;
            float var15 = var14;
            if (var14 > 40.0F) {
               var14 = 40.0F;
            }

            this.field_9479.field_13546 = (float)((double)this.field_9479.field_13546 + var12 * (double)(0.7F / var14 / var15));
            this.field_9479.rotationYaw = this.field_9479.rotationYaw + this.field_9479.field_13546;
         }
      } else {
         this.field_9479.method_12611().method_29422(class_8978.field_46001);
      }
   }

   @Override
   public void method_23469() {
      this.field_19164 = 0;
   }

   @Override
   public class_8978<class_3948> method_23464() {
      return class_8978.field_45998;
   }
}
