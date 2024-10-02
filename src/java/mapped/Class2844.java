package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public class Class2844 extends Class2828 {
   private static String[] field17643;
   public final ModelRenderer field17644;

   public Class2844() {
      this(0, 35, 64, 64);
   }

   public Class2844(int var1, int var2, int var3, int var4) {
      super(RenderType::getEntityTranslucent);
      this.textureWidth = var3;
      this.textureHeight = var4;
      this.field17644 = new ModelRenderer(this, var1, var2);
      this.field17644.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.field17644.setRotationPoint(0.0F, 0.0F, 0.0F);
   }

   public void method11174(float var1, float var2, float var3) {
      this.field17644.rotateAngleY = var2 * (float) (Math.PI / 180.0);
      this.field17644.rotateAngleX = var3 * (float) (Math.PI / 180.0);
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17644.render(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
