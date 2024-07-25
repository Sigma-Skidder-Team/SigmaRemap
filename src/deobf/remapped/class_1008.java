package remapped;

public class class_1008 extends class_2833 {
   private static String[] field_5183;
   private final class_337 field_5182;

   public class_1008(class_337 var1) {
      super(var1);
      this.field_5182 = var1;
   }

   @Override
   public void method_12883() {
      if (this.field_13878 == class_1737.field_8946 && !this.field_5182.method_26927().method_5591()) {
         class_1343 var3 = new class_1343(
            this.field_13884 - this.field_5182.getPosX(),
            this.field_13886 - this.field_5182.method_37309(),
            this.field_13880 - this.field_5182.getPosZ()
         );
         double var4 = var3.method_6217();
         double var6 = var3.field_7336 / var4;
         double var8 = var3.field_7333 / var4;
         double var10 = var3.field_7334 / var4;
         float var12 = (float)(MathHelper.method_42821(var3.field_7334, var3.field_7336) * 180.0F / (float)Math.PI) - 90.0F;
         this.field_5182.rotationYaw = this.method_12882(this.field_5182.rotationYaw, var12, 90.0F);
         this.field_5182.field_29605 = this.field_5182.rotationYaw;
         float var13 = (float)(this.field_13885 * this.field_5182.method_26575(Attributes.MOVEMENT_SPEED));
         float var14 = MathHelper.method_42795(0.125F, this.field_5182.method_26423(), var13);
         this.field_5182.method_26461(var14);
         double var15 = Math.sin((double)(this.field_5182.field_41697 + this.field_5182.method_37145()) * 0.5) * 0.05;
         double var17 = Math.cos((double)(this.field_5182.rotationYaw * (float) (Math.PI / 180.0)));
         double var19 = Math.sin((double)(this.field_5182.rotationYaw * (float) (Math.PI / 180.0)));
         double var21 = Math.sin((double)(this.field_5182.field_41697 + this.field_5182.method_37145()) * 0.75) * 0.05;
         this.field_5182
            .method_37215(this.field_5182.method_37098().method_6214(var15 * var17, var21 * (var19 + var17) * 0.25 + (double)var14 * var8 * 0.1, var15 * var19));
         class_3711 var23 = this.field_5182.method_26865();
         double var24 = this.field_5182.getPosX() + var6 * 2.0;
         double var26 = this.field_5182.method_37388() + var8 / var4;
         double var28 = this.field_5182.getPosZ() + var10 * 2.0;
         double var30 = var23.method_17237();
         double var32 = var23.method_17244();
         double var34 = var23.method_17242();
         if (!var23.method_17236()) {
            var30 = var24;
            var32 = var26;
            var34 = var28;
         }

         this.field_5182
            .method_26865()
            .method_17231(
               MathHelper.lerp(0.125, var30, var24),
               MathHelper.lerp(0.125, var32, var26),
               MathHelper.lerp(0.125, var34, var28),
               10.0F,
               40.0F
            );
         class_337.method_1542(this.field_5182, true);
      } else {
         this.field_5182.method_26461(0.0F);
         class_337.method_1542(this.field_5182, false);
      }
   }
}
