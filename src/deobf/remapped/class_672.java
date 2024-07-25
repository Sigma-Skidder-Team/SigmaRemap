package remapped;

public class class_672<T extends class_5886> extends class_3169<T> {
   private static String[] field_3729;
   public final class_1549 field_3734;
   public final class_1549 field_3733;
   private final class_1549 field_3735;
   private final class_1549 field_3732;
   private final class_1549 field_3730;
   private final class_1549 field_3731;

   public class_672(float var1, int var2, int var3) {
      super(var1, false);
      this.field_49928 = var2;
      this.field_49927 = var3;
      this.field_11704 = new class_1549(this, 16, 16);
      this.field_11704.method_7049(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.field_11696 = new class_1549(this);
      this.field_11696.method_7037(0, 0).method_7049(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, var1);
      this.field_11696.method_7037(31, 1).method_7049(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, var1);
      this.field_11696.method_7037(2, 4).method_7049(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.field_11696.method_7037(2, 0).method_7049(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.field_3734 = new class_1549(this);
      this.field_3734.method_7046(4.5F, -6.0F, 0.0F);
      this.field_3734.method_7037(51, 6).method_7049(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.field_11696.method_7043(this.field_3734);
      this.field_3733 = new class_1549(this);
      this.field_3733.method_7046(-4.5F, -6.0F, 0.0F);
      this.field_3733.method_7037(39, 6).method_7049(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.field_11696.method_7043(this.field_3733);
      this.field_11695 = new class_1549(this);
      this.field_3735 = this.field_11704.method_7038();
      this.field_3732 = this.field_11696.method_7038();
      this.field_3730 = this.field_11701.method_7038();
      this.field_3731 = this.field_11701.method_7038();
   }

   public void method_3077(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_11704.method_7034(this.field_3735);
      this.field_11696.method_7034(this.field_3732);
      this.field_11701.method_7034(this.field_3730);
      this.field_11705.method_7034(this.field_3731);
      super.method_10738((T)var1, var2, var3, var4, var5, var6);
      float var9 = (float) (Math.PI / 6);
      float var10 = var4 * 0.1F + var2 * 0.5F;
      float var11 = 0.08F + var3 * 0.4F;
      this.field_3734.field_8185 = (float) (-Math.PI / 6) - class_9299.method_42840(var10 * 1.2F) * var11;
      this.field_3733.field_8185 = (float) (Math.PI / 6) + class_9299.method_42840(var10) * var11;
      if (!(var1 instanceof class_6993)) {
         if (var1.method_37387() == class_6629.field_34234) {
            class_3191.method_14688(this.field_11701, this.field_11705, var1.method_26892(), this.field_33202, var4);
         }
      } else {
         class_6993 var12 = (class_6993)var1;
         class_9316 var13 = var12.method_31993();
         if (var13 != class_9316.field_47574) {
            if (var13 == class_9316.field_47570 && this.field_33202 == 0.0F) {
               this.method_3079((T)var1);
            } else if (var13 != class_9316.field_47569) {
               if (var13 != class_9316.field_47571) {
                  if (var13 == class_9316.field_47573) {
                     this.field_11696.field_8191 = 0.5F;
                     this.field_11696.field_8190 = 0.0F;
                     if (!var1.method_26849()) {
                        this.field_11701.field_8190 = 0.5F;
                        this.field_11701.field_8191 = -0.9F;
                     } else {
                        this.field_11705.field_8190 = -0.5F;
                        this.field_11705.field_8191 = -0.9F;
                     }
                  }
               } else {
                  class_3191.method_14685(this.field_11705, this.field_11701, var1, !var1.method_26849());
               }
            } else {
               class_3191.method_14689(this.field_11705, this.field_11701, this.field_11696, !var1.method_26849());
            }
         } else {
            float var14 = var4 / 60.0F;
            this.field_3733.field_8185 = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * class_9299.method_42818(var14 * 30.0F) * 10.0F;
            this.field_3734.field_8185 = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * class_9299.method_42840(var14 * 30.0F) * 10.0F;
            this.field_11696.field_8183 = class_9299.method_42818(var14 * 10.0F);
            this.field_11696.field_8181 = class_9299.method_42818(var14 * 40.0F) + 0.4F;
            this.field_11705.field_8185 = (float) (Math.PI / 180.0) * (70.0F + class_9299.method_42840(var14 * 40.0F) * 10.0F);
            this.field_11701.field_8185 = this.field_11705.field_8185 * -1.0F;
            this.field_11705.field_8181 = class_9299.method_42818(var14 * 40.0F) * 0.5F + 1.5F;
            this.field_11701.field_8181 = class_9299.method_42818(var14 * 40.0F) * 0.5F + 1.5F;
            this.field_11704.field_8181 = class_9299.method_42818(var14 * 40.0F) * 0.35F;
         }
      }

      this.field_15849.method_7034(this.field_11703);
      this.field_15853.method_7034(this.field_11706);
      this.field_15851.method_7034(this.field_11701);
      this.field_15855.method_7034(this.field_11705);
      this.field_15846.method_7034(this.field_11704);
      this.field_11695.method_7034(this.field_11696);
   }

   public void method_3078(T var1, float var2) {
      if (this.field_33202 > 0.0F && var1 instanceof class_2599 && ((class_2599)var1).method_31993() == class_9316.field_47570) {
         class_3191.method_14684(this.field_11705, this.field_11701, var1, this.field_33202, var2);
      } else {
         super.method_10739((T)var1, var2);
      }
   }

   private void method_3079(T var1) {
      if (!var1.method_26849()) {
         this.field_11705.field_8191 = -1.8F;
      } else {
         this.field_11701.field_8191 = -1.8F;
      }
   }
}
