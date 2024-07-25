package remapped;

public class class_7416<T extends class_4393> extends class_4171<T, class_2611<T>> {
   private class_1549 field_37850;
   private static final class_4639 field_37853 = new class_4639("textures/entity/cow/red_mushroom.png");
   private static final class_4639 field_37849 = new class_4639("textures/entity/cow/brown_mushroom.png");
   private static boolean field_37852 = false;
   private static boolean field_37854 = false;

   public class_7416(class_2514<T, class_2611<T>> var1) {
      super(var1);
      class_1995 var4 = (class_1995)var1;
      this.field_37850 = new class_1549(var4.method_11447());
      this.field_37850.method_7033(16, 16);
      this.field_37850.field_8183 = 8.0F;
      this.field_37850.field_8187 = 8.0F;
      this.field_37850.field_8190 = class_9299.field_47442 / 4.0F;
      int[][] var5 = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
      this.field_37850.method_7055(var5, -10.0F, 0.0F, 0.0F, 20.0F, 16.0F, 0.0F, 0.0F);
      int[][] var6 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
      this.field_37850.method_7055(var6, 0.0F, 0.0F, -10.0F, 0.0F, 16.0F, 20.0F, 0.0F);
   }

   public void method_33785(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method_26449() && !var4.method_37109()) {
         class_856 var13 = class_1893.method_8510().method_8505();
         class_2522 var14 = var4.method_20463().method_9649();
         class_4639 var15 = this.method_33784(var14);
         class_7907 var16 = null;
         if (var15 != null) {
            var16 = var2.method_11645(class_3581.method_16747(var15));
         }

         int var17 = class_6353.method_29110(var4, 0.0F);
         var1.method_36063();
         var1.method_36065(0.2F, -0.35F, 0.5);
         var1.method_36060(class_2426.field_12074.method_11074(-48.0F));
         var1.method_36062(-1.0F, -1.0F, 1.0F);
         var1.method_36065(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method_3713(var14, var1, var2, var3, var17);
         } else {
            this.field_37850.method_7060(var1, var16, var3, var17);
         }

         var1.method_36064();
         var1.method_36063();
         var1.method_36065(0.2F, -0.35F, 0.5);
         var1.method_36060(class_2426.field_12074.method_11074(42.0F));
         var1.method_36065(0.1F, 0.0, -0.6F);
         var1.method_36060(class_2426.field_12074.method_11074(-48.0F));
         var1.method_36062(-1.0F, -1.0F, 1.0F);
         var1.method_36065(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method_3713(var14, var1, var2, var3, var17);
         } else {
            this.field_37850.method_7060(var1, var16, var3, var17);
         }

         var1.method_36064();
         var1.method_36063();
         this.method_19347().method_11846().method_7057(var1);
         var1.method_36065(0.0, -0.7F, -0.2F);
         var1.method_36060(class_2426.field_12074.method_11074(-78.0F));
         var1.method_36062(-1.0F, -1.0F, 1.0F);
         var1.method_36065(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method_3713(var14, var1, var2, var3, var17);
         } else {
            this.field_37850.method_7060(var1, var16, var3, var17);
         }

         var1.method_36064();
      }
   }

   private class_4639 method_33784(class_2522 var1) {
      class_6414 var4 = var1.method_8360();
      if (var4 == class_4783.field_23594 && field_37852) {
         return field_37853;
      } else {
         return var4 == class_4783.field_23729 && field_37854 ? field_37849 : null;
      }
   }

   public static void method_33786() {
      field_37852 = class_3111.method_14362(field_37853);
      field_37854 = class_3111.method_14362(field_37849);
   }
}
