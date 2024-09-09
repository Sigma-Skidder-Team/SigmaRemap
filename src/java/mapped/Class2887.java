package mapped;

import com.google.common.collect.ImmutableList;

public class Class2887<T extends Class1057> extends Class2803<T> {
   private static String[] field17887;
   private final Class7219 field17888;
   private final Class7219 field17889 = new Class7219(64, 64, 0, 0);
   private final Class7219 field17890;

   public Class2887() {
      super(RenderType::method14314);
      this.field17888 = new Class7219(64, 64, 0, 28);
      this.field17890 = new Class7219(64, 64, 0, 52);
      this.field17889.method22673(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F);
      this.field17889.method22679(0.0F, 24.0F, 0.0F);
      this.field17888.method22673(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F);
      this.field17888.method22679(0.0F, 24.0F, 0.0F);
      this.field17890.method22673(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.field17890.method22679(0.0F, 12.0F, 0.0F);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var4 - (float)var1.ticksExisted;
      float var10 = (0.5F + var1.method4853(var9)) * (float) Math.PI;
      float var11 = -1.0F + MathHelper.sin(var10);
      float var12 = 0.0F;
      if (var10 > (float) Math.PI) {
         var12 = MathHelper.sin(var4 * 0.1F) * 0.7F;
      }

      this.field17889.method22679(0.0F, 16.0F + MathHelper.sin(var10) * 8.0F + var12, 0.0F);
      if (!(var1.method4853(var9) > 0.3F)) {
         this.field17889.field31036 = 0.0F;
      } else {
         this.field17889.field31036 = var11 * var11 * var11 * var11 * (float) Math.PI * 0.125F;
      }

      this.field17890.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17890.field31036 = (var1.rotationYawHead - 180.0F - var1.renderYawOffset) * (float) (Math.PI / 180.0);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17888, this.field17889);
   }

   public Class7219 method11202() {
      return this.field17888;
   }

   public Class7219 method11203() {
      return this.field17889;
   }

   public Class7219 method11204() {
      return this.field17890;
   }
}
