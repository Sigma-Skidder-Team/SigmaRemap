package remapped;

public class class_2320 extends class_2833 {
   private static String[] field_11618;
   private final class_3845 field_11617;

   public class_2320(class_3845 var1) {
      super(var1);
      this.field_11617 = var1;
   }

   private void method_10665() {
      if (!this.field_11617.method_37285()) {
         if (this.field_11617.onGround) {
            this.field_11617.method_26461(Math.max(this.field_11617.method_26423() / 2.0F, 0.06F));
         }
      } else {
         this.field_11617.method_37215(this.field_11617.method_37098().method_6214(0.0, 0.005, 0.0));
         if (!class_3845.method_17871(this.field_11617).method_12170(this.field_11617.method_37245(), 16.0)) {
            this.field_11617.method_26461(Math.max(this.field_11617.method_26423() / 2.0F, 0.08F));
         }

         if (this.field_11617.method_26449()) {
            this.field_11617.method_26461(Math.max(this.field_11617.method_26423() / 3.0F, 0.06F));
         }
      }
   }

   @Override
   public void method_12883() {
      this.method_10665();
      if (this.field_13878 == class_1737.field_8946 && !this.field_11617.method_26927().method_5591()) {
         double var3 = this.field_13884 - this.field_11617.getPosX();
         double var5 = this.field_13886 - this.field_11617.method_37309();
         double var7 = this.field_13880 - this.field_11617.getPosZ();
         double var9 = (double) MathHelper.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
         var5 /= var9;
         float var11 = (float)(MathHelper.method_42821(var7, var3) * 180.0F / (float)Math.PI) - 90.0F;
         this.field_11617.rotationYaw = this.method_12882(this.field_11617.rotationYaw, var11, 90.0F);
         this.field_11617.field_29605 = this.field_11617.rotationYaw;
         float var12 = (float)(this.field_13885 * this.field_11617.method_26575(Attributes.MOVEMENT_SPEED));
         this.field_11617.method_26461(MathHelper.method_42795(0.125F, this.field_11617.method_26423(), var12));
         this.field_11617.method_37215(this.field_11617.method_37098().method_6214(0.0, (double)this.field_11617.method_26423() * var5 * 0.1, 0.0));
      } else {
         this.field_11617.method_26461(0.0F);
      }
   }
}
