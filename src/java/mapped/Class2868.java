package mapped;

public class Class2868<T extends Class1019> extends Class2866<T> {
   private static String[] field17782;
   private float field17783;

   public Class2868() {
      super(12, 0.0F, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
      this.field17772 = new Class7219(this, 0, 0);
      this.field17772.method22675(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.6F);
      this.field17772.method22679(0.0F, 6.0F, -8.0F);
      this.field17773 = new Class7219(this, 28, 8);
      this.field17773.method22675(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.75F);
      this.field17773.method22679(0.0F, 5.0F, 2.0F);
      float var3 = 0.5F;
      this.field17774 = new Class7219(this, 0, 16);
      this.field17774.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field17774.method22679(-3.0F, 12.0F, 7.0F);
      this.field17775 = new Class7219(this, 0, 16);
      this.field17775.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field17775.method22679(3.0F, 12.0F, 7.0F);
      this.field17776 = new Class7219(this, 0, 16);
      this.field17776.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field17776.method22679(-3.0F, 12.0F, -5.0F);
      this.field17777 = new Class7219(this, 0, 16);
      this.field17777.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field17777.method22679(3.0F, 12.0F, -5.0F);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      super.method10997((T)var1, var2, var3, var4);
      this.field17772.field31033 = 6.0F + var1.method4513(var4) * 9.0F;
      this.field17783 = var1.method4514(var4);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      this.field17772.field31035 = this.field17783;
   }
}
