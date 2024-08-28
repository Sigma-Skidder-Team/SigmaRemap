package mapped;

import com.google.common.collect.ImmutableList;

public class Class2888<T extends Class1070> extends Class2803<T> {
   private static String[] field17891;
   private final Class7219 field17892;
   private final Class7219 field17893;
   private final Class7219 field17894;
   private final Class7219 field17895;
   private final Class7219 field17896;
   private final Class7219 field17897;
   private final Class7219 field17898;
   private final Class7219 field17899;
   private final Class7219 field17900;

   public Class2888() {
      this.field17604 = 64;
      this.field17605 = 128;
      this.field17892 = new Class7219(this, 0, 32);
      this.field17892.method22679(-4.0F, 8.0F, 0.0F);
      this.field17892.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.field17893 = new Class7219(this, 0, 55);
      this.field17893.method22679(4.0F, 8.0F, 0.0F);
      this.field17893.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.field17894 = new Class7219(this, 0, 0);
      this.field17894.method22679(0.0F, 1.0F, 0.0F);
      this.field17894.method22675(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F);
      this.field17895 = new Class7219(this, 16, 65);
      this.field17895.method22679(-8.0F, 4.0F, -8.0F);
      this.field17895.method22677(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method11205(this.field17895, 0.0F, 0.0F, -1.2217305F);
      this.field17896 = new Class7219(this, 16, 49);
      this.field17896.method22679(-8.0F, -1.0F, -8.0F);
      this.field17896.method22677(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method11205(this.field17896, 0.0F, 0.0F, -1.134464F);
      this.field17897 = new Class7219(this, 16, 33);
      this.field17897.method22679(-8.0F, -5.0F, -8.0F);
      this.field17897.method22677(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method11205(this.field17897, 0.0F, 0.0F, -0.87266463F);
      this.field17898 = new Class7219(this, 16, 33);
      this.field17898.method22679(8.0F, -6.0F, -8.0F);
      this.field17898.method22675(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method11205(this.field17898, 0.0F, 0.0F, 0.87266463F);
      this.field17899 = new Class7219(this, 16, 49);
      this.field17899.method22679(8.0F, -2.0F, -8.0F);
      this.field17899.method22675(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method11205(this.field17899, 0.0F, 0.0F, 1.134464F);
      this.field17900 = new Class7219(this, 16, 65);
      this.field17900.method22679(8.0F, 3.0F, -8.0F);
      this.field17900.method22675(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method11205(this.field17900, 0.0F, 0.0F, 1.2217305F);
      this.field17894.method22670(this.field17895);
      this.field17894.method22670(this.field17896);
      this.field17894.method22670(this.field17897);
      this.field17894.method22670(this.field17898);
      this.field17894.method22670(this.field17899);
      this.field17894.method22670(this.field17900);
   }

   public void method10998(Class1070 var1, float var2, float var3, float var4, float var5, float var6) {
      var3 = Math.min(0.25F, var3);
      if (var1.method3408().size() > 0) {
         this.field17894.field31035 = 0.0F;
         this.field17894.field31036 = 0.0F;
      } else {
         this.field17894.field31035 = var6 * (float) (Math.PI / 180.0);
         this.field17894.field31036 = var5 * (float) (Math.PI / 180.0);
      }

      float var9 = 1.5F;
      this.field17894.field31037 = 0.1F * MathHelper.method37763(var2 * 1.5F) * 4.0F * var3;
      this.field17894.field31033 = 2.0F;
      this.field17894.field31033 = this.field17894.field31033 - 2.0F * MathHelper.method37764(var2 * 1.5F) * 2.0F * var3;
      this.field17893.field31035 = MathHelper.method37763(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.field17892.field31035 = MathHelper.method37763(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.field17893.field31037 = (float) (Math.PI / 18) * MathHelper.method37764(var2 * 1.5F * 0.5F) * var3;
      this.field17892.field31037 = (float) (Math.PI / 18) * MathHelper.method37764(var2 * 1.5F * 0.5F + (float) Math.PI) * var3;
      this.field17893.field31033 = 8.0F + 2.0F * MathHelper.method37763(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.field17892.field31033 = 8.0F + 2.0F * MathHelper.method37763(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.field17895.field31037 = -1.2217305F;
      this.field17896.field31037 = -1.134464F;
      this.field17897.field31037 = -0.87266463F;
      this.field17898.field31037 = 0.87266463F;
      this.field17899.field31037 = 1.134464F;
      this.field17900.field31037 = 1.2217305F;
      float var10 = MathHelper.method37764(var2 * 1.5F + (float) Math.PI) * var3;
      this.field17895.field31037 += var10 * 1.3F;
      this.field17896.field31037 += var10 * 1.2F;
      this.field17897.field31037 += var10 * 0.6F;
      this.field17898.field31037 += var10 * 0.6F;
      this.field17899.field31037 += var10 * 1.2F;
      this.field17900.field31037 += var10 * 1.3F;
      float var11 = 1.0F;
      float var12 = 1.0F;
      this.field17895.field31037 = this.field17895.field31037 + 0.05F * MathHelper.method37763(var4 * 1.0F * -0.4F);
      this.field17896.field31037 = this.field17896.field31037 + 0.1F * MathHelper.method37763(var4 * 1.0F * 0.2F);
      this.field17897.field31037 = this.field17897.field31037 + 0.1F * MathHelper.method37763(var4 * 1.0F * 0.4F);
      this.field17898.field31037 = this.field17898.field31037 + 0.1F * MathHelper.method37763(var4 * 1.0F * 0.4F);
      this.field17899.field31037 = this.field17899.field31037 + 0.1F * MathHelper.method37763(var4 * 1.0F * 0.2F);
      this.field17900.field31037 = this.field17900.field31037 + 0.05F * MathHelper.method37763(var4 * 1.0F * -0.4F);
   }

   public void method11205(Class7219 var1, float var2, float var3, float var4) {
      var1.field31035 = var2;
      var1.field31036 = var3;
      var1.field31037 = var4;
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17894, this.field17893, this.field17892);
   }
}
