package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.HandSide;

public class Class2823<T extends Class1025> extends Class2803<T> implements Class2825, Class2824 {
   private static String[] field17586;
   private final Class7219 field17587;
   private final Class7219 field17588;
   private final Class7219 field17589;
   private final Class7219 field17590;
   private final Class7219 field17591;
   private final Class7219 field17592;
   private final Class7219 field17593;
   private final Class7219 field17594;

   public Class2823(float var1, float var2, int var3, int var4) {
      this.field17587 = new Class7219(this).method22684(var3, var4);
      this.field17587.method22679(0.0F, 0.0F + var2, 0.0F);
      this.field17587.method22671(0, 0).method22675(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.field17588 = new Class7219(this, 32, 0).method22684(var3, var4);
      this.field17588.method22675(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, var1 + 0.45F);
      this.field17587.method22670(this.field17588);
      this.field17588.field31039 = false;
      Class7219 var7 = new Class7219(this).method22684(var3, var4);
      var7.method22679(0.0F, var2 - 2.0F, 0.0F);
      var7.method22671(24, 0).method22675(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.field17587.method22670(var7);
      this.field17589 = new Class7219(this).method22684(var3, var4);
      this.field17589.method22679(0.0F, 0.0F + var2, 0.0F);
      this.field17589.method22671(16, 20).method22675(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.field17589.method22671(0, 38).method22675(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.field17590 = new Class7219(this).method22684(var3, var4);
      this.field17590.method22679(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.field17590.method22671(44, 22).method22675(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      Class7219 var8 = new Class7219(this, 44, 22).method22684(var3, var4);
      var8.field31038 = true;
      var8.method22675(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.field17590.method22670(var8);
      this.field17590.method22671(40, 38).method22675(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.field17591 = new Class7219(this, 0, 22).method22684(var3, var4);
      this.field17591.method22679(-2.0F, 12.0F + var2, 0.0F);
      this.field17591.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17592 = new Class7219(this, 0, 22).method22684(var3, var4);
      this.field17592.field31038 = true;
      this.field17592.method22679(2.0F, 12.0F + var2, 0.0F);
      this.field17592.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17593 = new Class7219(this, 40, 46).method22684(var3, var4);
      this.field17593.method22675(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17593.method22679(-5.0F, 2.0F + var2, 0.0F);
      this.field17594 = new Class7219(this, 40, 46).method22684(var3, var4);
      this.field17594.field31038 = true;
      this.field17594.method22675(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17594.method22679(5.0F, 2.0F + var2, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17587, this.field17589, this.field17591, this.field17592, this.field17590, this.field17593, this.field17594);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17587.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17587.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17590.field31033 = 3.0F;
      this.field17590.field31034 = -1.0F;
      this.field17590.field31035 = -0.75F;
      if (!this.field17601) {
         this.field17593.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F;
         this.field17593.field31036 = 0.0F;
         this.field17593.field31037 = 0.0F;
         this.field17594.field31035 = MathHelper.cos(var2 * 0.6662F) * 2.0F * var3 * 0.5F;
         this.field17594.field31036 = 0.0F;
         this.field17594.field31037 = 0.0F;
         this.field17591.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
         this.field17591.field31036 = 0.0F;
         this.field17591.field31037 = 0.0F;
         this.field17592.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
         this.field17592.field31036 = 0.0F;
         this.field17592.field31037 = 0.0F;
      } else {
         this.field17593.field31035 = (float) (-Math.PI / 5);
         this.field17593.field31036 = 0.0F;
         this.field17593.field31037 = 0.0F;
         this.field17594.field31035 = (float) (-Math.PI / 5);
         this.field17594.field31036 = 0.0F;
         this.field17594.field31037 = 0.0F;
         this.field17591.field31035 = -1.4137167F;
         this.field17591.field31036 = (float) (Math.PI / 10);
         this.field17591.field31037 = 0.07853982F;
         this.field17592.field31035 = -1.4137167F;
         this.field17592.field31036 = (float) (-Math.PI / 10);
         this.field17592.field31037 = -0.07853982F;
      }

      Class2117 var9 = var1.method4543();
      if (var9 != Class2117.field13795) {
         if (var9 != Class2117.field13796) {
            if (var9 != Class2117.field13797) {
               if (var9 != Class2117.field13798) {
                  if (var9 != Class2117.field13799) {
                     if (var9 == Class2117.field13800) {
                        this.field17593.field31034 = 0.0F;
                        this.field17593.field31032 = -5.0F;
                        this.field17593.field31035 = MathHelper.cos(var4 * 0.6662F) * 0.05F;
                        this.field17593.field31037 = 2.670354F;
                        this.field17593.field31036 = 0.0F;
                        this.field17594.field31034 = 0.0F;
                        this.field17594.field31032 = 5.0F;
                        this.field17594.field31035 = MathHelper.cos(var4 * 0.6662F) * 0.05F;
                        this.field17594.field31037 = (float) (-Math.PI * 3.0 / 4.0);
                        this.field17594.field31036 = 0.0F;
                     }
                  } else {
                     Class7972.method27106(this.field17593, this.field17594, var1, true);
                  }
               } else {
                  Class7972.method27105(this.field17593, this.field17594, this.field17587, true);
               }
            } else {
               this.field17593.field31036 = -0.1F + this.field17587.field31036;
               this.field17593.field31035 = (float) (-Math.PI / 2) + this.field17587.field31035;
               this.field17594.field31035 = -0.9424779F + this.field17587.field31035;
               this.field17594.field31036 = this.field17587.field31036 - 0.4F;
               this.field17594.field31037 = (float) (Math.PI / 2);
            }
         } else {
            this.field17593.field31034 = 0.0F;
            this.field17593.field31032 = -5.0F;
            this.field17594.field31034 = 0.0F;
            this.field17594.field31032 = 5.0F;
            this.field17593.field31035 = MathHelper.cos(var4 * 0.6662F) * 0.25F;
            this.field17594.field31035 = MathHelper.cos(var4 * 0.6662F) * 0.25F;
            this.field17593.field31037 = (float) (Math.PI * 3.0 / 4.0);
            this.field17594.field31037 = (float) (-Math.PI * 3.0 / 4.0);
            this.field17593.field31036 = 0.0F;
            this.field17594.field31036 = 0.0F;
         }
      } else if (!var1.getHeldItemMainhand().isEmpty()) {
         Class7972.method27107(this.field17593, this.field17594, var1, this.field17600, var4);
      } else {
         Class7972.method27109(this.field17594, this.field17593, true, this.field17600, var4);
      }

      boolean var10 = var9 == Class2117.field13794;
      this.field17590.field31039 = var10;
      this.field17594.field31039 = !var10;
      this.field17593.field31039 = !var10;
   }

   private Class7219 method11025(HandSide var1) {
      return var1 != HandSide.field14417 ? this.field17593 : this.field17594;
   }

   public Class7219 method11026() {
      return this.field17588;
   }

   @Override
   public Class7219 method11012() {
      return this.field17587;
   }

   @Override
   public void method11010(HandSide var1, MatrixStack var2) {
      this.method11025(var1).method22682(var2);
   }
}
