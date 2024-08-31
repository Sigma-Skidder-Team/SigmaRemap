package mapped;

import net.minecraft.entity.LivingEntity;

public class Class261<T extends LivingEntity> extends Class219<T, Class2894<T>> {
   public static final ResourceLocation field921 = new ResourceLocation("textures/entity/trident_riptide.png");
   private final Class7219 field922 = new Class7219(64, 64, 0, 0);

   public Class261(Class5714<T, Class2894<T>> var1) {
      super(var1);
      this.field922.method22673(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method3130()) {
         Class5422 var13 = var2.method25597(RenderType.getEntityCutoutNoCull(field921));

         for (int var14 = 0; var14 < 3; var14++) {
            var1.push();
            float var15 = var8 * (float)(-(45 + var14 * 5));
            var1.rotate(Vector3f.YP.rotationDegrees(var15));
            float var16 = 0.75F * (float)var14;
            var1.method35292(var16, var16, var16);
            var1.translate(0.0, (double)(-0.2F + 0.6F * (float)var14), 0.0);
            this.field922.method22680(var1, var13, var3, Class213.field798);
            var1.pop();
         }
      }
   }
}
