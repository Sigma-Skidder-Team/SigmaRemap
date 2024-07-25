package remapped;

public class class_8293 extends class_8715 {
   private static String[] field_42498;

   private class_8293(class_174 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.field_49476 = 4;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36847;
   }

   @Override
   public void method_44951(class_7907 var1, Camera var2, float var3) {
      this.method_44956(0.6F - ((float)this.field_49475 + var3 - 1.0F) * 0.25F * 0.5F);
      super.method_44951(var1, var2, var3);
   }

   @Override
   public float method_9766(float var1) {
      return 7.1F * class_9299.method_42818(((float)this.field_49475 + var1 - 1.0F) * 0.25F * (float) Math.PI);
   }
}
