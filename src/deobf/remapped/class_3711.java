package remapped;

public class class_3711 {
   private static String[] field_18210;
   public final MobEntity field_18205;
   public float field_18208;
   public float field_18207;
   public boolean field_18204;
   public double field_18209;
   public double field_18203;
   public double field_18206;

   public class_3711(MobEntity var1) {
      this.field_18205 = var1;
   }

   public void method_17232(Vector3d var1) {
      this.method_17230(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public void method_17240(Entity var1, float var2, float var3) {
      this.method_17231(var1.getPosX(), method_17238(var1), var1.getPosZ(), var2, var3);
   }

   public void method_17230(double var1, double var3, double var5) {
      this.method_17231(var1, var3, var5, (float)this.field_18205.method_26926(), (float)this.field_18205.method_26862());
   }

   public void method_17231(double var1, double var3, double var5, float var7, float var8) {
      this.field_18209 = var1;
      this.field_18203 = var3;
      this.field_18206 = var5;
      this.field_18208 = var7;
      this.field_18207 = var8;
      this.field_18204 = true;
   }

   public void method_17234() {
      if (this.method_17241()) {
         this.field_18205.rotationPitch = 0.0F;
      }

      if (!this.field_18204) {
         this.field_18205.field_29618 = this.method_17239(this.field_18205.field_29618, this.field_18205.field_29605, 10.0F);
      } else {
         this.field_18204 = false;
         this.field_18205.field_29618 = this.method_17239(this.field_18205.field_29618, this.method_17243(), this.field_18208);
         this.field_18205.rotationPitch = this.method_17239(this.field_18205.rotationPitch, this.method_17233(), this.field_18207);
      }

      if (!this.field_18205.method_26927().method_5591()) {
         this.field_18205.field_29618 = MathHelper.func_219800_b(
            this.field_18205.field_29618, this.field_18205.field_29605, (float)this.field_18205.getHorizontalFaceSpeed()
         );
      }
   }

   public boolean method_17241() {
      return true;
   }

   public boolean method_17236() {
      return this.field_18204;
   }

   public double method_17237() {
      return this.field_18209;
   }

   public double method_17244() {
      return this.field_18203;
   }

   public double method_17242() {
      return this.field_18206;
   }

   public float method_17233() {
      double var3 = this.field_18209 - this.field_18205.getPosX();
      double var5 = this.field_18203 - this.field_18205.method_37388();
      double var7 = this.field_18206 - this.field_18205.getPosZ();
      double var9 = (double) MathHelper.sqrt(var3 * var3 + var7 * var7);
      return (float)(-(MathHelper.atan2(var5, var9) * 180.0F / (float)Math.PI));
   }

   public float method_17243() {
      double var3 = this.field_18209 - this.field_18205.getPosX();
      double var5 = this.field_18206 - this.field_18205.getPosZ();
      return (float)(MathHelper.atan2(var5, var3) * 180.0F / (float)Math.PI) - 90.0F;
   }

   public float method_17239(float var1, float var2, float var3) {
      float var6 = MathHelper.wrapSubtractDegrees(var1, var2);
      float var7 = MathHelper.clamp(var6, -var3, var3);
      return var1 + var7;
   }

   private static double method_17238(Entity var0) {
      return !(var0 instanceof LivingEntity) ? (var0.getBoundingBox().field_19937 + var0.getBoundingBox().field_19939) / 2.0 : var0.method_37388();
   }
}
