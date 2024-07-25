package remapped;

import java.awt.image.BufferedImage;

public class class_9192 extends class_446 {
   public class_7309 field_47028 = null;
   private BufferedImage field_47027;
   private class_8343 field_47020;
   private float field_47022 = 0.0F;
   private class_1581 field_47026;
   private boolean field_47023 = false;
   private float field_47018 = 0.0F;
   private int field_47024 = 0;
   private int field_47025 = 0;
   private int field_47019 = class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 20.0F);

   public class_9192(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_7309 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_47028 = var7;
      this.method_32148(this.field_47026 = new class_1581(this, "loading", var5 - 50, 35, 30, 30));
      this.field_47026.method_32119(false);
   }

   public void method_42375(boolean var1) {
      this.method_42376(var1, false);
   }

   public void method_42376(boolean var1, boolean var2) {
      this.field_47023 = var1;
      if (var2) {
         this.field_47022 = 1.0F;
      }
   }

   public boolean method_42378() {
      return this.field_47023;
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      this.field_47022 = (float)((double)this.field_47022 + (this.field_47023 ? 0.2 : -0.2));
      this.field_47022 = Math.min(1.0F, Math.max(0.0F, this.field_47022));
      this.field_47019 = class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 2.0F);
      if (this.field_47023 || this.method_32185() || this.method_32183()) {
         class_73.method_94(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)(this.field_36270 + this.field_36278),
            (float)(this.field_36261 + this.field_36257),
            class_314.method_1444(class_1255.field_6918.field_6917, 0.05F)
         );
      }

      if (!this.method_32185()) {
         if (this.method_32183() && this.field_47023) {
            class_73.method_110(
               (float)this.field_36270,
               (float)this.field_36261,
               (float)(this.field_36270 + this.field_36278),
               (float)(this.field_36261 + this.field_36257),
               2,
               class_314.method_1444(class_1255.field_6920.field_6917, 0.5F)
            );
         } else if (!this.method_32183()) {
            if (this.field_47023) {
               class_73.method_110(
                  (float)this.field_36270,
                  (float)this.field_36261,
                  (float)(this.field_36270 + this.field_36278),
                  (float)(this.field_36261 + this.field_36257),
                  2,
                  class_314.method_1444(class_1255.field_6920.field_6917, 0.3F)
               );
            }
         } else {
            class_73.method_110(
               (float)this.field_36270,
               (float)this.field_36261,
               (float)(this.field_36270 + this.field_36278),
               (float)(this.field_36261 + this.field_36257),
               2,
               class_314.method_1444(class_1255.field_6929.field_6917, 0.3F)
            );
         }
      } else {
         class_73.method_110(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)(this.field_36270 + this.field_36278),
            (float)(this.field_36261 + this.field_36257),
            2,
            class_314.method_1444(class_1255.field_6920.field_6917, 0.65F)
         );
      }

      class_73.method_150(this.field_36270, this.field_36261, this.field_36270 + this.field_36278, this.field_36261 + this.field_36257, true);
      if (this.field_47028 != null) {
         this.method_42377();
         class_73.method_141();
         if (this.field_47022 > 0.0F && this.field_36257 > 55) {
            class_73.method_99(
               (float)(this.field_36270 + this.method_32109()),
               (float)this.field_36261 + (float)(26 * this.field_36257) / 100.0F,
               18.0F * this.field_47022 * (float)this.field_36257 / 100.0F,
               (float)(47 * this.field_36257) / 100.0F,
               class_2209.field_11022,
               !this.method_32185() ? class_1255.field_6918.field_6917 : this.field_47019
            );
         }

         super.method_32178(var1);
      }
   }

   public void method_42380() {
      class_73.method_102(
         (float)(this.field_36270 + 13), (float)(this.field_36261 + 13), 75.0F, 75.0F, this.field_47028.method_33340(), class_1255.field_6918.field_6917, true
      );
      class_73.method_147((float)(this.field_36270 + 13), (float)(this.field_36261 + 13), 75.0F, 75.0F, 20.0F, 1.0F);
      class_73.method_99(
         (float)(this.field_36270 + 1),
         (float)this.field_36261,
         100.0F,
         100.0F,
         class_2209.field_11019,
         !this.method_32185() ? class_1255.field_6918.field_6917 : this.field_47019
      );
   }

   public void method_42377() {
      String var3 = this.field_47028.method_33321();
      if (var3.equals("Unknown name")) {
         var3 = this.field_47028.method_33344();
      }

      class_73.method_88(
         class_5320.field_27156,
         (float)(this.field_36270 + this.field_36278 / 2),
         (float)(this.field_36261 + 20),
         var3,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.4F),
         class_6206.field_31726,
         class_6206.field_31726
      );
      class_73.method_88(
         class_5320.field_27156,
         (float)(this.field_36270 + this.field_36278 / 2),
         (float)(this.field_36261 + 18),
         var3,
         class_1255.field_6918.field_6917,
         class_6206.field_31726,
         class_6206.field_31726
      );
      if (!this.field_47028.method_33338()) {
         class_73.method_89(
            class_5320.field_27156,
            (float)(this.field_36270 + this.field_36278 / 2),
            (float)(this.field_36261 + 32),
            this.field_47028.method_33341().replaceAll(".", "*"),
            -8355712,
            class_6206.field_31726,
            class_6206.field_31723,
            true
         );
      } else {
         class_73.method_89(
            class_5320.field_27156,
            (float)(this.field_36270 + this.field_36278 / 2),
            (float)(this.field_36261 + 29),
            "Cracked",
            class_1255.field_6928.field_6917,
            class_6206.field_31726,
            class_6206.field_31723,
            true
         );
      }
   }

   public void method_42374(int var1) {
      this.field_47024 = var1;
      this.field_47025 = var1;
   }

   public void method_42379(boolean var1) {
      this.field_47026.method_32119(var1);
   }
}
