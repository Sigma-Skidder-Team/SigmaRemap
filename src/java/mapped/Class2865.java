package mapped;

import com.google.common.collect.ImmutableList;

public class Class2865<T extends Class1006 & Class1092> extends Class2855<T> {
   private static String[] field17761;
   private final Class7219 field17762;
   private final Class7219 field17763;
   private final Class7219 field17764;
   private final Class7219 field17765;
   private final Class7219 field17766;
   private final Class7219 field17767;
   private final Class7219 field17768;
   private final Class7219 field17769;
   private final Class7219 field17770;

   public Class2865() {
      super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
      this.field17604 = 128;
      this.field17605 = 64;
      this.field17765 = new Class7219(this);
      this.field17765.method22679(0.0F, 7.0F, 0.0F);
      this.field17765.method22671(1, 1).method22673(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F);
      this.field17770 = new Class7219(this);
      this.field17770.method22679(0.0F, -14.0F, -5.0F);
      this.field17770.method22671(90, 33).method22675(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, 0.001F);
      this.field17765.method22670(this.field17770);
      this.field17762 = new Class7219(this);
      this.field17762.method22679(0.0F, 2.0F, -12.0F);
      this.field17762.method22671(61, 1).method22673(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F);
      this.field17763 = new Class7219(this);
      this.field17763.method22679(-6.0F, -2.0F, -3.0F);
      this.field17763.method22671(1, 1).method22673(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.field17763.field31037 = (float) (-Math.PI * 2.0 / 9.0);
      this.field17762.method22670(this.field17763);
      this.field17764 = new Class7219(this);
      this.field17764.method22679(6.0F, -2.0F, -3.0F);
      this.field17764.method22671(1, 6).method22673(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.field17764.field31037 = (float) (Math.PI * 2.0 / 9.0);
      this.field17762.method22670(this.field17764);
      Class7219 var3 = new Class7219(this);
      var3.method22679(-7.0F, 2.0F, -12.0F);
      var3.method22671(10, 13).method22673(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.field17762.method22670(var3);
      Class7219 var4 = new Class7219(this);
      var4.method22679(7.0F, 2.0F, -12.0F);
      var4.method22671(1, 13).method22673(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.field17762.method22670(var4);
      this.field17762.field31035 = 0.87266463F;
      byte var5 = 14;
      byte var6 = 11;
      this.field17766 = new Class7219(this);
      this.field17766.method22679(-4.0F, 10.0F, -8.5F);
      this.field17766.method22671(66, 42).method22673(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.field17767 = new Class7219(this);
      this.field17767.method22679(4.0F, 10.0F, -8.5F);
      this.field17767.method22671(41, 42).method22673(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.field17768 = new Class7219(this);
      this.field17768.method22679(-5.0F, 13.0F, 10.0F);
      this.field17768.method22671(21, 45).method22673(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
      this.field17769 = new Class7219(this);
      this.field17769.method22679(5.0F, 13.0F, 10.0F);
      this.field17769.method22671(0, 45).method22673(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17762);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17765, this.field17766, this.field17767, this.field17768, this.field17769);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17763.field31037 = (float) (-Math.PI * 2.0 / 9.0) - var3 * MathHelper.sin(var2);
      this.field17764.field31037 = (float) (Math.PI * 2.0 / 9.0) + var3 * MathHelper.sin(var2);
      this.field17762.field31036 = var5 * (float) (Math.PI / 180.0);
      int var9 = ((Class1092)var1).method5082();
      float var10 = 1.0F - (float) MathHelper.method37772(10 - 2 * var9) / 10.0F;
      this.field17762.field31035 = MathHelper.method37821(var10, 0.87266463F, (float) (-Math.PI / 9));
      if (!var1.method3005()) {
         this.field17762.field31033 = 2.0F;
         this.field17770.field31034 = -7.0F;
      } else {
         this.field17762.field31033 = MathHelper.method37821(var10, 2.0F, 5.0F);
         this.field17770.field31034 = -3.0F;
      }

      float var11 = 1.2F;
      this.field17766.field31035 = MathHelper.cos(var2) * 1.2F * var3;
      this.field17767.field31035 = MathHelper.cos(var2 + (float) Math.PI) * 1.2F * var3;
      this.field17768.field31035 = this.field17767.field31035;
      this.field17769.field31035 = this.field17766.field31035;
   }
}
