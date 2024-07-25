package remapped;

public class class_5131 extends class_9335 {
   private static String[] field_26467;
   private static final int[] field_26470 = new int[]{0, 1, 4, 5, 6, 7};
   private final class_449 field_26468;
   private final int field_26466;
   private boolean field_26469;

   public class_5131(class_449 var1, int var2) {
      this.field_26468 = var1;
      this.field_26466 = var2;
   }

   @Override
   public boolean method_16795() {
      if (this.field_26468.method_26594().nextInt(this.field_26466) != 0) {
         return false;
      } else {
         Direction var3 = this.field_26468.method_37235();
         int var4 = var3.method_1041();
         int var5 = var3.method_1034();
         BlockPos var6 = this.field_26468.method_37075();

         for (int var10 : field_26470) {
            if (!this.method_23532(var6, var4, var5, var10) || !this.method_23531(var6, var4, var5, var10)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean method_23532(BlockPos var1, int var2, int var3, int var4) {
      BlockPos var7 = var1.method_6104(var2 * var4, 0, var3 * var4);
      return this.field_26468.world.method_28258(var7).method_22007(class_6503.field_33094)
         && !this.field_26468.world.method_28262(var7).method_8362().method_24502();
   }

   private boolean method_23531(BlockPos var1, int var2, int var3, int var4) {
      return this.field_26468.world.method_28262(var1.method_6104(var2 * var4, 1, var3 * var4)).method_8345()
         && this.field_26468.world.method_28262(var1.method_6104(var2 * var4, 2, var3 * var4)).method_8345();
   }

   @Override
   public boolean method_16799() {
      double var3 = this.field_26468.method_37098().field_7333;
      return (
            !(var3 * var3 < 0.03F)
               || this.field_26468.rotationPitch == 0.0F
               || !(Math.abs(this.field_26468.rotationPitch) < 10.0F)
               || !this.field_26468.method_37285()
         )
         && !this.field_26468.method_37360();
   }

   @Override
   public boolean method_16801() {
      return false;
   }

   @Override
   public void method_16796() {
      Direction var3 = this.field_26468.method_37235();
      this.field_26468.method_37215(this.field_26468.method_37098().method_6214((double)var3.method_1041() * 0.6, 0.7, (double)var3.method_1034() * 0.6));
      this.field_26468.method_26927().method_5620();
   }

   @Override
   public void method_16793() {
      this.field_26468.rotationPitch = 0.0F;
   }

   @Override
   public void method_16794() {
      boolean var3 = this.field_26469;
      if (!var3) {
         class_4774 var4 = this.field_26468.world.method_28258(this.field_26468.method_37075());
         this.field_26469 = var4.method_22007(class_6503.field_33094);
      }

      if (this.field_26469 && !var3) {
         this.field_26468.method_37155(class_463.field_2196, 1.0F, 1.0F);
      }

      class_1343 var9 = this.field_26468.method_37098();
      if (var9.field_7333 * var9.field_7333 < 0.03F && this.field_26468.rotationPitch != 0.0F) {
         this.field_26468.rotationPitch = class_9299.method_42833(this.field_26468.rotationPitch, 0.0F, 0.2F);
      } else {
         double var5 = Math.sqrt(Entity.method_37266(var9));
         double var7 = Math.signum(-var9.field_7333) * Math.acos(var5 / var9.method_6217()) * 180.0F / (float)Math.PI;
         this.field_26468.rotationPitch = (float)var7;
      }
   }
}
