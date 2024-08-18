package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_6823 extends class_7067<class_7451> {
   private static final class_454 field_35174 = new class_454("item_frame", "map=false");
   private static final class_454 field_35170 = new class_454("item_frame", "map=true");
   private final MinecraftClient field_35169 = MinecraftClient.getInstance();
   private final ItemRenderer field_35172;
   private static double field_35171 = 4096.0;

   public class_6823(EntityRenderDispatcher var1, ItemRenderer var2) {
      super(var1);
      this.field_35172 = var2;
   }

   public void method_31302(class_7451 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      super.method_32551(var1, var2, var3, var4, var5, var6);
      var4.method_36063();
      Direction var9 = var1.method_37365();
      Vector3d var10 = this.method_31305(var1, var3);
      var4.method_36065(-var10.method_61(), -var10.method_60(), -var10.method_62());
      double var11 = 0.46875;
      var4.method_36065((double)var9.method_1041() * 0.46875, (double)var9.method_1054() * 0.46875, (double)var9.method_1034() * 0.46875);
      var4.method_36060(class_2426.field_12080.method_11074(var1.rotationPitch));
      var4.method_36060(class_2426.field_12074.method_11074(180.0F - var1.rotationYaw));
      boolean var13 = var1.method_37109();
      if (!var13) {
         class_856 var14 = this.field_35169.method_8505();
         class_7458 var15 = var14.method_3716().method_43945();
         class_454 var16 = !(var1.method_33905().method_27960() instanceof class_2143) ? field_35174 : field_35170;
         var4.method_36063();
         var4.method_36065(-0.5, -0.5, -0.5);
         var14.method_3717()
            .method_10094(
               var4.method_36058(),
               var5.method_11645(class_5276.method_24074()),
               (class_2522)null,
               var15.method_33943(var16),
               1.0F,
               1.0F,
               1.0F,
               var6,
               class_5367.field_27381
            );
         var4.method_36064();
      }

      ItemStack var19 = var1.method_33905();
      if (!var19.method_28022()) {
         boolean var20 = var19.method_27960() instanceof class_2143;
         if (!var13) {
            var4.method_36065(0.0, 0.0, 0.4375);
         } else {
            var4.method_36065(0.0, 0.0, 0.5);
         }

         int var21 = !var20 ? var1.method_33907() : var1.method_33907() % 4 * 2;
         var4.method_36060(class_2426.field_12076.method_11074((float)var21 * 360.0F / 8.0F));
         if (!class_7860.method_35568(class_7860.field_39846, var1, this, var4, var5, var6)) {
            if (!var20) {
               var4.method_36062(0.5F, 0.5F, 0.5F);
               if (this.method_31304(var1)) {
                  this.field_35172.method_40269(var19, class_5612.field_28495, var6, class_5367.field_27381, var4, var5);
               }
            } else {
               var4.method_36060(class_2426.field_12076.method_11074(180.0F));
               float var17 = 0.0078125F;
               var4.method_36062(0.0078125F, 0.0078125F, 0.0078125F);
               var4.method_36065(-64.0, -64.0, 0.0);
               class_2134 var18 = class_8835.method_40647(var19, var1.world);
               var4.method_36065(0.0, 0.0, -1.0);
               if (var18 != null) {
                  this.field_35169.gameRenderer.method_35928().method_38860(var4, var5, var18, true, var6);
               }
            }
         }
      }

      var4.method_36064();
   }

   public Vector3d method_31305(class_7451 var1, float var2) {
      return new Vector3d((double)((float)var1.method_37365().method_1041() * 0.3F), -0.25, (double)((float)var1.method_37365().method_1034() * 0.3F));
   }

   public Identifier method_31301(class_7451 var1) {
      return class_8359.field_42824;
   }

   public boolean method_31300(class_7451 var1) {
      if (MinecraftClient.method_8616() && !var1.method_33905().method_28022() && var1.method_33905().method_28018() && this.field_36493.targetEntity == var1) {
         double var4 = this.field_36493.method_28129(var1);
         float var6 = !var1.method_37073() ? 64.0F : 32.0F;
         return var4 < (double)(var6 * var6);
      } else {
         return false;
      }
   }

   public void method_31299(class_7451 var1, ITextComponent var2, class_7966 var3, class_2565 var4, int var5) {
      super.method_32545(var1, var1.method_33905().method_28008(), var3, var4, var5);
   }

   private boolean method_31304(class_7451 var1) {
      if (!class_6588.field_33945) {
         if (!Config.field_15481) {
            Entity var4 = this.field_35169.getRenderViewEntity();
            double var5 = var1.method_37273(var4.getPosX(), var4.method_37309(), var4.getPosZ());
            if (var5 > field_35171) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void method_31303() {
      MinecraftClient var2 = MinecraftClient.getInstance();
      double var3 = Config.method_14261(var2.gameOptions.field_45543, 1.0, 120.0);
      double var5 = Math.max(6.0 * (double)var2.getMainWindow().method_43163() / var3, 16.0);
      field_35171 = var5 * var5;
   }
}
