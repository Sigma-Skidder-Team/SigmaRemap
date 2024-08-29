package mapped;

import com.google.common.collect.ImmutableList;

public class Class2856<T extends AbstractHorseEntity> extends Class2855<T> {
   private static String[] field17691;
   public final Class7219 field17692;
   public final Class7219 field17693;
   private final Class7219 field17694;
   private final Class7219 field17695;
   private final Class7219 field17696;
   private final Class7219 field17697;
   private final Class7219 field17698;
   private final Class7219 field17699;
   private final Class7219 field17700;
   private final Class7219 field17701;
   private final Class7219 field17702;
   private final Class7219[] field17703;
   private final Class7219[] field17704;

   public Class2856(float var1) {
      super(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F);
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17692 = new Class7219(this, 0, 32);
      this.field17692.method22675(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, 0.05F);
      this.field17692.method22679(0.0F, 11.0F, 5.0F);
      this.field17693 = new Class7219(this, 0, 35);
      this.field17693.method22673(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F);
      this.field17693.field31035 = (float) (Math.PI / 6);
      Class7219 var4 = new Class7219(this, 0, 13);
      var4.method22675(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, var1);
      Class7219 var5 = new Class7219(this, 56, 36);
      var5.method22675(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, var1);
      Class7219 var6 = new Class7219(this, 0, 25);
      var6.method22675(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, var1);
      this.field17693.method22670(var4);
      this.field17693.method22670(var5);
      this.field17693.method22670(var6);
      this.method11189(this.field17693);
      this.field17694 = new Class7219(this, 48, 21);
      this.field17694.field31038 = true;
      this.field17694.method22675(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1);
      this.field17694.method22679(4.0F, 14.0F, 7.0F);
      this.field17695 = new Class7219(this, 48, 21);
      this.field17695.method22675(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1);
      this.field17695.method22679(-4.0F, 14.0F, 7.0F);
      this.field17696 = new Class7219(this, 48, 21);
      this.field17696.field31038 = true;
      this.field17696.method22675(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1);
      this.field17696.method22679(4.0F, 6.0F, -12.0F);
      this.field17697 = new Class7219(this, 48, 21);
      this.field17697.method22675(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1);
      this.field17697.method22679(-4.0F, 6.0F, -12.0F);
      float var7 = 5.5F;
      this.field17698 = new Class7219(this, 48, 21);
      this.field17698.field31038 = true;
      this.field17698.method22676(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17698.method22679(4.0F, 14.0F, 7.0F);
      this.field17699 = new Class7219(this, 48, 21);
      this.field17699.method22676(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17699.method22679(-4.0F, 14.0F, 7.0F);
      this.field17700 = new Class7219(this, 48, 21);
      this.field17700.field31038 = true;
      this.field17700.method22676(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17700.method22679(4.0F, 6.0F, -12.0F);
      this.field17701 = new Class7219(this, 48, 21);
      this.field17701.method22676(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17701.method22679(-4.0F, 6.0F, -12.0F);
      this.field17702 = new Class7219(this, 42, 36);
      this.field17702.method22675(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, var1);
      this.field17702.method22679(0.0F, -5.0F, 2.0F);
      this.field17702.field31035 = (float) (Math.PI / 6);
      this.field17692.method22670(this.field17702);
      Class7219 var8 = new Class7219(this, 26, 0);
      var8.method22675(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, 0.5F);
      this.field17692.method22670(var8);
      Class7219 var9 = new Class7219(this, 29, 5);
      var9.method22675(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, var1);
      this.field17693.method22670(var9);
      Class7219 var10 = new Class7219(this, 29, 5);
      var10.method22675(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, var1);
      this.field17693.method22670(var10);
      Class7219 var11 = new Class7219(this, 32, 2);
      var11.method22675(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, var1);
      var11.field31035 = (float) (-Math.PI / 6);
      this.field17693.method22670(var11);
      Class7219 var12 = new Class7219(this, 32, 2);
      var12.method22675(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, var1);
      var12.field31035 = (float) (-Math.PI / 6);
      this.field17693.method22670(var12);
      Class7219 var13 = new Class7219(this, 1, 1);
      var13.method22675(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, 0.2F);
      this.field17693.method22670(var13);
      Class7219 var14 = new Class7219(this, 19, 0);
      var14.method22675(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.2F);
      this.field17693.method22670(var14);
      this.field17703 = new Class7219[]{var8, var9, var10, var13, var14};
      this.field17704 = new Class7219[]{var11, var12};
   }

   public void method11189(Class7219 var1) {
      Class7219 var4 = new Class7219(this, 19, 16);
      var4.method22675(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      Class7219 var5 = new Class7219(this, 19, 16);
      var5.method22675(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      var1.method22670(var4);
      var1.method22670(var5);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = var1.method4943();
      boolean var10 = var1.method3329();

      for (Class7219 var14 : this.field17703) {
         var14.field31039 = var9;
      }

      for (Class7219 var18 : this.field17704) {
         var18.field31039 = var10 && var9;
      }

      this.field17692.field31033 = 11.0F;
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17693);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(
         this.field17692,
         this.field17694,
         this.field17695,
         this.field17696,
         this.field17697,
         this.field17698,
         this.field17699,
         this.field17700,
         this.field17701
      );
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      super.method10997(var1, var2, var3, var4);
      float var7 = MathHelper.method37828(var1.field4966, var1.field4965, var4);
      float var8 = MathHelper.method37828(var1.field4968, var1.field4967, var4);
      float var9 = MathHelper.method37821(var4, var1.field5034, var1.field5032);
      float var10 = var8 - var7;
      float var11 = var9 * (float) (Math.PI / 180.0);
      if (var10 > 20.0F) {
         var10 = 20.0F;
      }

      if (var10 < -20.0F) {
         var10 = -20.0F;
      }

      if (var3 > 0.2F) {
         var11 += MathHelper.cos(var2 * 0.4F) * 0.15F * var3;
      }

      float var12 = var1.method4963(var4);
      float var13 = var1.method4964(var4);
      float var14 = 1.0F - var13;
      float var15 = var1.method4965(var4);
      boolean var16 = var1.field5887 != 0;
      float var17 = (float)var1.field5055 + var4;
      this.field17693.field31033 = 4.0F;
      this.field17693.field31034 = -12.0F;
      this.field17692.field31035 = 0.0F;
      this.field17693.field31035 = (float) (Math.PI / 6) + var11;
      this.field17693.field31036 = var10 * (float) (Math.PI / 180.0);
      float var18 = !var1.method3250() ? 1.0F : 0.2F;
      float var19 = MathHelper.cos(var18 * var2 * 0.6662F + (float) Math.PI);
      float var20 = var19 * 0.8F * var3;
      float var21 = (1.0F - Math.max(var13, var12)) * ((float) (Math.PI / 6) + var11 + var15 * MathHelper.sin(var17) * 0.05F);
      this.field17693.field31035 = var13 * ((float) (Math.PI / 12) + var11) + var12 * (2.1816616F + MathHelper.sin(var17) * 0.05F) + var21;
      this.field17693.field31036 = var13 * var10 * (float) (Math.PI / 180.0) + (1.0F - Math.max(var13, var12)) * this.field17693.field31036;
      this.field17693.field31033 = var13 * -4.0F + var12 * 11.0F + (1.0F - Math.max(var13, var12)) * this.field17693.field31033;
      this.field17693.field31034 = var13 * -4.0F + var12 * -12.0F + (1.0F - Math.max(var13, var12)) * this.field17693.field31034;
      this.field17692.field31035 = var13 * (float) (-Math.PI / 4) + var14 * this.field17692.field31035;
      float var22 = (float) (Math.PI / 12) * var13;
      float var23 = MathHelper.cos(var17 * 0.6F + (float) Math.PI);
      this.field17696.field31033 = 2.0F * var13 + 14.0F * var14;
      this.field17696.field31034 = -6.0F * var13 - 10.0F * var14;
      this.field17697.field31033 = this.field17696.field31033;
      this.field17697.field31034 = this.field17696.field31034;
      float var24 = ((float) (-Math.PI / 3) + var23) * var13 + var20 * var14;
      float var25 = ((float) (-Math.PI / 3) - var23) * var13 - var20 * var14;
      this.field17694.field31035 = var22 - var19 * 0.5F * var3 * var14;
      this.field17695.field31035 = var22 + var19 * 0.5F * var3 * var14;
      this.field17696.field31035 = var24;
      this.field17697.field31035 = var25;
      this.field17702.field31035 = (float) (Math.PI / 6) + var3 * 0.75F;
      this.field17702.field31033 = -5.0F + var3;
      this.field17702.field31034 = 2.0F + var3 * 2.0F;
      if (!var16) {
         this.field17702.field31036 = 0.0F;
      } else {
         this.field17702.field31036 = MathHelper.cos(var17 * 0.7F);
      }

      this.field17698.field31033 = this.field17694.field31033;
      this.field17698.field31034 = this.field17694.field31034;
      this.field17698.field31035 = this.field17694.field31035;
      this.field17699.field31033 = this.field17695.field31033;
      this.field17699.field31034 = this.field17695.field31034;
      this.field17699.field31035 = this.field17695.field31035;
      this.field17700.field31033 = this.field17696.field31033;
      this.field17700.field31034 = this.field17696.field31034;
      this.field17700.field31035 = this.field17696.field31035;
      this.field17701.field31033 = this.field17697.field31033;
      this.field17701.field31034 = this.field17697.field31034;
      this.field17701.field31035 = this.field17697.field31035;
      boolean var26 = var1.method3005();
      this.field17694.field31039 = !var26;
      this.field17695.field31039 = !var26;
      this.field17696.field31039 = !var26;
      this.field17697.field31039 = !var26;
      this.field17698.field31039 = var26;
      this.field17699.field31039 = var26;
      this.field17700.field31039 = var26;
      this.field17701.field31039 = var26;
      this.field17692.field31033 = !var26 ? 0.0F : 10.8F;
   }
}
