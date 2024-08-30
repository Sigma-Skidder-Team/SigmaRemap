package mapped;

import javax.annotation.Nullable;

public class Class5742 extends Class5712<ArmorStandEntity, Class2892> {
   public static final ResourceLocation field25165 = new ResourceLocation("textures/entity/armorstand/wood.png");

   public Class5742(EntityRendererManager var1) {
      super(var1, new Class2893(), 0.0F);
      this.method17880(new Class255<ArmorStandEntity, Class2892, Class2892>(this, new Class2892(0.5F), new Class2892(1.0F)));
      this.method17880(new Class242<ArmorStandEntity, Class2892>(this));
      this.method17880(new Class220<ArmorStandEntity, Class2892>(this));
      this.method17880(new Class235<ArmorStandEntity, Class2892>(this));
   }

   public ResourceLocation method17843(ArmorStandEntity var1) {
      return field25165;
   }

   public void method17842(ArmorStandEntity var1, MatrixStack var2, float var3, float var4, float var5) {
      var2.rotate(Vector3f.YP.rotationDegrees(180.0F - var4));
      float var8 = (float)(var1.world.method6783() - var1.field5584) + var5;
      if (var8 < 5.0F) {
         var2.rotate(Vector3f.YP.rotationDegrees(MathHelper.sin(var8 / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   public boolean method17852(ArmorStandEntity var1) {
      double var4 = this.field25097.method32228(var1);
      float var6 = !var1.method3336() ? 64.0F : 32.0F;
      return !(var4 >= (double)(var6 * var6)) ? var1.method3383() : false;
   }

   @Nullable
   public RenderType method17882(ArmorStandEntity var1, boolean var2, boolean var3, boolean var4) {
      if (var1.method4203()) {
         ResourceLocation var7 = this.method17843(var1);
         if (!var3) {
            return !var2 ? null : RenderType.method14311(var7, false);
         } else {
            return RenderType.method14317(var7, false);
         }
      } else {
         return super.method17882(var1, var2, var3, var4);
      }
   }
}
