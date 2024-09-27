package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public class Class2845 extends Class2844 {
   private static String[] field17643;
   private final ModelRenderer field17645 = new ModelRenderer(this, 32, 0);

   public Class2845() {
      super(0, 0, 64, 64);
      this.field17645.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F);
      this.field17645.setRotationPoint(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void method11174(float var1, float var2, float var3) {
      super.method11174(var1, var2, var3);
      this.field17645.rotateAngleY = this.field17644.rotateAngleY;
      this.field17645.rotateAngleX = this.field17644.rotateAngleX;
   }

   @Override
   public void method11016(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      super.method11016(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field17645.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
