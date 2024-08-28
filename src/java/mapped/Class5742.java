package mapped;

import javax.annotation.Nullable;

public class Class5742 extends Class5712<Class1005, Class2892> {
   public static final ResourceLocation field25165 = new ResourceLocation("textures/entity/armorstand/wood.png");

   public Class5742(Class8853 var1) {
      super(var1, new Class2893(), 0.0F);
      this.method17880(new Class255<Class1005, Class2892, Class2892>(this, new Class2892(0.5F), new Class2892(1.0F)));
      this.method17880(new Class242<Class1005, Class2892>(this));
      this.method17880(new Class220<Class1005, Class2892>(this));
      this.method17880(new Class235<Class1005, Class2892>(this));
   }

   public ResourceLocation method17843(Class1005 var1) {
      return field25165;
   }

   public void method17842(Class1005 var1, Class9332 var2, float var3, float var4, float var5) {
      var2.method35293(Class7680.field32900.method25286(180.0F - var4));
      float var8 = (float)(var1.field5024.method6783() - var1.field5584) + var5;
      if (var8 < 5.0F) {
         var2.method35293(Class7680.field32900.method25286(MathHelper.method37763(var8 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   public boolean method17852(Class1005 var1) {
      double var4 = this.field25097.method32228(var1);
      float var6 = !var1.method3336() ? 64.0F : 32.0F;
      return !(var4 >= (double)(var6 * var6)) ? var1.method3383() : false;
   }

   @Nullable
   public Class4520 method17882(Class1005 var1, boolean var2, boolean var3, boolean var4) {
      if (var1.method4203()) {
         ResourceLocation var7 = this.method17843(var1);
         if (!var3) {
            return !var2 ? null : Class4520.method14311(var7, false);
         } else {
            return Class4520.method14317(var7, false);
         }
      } else {
         return super.method17882(var1, var2, var3, var4);
      }
   }
}
