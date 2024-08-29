package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class2890<T extends Entity> extends Class2803<T> {
   private static String[] field17903;
   private final Class7219 field17904;
   private final Class7219 field17905;
   private final Class7219 field17906;
   private final Class7219 field17907;
   private final Class7219 field17908;
   private final Class7219 field17909;
   private final Class7219 field17910;

   public Class2890() {
      this(0.0F);
   }

   public Class2890(float var1) {
      byte var4 = 6;
      this.field17904 = new Class7219(this, 0, 0);
      this.field17904.method22675(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.field17904.method22679(0.0F, 6.0F, 0.0F);
      this.field17905 = new Class7219(this, 32, 0);
      this.field17905.method22675(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 + 0.5F);
      this.field17905.method22679(0.0F, 6.0F, 0.0F);
      this.field17906 = new Class7219(this, 16, 16);
      this.field17906.method22675(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.field17906.method22679(0.0F, 6.0F, 0.0F);
      this.field17907 = new Class7219(this, 0, 16);
      this.field17907.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17907.method22679(-2.0F, 18.0F, 4.0F);
      this.field17908 = new Class7219(this, 0, 16);
      this.field17908.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17908.method22679(2.0F, 18.0F, 4.0F);
      this.field17909 = new Class7219(this, 0, 16);
      this.field17909.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17909.method22679(-2.0F, 18.0F, -4.0F);
      this.field17910 = new Class7219(this, 0, 16);
      this.field17910.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17910.method22679(2.0F, 18.0F, -4.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17904, this.field17906, this.field17907, this.field17908, this.field17909, this.field17910);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17904.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17904.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17907.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17908.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17909.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17910.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
   }
}
