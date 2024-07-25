package remapped;

public class class_4166 extends class_8715 {
   private static String[] field_20268;
   private final class_6571 field_20267;

   private class_4166(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_20267 = var14;
      this.field_49481 *= 0.3F;
      this.field_49486 = Math.random() * 0.2F + 0.1F;
      this.field_49471 *= 0.3F;
      this.method_44955(0.01F, 0.01F);
      this.field_49476 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.method_40054(var14);
      this.field_49477 = 0.0F;
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
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
      int var3 = 60 - this.field_49476;
      if (this.field_49476-- > 0) {
         this.field_49486 = this.field_49486 - (double)this.field_49477;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.98F;
         this.field_49486 *= 0.98F;
         this.field_49471 *= 0.98F;
         float var4 = (float)var3 * 0.001F;
         this.method_44955(var4, var4);
         this.method_40055(this.field_20267.method_30022(var3 % 4, 4));
      } else {
         this.method_44948();
      }
   }
}
