package mapped;

import com.google.common.collect.ImmutableList;

public class Class2854<T extends Class1066> extends Class2827<T> {
   private static String[] field17676;
   private final Class7219 field17677;
   private final Class7219 field17678;
   private final Class7219 field17679;
   private final Class7219 field17680;
   private final Class7219 field17681;
   private final Class7219 field17682;
   private final Class7219 field17683;
   private final Class7219 field17684;

   public Class2854(float var1) {
      this.field17604 = 128;
      this.field17605 = 64;
      this.field17677 = new Class7219(this, 0, 0);
      this.field17677.method22675(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, var1);
      this.field17677.method22679(0.0F, 7.0F, -6.0F);
      this.field17677.method22671(0, 14).method22675(-4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, var1);
      this.field17677.method22671(17, 0).method22675(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.field17677.method22671(17, 0).method22675(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.field17678 = new Class7219(this, 29, 0);
      this.field17678.method22675(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, var1);
      this.field17678.method22679(0.0F, 5.0F, 2.0F);
      this.field17683 = new Class7219(this, 45, 28);
      this.field17683.method22675(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.field17683.method22679(-8.5F, 3.0F, 3.0F);
      this.field17683.field31036 = (float) (Math.PI / 2);
      this.field17684 = new Class7219(this, 45, 41);
      this.field17684.method22675(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.field17684.method22679(5.5F, 3.0F, 3.0F);
      this.field17684.field31036 = (float) (Math.PI / 2);
      byte var4 = 4;
      byte var5 = 14;
      this.field17679 = new Class7219(this, 29, 29);
      this.field17679.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17679.method22679(-2.5F, 10.0F, 6.0F);
      this.field17680 = new Class7219(this, 29, 29);
      this.field17680.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17680.method22679(2.5F, 10.0F, 6.0F);
      this.field17681 = new Class7219(this, 29, 29);
      this.field17681.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17681.method22679(-2.5F, 10.0F, -4.0F);
      this.field17682 = new Class7219(this, 29, 29);
      this.field17682.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17682.method22679(2.5F, 10.0F, -4.0F);
      this.field17679.field31032--;
      this.field17680.field31032++;
      this.field17679.field31034 += 0.0F;
      this.field17680.field31034 += 0.0F;
      this.field17681.field31032--;
      this.field17682.field31032++;
      this.field17681.field31034--;
      this.field17682.field31034--;
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17677.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17677.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17678.field31035 = (float) (Math.PI / 2);
      this.field17679.field31035 = MathHelper.method37764(var2 * 0.6662F) * 1.4F * var3;
      this.field17680.field31035 = MathHelper.method37764(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17681.field31035 = MathHelper.method37764(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17682.field31035 = MathHelper.method37764(var2 * 0.6662F) * 1.4F * var3;
      boolean var9 = !var1.method3005() && var1.method4927();
      this.field17683.field31039 = var9;
      this.field17684.field31039 = var9;
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (!this.field17602) {
         ImmutableList.of(
               this.field17677, this.field17678, this.field17679, this.field17680, this.field17681, this.field17682, this.field17683, this.field17684
            )
            .forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
      } else {
         float var11 = 2.0F;
         var1.method35294();
         float var12 = 0.7F;
         var1.method35292(0.71428573F, 0.64935064F, 0.7936508F);
         var1.method35291(0.0, 1.3125, 0.22F);
         this.field17677.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.method35295();
         var1.method35294();
         float var13 = 1.1F;
         var1.method35292(0.625F, 0.45454544F, 0.45454544F);
         var1.method35291(0.0, 2.0625, 0.0);
         this.field17678.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.method35295();
         var1.method35294();
         var1.method35292(0.45454544F, 0.41322312F, 0.45454544F);
         var1.method35291(0.0, 2.0625, 0.0);
         ImmutableList.of(this.field17679, this.field17680, this.field17681, this.field17682, this.field17683, this.field17684)
            .forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.method35295();
      }
   }
}
