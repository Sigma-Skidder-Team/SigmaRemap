package remapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Calendar;

public class class_4732<T extends class_3757 & class_3848> extends class_2255<T> {
   private static String[] field_22935;
   private final class_1549 field_22931;
   private final class_1549 field_22933;
   private final class_1549 field_22936;
   private final class_1549 field_22929;
   private final class_1549 field_22930;
   private final class_1549 field_22928;
   private final class_1549 field_22937;
   private final class_1549 field_22938;
   private final class_1549 field_22934;
   private boolean field_22932;

   public class_4732(class_3569 var1) {
      super(var1);
      Calendar var4 = Calendar.getInstance();
      if (var4.get(2) + 1 == 12 && var4.get(5) >= 24 && var4.get(5) <= 26) {
         this.field_22932 = true;
      }

      this.field_22933 = new class_1549(64, 64, 0, 19);
      this.field_22933.method_7049(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F);
      this.field_22931 = new class_1549(64, 64, 0, 0);
      this.field_22931.method_7049(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F);
      this.field_22931.field_8181 = 9.0F;
      this.field_22931.field_8187 = 1.0F;
      this.field_22936 = new class_1549(64, 64, 0, 0);
      this.field_22936.method_7049(7.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F);
      this.field_22936.field_8181 = 8.0F;
      this.field_22930 = new class_1549(64, 64, 0, 19);
      this.field_22930.method_7049(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.field_22929 = new class_1549(64, 64, 0, 0);
      this.field_22929.method_7049(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.field_22929.field_8181 = 9.0F;
      this.field_22929.field_8187 = 1.0F;
      this.field_22928 = new class_1549(64, 64, 0, 0);
      this.field_22928.method_7049(15.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field_22928.field_8181 = 8.0F;
      this.field_22938 = new class_1549(64, 64, 0, 19);
      this.field_22938.method_7049(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.field_22937 = new class_1549(64, 64, 0, 0);
      this.field_22937.method_7049(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.field_22937.field_8181 = 9.0F;
      this.field_22937.field_8187 = 1.0F;
      this.field_22934 = new class_1549(64, 64, 0, 0);
      this.field_22934.method_7049(0.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field_22934.field_8181 = 8.0F;
   }

   @Override
   public void method_10364(T var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      class_6486 var9 = var1.method_17402();
      boolean var10 = var9 != null;
      class_2522 var11 = !var10 ? class_4783.field_23471.method_29260().method_10308(class_6942.field_35692, class_240.field_800) : var1.method_17403();
      class_9264 var12 = !var11.method_10307(class_6942.field_35695) ? class_9264.field_47274 : var11.<class_9264>method_10313(class_6942.field_35695);
      class_6414 var13 = var11.method_8360();
      if (var13 instanceof class_8218) {
         class_8218 var14 = (class_8218)var13;
         boolean var15 = var12 != class_9264.field_47274;
         var3.method_36063();
         float var16 = var11.<class_240>method_10313(class_6942.field_35692).method_1028();
         var3.method_36065(0.5, 0.5, 0.5);
         var3.method_36060(class_2426.field_12074.method_11074(-var16));
         var3.method_36065(-0.5, -0.5, -0.5);
         class_7892 var17;
         if (!var10) {
            var17 = class_3606::method_16828;
         } else {
            var17 = var14.method_37624(var11, var9, var1.method_17399(), true);
         }

         float var18 = var17.<Float2FloatFunction>method_35688(class_6942.method_31761((class_3848)var1)).get(var2);
         var18 = 1.0F - var18;
         var18 = 1.0F - var18 * var18 * var18;
         int var19 = var17.<Int2IntFunction>method_35688(new class_491()).applyAsInt(var5);
         class_2843 var20 = class_5276.method_24078(var1, var12, this.field_22932);
         class_7907 var21 = var20.method_12943(var4, class_3581::method_16747);
         if (!var15) {
            this.method_21855(var3, var21, this.field_22931, this.field_22936, this.field_22933, var18, var19, var6);
         } else if (var12 != class_9264.field_47279) {
            this.method_21855(var3, var21, this.field_22929, this.field_22928, this.field_22930, var18, var19, var6);
         } else {
            this.method_21855(var3, var21, this.field_22937, this.field_22934, this.field_22938, var18, var19, var6);
         }

         var3.method_36064();
      }
   }

   private void method_21855(class_7966 var1, class_7907 var2, class_1549 var3, class_1549 var4, class_1549 var5, float var6, int var7, int var8) {
      var3.field_8191 = -(var6 * (float) (Math.PI / 2));
      var4.field_8191 = var3.field_8191;
      var3.method_7060(var1, var2, var7, var8);
      var4.method_7060(var1, var2, var7, var8);
      var5.method_7060(var1, var2, var7, var8);
   }
}
