package remapped;

public class class_6296 extends class_7067<class_3942> {
   private static final Identifier field_32174 = new Identifier("textures/entity/fishing_hook.png");
   private static final RenderLayer field_32173 = RenderLayer.method_16747(field_32174);

   public class_6296(EntityRenderDispatcher var1) {
      super(var1);
   }

   public void method_28734(class_3942 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      PlayerEntity var9 = var1.method_18219();
      if (var9 != null) {
         var4.method_36063();
         var4.method_36063();
         var4.method_36062(0.5F, 0.5F, 0.5F);
         var4.method_36060(this.field_36493.method_28121());
         var4.method_36060(class_2426.field_12074.method_11074(180.0F));
         class_6279 var10 = var4.method_36058();
         class_8107 var11 = var10.method_28620();
         class_6555 var12 = var10.method_28618();
         class_7907 var13 = var5.method_11645(field_32173);
         method_28735(var13, var11, var12, var6, 0.0F, 0, 0, 1);
         method_28735(var13, var11, var12, var6, 1.0F, 0, 1, 1);
         method_28735(var13, var11, var12, var6, 1.0F, 1, 1, 0);
         method_28735(var13, var11, var12, var6, 0.0F, 1, 0, 0);
         var4.method_36064();
         int var14 = var9.method_26432() != class_1736.field_8943 ? -1 : 1;
         ItemStack var15 = var9.method_26446();
         if (var15.method_27960() != class_4897.field_24505) {
            var14 = -var14;
         }

         float var16 = var9.method_26533(var3);
         float var17 = MathHelper.sin(MathHelper.sqrt(var16) * (float) Math.PI);
         float var18 = MathHelper.method_42795(var3, var9.field_29611, var9.field_29605) * (float) (Math.PI / 180.0);
         double var19 = (double) MathHelper.sin(var18);
         double var21 = (double) MathHelper.cos(var18);
         double var23 = (double)var14 * 0.35;
         double var25 = 0.8;
         double var27;
         double var29;
         double var31;
         float var36;
         if ((this.field_36493.gameOptions == null || this.field_36493.gameOptions.getPointOfView().method_42383())
            && var9 == MinecraftClient.getInstance().thePlayer) {
            double var33 = this.field_36493.gameOptions.field_45543;
            var33 /= 100.0;
            class_1343 var35 = new class_1343((double)var14 * -0.36 * var33, -0.045 * var33, 0.4);
            var35 = var35.method_6212(-MathHelper.method_42795(var3, var9.field_41762, var9.rotationPitch) * (float) (Math.PI / 180.0));
            var35 = var35.method_6192(-MathHelper.method_42795(var3, var9.prevRotationYaw, var9.rotationYaw) * (float) (Math.PI / 180.0));
            var35 = var35.method_6192(var17 * 0.5F);
            var35 = var35.method_6212(-var17 * 0.7F);
            var27 = MathHelper.lerp((double)var3, var9.field_41767, var9.getPosX()) + var35.field_7336;
            var29 = MathHelper.lerp((double)var3, var9.field_41698, var9.method_37309()) + var35.field_7333;
            var31 = MathHelper.lerp((double)var3, var9.field_41725, var9.getPosZ()) + var35.field_7334;
            var36 = var9.method_37277();
         } else {
            var27 = MathHelper.lerp((double)var3, var9.field_41767, var9.getPosX()) - var21 * var23 - var19 * 0.8;
            var29 = var9.field_41698 + (double)var9.method_37277() + (var9.method_37309() - var9.field_41698) * (double)var3 - 0.45;
            var31 = MathHelper.lerp((double)var3, var9.field_41725, var9.getPosZ()) - var19 * var23 + var21 * 0.8;
            var36 = !var9.method_37382() ? 0.0F : -0.1875F;
         }

         double var49 = MathHelper.lerp((double)var3, var1.field_41767, var1.getPosX());
         double var37 = MathHelper.lerp((double)var3, var1.field_41698, var1.method_37309()) + 0.25;
         double var39 = MathHelper.lerp((double)var3, var1.field_41725, var1.getPosZ());
         float var41 = (float)(var27 - var49);
         float var42 = (float)(var29 - var37) + var36;
         float var43 = (float)(var31 - var39);
         class_7907 var44 = var5.method_11645(RenderLayer.method_16744());
         class_8107 var45 = var4.method_36058().method_28620();
         byte var46 = 16;

         for (int var47 = 0; var47 < 16; var47++) {
            method_28737(var41, var42, var43, var44, var45, method_28736(var47, 16));
            method_28737(var41, var42, var43, var44, var45, method_28736(var47 + 1, 16));
         }

         var4.method_36064();
         super.method_32551(var1, var2, var3, var4, var5, var6);
      }
   }

   private static float method_28736(int var0, int var1) {
      return (float)var0 / (float)var1;
   }

   private static void method_28735(class_7907 var0, class_8107 var1, class_6555 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.method_35762(var1, var4 - 0.5F, (float)var5 - 0.5F, 0.0F)
         .method_35743(255, 255, 255, 255)
         .method_35745((float)var6, (float)var7)
         .method_35737(class_5367.field_27381)
         .method_35747(var3)
         .method_35756(var2, 0.0F, 1.0F, 0.0F)
         .method_35735();
   }

   private static void method_28737(float var0, float var1, float var2, class_7907 var3, class_8107 var4, float var5) {
      var3.method_35762(var4, var0 * var5, var1 * (var5 * var5 + var5) * 0.5F + 0.25F, var2 * var5).method_35743(0, 0, 0, 255).method_35735();
   }

   public Identifier method_28733(class_3942 var1) {
      return field_32174;
   }
}
