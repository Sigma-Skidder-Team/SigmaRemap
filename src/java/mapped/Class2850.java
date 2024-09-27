package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class2850 extends Class2828 {
   private static String[] field17655;
   private final ModelRenderer field17656 = new ModelRenderer(64, 32, 0, 0).method22673(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final ModelRenderer field17657 = new ModelRenderer(64, 32, 16, 0).method22673(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final ModelRenderer field17658;
   private final ModelRenderer field17659;
   private final ModelRenderer field17660;
   private final ModelRenderer field17661;
   private final ModelRenderer field17662 = new ModelRenderer(64, 32, 12, 0).method22673(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F);
   private final List<ModelRenderer> field17663;

   public Class2850() {
      super(RenderType::getEntitySolid);
      this.field17658 = new ModelRenderer(64, 32, 0, 10).method22673(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F);
      this.field17659 = new ModelRenderer(64, 32, 12, 10).method22673(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F);
      this.field17660 = new ModelRenderer(64, 32, 24, 10).method22673(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.field17661 = new ModelRenderer(64, 32, 24, 10).method22673(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.field17663 = ImmutableList.of(this.field17656, this.field17657, this.field17662, this.field17658, this.field17659, this.field17660, this.field17661);
      this.field17656.setRotationPoint(0.0F, 0.0F, -1.0F);
      this.field17657.setRotationPoint(0.0F, 0.0F, 1.0F);
      this.field17662.rotateAngleY = (float) (Math.PI / 2);
   }

   @Override
   public void method11016(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.method11176(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method11176(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17663.forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void method11177(float var1, float var2, float var3, float var4) {
      float var7 = (MathHelper.sin(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.field17656.rotateAngleY = (float) Math.PI + var7;
      this.field17657.rotateAngleY = -var7;
      this.field17658.rotateAngleY = var7;
      this.field17659.rotateAngleY = -var7;
      this.field17660.rotateAngleY = var7 - var7 * 2.0F * var2;
      this.field17661.rotateAngleY = var7 - var7 * 2.0F * var3;
      this.field17658.rotationPointX = MathHelper.sin(var7);
      this.field17659.rotationPointX = MathHelper.sin(var7);
      this.field17660.rotationPointX = MathHelper.sin(var7);
      this.field17661.rotationPointX = MathHelper.sin(var7);
   }
}
