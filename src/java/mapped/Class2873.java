package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class Class2873<T extends Class1088> extends Class2866<T> {
   private static String[] field17771;
   private final Class7219 field17787;

   public Class2873(float var1) {
      super(12, var1, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
      this.field17604 = 128;
      this.field17605 = 64;
      this.field17772 = new Class7219(this, 3, 0);
      this.field17772.method22675(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F);
      this.field17772.method22679(0.0F, 19.0F, -10.0F);
      this.field17773 = new Class7219(this);
      this.field17773.method22671(7, 37).method22675(-9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F, 0.0F);
      this.field17773.method22671(31, 1).method22675(-5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F, 0.0F);
      this.field17773.method22679(0.0F, 11.0F, -10.0F);
      this.field17787 = new Class7219(this);
      this.field17787.method22671(70, 33).method22675(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F, 0.0F);
      this.field17787.method22679(0.0F, 11.0F, -10.0F);
      boolean var4 = true;
      this.field17774 = new Class7219(this, 1, 23);
      this.field17774.method22675(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.field17774.method22679(-3.5F, 22.0F, 11.0F);
      this.field17775 = new Class7219(this, 1, 12);
      this.field17775.method22675(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.field17775.method22679(3.5F, 22.0F, 11.0F);
      this.field17776 = new Class7219(this, 27, 30);
      this.field17776.method22675(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.field17776.method22679(-5.0F, 21.0F, -4.0F);
      this.field17777 = new Class7219(this, 27, 24);
      this.field17777.method22675(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.field17777.method22679(5.0F, 21.0F, -4.0F);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return Iterables.concat(super.method11002(), ImmutableList.of(this.field17787));
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      this.field17774.field31035 = MathHelper.cos(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.field17775.field31035 = MathHelper.cos(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.field17776.field31037 = MathHelper.cos(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.field17777.field31037 = MathHelper.cos(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.field17776.field31035 = 0.0F;
      this.field17777.field31035 = 0.0F;
      this.field17776.field31036 = 0.0F;
      this.field17777.field31036 = 0.0F;
      this.field17774.field31036 = 0.0F;
      this.field17775.field31036 = 0.0F;
      this.field17787.field31035 = (float) (Math.PI / 2);
      if (!var1.method3250() && var1.method3226()) {
         float var9 = !var1.method5047() ? 1.0F : 4.0F;
         float var10 = !var1.method5047() ? 1.0F : 2.0F;
         float var11 = 5.0F;
         this.field17776.field31036 = MathHelper.cos(var9 * var2 * 5.0F + (float) Math.PI) * 8.0F * var3 * var10;
         this.field17776.field31037 = 0.0F;
         this.field17777.field31036 = MathHelper.cos(var9 * var2 * 5.0F) * 8.0F * var3 * var10;
         this.field17777.field31037 = 0.0F;
         this.field17774.field31036 = MathHelper.cos(var2 * 5.0F + (float) Math.PI) * 3.0F * var3;
         this.field17774.field31035 = 0.0F;
         this.field17775.field31036 = MathHelper.cos(var2 * 5.0F) * 3.0F * var3;
         this.field17775.field31035 = 0.0F;
      }

      this.field17787.field31039 = !this.field17602 && var1.method5045();
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      boolean var11 = this.field17787.field31039;
      if (var11) {
         var1.push();
         var1.translate(0.0, -0.08F, 0.0);
      }

      super.method11016(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var11) {
         var1.pop();
      }
   }
}
