package mapped;

import com.google.common.collect.ImmutableList;

public class Class2860<T extends Entity> extends Class2855<T> {
   public final Class7219 field17722;
   public final Class7219 field17723;
   public final Class7219 field17724;
   public final Class7219 field17725;
   public final Class7219 field17726;
   public final Class7219 field17727;
   public final Class7219 field17728;
   public final Class7219 field17729;
   public int field17730 = 1;

   public Class2860(float var1) {
      super(true, 10.0F, 4.0F);
      this.field17728 = new Class7219(this);
      this.field17728.method22672("main", -2.5F, -2.0F, -3.0F, 5, 4, 5, var1, 0, 0);
      this.field17728.method22672("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2, var1, 0, 24);
      this.field17728.method22672("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, var1, 0, 10);
      this.field17728.method22672("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, var1, 6, 10);
      this.field17728.method22679(0.0F, 15.0F, -9.0F);
      this.field17729 = new Class7219(this, 20, 0);
      this.field17729.method22675(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, var1);
      this.field17729.method22679(0.0F, 12.0F, -10.0F);
      this.field17726 = new Class7219(this, 0, 15);
      this.field17726.method22675(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.field17726.field31035 = 0.9F;
      this.field17726.method22679(0.0F, 15.0F, 8.0F);
      this.field17727 = new Class7219(this, 4, 15);
      this.field17727.method22675(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.field17727.method22679(0.0F, 20.0F, 14.0F);
      this.field17722 = new Class7219(this, 8, 13);
      this.field17722.method22675(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.field17722.method22679(1.1F, 18.0F, 5.0F);
      this.field17723 = new Class7219(this, 8, 13);
      this.field17723.method22675(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.field17723.method22679(-1.1F, 18.0F, 5.0F);
      this.field17724 = new Class7219(this, 40, 0);
      this.field17724.method22675(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.field17724.method22679(1.2F, 14.1F, -5.0F);
      this.field17725 = new Class7219(this, 40, 0);
      this.field17725.method22675(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.field17725.method22679(-1.2F, 14.1F, -5.0F);
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17728);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17729, this.field17722, this.field17723, this.field17724, this.field17725, this.field17726, this.field17727);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17728.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17728.field31036 = var5 * (float) (Math.PI / 180.0);
      if (this.field17730 != 3) {
         this.field17729.field31035 = (float) (Math.PI / 2);
         if (this.field17730 != 2) {
            this.field17722.field31035 = MathHelper.method37764(var2 * 0.6662F) * var3;
            this.field17723.field31035 = MathHelper.method37764(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field17724.field31035 = MathHelper.method37764(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field17725.field31035 = MathHelper.method37764(var2 * 0.6662F) * var3;
            if (this.field17730 != 1) {
               this.field17727.field31035 = 1.7278761F + 0.47123894F * MathHelper.method37764(var2) * var3;
            } else {
               this.field17727.field31035 = 1.7278761F + (float) (Math.PI / 4) * MathHelper.method37764(var2) * var3;
            }
         } else {
            this.field17722.field31035 = MathHelper.method37764(var2 * 0.6662F) * var3;
            this.field17723.field31035 = MathHelper.method37764(var2 * 0.6662F + 0.3F) * var3;
            this.field17724.field31035 = MathHelper.method37764(var2 * 0.6662F + (float) Math.PI + 0.3F) * var3;
            this.field17725.field31035 = MathHelper.method37764(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field17727.field31035 = 1.7278761F + (float) (Math.PI / 10) * MathHelper.method37764(var2) * var3;
         }
      }
   }

   @Override
   public void method10997(T var1, float var2, float var3, float var4) {
      this.field17729.field31033 = 12.0F;
      this.field17729.field31034 = -10.0F;
      this.field17728.field31033 = 15.0F;
      this.field17728.field31034 = -9.0F;
      this.field17726.field31033 = 15.0F;
      this.field17726.field31034 = 8.0F;
      this.field17727.field31033 = 20.0F;
      this.field17727.field31034 = 14.0F;
      this.field17724.field31033 = 14.1F;
      this.field17724.field31034 = -5.0F;
      this.field17725.field31033 = 14.1F;
      this.field17725.field31034 = -5.0F;
      this.field17722.field31033 = 18.0F;
      this.field17722.field31034 = 5.0F;
      this.field17723.field31033 = 18.0F;
      this.field17723.field31034 = 5.0F;
      this.field17726.field31035 = 0.9F;
      if (!var1.method3336()) {
         if (!var1.method3337()) {
            this.field17730 = 1;
         } else {
            this.field17727.field31033 = this.field17726.field31033;
            this.field17727.field31034 += 2.0F;
            this.field17726.field31035 = (float) (Math.PI / 2);
            this.field17727.field31035 = (float) (Math.PI / 2);
            this.field17730 = 2;
         }
      } else {
         this.field17729.field31033++;
         this.field17728.field31033 += 2.0F;
         this.field17726.field31033++;
         this.field17727.field31033 += -4.0F;
         this.field17727.field31034 += 2.0F;
         this.field17726.field31035 = (float) (Math.PI / 2);
         this.field17727.field31035 = (float) (Math.PI / 2);
         this.field17730 = 0;
      }
   }
}
