package remapped;

public class class_6906<T extends AbstractMinecartEntity> extends class_7067<T> {
   private static final Identifier field_35502 = new Identifier("textures/entity/minecart.png");
   public final class_6521<T> field_35503 = new class_1921<T>();

   public class_6906(EntityRenderDispatcher var1) {
      super(var1);
      this.field_36492 = 0.7F;
   }

   public void method_31645(T var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      super.method_32551((T)var1, var2, var3, var4, var5, var6);
      var4.method_36063();
      long var9 = (long)var1.method_37145() * 493286711L;
      var9 = var9 * var9 * 4392167121L + var9 * 98761L;
      float var11 = (((float)(var9 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var12 = (((float)(var9 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var13 = (((float)(var9 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      var4.method_36065((double)var11, (double)var12, (double)var13);
      double var14 = MathHelper.lerp((double)var3, var1.field_41754, var1.getPosX());
      double var16 = MathHelper.lerp((double)var3, var1.field_41713, var1.method_37309());
      double var18 = MathHelper.lerp((double)var3, var1.field_41724, var1.getPosZ());
      double var20 = 0.3F;
      Vector3d var22 = var1.method_4748(var14, var16, var18);
      float var23 = MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch);
      if (var22 != null) {
         Vector3d var24 = var1.method_4745(var14, var16, var18, 0.3F);
         Vector3d var25 = var1.method_4745(var14, var16, var18, -0.3F);
         if (var24 == null) {
            var24 = var22;
         }

         if (var25 == null) {
            var25 = var22;
         }

         var4.method_36065(var22.field_7336 - var14, (var24.field_7333 + var25.field_7333) / 2.0 - var16, var22.field_7334 - var18);
         Vector3d var26 = var25.method_6214(-var24.field_7336, -var24.field_7333, -var24.field_7334);
         if (var26.method_6217() != 0.0) {
            var26 = var26.method_6213();
            var2 = (float)(Math.atan2(var26.field_7334, var26.field_7336) * 180.0 / Math.PI);
            var23 = (float)(Math.atan(var26.field_7333) * 73.0);
         }
      }

      var4.method_36065(0.0, 0.375, 0.0);
      var4.method_36060(class_2426.field_12074.method_11074(180.0F - var2));
      var4.method_36060(class_2426.field_12076.method_11074(-var23));
      float var30 = (float)var1.method_4747() - var3;
      float var31 = var1.method_4736() - var3;
      if (var31 < 0.0F) {
         var31 = 0.0F;
      }

      if (var30 > 0.0F) {
         var4.method_36060(class_2426.field_12080.method_11074(MathHelper.sin(var30) * var30 * var31 / 10.0F * (float)var1.method_4751()));
      }

      int var33 = var1.method_4741();
      class_2522 var27 = var1.method_4739();
      if (var27.method_8352() != class_7537.field_38470) {
         var4.method_36063();
         float var28 = 0.75F;
         var4.method_36062(0.75F, 0.75F, 0.75F);
         var4.method_36065(-0.5, (double)((float)(var33 - 8) / 16.0F), 0.5);
         var4.method_36060(class_2426.field_12074.method_11074(90.0F));
         this.method_31646((T)var1, var3, var27, var4, var5, var6);
         var4.method_36064();
      }

      var4.method_36062(-1.0F, -1.0F, 1.0F);
      this.field_35503.method_29700((T)var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
      class_7907 var34 = var5.method_11645(this.field_35503.method_45498(this.method_31644((T)var1)));
      this.field_35503.method_45499(var4, var34, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_36064();
   }

   public Identifier method_31644(T var1) {
      return field_35502;
   }

   public void method_31646(T var1, float var2, class_2522 var3, class_7966 var4, class_2565 var5, int var6) {
      MinecraftClient.getInstance().method_8505().method_3713(var3, var4, var5, var6, class_5367.field_27381);
   }
}
