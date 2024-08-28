package mapped;

public class Class2800<T extends Class1038> extends Class2797<T> implements Class2801 {
   private static String[] field17431;
   private Class7219 field17445;

   public Class2800(float var1, boolean var2) {
      super(var1, 0.0F, 64, !var2 ? 64 : 32);
      if (!var2) {
         this.field17432 = new Class7219(this, 0, 0);
         this.field17432.method22671(0, 0).method22675(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
         this.field17432.method22671(24, 0).method22675(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
         this.field17433 = new Class7219(this, 32, 0);
         this.field17433.method22675(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
         this.field17445 = new Class7219(this);
         this.field17445.method22671(30, 47).method22675(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
         this.field17445.field31035 = (float) (-Math.PI / 2);
         this.field17433.method22670(this.field17445);
         this.field17434 = new Class7219(this, 16, 20);
         this.field17434.method22675(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
         this.field17434.method22671(0, 38).method22675(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.05F);
         this.field17435 = new Class7219(this, 44, 22);
         this.field17435.method22675(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field17435.method22679(-5.0F, 2.0F, 0.0F);
         this.field17436 = new Class7219(this, 44, 22);
         this.field17436.field31038 = true;
         this.field17436.method22675(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field17436.method22679(5.0F, 2.0F, 0.0F);
         this.field17437 = new Class7219(this, 0, 22);
         this.field17437.method22679(-2.0F, 12.0F, 0.0F);
         this.field17437.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field17438 = new Class7219(this, 0, 22);
         this.field17438.field31038 = true;
         this.field17438.method22679(2.0F, 12.0F, 0.0F);
         this.field17438.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      } else {
         this.field17432 = new Class7219(this, 0, 0);
         this.field17432.method22675(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
         this.field17434 = new Class7219(this, 16, 16);
         this.field17434.method22675(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.field17437 = new Class7219(this, 0, 16);
         this.field17437.method22679(-2.0F, 12.0F, 0.0F);
         this.field17437.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.field17438 = new Class7219(this, 0, 16);
         this.field17438.field31038 = true;
         this.field17438.method22679(2.0F, 12.0F, 0.0F);
         this.field17438.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
      }
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      Class7972.method27109(this.field17436, this.field17435, var1.method4307(), this.field17600, var4);
   }

   @Override
   public void method11014(boolean var1) {
      this.field17432.field31039 = var1;
      this.field17433.field31039 = var1;
      this.field17445.field31039 = var1;
   }
}
