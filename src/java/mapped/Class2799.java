package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2799<T extends LivingEntity> extends Class2797<T> {
   private static String[] field17431;
   public boolean field17443;
   public boolean field17444;

   public Class2799(float var1) {
      super(0.0F, -14.0F, 64, 32);
      float var4 = -14.0F;
      this.field17433 = new Class7219(this, 0, 16);
      this.field17433.method22675(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 - 0.5F);
      this.field17433.method22679(0.0F, -14.0F, 0.0F);
      this.field17434 = new Class7219(this, 32, 16);
      this.field17434.method22675(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.field17434.method22679(0.0F, -14.0F, 0.0F);
      this.field17435 = new Class7219(this, 56, 0);
      this.field17435.method22675(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field17435.method22679(-3.0F, -12.0F, 0.0F);
      this.field17436 = new Class7219(this, 56, 0);
      this.field17436.field31038 = true;
      this.field17436.method22675(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field17436.method22679(5.0F, -12.0F, 0.0F);
      this.field17437 = new Class7219(this, 56, 0);
      this.field17437.method22675(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field17437.method22679(-2.0F, -2.0F, 0.0F);
      this.field17438 = new Class7219(this, 56, 0);
      this.field17438.field31038 = true;
      this.field17438.method22675(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field17438.method22679(2.0F, -2.0F, 0.0F);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      this.field17432.field31039 = true;
      float var9 = -14.0F;
      this.field17434.field31035 = 0.0F;
      this.field17434.field31033 = -14.0F;
      this.field17434.field31034 = -0.0F;
      this.field17437.field31035 -= 0.0F;
      this.field17438.field31035 -= 0.0F;
      this.field17435.field31035 = (float)((double)this.field17435.field31035 * 0.5);
      this.field17436.field31035 = (float)((double)this.field17436.field31035 * 0.5);
      this.field17437.field31035 = (float)((double)this.field17437.field31035 * 0.5);
      this.field17438.field31035 = (float)((double)this.field17438.field31035 * 0.5);
      float var10 = 0.4F;
      if (this.field17435.field31035 > 0.4F) {
         this.field17435.field31035 = 0.4F;
      }

      if (this.field17436.field31035 > 0.4F) {
         this.field17436.field31035 = 0.4F;
      }

      if (this.field17435.field31035 < -0.4F) {
         this.field17435.field31035 = -0.4F;
      }

      if (this.field17436.field31035 < -0.4F) {
         this.field17436.field31035 = -0.4F;
      }

      if (this.field17437.field31035 > 0.4F) {
         this.field17437.field31035 = 0.4F;
      }

      if (this.field17438.field31035 > 0.4F) {
         this.field17438.field31035 = 0.4F;
      }

      if (this.field17437.field31035 < -0.4F) {
         this.field17437.field31035 = -0.4F;
      }

      if (this.field17438.field31035 < -0.4F) {
         this.field17438.field31035 = -0.4F;
      }

      if (this.field17443) {
         this.field17435.field31035 = -0.5F;
         this.field17436.field31035 = -0.5F;
         this.field17435.field31037 = 0.05F;
         this.field17436.field31037 = -0.05F;
      }

      this.field17435.field31034 = 0.0F;
      this.field17436.field31034 = 0.0F;
      this.field17437.field31034 = 0.0F;
      this.field17438.field31034 = 0.0F;
      this.field17437.field31033 = -5.0F;
      this.field17438.field31033 = -5.0F;
      this.field17432.field31034 = -0.0F;
      this.field17432.field31033 = -13.0F;
      this.field17433.field31032 = this.field17432.field31032;
      this.field17433.field31033 = this.field17432.field31033;
      this.field17433.field31034 = this.field17432.field31034;
      this.field17433.field31035 = this.field17432.field31035;
      this.field17433.field31036 = this.field17432.field31036;
      this.field17433.field31037 = this.field17432.field31037;
      if (this.field17444) {
         float var11 = 1.0F;
         this.field17432.field31033 -= 5.0F;
      }

      float var12 = -14.0F;
      this.field17435.method22679(-5.0F, -12.0F, 0.0F);
      this.field17436.method22679(5.0F, -12.0F, 0.0F);
   }
}
