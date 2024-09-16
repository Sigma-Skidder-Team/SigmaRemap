package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2864<T extends Class1095> extends Class2855<T> {
   private static String[] field17749;
   public final Class7219 field17750;
   private final Class7219 field17751;
   private final Class7219 field17752;
   private final Class7219 field17753;
   private final Class7219 field17754;
   private final Class7219 field17755;
   private final Class7219 field17756;
   private final Class7219 field17757;
   private final Class7219 field17758;
   private final Class7219 field17759;
   private float field17760;

   public Class2864() {
      super(true, 8.0F, 3.35F);
      this.field17604 = 48;
      this.field17605 = 32;
      this.field17750 = new Class7219(this, 1, 5);
      this.field17750.method22673(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F);
      this.field17750.method22679(-1.0F, 16.5F, -3.0F);
      this.field17751 = new Class7219(this, 8, 1);
      this.field17751.method22673(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.field17752 = new Class7219(this, 15, 1);
      this.field17752.method22673(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.field17753 = new Class7219(this, 6, 18);
      this.field17753.method22673(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F);
      this.field17750.method22670(this.field17751);
      this.field17750.method22670(this.field17752);
      this.field17750.method22670(this.field17753);
      this.field17754 = new Class7219(this, 24, 15);
      this.field17754.method22673(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F);
      this.field17754.method22679(0.0F, 16.0F, -6.0F);
      float var3 = 0.001F;
      this.field17755 = new Class7219(this, 13, 24);
      this.field17755.method22675(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field17755.method22679(-5.0F, 17.5F, 7.0F);
      this.field17756 = new Class7219(this, 4, 24);
      this.field17756.method22675(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field17756.method22679(-1.0F, 17.5F, 7.0F);
      this.field17757 = new Class7219(this, 13, 24);
      this.field17757.method22675(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field17757.method22679(-5.0F, 17.5F, 0.0F);
      this.field17758 = new Class7219(this, 4, 24);
      this.field17758.method22675(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field17758.method22679(-1.0F, 17.5F, 0.0F);
      this.field17759 = new Class7219(this, 30, 0);
      this.field17759.method22673(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F);
      this.field17759.method22679(-4.0F, 15.0F, -1.0F);
      this.field17754.method22670(this.field17759);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      this.field17754.field31035 = (float) (Math.PI / 2);
      this.field17759.field31035 = -0.05235988F;
      this.field17755.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17756.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17757.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17758.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17750.method22679(-1.0F, 16.5F, -3.0F);
      this.field17750.field31036 = 0.0F;
      this.field17750.field31037 = var1.method5146(var4);
      this.field17755.field31039 = true;
      this.field17756.field31039 = true;
      this.field17757.field31039 = true;
      this.field17758.field31039 = true;
      this.field17754.method22679(0.0F, 16.0F, -6.0F);
      this.field17754.field31037 = 0.0F;
      this.field17755.method22679(-5.0F, 17.5F, 7.0F);
      this.field17756.method22679(-1.0F, 17.5F, 7.0F);
      if (!var1.method3336()) {
         if (!var1.isSleeping()) {
            if (var1.method5129()) {
               this.field17754.field31035 = (float) (Math.PI / 6);
               this.field17754.method22679(0.0F, 9.0F, -3.0F);
               this.field17759.field31035 = (float) (Math.PI / 4);
               this.field17759.method22679(-4.0F, 15.0F, -2.0F);
               this.field17750.method22679(-1.0F, 10.0F, -0.25F);
               this.field17750.field31035 = 0.0F;
               this.field17750.field31036 = 0.0F;
               if (this.field17602) {
                  this.field17750.method22679(-1.0F, 13.0F, -3.75F);
               }

               this.field17755.field31035 = (float) (-Math.PI * 5.0 / 12.0);
               this.field17755.method22679(-5.0F, 21.5F, 6.75F);
               this.field17756.field31035 = (float) (-Math.PI * 5.0 / 12.0);
               this.field17756.method22679(-1.0F, 21.5F, 6.75F);
               this.field17757.field31035 = (float) (-Math.PI / 12);
               this.field17758.field31035 = (float) (-Math.PI / 12);
            }
         } else {
            this.field17754.field31037 = (float) (-Math.PI / 2);
            this.field17754.method22679(0.0F, 21.0F, -6.0F);
            this.field17759.field31035 = (float) (-Math.PI * 5.0 / 6.0);
            if (this.field17602) {
               this.field17759.field31035 = -2.1816616F;
               this.field17754.method22679(0.0F, 21.0F, -2.0F);
            }

            this.field17750.method22679(1.0F, 19.49F, -3.0F);
            this.field17750.field31035 = 0.0F;
            this.field17750.field31036 = (float) (-Math.PI * 2.0 / 3.0);
            this.field17750.field31037 = 0.0F;
            this.field17755.field31039 = false;
            this.field17756.field31039 = false;
            this.field17757.field31039 = false;
            this.field17758.field31039 = false;
         }
      } else {
         this.field17754.field31035 = 1.6755161F;
         float var7 = var1.method5147(var4);
         this.field17754.method22679(0.0F, 16.0F + var1.method5147(var4), -6.0F);
         this.field17750.method22679(-1.0F, 16.5F + var7, -3.0F);
         this.field17750.field31036 = 0.0F;
      }
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17750);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17754, this.field17755, this.field17756, this.field17757, this.field17758);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      if (!var1.isSleeping() && !var1.method5131() && !var1.method3336()) {
         this.field17750.field31035 = var6 * (float) (Math.PI / 180.0);
         this.field17750.field31036 = var5 * (float) (Math.PI / 180.0);
      }

      if (var1.isSleeping()) {
         this.field17750.field31035 = 0.0F;
         this.field17750.field31036 = (float) (-Math.PI * 2.0 / 3.0);
         this.field17750.field31037 = MathHelper.cos(var4 * 0.027F) / 22.0F;
      }

      if (var1.method3336()) {
         float var9 = MathHelper.cos(var4) * 0.01F;
         this.field17754.field31036 = var9;
         this.field17755.field31037 = var9;
         this.field17756.field31037 = var9;
         this.field17757.field31037 = var9 / 2.0F;
         this.field17758.field31037 = var9 / 2.0F;
      }

      if (var1.method5131()) {
         float var10 = 0.1F;
         this.field17760 += 0.67F;
         this.field17755.field31035 = MathHelper.cos(this.field17760 * 0.4662F) * 0.1F;
         this.field17756.field31035 = MathHelper.cos(this.field17760 * 0.4662F + (float) Math.PI) * 0.1F;
         this.field17757.field31035 = MathHelper.cos(this.field17760 * 0.4662F + (float) Math.PI) * 0.1F;
         this.field17758.field31035 = MathHelper.cos(this.field17760 * 0.4662F) * 0.1F;
      }
   }
}
