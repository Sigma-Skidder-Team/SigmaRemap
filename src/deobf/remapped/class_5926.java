package remapped;

public class class_5926 extends class_8715 {
   private static String[] field_30060;
   private final class_6571 field_30059;

   public class_5926(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6);
      this.field_30059 = var14;
      this.field_49481 = var8 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.field_49486 = var10 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.field_49471 = var12 + (Math.random() * 2.0 - 1.0) * 0.05F;
      float var17 = this.field_49466.nextFloat() * 0.3F + 0.7F;
      this.field_49485 = var17;
      this.field_49468 = var17;
      this.field_49487 = var17;
      this.field_10503 = 0.1F * (this.field_49466.nextFloat() * this.field_49466.nextFloat() * 6.0F + 1.0F);
      this.field_49476 = (int)(16.0 / ((double)this.field_49466.nextFloat() * 0.8 + 0.2)) + 2;
      this.method_40054(var14);
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_30059);
         this.field_49486 += 0.004;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.9F;
         this.field_49486 *= 0.9F;
         this.field_49471 *= 0.9F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }
}
