package remapped;

import com.google.common.collect.ImmutableList;

public class class_5723<T extends class_7637> extends class_5272<T> implements class_1787, class_8667 {
   private static String[] field_28922;
   private final class_1549 field_28918;
   private final class_1549 field_28919;
   private final class_1549 field_28921;
   private final class_1549 field_28923;
   private final class_1549 field_28917;
   private final class_1549 field_28916;
   private final class_1549 field_28920;
   private final class_1549 field_28924;

   public class_5723(float var1, float var2, int var3, int var4) {
      this.field_28918 = new class_1549(this).method_7033(var3, var4);
      this.field_28918.method_7046(0.0F, 0.0F + var2, 0.0F);
      this.field_28918.method_7037(0, 0).method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.field_28919 = new class_1549(this, 32, 0).method_7033(var3, var4);
      this.field_28919.method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, var1 + 0.45F);
      this.field_28918.method_7043(this.field_28919);
      this.field_28919.field_8200 = false;
      class_1549 var7 = new class_1549(this).method_7033(var3, var4);
      var7.method_7046(0.0F, var2 - 2.0F, 0.0F);
      var7.method_7037(24, 0).method_7049(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.field_28918.method_7043(var7);
      this.field_28921 = new class_1549(this).method_7033(var3, var4);
      this.field_28921.method_7046(0.0F, 0.0F + var2, 0.0F);
      this.field_28921.method_7037(16, 20).method_7049(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.field_28921.method_7037(0, 38).method_7049(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.field_28923 = new class_1549(this).method_7033(var3, var4);
      this.field_28923.method_7046(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.field_28923.method_7037(44, 22).method_7049(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      class_1549 var8 = new class_1549(this, 44, 22).method_7033(var3, var4);
      var8.field_8197 = true;
      var8.method_7049(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.field_28923.method_7043(var8);
      this.field_28923.method_7037(40, 38).method_7049(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.field_28917 = new class_1549(this, 0, 22).method_7033(var3, var4);
      this.field_28917.method_7046(-2.0F, 12.0F + var2, 0.0F);
      this.field_28917.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_28916 = new class_1549(this, 0, 22).method_7033(var3, var4);
      this.field_28916.field_8197 = true;
      this.field_28916.method_7046(2.0F, 12.0F + var2, 0.0F);
      this.field_28916.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_28920 = new class_1549(this, 40, 46).method_7033(var3, var4);
      this.field_28920.method_7049(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_28920.method_7046(-5.0F, 2.0F + var2, 0.0F);
      this.field_28924 = new class_1549(this, 40, 46).method_7033(var3, var4);
      this.field_28924.field_8197 = true;
      this.field_28924.method_7049(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_28924.method_7046(5.0F, 2.0F + var2, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_28918, this.field_28921, this.field_28917, this.field_28916, this.field_28923, this.field_28920, this.field_28924);
   }

   public void method_25892(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_28918.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_28918.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_28923.field_8181 = 3.0F;
      this.field_28923.field_8187 = -1.0F;
      this.field_28923.field_8191 = -0.75F;
      if (!this.field_33203) {
         this.field_28920.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F;
         this.field_28920.field_8190 = 0.0F;
         this.field_28920.field_8185 = 0.0F;
         this.field_28924.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 2.0F * var3 * 0.5F;
         this.field_28924.field_8190 = 0.0F;
         this.field_28924.field_8185 = 0.0F;
         this.field_28917.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
         this.field_28917.field_8190 = 0.0F;
         this.field_28917.field_8185 = 0.0F;
         this.field_28916.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
         this.field_28916.field_8190 = 0.0F;
         this.field_28916.field_8185 = 0.0F;
      } else {
         this.field_28920.field_8191 = (float) (-Math.PI / 5);
         this.field_28920.field_8190 = 0.0F;
         this.field_28920.field_8185 = 0.0F;
         this.field_28924.field_8191 = (float) (-Math.PI / 5);
         this.field_28924.field_8190 = 0.0F;
         this.field_28924.field_8185 = 0.0F;
         this.field_28917.field_8191 = -1.4137167F;
         this.field_28917.field_8190 = (float) (Math.PI / 10);
         this.field_28917.field_8185 = 0.07853982F;
         this.field_28916.field_8191 = -1.4137167F;
         this.field_28916.field_8190 = (float) (-Math.PI / 10);
         this.field_28916.field_8185 = -0.07853982F;
      }

      class_5871 var9 = var1.method_34604();
      if (var9 != class_5871.field_29818) {
         if (var9 != class_5871.field_29814) {
            if (var9 != class_5871.field_29813) {
               if (var9 != class_5871.field_29817) {
                  if (var9 != class_5871.field_29815) {
                     if (var9 == class_5871.field_29819) {
                        this.field_28920.field_8187 = 0.0F;
                        this.field_28920.field_8183 = -5.0F;
                        this.field_28920.field_8191 = class_9299.method_42840(var4 * 0.6662F) * 0.05F;
                        this.field_28920.field_8185 = 2.670354F;
                        this.field_28920.field_8190 = 0.0F;
                        this.field_28924.field_8187 = 0.0F;
                        this.field_28924.field_8183 = 5.0F;
                        this.field_28924.field_8191 = class_9299.method_42840(var4 * 0.6662F) * 0.05F;
                        this.field_28924.field_8185 = (float) (-Math.PI * 3.0 / 4.0);
                        this.field_28924.field_8190 = 0.0F;
                     }
                  } else {
                     class_3191.method_14685(this.field_28920, this.field_28924, var1, true);
                  }
               } else {
                  class_3191.method_14689(this.field_28920, this.field_28924, this.field_28918, true);
               }
            } else {
               this.field_28920.field_8190 = -0.1F + this.field_28918.field_8190;
               this.field_28920.field_8191 = (float) (-Math.PI / 2) + this.field_28918.field_8191;
               this.field_28924.field_8191 = -0.9424779F + this.field_28918.field_8191;
               this.field_28924.field_8190 = this.field_28918.field_8190 - 0.4F;
               this.field_28924.field_8185 = (float) (Math.PI / 2);
            }
         } else {
            this.field_28920.field_8187 = 0.0F;
            this.field_28920.field_8183 = -5.0F;
            this.field_28924.field_8187 = 0.0F;
            this.field_28924.field_8183 = 5.0F;
            this.field_28920.field_8191 = class_9299.method_42840(var4 * 0.6662F) * 0.25F;
            this.field_28924.field_8191 = class_9299.method_42840(var4 * 0.6662F) * 0.25F;
            this.field_28920.field_8185 = (float) (Math.PI * 3.0 / 4.0);
            this.field_28924.field_8185 = (float) (-Math.PI * 3.0 / 4.0);
            this.field_28920.field_8190 = 0.0F;
            this.field_28924.field_8190 = 0.0F;
         }
      } else if (!var1.method_26446().method_28022()) {
         class_3191.method_14684(this.field_28920, this.field_28924, var1, this.field_33202, var4);
      } else {
         class_3191.method_14688(this.field_28924, this.field_28920, true, this.field_33202, var4);
      }

      boolean var10 = var9 == class_5871.field_29811;
      this.field_28923.field_8200 = var10;
      this.field_28924.field_8200 = !var10;
      this.field_28920.field_8200 = !var10;
   }

   private class_1549 method_25893(class_1736 var1) {
      return var1 != class_1736.field_8940 ? this.field_28920 : this.field_28924;
   }

   public class_1549 method_25894() {
      return this.field_28919;
   }

   @Override
   public class_1549 method_39733() {
      return this.field_28918;
   }

   @Override
   public void method_7948(class_1736 var1, class_7966 var2) {
      this.method_25893(var1).method_7057(var2);
   }
}
