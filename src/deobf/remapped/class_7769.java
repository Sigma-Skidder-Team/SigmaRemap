package remapped;

import com.google.common.collect.ImmutableList;

public class class_7769<T extends LivingEntity> extends class_1498<T> {
   private static String[] field_39370;
   private final class_1549 field_39372;
   private final class_1549 field_39371 = new class_1549(this, 22, 0);

   public class_7769() {
      this.field_39371.method_7049(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
      this.field_39372 = new class_1549(this, 22, 0);
      this.field_39372.field_8197 = true;
      this.field_39372.method_7049(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of();
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_39371, this.field_39372);
   }

   public void method_35240(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = (float) (Math.PI / 12);
      float var10 = (float) (-Math.PI / 12);
      float var11 = 0.0F;
      float var12 = 0.0F;
      if (!var1.method_26618()) {
         if (var1.method_37382()) {
            var9 = (float) (Math.PI * 2.0 / 9.0);
            var10 = (float) (-Math.PI / 4);
            var11 = 3.0F;
            var12 = 0.08726646F;
         }
      } else {
         float var13 = 1.0F;
         class_1343 var14 = var1.method_37098();
         if (var14.field_7333 < 0.0) {
            class_1343 var15 = var14.method_6213();
            var13 = 1.0F - (float)Math.pow(-var15.field_7333, 1.5);
         }

         var9 = var13 * (float) (Math.PI / 9) + (1.0F - var13) * var9;
         var10 = var13 * (float) (-Math.PI / 2) + (1.0F - var13) * var10;
      }

      this.field_39371.field_8183 = 5.0F;
      this.field_39371.field_8181 = var11;
      if (!(var1 instanceof AbstractClientPlayerEntity)) {
         this.field_39371.field_8191 = var9;
         this.field_39371.field_8185 = var10;
         this.field_39371.field_8190 = var12;
      } else {
         AbstractClientPlayerEntity var16 = (AbstractClientPlayerEntity)var1;
         var16.field_49391 = (float)((double)var16.field_49391 + (double)(var9 - var16.field_49391) * 0.1);
         var16.field_49394 = (float)((double)var16.field_49394 + (double)(var12 - var16.field_49394) * 0.1);
         var16.field_49384 = (float)((double)var16.field_49384 + (double)(var10 - var16.field_49384) * 0.1);
         this.field_39371.field_8191 = var16.field_49391;
         this.field_39371.field_8190 = var16.field_49394;
         this.field_39371.field_8185 = var16.field_49384;
      }

      this.field_39372.field_8183 = -this.field_39371.field_8183;
      this.field_39372.field_8190 = -this.field_39371.field_8190;
      this.field_39372.field_8181 = this.field_39371.field_8181;
      this.field_39372.field_8191 = this.field_39371.field_8191;
      this.field_39372.field_8185 = -this.field_39371.field_8185;
   }
}
