package remapped;

public class class_8674 extends class_7260<class_5555> {
   private static final Identifier field_44528 = new Identifier("textures/entity/end_gateway_beam.png");

   public class_8674(class_3569 var1) {
      super(var1);
   }

   public void method_39850(class_5555 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      if (var1.method_25241() || var1.method_25249()) {
         float var9 = !var1.method_25241() ? var1.method_25244(var2) : var1.method_25245(var2);
         double var10 = !var1.method_25241() ? 50.0 : 256.0;
         var9 = class_9299.method_42818(var9 * (float) Math.PI);
         int var12 = class_9299.method_42847((double)var9 * var10);
         float[] var13 = !var1.method_25241() ? class_9077.field_46499.method_41792() : class_9077.field_46480.method_41792();
         long var14 = var1.method_17402().method_29546();
         class_1227.method_5466(var3, var4, field_44528, var2, var9, var14, 0, var12, var13, 0.15F, 0.175F);
         class_1227.method_5466(var3, var4, field_44528, var2, var9, var14, 0, -var12, var13, 0.15F, 0.175F);
      }

      super.method_33179(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public int method_33182(double var1) {
      return super.method_33182(var1) + 1;
   }

   @Override
   public float method_33180() {
      return 1.0F;
   }
}
