package remapped;

public class class_1902 {
   private static String[] field_9710;
   private final MobEntity field_9712;
   private int field_9711;
   private float field_9709;

   public class_1902(MobEntity var1) {
      this.field_9712 = var1;
   }

   public void method_8645() {
      if (!this.method_8643()) {
         if (this.method_8647()) {
            if (!(Math.abs(this.field_9712.field_29618 - this.field_9709) > 15.0F)) {
               this.field_9711++;
               if (this.field_9711 > 10) {
                  this.method_8644();
               }
            } else {
               this.field_9711 = 0;
               this.field_9709 = this.field_9712.field_29618;
               this.method_8646();
            }
         }
      } else {
         this.field_9712.field_29605 = this.field_9712.rotationYaw;
         this.method_8642();
         this.field_9709 = this.field_9712.field_29618;
         this.field_9711 = 0;
      }
   }

   private void method_8646() {
      this.field_9712.field_29605 = MathHelper.func_219800_b(this.field_9712.field_29605, this.field_9712.field_29618, (float)this.field_9712.getHorizontalFaceSpeed());
   }

   private void method_8642() {
      this.field_9712.field_29618 = MathHelper.func_219800_b(this.field_9712.field_29618, this.field_9712.field_29605, (float)this.field_9712.getHorizontalFaceSpeed());
   }

   private void method_8644() {
      int var3 = this.field_9711 - 10;
      float var4 = MathHelper.clamp((float)var3 / 10.0F, 0.0F, 1.0F);
      float var5 = (float)this.field_9712.getHorizontalFaceSpeed() * (1.0F - var4);
      this.field_9712.field_29605 = MathHelper.func_219800_b(this.field_9712.field_29605, this.field_9712.field_29618, var5);
   }

   private boolean method_8647() {
      return this.field_9712.getPassengers().isEmpty() || !(this.field_9712.getPassengers().get(0) instanceof MobEntity);
   }

   private boolean method_8643() {
      double var3 = this.field_9712.getPosX() - this.field_9712.field_41767;
      double var5 = this.field_9712.getPosZ() - this.field_9712.field_41725;
      return var3 * var3 + var5 * var5 > 2.5000003E-7F;
   }
}
