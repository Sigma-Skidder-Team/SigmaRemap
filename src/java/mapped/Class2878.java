package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2878<T extends Entity> extends Class2803<T> {
   private static String[] field17845;
   private final Class7219 field17846;
   private final Class7219 field17847;
   private final Class7219 field17848;
   private final Class7219 field17849;
   private final Class7219 field17850;

   public Class2878() {
      float var3 = 4.0F;
      float var4 = 0.0F;
      this.field17848 = new Class7219(this, 0, 0).method22684(64, 64);
      this.field17848.method22675(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F);
      this.field17848.method22679(0.0F, 4.0F, 0.0F);
      this.field17849 = new Class7219(this, 32, 0).method22684(64, 64);
      this.field17849.method22675(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.field17849.method22679(0.0F, 6.0F, 0.0F);
      this.field17850 = new Class7219(this, 32, 0).method22684(64, 64);
      this.field17850.method22675(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.field17850.method22679(0.0F, 6.0F, 0.0F);
      this.field17846 = new Class7219(this, 0, 16).method22684(64, 64);
      this.field17846.method22675(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F);
      this.field17846.method22679(0.0F, 13.0F, 0.0F);
      this.field17847 = new Class7219(this, 0, 36).method22684(64, 64);
      this.field17847.method22675(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F);
      this.field17847.method22679(0.0F, 24.0F, 0.0F);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17848.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17848.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17846.field31036 = var5 * (float) (Math.PI / 180.0) * 0.25F;
      float var9 = MathHelper.sin(this.field17846.field31036);
      float var10 = MathHelper.cos(this.field17846.field31036);
      this.field17849.field31037 = 1.0F;
      this.field17850.field31037 = -1.0F;
      this.field17849.field31036 = 0.0F + this.field17846.field31036;
      this.field17850.field31036 = (float) Math.PI + this.field17846.field31036;
      this.field17849.field31032 = var10 * 5.0F;
      this.field17849.field31034 = -var9 * 5.0F;
      this.field17850.field31032 = -var10 * 5.0F;
      this.field17850.field31034 = var9 * 5.0F;
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17846, this.field17847, this.field17848, this.field17849, this.field17850);
   }

   public Class7219 method11197() {
      return this.field17848;
   }
}
