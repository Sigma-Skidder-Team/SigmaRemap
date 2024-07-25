package remapped;

public class class_1156 extends class_8715 {
   private static String[] field_6568;
   private final class_6571 field_6566;
   private final double field_6567;

   public class_1156(
      class_174 var1,
      double var2,
      double var4,
      double var6,
      float var8,
      float var9,
      float var10,
      double var11,
      double var13,
      double var15,
      float var17,
      class_6571 var18,
      float var19,
      int var20,
      double var21,
      boolean var23
   ) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_6567 = var21;
      this.field_6566 = var18;
      this.field_49481 *= (double)var8;
      this.field_49486 *= (double)var9;
      this.field_49471 *= (double)var10;
      this.field_49481 += var11;
      this.field_49486 += var13;
      this.field_49471 += var15;
      float var26 = var1.field_33033.nextFloat() * var19;
      this.field_49485 = var26;
      this.field_49468 = var26;
      this.field_49487 = var26;
      this.field_10503 *= 0.75F * var17;
      this.field_49476 = (int)((double)var20 / ((double)var1.field_33033.nextFloat() * 0.8 + 0.2));
      this.field_49476 = (int)((float)this.field_49476 * var17);
      this.field_49476 = Math.max(this.field_49476, 1);
      this.method_40054(var18);
      this.field_49474 = var23;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public float method_9766(float var1) {
      return this.field_10503 * class_9299.method_42828(((float)this.field_49475 + var1) / (float)this.field_49476 * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_6566);
         this.field_49486 = this.field_49486 + this.field_6567;
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
