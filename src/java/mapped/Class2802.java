package mapped;

import com.google.common.collect.ImmutableList;

public class Class2802<T extends Entity> extends Class2803<T> implements Class2824, Class2801 {
   private static String[] field17446;
   public Class7219 field17447;
   public Class7219 field17448;
   public final Class7219 field17449;
   public final Class7219 field17450;
   public final Class7219 field17451;
   public final Class7219 field17452;
   public final Class7219 field17453;
   public final Class7219 field17454;
   public final Class7219 field17455;

   public Class2802(float var1) {
      this(var1, 64, 64);
   }

   public Class2802(float var1, int var2, int var3) {
      float var6 = 0.5F;
      this.field17447 = new Class7219(this).method22684(var2, var3);
      this.field17447.method22679(0.0F, 0.0F, 0.0F);
      this.field17447.method22671(0, 0).method22675(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.field17448 = new Class7219(this).method22684(var2, var3);
      this.field17448.method22679(0.0F, 0.0F, 0.0F);
      this.field17448.method22671(32, 0).method22675(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
      this.field17447.method22670(this.field17448);
      this.field17449 = new Class7219(this).method22684(var2, var3);
      this.field17449.method22679(0.0F, 0.0F, 0.0F);
      this.field17449.method22671(30, 47).method22675(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
      this.field17449.field31035 = (float) (-Math.PI / 2);
      this.field17448.method22670(this.field17449);
      this.field17455 = new Class7219(this).method22684(var2, var3);
      this.field17455.method22679(0.0F, -2.0F, 0.0F);
      this.field17455.method22671(24, 0).method22675(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.field17447.method22670(this.field17455);
      this.field17450 = new Class7219(this).method22684(var2, var3);
      this.field17450.method22679(0.0F, 0.0F, 0.0F);
      this.field17450.method22671(16, 20).method22675(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.field17451 = new Class7219(this).method22684(var2, var3);
      this.field17451.method22679(0.0F, 0.0F, 0.0F);
      this.field17451.method22671(0, 38).method22675(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.field17450.method22670(this.field17451);
      this.field17452 = new Class7219(this).method22684(var2, var3);
      this.field17452.method22679(0.0F, 2.0F, 0.0F);
      this.field17452.method22671(44, 22).method22675(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.field17452.method22671(44, 22).method22677(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1, true);
      this.field17452.method22671(40, 38).method22675(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.field17453 = new Class7219(this, 0, 22).method22684(var2, var3);
      this.field17453.method22679(-2.0F, 12.0F, 0.0F);
      this.field17453.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17454 = new Class7219(this, 0, 22).method22684(var2, var3);
      this.field17454.field31038 = true;
      this.field17454.method22679(2.0F, 12.0F, 0.0F);
      this.field17454.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17447, this.field17450, this.field17453, this.field17454, this.field17452);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = false;
      if (var1 instanceof Class1043) {
         var9 = ((Class1043)var1).method4738() > 0;
      }

      this.field17447.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17447.field31035 = var6 * (float) (Math.PI / 180.0);
      if (!var9) {
         this.field17447.field31037 = 0.0F;
      } else {
         this.field17447.field31037 = 0.3F * Class9679.method37763(0.45F * var4);
         this.field17447.field31035 = 0.4F;
      }

      this.field17452.field31033 = 3.0F;
      this.field17452.field31034 = -1.0F;
      this.field17452.field31035 = -0.75F;
      this.field17453.field31035 = Class9679.method37764(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
      this.field17454.field31035 = Class9679.method37764(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
      this.field17453.field31036 = 0.0F;
      this.field17454.field31036 = 0.0F;
   }

   @Override
   public Class7219 method11012() {
      return this.field17447;
   }

   @Override
   public void method11014(boolean var1) {
      this.field17447.field31039 = var1;
      this.field17448.field31039 = var1;
      this.field17449.field31039 = var1;
   }
}
