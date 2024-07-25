package remapped;

import java.util.List;

public class class_3913 extends class_2255<class_8398> {
   private static String[] field_19009;
   private final class_6679 field_19008 = new class_6679();
   private static double field_19010 = 4096.0;

   public class_3913(class_3569 var1) {
      super(var1);
   }

   public void method_18116(class_8398 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      class_2522 var9 = var1.method_17403();
      var3.method_36063();
      float var10 = 0.6666667F;
      if (!(var9.method_8360() instanceof class_8973)) {
         var3.method_36065(0.5, 0.5, 0.5);
         float var11 = -var9.<Direction>method_10313(class_4853.field_24194).method_1028();
         var3.method_36060(class_2426.field_12074.method_11074(var11));
         var3.method_36065(0.0, -0.3125, -0.4375);
         this.field_19008.field_34523.field_8200 = false;
      } else {
         var3.method_36065(0.5, 0.5, 0.5);
         float var26 = -((float)(var9.<Integer>method_10313(class_8973.field_45980) * 360) / 16.0F);
         var3.method_36060(class_2426.field_12074.method_11074(var26));
         this.field_19008.field_34523.field_8200 = true;
      }

      var3.method_36063();
      var3.method_36062(0.6666667F, -0.6666667F, -0.6666667F);
      class_2843 var27 = method_18118(var9.method_8360());
      class_7907 var12 = var27.method_12943(var4, this.field_19008::method_45498);
      this.field_19008.field_34525.method_7060(var3, var12, var5, var6);
      this.field_19008.field_34523.method_7060(var3, var12, var5, var6);
      var3.method_36064();
      if (method_18119(var1)) {
         TextRenderer var13 = this.field_11222.method_16591();
         float var14 = 0.010416667F;
         var3.method_36065(0.0, 0.33333334F, 0.046666667F);
         var3.method_36062(0.010416667F, -0.010416667F, 0.010416667F);
         int var15 = var1.method_38681().method_41791();
         if (Config.method_14438()) {
            var15 = class_9300.method_42925(var15);
         }

         double var16 = 0.4;
         int var18 = (int)((double)class_5797.method_26255(var15) * 0.4);
         int var19 = (int)((double)class_5797.method_26240(var15) * 0.4);
         int var20 = (int)((double)class_5797.method_26264(var15) * 0.4);
         int var21 = class_5797.method_26244(0, var20, var19, var18);
         byte var22 = 20;

         for (int var23 = 0; var23 < 4; var23++) {
            class_7107 var24 = var1.method_38680(var23, var1x -> {
               List var4x = var13.method_45391(var1x, 90);
               return !var4x.isEmpty() ? (class_7107)var4x.get(0) : class_7107.field_36653;
            });
            if (var24 != null) {
               float var25 = (float)(-var13.method_45400(var24) / 2);
               var13.method_45376(var24, var25, (float)(var23 * 10 - 20), var21, false, var3.method_36058().method_28620(), var4, false, 0, var5);
            }
         }
      }

      var3.method_36064();
   }

   public static class_2843 method_18118(class_6414 var0) {
      class_9271 var3;
      if (!(var0 instanceof class_5210)) {
         var3 = class_9271.field_47294;
      } else {
         var3 = ((class_5210)var0).method_23887();
      }

      return class_5276.method_24073(var3);
   }

   private static boolean method_18119(class_8398 var0) {
      if (!class_6588.field_33945) {
         if (!Config.field_15481) {
            BlockPos var3 = var0.method_17399();
            Entity var4 = MinecraftClient.getInstance().getRenderViewEntity();
            double var5 = var4.method_37273((double)var3.getX(), (double)var3.getY(), (double)var3.getZ());
            if (var5 > field_19010) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void method_18117() {
      MinecraftClient var2 = MinecraftClient.getInstance();
      double var3 = Config.method_14261(var2.gameOptions.field_45543, 1.0, 120.0);
      double var5 = Math.max(1.5 * (double)var2.getMainWindow().method_43163() / var3, 16.0);
      field_19010 = var5 * var5;
   }
}
