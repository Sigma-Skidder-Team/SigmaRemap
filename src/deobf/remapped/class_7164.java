package remapped;

public abstract class class_7164<T extends MobEntity, M extends class_6521<T>> extends class_6353<T, M> {
   public class_7164(EntityRenderDispatcher var1, M var2, float var3) {
      super(var1, (M)var2, var3);
   }

   public boolean method_32864(T var1) {
      return super.method_29103((T)var1) && (var1.method_37141() || var1.method_45507() && var1 == this.field_36493.targetEntity);
   }

   public boolean method_32863(T var1, class_2359 var2, double var3, double var5, double var7) {
      if (!super.method_32548((T)var1, var2, var3, var5, var7)) {
         Entity var11 = var1.method_26922();
         return var11 == null ? false : var2.method_10824(var11.method_37210());
      } else {
         return true;
      }
   }

   public void method_32866(T var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      super.method_29107((T)var1, var2, var3, var4, var5, var6);
      Entity var9 = var1.method_26922();
      if (var9 != null) {
         this.method_32862((T)var1, var3, var4, var5, var9);
      }
   }

   private <E extends Entity> void method_32862(T var1, float var2, class_7966 var3, class_2565 var4, E var5) {
      if (!Config.method_14424() || !class_6588.field_33945) {
         var3.method_36063();
         class_1343 var8 = var5.method_37202(var2);
         double var9 = (double)(MathHelper.method_42795(var2, var1.field_29605, var1.field_29611) * (float) (Math.PI / 180.0)) + (Math.PI / 2);
         class_1343 var11 = var1.method_37323();
         double var12 = Math.cos(var9) * var11.field_7334 + Math.sin(var9) * var11.field_7336;
         double var14 = Math.sin(var9) * var11.field_7334 - Math.cos(var9) * var11.field_7336;
         double var16 = MathHelper.lerp((double)var2, var1.field_41767, var1.getPosX()) + var12;
         double var18 = MathHelper.lerp((double)var2, var1.field_41698, var1.method_37309()) + var11.field_7333;
         double var20 = MathHelper.lerp((double)var2, var1.field_41725, var1.getPosZ()) + var14;
         var3.method_36065(var12, var11.field_7333, var14);
         float var22 = (float)(var8.field_7336 - var16);
         float var23 = (float)(var8.field_7333 - var18);
         float var24 = (float)(var8.field_7334 - var20);
         float var25 = 0.025F;
         class_7907 var26 = var4.method_11645(RenderLayer.method_16743());
         class_8107 var27 = var3.method_36058().method_28620();
         float var28 = MathHelper.method_42836(var22 * var22 + var24 * var24) * 0.025F / 2.0F;
         float var29 = var24 * var28;
         float var30 = var22 * var28;
         BlockPos var31 = new BlockPos(var1.method_37335(var2));
         BlockPos var32 = new BlockPos(var5.method_37335(var2));
         int var33 = this.method_32546((T)var1, var31);
         int var34 = this.field_36493.<Entity>method_28131(var5).method_32546(var5, var32);
         int var35 = var1.world.method_25266(class_2957.field_14437, var31);
         int var36 = var1.world.method_25266(class_2957.field_14437, var32);
         if (Config.method_14424()) {
            class_6588.method_30195();
         }

         method_32867(var26, var27, var22, var23, var24, var33, var34, var35, var36, 0.025F, 0.025F, var29, var30);
         method_32867(var26, var27, var22, var23, var24, var33, var34, var35, var36, 0.025F, 0.0F, var29, var30);
         if (Config.method_14424()) {
            class_6588.method_30104();
         }

         var3.method_36064();
      }
   }

   public static void method_32867(
      class_7907 var0,
      class_8107 var1,
      float var2,
      float var3,
      float var4,
      int var5,
      int var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      byte var15 = 24;

      for (int var16 = 0; var16 < 24; var16++) {
         float var17 = (float)var16 / 23.0F;
         int var18 = (int) MathHelper.method_42795(var17, (float)var5, (float)var6);
         int var19 = (int) MathHelper.method_42795(var17, (float)var7, (float)var8);
         int var20 = class_5778.method_26127(var18, var19);
         method_32865(var0, var1, var20, var2, var3, var4, var9, var10, 24, var16, false, var11, var12);
         method_32865(var0, var1, var20, var2, var3, var4, var9, var10, 24, var16 + 1, true, var11, var12);
      }
   }

   public static void method_32865(
      class_7907 var0,
      class_8107 var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      boolean var10,
      float var11,
      float var12
   ) {
      float var15 = 0.5F;
      float var16 = 0.4F;
      float var17 = 0.3F;
      if (var9 % 2 == 0) {
         var15 *= 0.7F;
         var16 *= 0.7F;
         var17 *= 0.7F;
      }

      float var18 = (float)var9 / (float)var8;
      float var19 = var3 * var18;
      float var20 = !(var4 > 0.0F) ? var4 - var4 * (1.0F - var18) * (1.0F - var18) : var4 * var18 * var18;
      float var21 = var5 * var18;
      if (!var10) {
         var0.method_35762(var1, var19 + var11, var20 + var6 - var7, var21 - var12).method_35742(var15, var16, var17, 1.0F).method_35747(var2).method_35735();
      }

      var0.method_35762(var1, var19 - var11, var20 + var7, var21 + var12).method_35742(var15, var16, var17, 1.0F).method_35747(var2).method_35735();
      if (var10) {
         var0.method_35762(var1, var19 + var11, var20 + var6 - var7, var21 - var12).method_35742(var15, var16, var17, 1.0F).method_35747(var2).method_35735();
      }
   }
}
