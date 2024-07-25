package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.List;

public class class_9429 extends class_2255<class_8837> {
   private static String[] field_48169;
   private final class_1549 field_48167 = method_43641();
   private final class_1549 field_48166 = new class_1549(64, 64, 44, 0);
   private final class_1549 field_48168;

   public class_9429(class_3569 var1) {
      super(var1);
      this.field_48166.method_7049(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F, 0.0F);
      this.field_48168 = new class_1549(64, 64, 0, 42);
      this.field_48168.method_7049(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F);
   }

   public static class_1549 method_43641() {
      class_1549 var2 = new class_1549(64, 64, 0, 0);
      var2.method_7049(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F, 0.0F);
      return var2;
   }

   public void method_43640(class_8837 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      List var9 = var1.method_40655();
      if (var9 != null) {
         float var10 = 0.6666667F;
         boolean var11 = var1.method_17402() == null;
         var3.method_36063();
         long var12;
         if (!var11) {
            var12 = var1.method_17402().method_29546();
            class_2522 var14 = var1.method_17403();
            if (!(var14.method_8360() instanceof class_9815)) {
               var3.method_36065(0.5, -0.16666667F, 0.5);
               float var15 = -var14.<Direction>method_10313(class_6832.field_35227).method_1028();
               var3.method_36060(class_2426.field_12074.method_11074(var15));
               var3.method_36065(0.0, -0.3125, -0.4375);
               this.field_48166.field_8200 = false;
            } else {
               var3.method_36065(0.5, 0.5, 0.5);
               float var18 = (float)(-var14.<Integer>method_10313(class_9815.field_49744) * 360) / 16.0F;
               var3.method_36060(class_2426.field_12074.method_11074(var18));
               this.field_48166.field_8200 = true;
            }
         } else {
            var12 = 0L;
            var3.method_36065(0.5, 0.5, 0.5);
            this.field_48166.field_8200 = true;
         }

         var3.method_36063();
         var3.method_36062(0.6666667F, -0.6666667F, -0.6666667F);
         class_7907 var17 = class_6560.field_33431.method_12943(var4, RenderLayer::method_16734);
         this.field_48166.method_7060(var3, var17, var5, var6);
         this.field_48168.method_7060(var3, var17, var5, var6);
         BlockPos var19 = var1.method_17399();
         float var16 = ((float)Math.floorMod((long)(var19.getX() * 7 + var19.getY() * 9 + var19.getZ() * 13) + var12, 100L) + var2)
            / 100.0F;
         this.field_48167.field_8191 = (-0.0125F + 0.01F * MathHelper.cos((float) (Math.PI * 2) * var16)) * (float) Math.PI;
         this.field_48167.field_8181 = -32.0F;
         method_43643(var3, var4, var5, var6, this.field_48167, class_6560.field_33431, true, var9);
         var3.method_36064();
         var3.method_36064();
      }
   }

   public static void method_43643(
      class_7966 var0, class_2565 var1, int var2, int var3, class_1549 var4, class_2843 var5, boolean var6, List<Pair<class_8427, class_9077>> var7
   ) {
      method_43642(var0, var1, var2, var3, var4, var5, var6, var7, false);
   }

   public static void method_43642(
      class_7966 var0,
      class_2565 var1,
      int var2,
      int var3,
      class_1549 var4,
      class_2843 var5,
      boolean var6,
      List<Pair<class_8427, class_9077>> var7,
      boolean var8
   ) {
      var4.method_7060(var0, var5.method_12944(var1, RenderLayer::method_16734, var8), var2, var3);

      for (int var11 = 0; var11 < 17 && var11 < var7.size(); var11++) {
         Pair var12 = (Pair)var7.get(var11);
         float[] var13 = ((class_9077)var12.getSecond()).method_41792();
         class_2843 var14 = new class_2843(!var6 ? class_5276.field_26973 : class_5276.field_26965, ((class_8427)var12.getFirst()).method_38784(var6));
         var4.method_7061(var0, var14.method_12943(var1, RenderLayer::method_16750), var2, var3, var13[0], var13[1], var13[2], 1.0F);
      }
   }
}
