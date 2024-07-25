package remapped;

public abstract class class_5127 extends class_8715 {
   public class_5127(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_49481 = this.field_49481 * 0.01F + var8;
      this.field_49486 = this.field_49486 * 0.01F + var10;
      this.field_49471 = this.field_49471 * 0.01F + var12;
      this.field_49462 = this.field_49462 + (double)((this.field_49466.nextFloat() - this.field_49466.nextFloat()) * 0.05F);
      this.field_49473 = this.field_49473 + (double)((this.field_49466.nextFloat() - this.field_49466.nextFloat()) * 0.05F);
      this.field_49465 = this.field_49465 + (double)((this.field_49466.nextFloat() - this.field_49466.nextFloat()) * 0.05F);
      this.field_49476 = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
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
