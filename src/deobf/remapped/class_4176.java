package remapped;

import java.util.Random;

public class class_4176 extends class_8715 {
   private static String[] field_20328;
   private static final Random field_20326 = new Random();
   private final class_6571 field_20327;

   private class_4176(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6, 0.5 - field_20326.nextDouble(), var10, 0.5 - field_20326.nextDouble());
      this.field_20327 = var14;
      this.field_49486 *= 0.2F;
      if (var8 == 0.0 && var12 == 0.0) {
         this.field_49481 *= 0.1F;
         this.field_49471 *= 0.1F;
      }

      this.field_10503 *= 0.75F;
      this.field_49476 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.field_49474 = false;
      this.method_40054(var14);
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36847;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_20327);
         this.field_49486 += 0.004;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         if (this.field_49473 == this.field_49480) {
            this.field_49481 *= 1.1;
            this.field_49471 *= 1.1;
         }

         this.field_49481 *= 0.96F;
         this.field_49486 *= 0.96F;
         this.field_49471 *= 0.96F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }
}
