package remapped;

public class class_5610 extends class_1859 {
   public final int field_28477;
   private float field_28476;
   private boolean field_28475 = false;
   private boolean field_28474 = false;

   public class_5610(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, class_590.field_3421, var7, false);
      this.field_28477 = var8;
      this.method_25466();
   }

   public void method_25466() {
      for (class_1226 var4 : class_8441.method_38833()) {
         int var5 = var4.method_5458();
         if (var5 == this.field_28477) {
            this.field_28474 = true;
            return;
         }
      }

      this.field_28474 = false;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_28476 = Math.max(0.0F, Math.min(1.0F, this.field_28476 + 0.2F * (float)(!this.method_32185() && !this.field_28475 ? -1 : 1)));
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_139(
         (float)this.field_36270,
         (float)(this.field_36261 + 5),
         (float)this.field_36278,
         (float)this.field_36257,
         8.0F,
         class_314.method_1442(-3092272, -2171170, this.field_28476)
      );
      class_73.method_139(
         (float)this.field_36270, (float)this.field_36261 + 3.0F * this.field_28476, (float)this.field_36278, (float)this.field_36257, 8.0F, -986896
      );
      class_3384 var4 = class_5320.field_27152;
      if (this.field_36275.contains("Lock")) {
         class_73.method_121(
            (float)(this.field_36270 + 14),
            (float)(this.field_36261 + 11) + 3.0F * this.field_28476,
            10.0F,
            class_314.method_1444(class_1255.field_6932.field_6917, this.field_28476)
         );
      }

      if (!this.field_36275.equals("Return")) {
         if (!this.field_36275.equals("Back")) {
            if (!this.field_36275.equals("Meta")) {
               if (!this.field_36275.equals("Menu")) {
                  if (!this.field_36275.equals("Space")) {
                     if (this.field_28474) {
                        var4 = class_5320.field_27154;
                     }

                     class_73.method_87(
                        var4,
                        (float)(this.field_36270 + (this.field_36278 - var4.method_18547(this.field_36275)) / 2),
                        (float)(this.field_36261 + 19) + 3.0F * this.field_28476,
                        this.field_36275,
                        class_314.method_1444(class_1255.field_6929.field_6917, 0.4F + (!this.field_28474 ? 0.0F : 0.2F))
                     );
                  }
               } else {
                  int var5 = this.field_36270 + 25;
                  int var6 = this.field_36261 + 25 + (int)(3.0F * this.field_28476);
                  class_73.method_109(
                     (float)var5,
                     (float)var6,
                     (float)(var5 + 14),
                     (float)(var6 + 3),
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
                  );
                  class_73.method_94(
                     (float)var5,
                     (float)(var6 + 4),
                     (float)(var5 + 14),
                     (float)(var6 + 7),
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
                  );
                  class_73.method_109(
                     (float)var5,
                     (float)(var6 + 8),
                     (float)(var5 + 14),
                     (float)(var6 + 11),
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
                  );
                  class_73.method_109(
                     (float)var5,
                     (float)(var6 + 12),
                     (float)(var5 + 14),
                     (float)(var6 + 15),
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
                  );
               }
            } else {
               int var7 = this.field_36270 + 32;
               int var10 = this.field_36261 + 32 + (int)(3.0F * this.field_28476);
               class_73.method_121(
                  (float)var7, (float)var10, 14.0F, class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
               );
            }
         } else {
            int var8 = this.field_36270 + 43;
            int var11 = this.field_36261 + 33 + (int)(3.0F * this.field_28476);
            class_73.method_142(
               (float)var8,
               (float)var11,
               (float)(var8 + 6),
               (float)(var11 - 3),
               (float)(var8 + 6),
               (float)(var11 + 3),
               class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
            );
            class_73.method_94(
               (float)(var8 + 6),
               (float)(var11 - 1),
               (float)(var8 + 27),
               (float)(var11 + 1),
               class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
            );
         }
      } else {
         int var9 = this.field_36270 + 50;
         int var12 = this.field_36261 + 33 + (int)(3.0F * this.field_28476);
         class_73.method_142(
            (float)var9,
            (float)var12,
            (float)(var9 + 6),
            (float)(var12 - 3),
            (float)(var9 + 6),
            (float)(var12 + 3),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
         );
         class_73.method_94(
            (float)(var9 + 6),
            (float)(var12 - 1),
            (float)(var9 + 27),
            (float)(var12 + 1),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
         );
         class_73.method_94(
            (float)(var9 + 25),
            (float)(var12 - 8),
            (float)(var9 + 27),
            (float)(var12 - 1),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.3F + (!this.field_28474 ? 0.0F : 0.2F))
         );
      }

      super.method_32178(var1);
   }

   @Override
   public void method_29509(int var1) {
      if (var1 == this.field_28477) {
         this.field_28475 = true;
      }

      super.method_29509(var1);
   }

   @Override
   public void method_32110(int var1) {
      if (var1 == this.field_28477) {
         this.field_28475 = false;
      }

      super.method_32110(var1);
   }
}
