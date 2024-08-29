package mapped;

import com.google.common.collect.ImmutableList;

public class Class2885<T extends Entity> extends Class2803<T> {
   private static String[] field17876;
   private final Class7219 field17877;
   private final Class7219 field17878;
   private final Class7219 field17879;
   private final Class7219 field17880;
   private final Class7219 field17881;
   private final Class7219 field17882;

   public Class2885() {
      this.field17604 = 32;
      this.field17605 = 32;
      this.field17877 = new Class7219(this, 0, 27);
      this.field17877.method22673(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F);
      this.field17877.method22679(0.0F, 23.0F, 0.0F);
      this.field17878 = new Class7219(this, 24, 6);
      this.field17878.method22673(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.field17878.method22679(0.0F, 20.0F, 0.0F);
      this.field17879 = new Class7219(this, 28, 6);
      this.field17879.method22673(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.field17879.method22679(0.0F, 20.0F, 0.0F);
      this.field17882 = new Class7219(this, -3, 0);
      this.field17882.method22673(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F);
      this.field17882.method22679(0.0F, 22.0F, 1.5F);
      this.field17880 = new Class7219(this, 25, 0);
      this.field17880.method22673(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.field17880.method22679(-1.5F, 22.0F, -1.5F);
      this.field17881 = new Class7219(this, 25, 0);
      this.field17881.method22673(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.field17881.method22679(1.5F, 22.0F, -1.5F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17877, this.field17878, this.field17879, this.field17882, this.field17880, this.field17881);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17880.field31037 = -0.2F + 0.4F * MathHelper.sin(var4 * 0.2F);
      this.field17881.field31037 = 0.2F - 0.4F * MathHelper.sin(var4 * 0.2F);
   }
}
