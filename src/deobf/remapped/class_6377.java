package remapped;

public class class_6377 {
   private static String[] field_32583;
   public static float field_32578;
   public static float field_32585;
   public static float field_32584;
   private static int field_32582 = -1;
   private static int field_32579 = -1;
   private static long field_32580 = -1L;
   public static boolean field_32581 = false;

   public static void method_29157(Camera var0, float var1, ClientWorld var2, int var3, float var4) {
      class_4774 var7 = var0.method_41626();
      if (!var7.method_22007(class_6503.field_33094)) {
         if (!var7.method_22007(class_6503.field_33095)) {
            float var8 = 0.25F + 0.75F * (float)var3 / 32.0F;
            var8 = 1.0F - (float)Math.pow((double)var8, 0.25);
            class_1343 var9 = var2.method_750(var0.method_41630(), var1);
            var9 = class_9300.method_42927(var9, var2, var0.method_41633(), var1);
            float var10 = (float)var9.field_7336;
            float var11 = (float)var9.field_7333;
            float var12 = (float)var9.field_7334;
            float var13 = class_9299.method_42828(class_9299.method_42840(var2.method_13578(var1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
            class_859 var14 = var2.getBiomeManager();
            class_1343 var15 = var0.method_41627().method_6193(2.0, 2.0, 2.0).method_6209(0.25);
            class_1343 var16 = class_4555.method_21121(
               var15,
               (var3x, var4x, var5) -> var2.method_738().method_34246(class_1343.method_6220(var14.method_3727(var3x, var4x, var5).method_28874()), var13)
            );
            var16 = class_9300.method_42860(var16, var2, var0.method_41633(), var1);
            field_32578 = (float)var16.method_61();
            field_32585 = (float)var16.method_60();
            field_32584 = (float)var16.method_62();
            if (var3 >= 4) {
               float var17 = !(class_9299.method_42818(var2.method_29553(var1)) > 0.0F) ? 1.0F : -1.0F;
               class_2426 var18 = new class_2426(var17, 0.0F, 0.0F);
               float var21 = var0.method_41634().method_11067(var18);
               if (var21 < 0.0F) {
                  var21 = 0.0F;
               }

               if (var21 > 0.0F) {
                  float[] var22 = var2.method_738().method_34248(var2.method_13578(var1), var1);
                  if (var22 != null) {
                     var21 *= var22[3];
                     field_32578 = field_32578 * (1.0F - var21) + var22[0] * var21;
                     field_32585 = field_32585 * (1.0F - var21) + var22[1] * var21;
                     field_32584 = field_32584 * (1.0F - var21) + var22[2] * var21;
                  }
               }
            }

            field_32578 = field_32578 + (var10 - field_32578) * var8;
            field_32585 = field_32585 + (var11 - field_32585) * var8;
            field_32584 = field_32584 + (var12 - field_32584) * var8;
            float var44 = var2.method_29578(var1);
            if (var44 > 0.0F) {
               float var46 = 1.0F - var44 * 0.5F;
               float var52 = 1.0F - var44 * 0.4F;
               field_32578 *= var46;
               field_32585 *= var46;
               field_32584 *= var52;
            }

            float var47 = var2.method_29601(var1);
            if (var47 > 0.0F) {
               float var53 = 1.0F - var47 * 0.5F;
               field_32578 *= var53;
               field_32585 *= var53;
               field_32584 *= var53;
            }

            field_32580 = -1L;
         } else {
            field_32578 = 0.6F;
            field_32585 = 0.1F;
            field_32584 = 0.0F;
            field_32580 = -1L;
         }
      } else {
         long var19 = Util.getMeasuringTimeMs();
         int var25 = var2.method_22561(new BlockPos(var0.method_41627())).method_28883();
         if (field_32580 < 0L) {
            field_32582 = var25;
            field_32579 = var25;
            field_32580 = var19;
         }

         int var32 = field_32582 >> 16 & 0xFF;
         int var38 = field_32582 >> 8 & 0xFF;
         int var39 = field_32582 & 0xFF;
         int var40 = field_32579 >> 16 & 0xFF;
         int var41 = field_32579 >> 8 & 0xFF;
         int var43 = field_32579 & 0xFF;
         float var45 = class_9299.method_42828((float)(var19 - field_32580) / 5000.0F, 0.0F, 1.0F);
         float var48 = class_9299.method_42795(var45, (float)var40, (float)var32);
         float var54 = class_9299.method_42795(var45, (float)var41, (float)var38);
         float var55 = class_9299.method_42795(var45, (float)var43, (float)var39);
         field_32578 = var48 / 255.0F;
         field_32585 = var54 / 255.0F;
         field_32584 = var55 / 255.0F;
         if (field_32582 != var25) {
            field_32582 = var25;
            field_32579 = class_9299.method_42848(var48) << 16 | class_9299.method_42848(var54) << 8 | class_9299.method_42848(var55);
            field_32580 = var19;
         }
      }

      double var49 = var0.method_41627().field_7333 * var2.method_749().method_3494();
      if (var0.method_41633() instanceof class_5834 && ((class_5834)var0.method_41633()).isPotionActive(Effects.field_19736)) {
         int var26 = ((class_5834)var0.method_41633()).method_26553(Effects.field_19736).method_10347();
         if (var26 >= 20) {
            var49 = 0.0;
         } else {
            var49 *= (double)(1.0F - (float)var26 / 20.0F);
         }
      }

      if (var49 < 1.0 && !var7.method_22007(class_6503.field_33095)) {
         if (var49 < 0.0) {
            var49 = 0.0;
         }

         var49 *= var49;
         field_32578 = (float)((double)field_32578 * var49);
         field_32585 = (float)((double)field_32585 * var49);
         field_32584 = (float)((double)field_32584 * var49);
      }

      if (var4 > 0.0F) {
         field_32578 = field_32578 * (1.0F - var4) + field_32578 * 0.7F * var4;
         field_32585 = field_32585 * (1.0F - var4) + field_32585 * 0.6F * var4;
         field_32584 = field_32584 * (1.0F - var4) + field_32584 * 0.6F * var4;
      }

      if (!var7.method_22007(class_6503.field_33094)) {
         if (var0.method_41633() instanceof class_5834 && ((class_5834)var0.method_41633()).isPotionActive(Effects.field_19746)) {
            float var27 = GameRenderer.method_35954((class_5834)var0.method_41633(), var1);
            float var33 = Math.min(1.0F / field_32578, Math.min(1.0F / field_32585, 1.0F / field_32584));
            if (Float.isInfinite(var33)) {
               var33 = Math.nextAfter(var33, 0.0);
            }

            field_32578 = field_32578 * (1.0F - var27) + field_32578 * var33 * var27;
            field_32585 = field_32585 * (1.0F - var27) + field_32585 * var33 * var27;
            field_32584 = field_32584 * (1.0F - var27) + field_32584 * var33 * var27;
         }
      } else {
         float var28 = 0.0F;
         if (var0.method_41633() instanceof ClientPlayerEntity) {
            ClientPlayerEntity var34 = (ClientPlayerEntity)var0.method_41633();
            var28 = var34.method_27328();
         }

         float var35 = Math.min(1.0F / field_32578, Math.min(1.0F / field_32585, 1.0F / field_32584));
         if (Float.isInfinite(var35)) {
            var35 = Math.nextAfter(var35, 0.0);
         }

         field_32578 = field_32578 * (1.0F - var28) + field_32578 * var35 * var28;
         field_32585 = field_32585 * (1.0F - var28) + field_32585 * var35 * var28;
         field_32584 = field_32584 * (1.0F - var28) + field_32584 * var35 * var28;
      }

      if (!var7.method_22007(class_6503.field_33094)) {
         if (var7.method_22007(class_6503.field_33095)) {
            Entity var29 = var0.method_41633();
            class_1343 var36 = class_9300.method_42928(var2, var29.getPosX(), var29.method_37309() + 1.0, var29.getPosZ());
            if (var36 != null) {
               field_32578 = (float)var36.field_7336;
               field_32585 = (float)var36.field_7333;
               field_32584 = (float)var36.field_7334;
            }
         }
      } else {
         Entity var30 = var0.method_41633();
         class_1343 var37 = class_9300.method_42917(var2, var30.getPosX(), var30.method_37309() + 1.0, var30.getPosZ());
         if (var37 != null) {
            field_32578 = (float)var37.field_7336;
            field_32585 = (float)var37.field_7333;
            field_32584 = (float)var37.field_7334;
         }
      }

      if (class_7860.field_40155.method_22501()) {
         Object var31 = class_7860.method_35574(class_7860.field_40155, var0, var1, field_32578, field_32585, field_32584);
         class_7860.method_35567(var31);
         field_32578 = class_7860.method_35585(var31, class_7860.field_39977);
         field_32585 = class_7860.method_35585(var31, class_7860.field_40020);
         field_32584 = class_7860.method_35585(var31, class_7860.field_40226);
      }

      class_6588.method_30228(field_32578, field_32585, field_32584, 0.0F);
      RenderSystem.method_16391(field_32578, field_32585, field_32584, 0.0F);
   }

   public static void method_29162() {
      RenderSystem.method_16460(0.0F);
      RenderSystem.method_16365(class_5084.field_26251);
   }

   public static void method_29159(Camera var0, class_1026 var1, float var2, boolean var3) {
      method_29160(var0, var1, var2, var3, 0.0F);
   }

   public static void method_29160(Camera var0, class_1026 var1, float var2, boolean var3, float var4) {
      field_32581 = false;
      class_4774 var7 = var0.method_41626();
      Entity var8 = var0.method_41633();
      float var9 = -1.0F;
      if (class_7860.field_39889.method_3596()) {
         var9 = class_7860.method_35586(class_7860.field_39889, var1, var0, var4, 0.1F);
      }

      if (!(var9 >= 0.0F)) {
         if (!var7.method_22007(class_6503.field_33094)) {
            float var10;
            float var11;
            if (!var7.method_22007(class_6503.field_33095)) {
               if (var8 instanceof class_5834 && ((class_5834)var8).isPotionActive(Effects.field_19736)) {
                  int var12 = ((class_5834)var8).method_26553(Effects.field_19736).method_10347();
                  float var13 = class_9299.method_42795(Math.min(1.0F, (float)var12 / 20.0F), var2, 5.0F);
                  if (var1 != class_1026.field_5679) {
                     var10 = var13 * 0.25F;
                     var11 = var13;
                  } else {
                     var10 = 0.0F;
                     var11 = var13 * 0.8F;
                  }
               } else if (!var3) {
                  if (var1 != class_1026.field_5679) {
                     field_32581 = true;
                     var10 = var2 * Config.method_14336();
                     var11 = var2;
                  } else {
                     field_32581 = true;
                     var10 = 0.0F;
                     var11 = var2;
                  }
               } else {
                  field_32581 = true;
                  var10 = var2 * 0.05F;
                  var11 = Math.min(var2, 192.0F) * 0.5F;
               }
            } else if (var8 instanceof class_5834 && ((class_5834)var8).isPotionActive(Effects.field_19745)) {
               var10 = 0.0F;
               var11 = 3.0F;
            } else {
               var10 = 0.25F;
               var11 = 1.0F;
            }

            RenderSystem.method_16419(var10);
            RenderSystem.method_16470(var11);
            RenderSystem.method_16365(class_5084.field_26248);
            RenderSystem.method_16396();
            if (class_7860.field_39952.method_3596()) {
               class_7860.method_35547(class_7860.field_39952, var1, var0, var4, var11);
            }
         } else {
            float var14 = 1.0F;
            var14 = 0.05F;
            if (var8 instanceof ClientPlayerEntity) {
               ClientPlayerEntity var16 = (ClientPlayerEntity)var8;
               var14 -= var16.method_27328() * var16.method_27328() * 0.03F;
               class_6325 var17 = var16.world.method_22561(var16.method_37075());
               if (var17.method_28887() == class_8862.field_45306) {
                  var14 += 0.005F;
               }
            }

            RenderSystem.method_16460(var14);
            RenderSystem.method_16365(class_5084.field_26251);
         }
      } else {
         GlStateManager.method_8784(var9);
      }
   }

   public static void method_29161() {
      RenderSystem.method_16434(2918, field_32578, field_32585, field_32584, 1.0F);
      if (Config.method_14424()) {
         class_6588.method_30291(field_32578, field_32585, field_32584);
      }
   }
}
