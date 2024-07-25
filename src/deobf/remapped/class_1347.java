package remapped;

import java.awt.Dimension;

public class class_1347 {
   private Dimension field_7353 = null;
   private boolean field_7352 = false;
   private class_3142[] field_7357 = new class_3142[0];
   private class_4639 field_7366 = null;
   private class_5797 field_7355 = null;
   private class_7884 field_7364 = null;
   private class_4639 field_7359 = new class_4639("textures/block/red_wool.png");
   public static final int field_7361 = 0;
   public static final int field_7363 = 1;
   public static final int field_7360 = 2;
   public static final int field_7365 = 3;
   public static final int field_7358 = 4;
   public static final int field_7354 = 5;
   public static final int field_7356 = 6;

   public class_1347(Dimension var1, boolean var2, class_3142[] var3) {
      this.field_7353 = var1;
      this.field_7352 = var2;
      this.field_7357 = var3;
   }

   public void method_6231(class_2344 var1, class_9716 var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      class_4639 var9 = this.field_7359;
      if (!this.field_7352) {
         if (this.field_7366 == null) {
            var9 = this.field_7359;
         } else {
            if (this.field_7364 == null && this.field_7355 != null) {
               this.field_7364 = new class_7884(this.field_7355);
               class_1893.method_8510().method_8577().method_35682(this.field_7366, this.field_7364);
            }

            var9 = this.field_7366;
         }
      } else {
         var9 = var2.method_44889();
      }

      for (int var10 = 0; var10 < this.field_7357.length; var10++) {
         class_3142 var11 = this.field_7357[var10];
         var3.method_36063();
         class_3581 var12 = class_3581.method_16755(var9);
         class_7907 var13 = var4.method_11645(var12);
         var11.method_14530(var1, var3, var13, var5, var6);
         var3.method_36064();
      }
   }

   public static class_1549 method_6229(class_2344 var0, int var1) {
      switch (var1) {
         case 0:
            return var0.field_11704;
         case 1:
            return var0.field_11696;
         case 2:
            return var0.field_11701;
         case 3:
            return var0.field_11705;
         case 4:
            return var0.field_11703;
         case 5:
            return var0.field_11706;
         default:
            return null;
      }
   }

   public class_5797 method_6230() {
      return this.field_7355;
   }

   public void method_6228(class_5797 var1) {
      this.field_7355 = var1;
   }

   public class_7884 method_6226() {
      return this.field_7364;
   }

   public class_4639 method_6232() {
      return this.field_7366;
   }

   public void method_6234(class_4639 var1) {
      this.field_7366 = var1;
   }

   public boolean method_6233() {
      return this.field_7352;
   }
}
