package remapped;

public class class_4458 extends class_8715 {
   private static String[] field_21719;
   private final class_6571 field_21718;

   private class_4458(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6);
      this.field_21718 = var14;
      this.field_49476 = 4;
      this.field_49477 = 0.008F;
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.method_40054(var14);
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.field_49486 = this.field_49486 - (double)this.field_49477;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.method_40054(this.field_21718);
      } else {
         this.method_44948();
      }
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }
}
