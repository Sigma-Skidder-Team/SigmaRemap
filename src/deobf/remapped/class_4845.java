package remapped;

public class class_4845<T extends class_8145> extends class_5103<T> {
   private static String[] field_24173;
   private boolean field_24172;
   private final class_1549 field_24174 = new class_1549(this).method_7033(64, 128);

   public class_4845(float var1) {
      super(var1, 64, 128);
      this.field_24174.method_7046(0.0F, -2.0F, 0.0F);
      this.field_24174.method_7037(0, 0).method_7049(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, -0.25F);
      this.field_26330.method_7043(this.field_24174);
      this.field_26323 = new class_1549(this).method_7033(64, 128);
      this.field_26323.method_7046(0.0F, 0.0F, 0.0F);
      this.field_26323.method_7037(0, 0).method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.field_26328 = new class_1549(this).method_7033(64, 128);
      this.field_26328.method_7046(-5.0F, -10.03125F, -5.0F);
      this.field_26328.method_7037(0, 64).method_7048(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F);
      this.field_26323.method_7043(this.field_26328);
      this.field_26323.method_7043(this.field_26330);
      class_1549 var4 = new class_1549(this).method_7033(64, 128);
      var4.method_7046(1.75F, -4.0F, 2.0F);
      var4.method_7037(0, 76).method_7048(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F);
      var4.field_8191 = -0.05235988F;
      var4.field_8185 = 0.02617994F;
      this.field_26328.method_7043(var4);
      class_1549 var5 = new class_1549(this).method_7033(64, 128);
      var5.method_7046(1.75F, -4.0F, 2.0F);
      var5.method_7037(0, 87).method_7048(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F);
      var5.field_8191 = -0.10471976F;
      var5.field_8185 = 0.05235988F;
      var4.method_7043(var5);
      class_1549 var6 = new class_1549(this).method_7033(64, 128);
      var6.method_7046(1.75F, -2.0F, 2.0F);
      var6.method_7037(0, 95).method_7049(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.25F);
      var6.field_8191 = (float) (-Math.PI / 15);
      var6.field_8185 = 0.10471976F;
      var5.method_7043(var6);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_29700((T)var1, var2, var3, var4, var5, var6);
      this.field_26330.method_7046(0.0F, -2.0F, 0.0F);
      float var9 = 0.01F * (float)(var1.method_37145() % 10);
      this.field_26330.field_8191 = class_9299.method_42818((float)var1.field_41697 * var9) * 4.5F * (float) (Math.PI / 180.0);
      this.field_26330.field_8190 = 0.0F;
      this.field_26330.field_8185 = class_9299.method_42840((float)var1.field_41697 * var9) * 2.5F * (float) (Math.PI / 180.0);
      if (this.field_24172) {
         this.field_26330.method_7046(0.0F, 1.0F, -1.5F);
         this.field_26330.field_8191 = -0.9F;
      }
   }

   public class_1549 method_22283() {
      return this.field_26330;
   }

   public void method_22284(boolean var1) {
      this.field_24172 = var1;
   }
}
