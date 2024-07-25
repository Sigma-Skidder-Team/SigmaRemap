package remapped;

public class class_763 extends class_7164<class_337, class_2574> {
   private static final Identifier field_4125 = new Identifier("textures/entity/guardian.png");
   private static final Identifier field_4124 = new Identifier("textures/entity/guardian_beam.png");
   private static final RenderLayer field_4126 = RenderLayer.method_16755(field_4124);

   public class_763(EntityRenderDispatcher var1) {
      this(var1, 0.5F);
   }

   public class_763(EntityRenderDispatcher var1, float var2) {
      super(var1, new class_2574(), var2);
   }

   public boolean method_3439(class_337 var1, class_2359 var2, double var3, double var5, double var7) {
      if (!super.method_32863(var1, var2, var3, var5, var7)) {
         if (var1.method_1555()) {
            LivingEntity var11 = var1.method_1552();
            if (var11 != null) {
               class_1343 var12 = this.method_3438(var11, (double)var11.method_37074() * 0.5, 1.0F);
               class_1343 var13 = this.method_3438(var1, (double)var1.method_37277(), 1.0F);
               return var2.method_10824(
                  new Box(var13.field_7336, var13.field_7333, var13.field_7334, var12.field_7336, var12.field_7333, var12.field_7334)
               );
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private class_1343 method_3438(LivingEntity var1, double var2, float var4) {
      double var7 = class_9299.method_42794((double)var4, var1.field_41754, var1.getPosX());
      double var9 = class_9299.method_42794((double)var4, var1.field_41713, var1.method_37309()) + var2;
      double var11 = class_9299.method_42794((double)var4, var1.field_41724, var1.getPosZ());
      return new class_1343(var7, var9, var11);
   }

   public void method_3442(class_337 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      super.method_32866(var1, var2, var3, var4, var5, var6);
      LivingEntity var9 = var1.method_1552();
      if (var9 != null) {
         float var10 = var1.method_1546(var3);
         float var11 = (float)var1.world.method_29546() + var3;
         float var12 = var11 * 0.5F % 1.0F;
         float var13 = var1.method_37277();
         var4.method_36063();
         var4.method_36065(0.0, (double)var13, 0.0);
         class_1343 var14 = this.method_3438(var9, (double)var9.method_37074() * 0.5, var3);
         class_1343 var15 = this.method_3438(var1, (double)var13, var3);
         class_1343 var16 = var14.method_6194(var15);
         float var17 = (float)(var16.method_6217() + 1.0);
         var16 = var16.method_6213();
         float var18 = (float)Math.acos(var16.field_7333);
         float var19 = (float)Math.atan2(var16.field_7334, var16.field_7336);
         var4.method_36060(class_2426.field_12074.method_11074(((float) (Math.PI / 2) - var19) * (180.0F / (float)Math.PI)));
         var4.method_36060(class_2426.field_12080.method_11074(var18 * (180.0F / (float)Math.PI)));
         boolean var20 = true;
         float var21 = var11 * 0.05F * -1.5F;
         float var22 = var10 * var10;
         int var23 = 64 + (int)(var22 * 191.0F);
         int var24 = 32 + (int)(var22 * 191.0F);
         int var25 = 128 - (int)(var22 * 64.0F);
         float var26 = 0.2F;
         float var27 = 0.282F;
         float var28 = class_9299.method_42840(var21 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var29 = class_9299.method_42818(var21 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var30 = class_9299.method_42840(var21 + (float) (Math.PI / 4)) * 0.282F;
         float var31 = class_9299.method_42818(var21 + (float) (Math.PI / 4)) * 0.282F;
         float var32 = class_9299.method_42840(var21 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var33 = class_9299.method_42818(var21 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var34 = class_9299.method_42840(var21 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var35 = class_9299.method_42818(var21 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var36 = class_9299.method_42840(var21 + (float) Math.PI) * 0.2F;
         float var37 = class_9299.method_42818(var21 + (float) Math.PI) * 0.2F;
         float var38 = class_9299.method_42840(var21 + 0.0F) * 0.2F;
         float var39 = class_9299.method_42818(var21 + 0.0F) * 0.2F;
         float var40 = class_9299.method_42840(var21 + (float) (Math.PI / 2)) * 0.2F;
         float var41 = class_9299.method_42818(var21 + (float) (Math.PI / 2)) * 0.2F;
         float var42 = class_9299.method_42840(var21 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var43 = class_9299.method_42818(var21 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var44 = 0.0F;
         float var45 = 0.4999F;
         float var46 = -1.0F + var12;
         float var47 = var17 * 2.5F + var46;
         class_7907 var48 = var5.method_11645(field_4126);
         class_6279 var49 = var4.method_36058();
         class_8107 var50 = var49.method_28620();
         class_6555 var51 = var49.method_28618();
         method_3440(var48, var50, var51, var36, var17, var37, var23, var24, var25, 0.4999F, var47);
         method_3440(var48, var50, var51, var36, 0.0F, var37, var23, var24, var25, 0.4999F, var46);
         method_3440(var48, var50, var51, var38, 0.0F, var39, var23, var24, var25, 0.0F, var46);
         method_3440(var48, var50, var51, var38, var17, var39, var23, var24, var25, 0.0F, var47);
         method_3440(var48, var50, var51, var40, var17, var41, var23, var24, var25, 0.4999F, var47);
         method_3440(var48, var50, var51, var40, 0.0F, var41, var23, var24, var25, 0.4999F, var46);
         method_3440(var48, var50, var51, var42, 0.0F, var43, var23, var24, var25, 0.0F, var46);
         method_3440(var48, var50, var51, var42, var17, var43, var23, var24, var25, 0.0F, var47);
         float var52 = 0.0F;
         if (var1.field_41697 % 2 == 0) {
            var52 = 0.5F;
         }

         method_3440(var48, var50, var51, var28, var17, var29, var23, var24, var25, 0.5F, var52 + 0.5F);
         method_3440(var48, var50, var51, var30, var17, var31, var23, var24, var25, 1.0F, var52 + 0.5F);
         method_3440(var48, var50, var51, var34, var17, var35, var23, var24, var25, 1.0F, var52);
         method_3440(var48, var50, var51, var32, var17, var33, var23, var24, var25, 0.5F, var52);
         var4.method_36064();
      }
   }

   private static void method_3440(
      class_7907 var0, class_8107 var1, class_6555 var2, float var3, float var4, float var5, int var6, int var7, int var8, float var9, float var10
   ) {
      var0.method_35762(var1, var3, var4, var5)
         .method_35743(var6, var7, var8, 255)
         .method_35745(var9, var10)
         .method_35737(class_5367.field_27381)
         .method_35747(15728880)
         .method_35756(var2, 0.0F, 1.0F, 0.0F)
         .method_35735();
   }

   public Identifier method_3441(class_337 var1) {
      return field_4125;
   }
}
