package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public final class Class2848 extends Class2828 {
   private static String[] field17649;
   public final ModelRenderer field17650 = new ModelRenderer(64, 32, 0, 0);
   public final ModelRenderer field17651;

   public Class2848() {
      super(RenderType::getEntityCutoutNoCull);
      this.field17650.addBox(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F, 0.0F);
      this.field17651 = new ModelRenderer(64, 32, 0, 14);
      this.field17651.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F);
   }

   @Override
   public void method11016(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17650.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field17651.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
