package mapped;

import com.google.common.collect.ImmutableList;

public class Class2804<T extends Entity> extends Class2803<T> {
   private static String[] field17456;
   private final Class7219 field17457 = new Class7219(this, 0, 0);
   private final Class7219 field17458;
   private final Class7219 field17459;

   public Class2804() {
      this.field17457.method22679(-5.0F, 22.0F, -5.0F);
      this.field17457.method22673(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F);
      this.field17458 = new Class7219(this, 40, 0);
      this.field17458.method22679(1.5F, 22.0F, -4.0F);
      this.field17458.method22673(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      this.field17459 = new Class7219(this, 40, 0);
      this.field17459.method22679(-1.5F, 22.0F, 4.0F);
      this.field17459.method22673(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var2 * 2.0F;
      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 = 1.0F - var9 * var9 * var9;
      this.field17458.field31037 = (float) Math.PI - var9 * 0.35F * (float) Math.PI;
      this.field17459.field31037 = (float) Math.PI + var9 * 0.35F * (float) Math.PI;
      this.field17459.field31036 = (float) Math.PI;
      float var10 = (var2 + Class9679.method37763(var2 * 2.7F)) * 0.6F * 12.0F;
      this.field17458.field31033 = 24.0F - var10;
      this.field17459.field31033 = this.field17458.field31033;
      this.field17457.field31033 = this.field17458.field31033;
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17457, this.field17458, this.field17459);
   }
}
