package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class2866<T extends Entity> extends Class2855<T> {
   private static String[] field17771;
   public Class7219 field17772 = new Class7219(this, 0, 0);
   public Class7219 field17773;
   public Class7219 field17774;
   public Class7219 field17775;
   public Class7219 field17776;
   public Class7219 field17777;

   public Class2866(int var1, float var2, boolean var3, float var4, float var5, float var6, float var7, int var8) {
      super(var3, var4, var5, var6, var7, (float)var8);
      this.field17772.method22675(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, var2);
      this.field17772.method22679(0.0F, (float)(18 - var1), -6.0F);
      this.field17773 = new Class7219(this, 28, 8);
      this.field17773.method22675(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, var2);
      this.field17773.method22679(0.0F, (float)(17 - var1), 2.0F);
      this.field17774 = new Class7219(this, 0, 16);
      this.field17774.method22675(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17774.method22679(-3.0F, (float)(24 - var1), 7.0F);
      this.field17775 = new Class7219(this, 0, 16);
      this.field17775.method22675(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17775.method22679(3.0F, (float)(24 - var1), 7.0F);
      this.field17776 = new Class7219(this, 0, 16);
      this.field17776.method22675(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17776.method22679(-3.0F, (float)(24 - var1), -5.0F);
      this.field17777 = new Class7219(this, 0, 16);
      this.field17777.method22675(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17777.method22679(3.0F, (float)(24 - var1), -5.0F);
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of(this.field17772);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17773, this.field17774, this.field17775, this.field17776, this.field17777);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17772.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17772.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17773.field31035 = (float) (Math.PI / 2);
      this.field17774.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17775.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17776.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17777.field31035 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
   }
}
