package mapped;

import com.google.common.collect.ImmutableList;

public class Class2809<T extends Entity> extends Class2808<T> {
   private static String[] field17480;
   private final Class7219 field17481;
   private final Class7219 field17482;
   private final Class7219 field17483;
   private final Class7219 field17484;
   private final Class7219 field17485;

   public Class2809(float var1) {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var4 = 22;
      this.field17481 = new Class7219(this, 0, 0);
      this.field17481.method22675(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, var1);
      this.field17481.method22679(0.0F, 22.0F, 0.0F);
      this.field17482 = new Class7219(this, 22, -6);
      this.field17482.method22675(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, var1);
      this.field17482.method22679(0.0F, 22.0F, 3.0F);
      this.field17483 = new Class7219(this, 2, 16);
      this.field17483.method22675(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17483.method22679(-1.0F, 22.5F, 0.0F);
      this.field17483.field31036 = (float) (Math.PI / 4);
      this.field17484 = new Class7219(this, 2, 12);
      this.field17484.method22675(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17484.method22679(1.0F, 22.5F, 0.0F);
      this.field17484.field31036 = (float) (-Math.PI / 4);
      this.field17485 = new Class7219(this, 10, -5);
      this.field17485.method22675(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, var1);
      this.field17485.method22679(0.0F, 20.5F, -3.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17481, this.field17482, this.field17483, this.field17484, this.field17485);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.method3250()) {
         var9 = 1.5F;
      }

      this.field17482.field31036 = -var9 * 0.45F * MathHelper.method37763(0.6F * var4);
   }
}
