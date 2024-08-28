package mapped;

import com.google.common.collect.ImmutableList;

public class Class2874<T extends Entity> extends Class2855<T> {
   private static String[] field17788;
   private final Class7219 field17789;
   private final Class7219 field17790;
   private final Class7219 field17791;
   private final Class7219 field17792;
   private final Class7219 field17793;
   private final Class7219 field17794;
   private final Class7219 field17795;
   private final Class7219 field17796;

   public Class2874() {
      byte var3 = 16;
      this.field17789 = new Class7219(this, 0, 0);
      this.field17789.method22675(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F);
      this.field17789.method22679(0.0F, 15.0F, -4.0F);
      this.field17795 = new Class7219(this, 14, 0);
      this.field17795.method22675(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F);
      this.field17795.method22679(0.0F, 15.0F, -4.0F);
      this.field17796 = new Class7219(this, 14, 4);
      this.field17796.method22675(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F);
      this.field17796.method22679(0.0F, 15.0F, -4.0F);
      this.field17790 = new Class7219(this, 0, 9);
      this.field17790.method22675(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.field17790.method22679(0.0F, 16.0F, 0.0F);
      this.field17791 = new Class7219(this, 26, 0);
      this.field17791.method22673(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.field17791.method22679(-2.0F, 19.0F, 1.0F);
      this.field17792 = new Class7219(this, 26, 0);
      this.field17792.method22673(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.field17792.method22679(1.0F, 19.0F, 1.0F);
      this.field17793 = new Class7219(this, 24, 13);
      this.field17793.method22673(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.field17793.method22679(-4.0F, 13.0F, 0.0F);
      this.field17794 = new Class7219(this, 24, 13);
      this.field17794.method22673(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.field17794.method22679(4.0F, 13.0F, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17789, this.field17795, this.field17796);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17790, this.field17791, this.field17792, this.field17793, this.field17794);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17789.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17789.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17795.field31035 = this.field17789.field31035;
      this.field17795.field31036 = this.field17789.field31036;
      this.field17796.field31035 = this.field17789.field31035;
      this.field17796.field31036 = this.field17789.field31036;
      this.field17790.field31035 = (float) (Math.PI / 2);
      this.field17791.field31035 = Class9679.method37764(var2 * 0.6662F) * 1.4F * var3;
      this.field17792.field31035 = Class9679.method37764(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17793.field31037 = var4;
      this.field17794.field31037 = -var4;
   }
}
