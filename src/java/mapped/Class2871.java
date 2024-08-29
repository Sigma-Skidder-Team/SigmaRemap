package mapped;

public class Class2871<T extends Class1096> extends Class2866<T> {
   private static String[] field17786;

   public Class2871() {
      super(12, 0.0F, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
      this.field17604 = 128;
      this.field17605 = 64;
      this.field17772 = new Class7219(this, 0, 0);
      this.field17772.method22675(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F);
      this.field17772.method22679(0.0F, 10.0F, -16.0F);
      this.field17772.method22671(0, 44).method22675(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F);
      this.field17772.method22671(26, 0).method22675(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      Class7219 var3 = this.field17772.method22671(26, 0);
      var3.field31038 = true;
      var3.method22675(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field17773 = new Class7219(this);
      this.field17773.method22671(0, 19).method22675(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F);
      this.field17773.method22671(39, 0).method22675(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F);
      this.field17773.method22679(-2.0F, 9.0F, 12.0F);
      byte var4 = 10;
      this.field17774 = new Class7219(this, 50, 22);
      this.field17774.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.field17774.method22679(-3.5F, 14.0F, 6.0F);
      this.field17775 = new Class7219(this, 50, 22);
      this.field17775.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.field17775.method22679(3.5F, 14.0F, 6.0F);
      this.field17776 = new Class7219(this, 50, 40);
      this.field17776.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.field17776.method22679(-2.5F, 14.0F, -7.0F);
      this.field17777 = new Class7219(this, 50, 40);
      this.field17777.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.field17777.method22679(2.5F, 14.0F, -7.0F);
      this.field17774.field31032--;
      this.field17775.field31032++;
      this.field17774.field31034 += 0.0F;
      this.field17775.field31034 += 0.0F;
      this.field17776.field31032--;
      this.field17777.field31032++;
      this.field17776.field31034--;
      this.field17777.field31034--;
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      float var9 = var4 - (float)var1.ticksExisted;
      float var10 = var1.method5185(var9);
      var10 *= var10;
      float var11 = 1.0F - var10;
      this.field17773.field31035 = (float) (Math.PI / 2) - var10 * (float) Math.PI * 0.35F;
      this.field17773.field31033 = 9.0F * var11 + 11.0F * var10;
      this.field17776.field31033 = 14.0F * var11 - 6.0F * var10;
      this.field17776.field31034 = -8.0F * var11 - 4.0F * var10;
      this.field17776.field31035 -= var10 * (float) Math.PI * 0.45F;
      this.field17777.field31033 = this.field17776.field31033;
      this.field17777.field31034 = this.field17776.field31034;
      this.field17777.field31035 -= var10 * (float) Math.PI * 0.45F;
      if (!this.field17602) {
         this.field17772.field31033 = 10.0F * var11 - 14.0F * var10;
         this.field17772.field31034 = -16.0F * var11 - 3.0F * var10;
      } else {
         this.field17772.field31033 = 10.0F * var11 - 9.0F * var10;
         this.field17772.field31034 = -16.0F * var11 - 7.0F * var10;
      }

      this.field17772.field31035 += var10 * (float) Math.PI * 0.15F;
   }
}
