package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class2842 extends Class2828 {
   public static final ResourceLocation field17638 = new ResourceLocation("textures/entity/trident.png");
   private final ModelRenderer field17639 = new ModelRenderer(32, 32, 0, 6);

   public Class2842() {
      super(RenderType::getEntitySolid);
      this.field17639.addBox(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F, 0.0F);
      ModelRenderer var3 = new ModelRenderer(32, 32, 4, 0);
      var3.method22673(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F);
      this.field17639.method22670(var3);
      ModelRenderer var4 = new ModelRenderer(32, 32, 4, 3);
      var4.method22673(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.field17639.method22670(var4);
      ModelRenderer var5 = new ModelRenderer(32, 32, 0, 0);
      var5.addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field17639.method22670(var5);
      ModelRenderer var6 = new ModelRenderer(32, 32, 4, 3);
      var6.field31038 = true;
      var6.method22673(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.field17639.method22670(var6);
   }

   @Override
   public void method11016(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17639.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
