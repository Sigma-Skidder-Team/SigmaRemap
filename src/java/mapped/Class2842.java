package mapped;

import net.minecraft.util.ResourceLocation;

public class Class2842 extends Class2828 {
   public static final ResourceLocation field17638 = new ResourceLocation("textures/entity/trident.png");
   private final Class7219 field17639 = new Class7219(32, 32, 0, 6);

   public Class2842() {
      super(RenderType::getEntitySolid);
      this.field17639.method22675(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F, 0.0F);
      Class7219 var3 = new Class7219(32, 32, 4, 0);
      var3.method22673(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F);
      this.field17639.method22670(var3);
      Class7219 var4 = new Class7219(32, 32, 4, 3);
      var4.method22673(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.field17639.method22670(var4);
      Class7219 var5 = new Class7219(32, 32, 0, 0);
      var5.method22675(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field17639.method22670(var5);
      Class7219 var6 = new Class7219(32, 32, 4, 3);
      var6.field31038 = true;
      var6.method22673(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.field17639.method22670(var6);
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17639.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
