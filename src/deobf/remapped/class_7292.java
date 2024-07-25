package remapped;

public class class_7292 extends class_8715 {
   private static String[] field_37296;
   private final float field_37295;
   private final float field_37297;

   private class_7292(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6098 var14) {
      this(var1, var2, var4, var6, var14);
      this.field_49481 *= 0.1F;
      this.field_49486 *= 0.1F;
      this.field_49471 *= 0.1F;
      this.field_49481 += var8;
      this.field_49486 += var10;
      this.field_49471 += var12;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36845;
   }

   public class_7292(class_174 var1, double var2, double var4, double var6, class_6098 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.method_40055(class_1893.method_8510().method_8511().method_40278(var8, var1, (class_5834)null).method_33587());
      this.field_49477 = 1.0F;
      this.field_10503 /= 2.0F;
      this.field_37295 = this.field_49466.nextFloat() * 3.0F;
      this.field_37297 = this.field_49466.nextFloat() * 3.0F;
   }

   @Override
   public float method_9765() {
      return this.field_44681.method_23602((double)((this.field_37295 + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   public float method_9767() {
      return this.field_44681.method_23602((double)(this.field_37295 / 4.0F * 16.0F));
   }

   @Override
   public float method_9768() {
      return this.field_44681.method_23639((double)(this.field_37297 / 4.0F * 16.0F));
   }

   @Override
   public float method_9769() {
      return this.field_44681.method_23639((double)((this.field_37297 + 1.0F) / 4.0F * 16.0F));
   }
}
