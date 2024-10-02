package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Class2875 extends Class2827<Class1007> {
   private final ModelRenderer field17797;
   private final ModelRenderer field17798;
   private final ModelRenderer field17799;
   private final ModelRenderer field17800;
   private ModelRenderer field17801;
   private ModelRenderer field17802;
   private ModelRenderer field17803;
   private ModelRenderer field17804;
   private ModelRenderer field17805;
   private ModelRenderer field17806;
   private ModelRenderer field17807;
   private ModelRenderer field17808;
   private ModelRenderer field17809;
   private ModelRenderer field17810;
   private ModelRenderer field17811;
   private ModelRenderer field17812;
   private ModelRenderer field17813;
   private ModelRenderer field17814;
   private ModelRenderer field17815;
   private ModelRenderer field17816;
   private Class1007 field17817;
   private float field17818;

   public Class2875() {
      this.textureWidth = 256;
      this.textureHeight = 256;
      float var3 = -16.0F;
      this.field17797 = new ModelRenderer(this);
      this.field17797.method22672("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 0.0F, 176, 44);
      this.field17797.method22672("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, 0.0F, 112, 30);
      this.field17797.mirror = true;
      this.field17797.method22672("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0.0F, 0, 0);
      this.field17797.method22672("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 0.0F, 112, 0);
      this.field17797.mirror = false;
      this.field17797.method22672("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0.0F, 0, 0);
      this.field17797.method22672("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 0.0F, 112, 0);
      this.field17799 = new ModelRenderer(this);
      this.field17799.setRotationPoint(0.0F, 4.0F, -8.0F);
      this.field17799.method22672("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, 0.0F, 176, 65);
      this.field17797.method22670(this.field17799);
      this.field17798 = new ModelRenderer(this);
      this.field17798.method22672("box", -5.0F, -5.0F, -5.0F, 10, 10, 10, 0.0F, 192, 104);
      this.field17798.method22672("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6, 0.0F, 48, 0);
      this.field17800 = new ModelRenderer(this);
      this.field17800.setRotationPoint(0.0F, 4.0F, 8.0F);
      this.field17800.method22672("body", -12.0F, 0.0F, -16.0F, 24, 24, 64, 0.0F, 0, 0);
      this.field17800.method22672("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12, 0.0F, 220, 53);
      this.field17800.method22672("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12, 0.0F, 220, 53);
      this.field17800.method22672("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12, 0.0F, 220, 53);
      this.field17801 = new ModelRenderer(this);
      this.field17801.mirror = true;
      this.field17801.setRotationPoint(12.0F, 5.0F, 2.0F);
      this.field17801.method22672("bone", 0.0F, -4.0F, -4.0F, 56, 8, 8, 0.0F, 112, 88);
      this.field17801.method22672("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 88);
      this.field17802 = new ModelRenderer(this);
      this.field17802.mirror = true;
      this.field17802.setRotationPoint(56.0F, 0.0F, 0.0F);
      this.field17802.method22672("bone", 0.0F, -2.0F, -2.0F, 56, 4, 4, 0.0F, 112, 136);
      this.field17802.method22672("skin", 0.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 144);
      this.field17801.method22670(this.field17802);
      this.field17803 = new ModelRenderer(this);
      this.field17803.setRotationPoint(12.0F, 20.0F, 2.0F);
      this.field17803.method22672("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 0.0F, 112, 104);
      this.field17804 = new ModelRenderer(this);
      this.field17804.setRotationPoint(0.0F, 20.0F, -1.0F);
      this.field17804.method22672("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 0.0F, 226, 138);
      this.field17803.method22670(this.field17804);
      this.field17805 = new ModelRenderer(this);
      this.field17805.setRotationPoint(0.0F, 23.0F, 0.0F);
      this.field17805.method22672("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 0.0F, 144, 104);
      this.field17804.method22670(this.field17805);
      this.field17806 = new ModelRenderer(this);
      this.field17806.setRotationPoint(16.0F, 16.0F, 42.0F);
      this.field17806.method22672("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0.0F, 0, 0);
      this.field17807 = new ModelRenderer(this);
      this.field17807.setRotationPoint(0.0F, 32.0F, -4.0F);
      this.field17807.method22672("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 0.0F, 196, 0);
      this.field17806.method22670(this.field17807);
      this.field17808 = new ModelRenderer(this);
      this.field17808.setRotationPoint(0.0F, 31.0F, 4.0F);
      this.field17808.method22672("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 0.0F, 112, 0);
      this.field17807.method22670(this.field17808);
      this.field17809 = new ModelRenderer(this);
      this.field17809.setRotationPoint(-12.0F, 5.0F, 2.0F);
      this.field17809.method22672("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8, 0.0F, 112, 88);
      this.field17809.method22672("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 88);
      this.field17810 = new ModelRenderer(this);
      this.field17810.setRotationPoint(-56.0F, 0.0F, 0.0F);
      this.field17810.method22672("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4, 0.0F, 112, 136);
      this.field17810.method22672("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56, 0.0F, -56, 144);
      this.field17809.method22670(this.field17810);
      this.field17811 = new ModelRenderer(this);
      this.field17811.setRotationPoint(-12.0F, 20.0F, 2.0F);
      this.field17811.method22672("main", -4.0F, -4.0F, -4.0F, 8, 24, 8, 0.0F, 112, 104);
      this.field17812 = new ModelRenderer(this);
      this.field17812.setRotationPoint(0.0F, 20.0F, -1.0F);
      this.field17812.method22672("main", -3.0F, -1.0F, -3.0F, 6, 24, 6, 0.0F, 226, 138);
      this.field17811.method22670(this.field17812);
      this.field17813 = new ModelRenderer(this);
      this.field17813.setRotationPoint(0.0F, 23.0F, 0.0F);
      this.field17813.method22672("main", -4.0F, 0.0F, -12.0F, 8, 4, 16, 0.0F, 144, 104);
      this.field17812.method22670(this.field17813);
      this.field17814 = new ModelRenderer(this);
      this.field17814.setRotationPoint(-16.0F, 16.0F, 42.0F);
      this.field17814.method22672("main", -8.0F, -4.0F, -8.0F, 16, 32, 16, 0.0F, 0, 0);
      this.field17815 = new ModelRenderer(this);
      this.field17815.setRotationPoint(0.0F, 32.0F, -4.0F);
      this.field17815.method22672("main", -6.0F, -2.0F, 0.0F, 12, 32, 12, 0.0F, 196, 0);
      this.field17814.method22670(this.field17815);
      this.field17816 = new ModelRenderer(this);
      this.field17816.setRotationPoint(0.0F, 31.0F, 4.0F);
      this.field17816.method22672("main", -9.0F, 0.0F, -20.0F, 18, 6, 24, 0.0F, 112, 0);
      this.field17815.method22670(this.field17816);
   }

   public void setLivingAnimations(Class1007 var1, float var2, float var3, float var4) {
      this.field17817 = var1;
      this.field17818 = var4;
   }

   public void setRotationAngles(Class1007 var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      var1.push();
      float var11 = MathHelper.lerp(this.field17818, this.field17817.field5632, this.field17817.field5633);
      this.field17799.rotateAngleX = (float)(Math.sin((double)(var11 * (float) (Math.PI * 2))) + 1.0) * 0.2F;
      float var12 = (float)(Math.sin((double)(var11 * (float) (Math.PI * 2) - 1.0F)) + 1.0);
      var12 = (var12 * var12 + var12 * 2.0F) * 0.05F;
      var1.translate(0.0, (double)(var12 - 2.0F), -3.0);
      var1.rotate(Vector3f.XP.rotationDegrees(var12 * 2.0F));
      float var13 = 0.0F;
      float var14 = 20.0F;
      float var15 = -12.0F;
      float var16 = 1.5F;
      double[] var17 = this.field17817.method4317(6, this.field17818);
      float var18 = MathHelper.method37829(this.field17817.method4317(5, this.field17818)[0] - this.field17817.method4317(10, this.field17818)[0]);
      float var19 = MathHelper.method37829(this.field17817.method4317(5, this.field17818)[0] + (double)(var18 / 2.0F));
      float var20 = var11 * (float) (Math.PI * 2);

      for (int var21 = 0; var21 < 5; var21++) {
         double[] var22 = this.field17817.method4317(5 - var21, this.field17818);
         float var23 = (float)Math.cos((double)((float)var21 * 0.45F + var20)) * 0.15F;
         this.field17798.rotateAngleY = MathHelper.method37829(var22[0] - var17[0]) * (float) (Math.PI / 180.0) * 1.5F;
         this.field17798.rotateAngleX = var23 + this.field17817.method4333(var21, var17, var22) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         this.field17798.rotateAngleZ = -MathHelper.method37829(var22[0] - (double)var19) * (float) (Math.PI / 180.0) * 1.5F;
         this.field17798.rotationPointY = var14;
         this.field17798.rotationPointZ = var15;
         this.field17798.rotationPointX = var13;
         var14 = (float)((double)var14 + Math.sin((double)this.field17798.rotateAngleX) * 10.0);
         var15 = (float)((double)var15 - Math.cos((double)this.field17798.rotateAngleY) * Math.cos((double)this.field17798.rotateAngleX) * 10.0);
         var13 = (float)((double)var13 - Math.sin((double)this.field17798.rotateAngleY) * Math.cos((double)this.field17798.rotateAngleX) * 10.0);
         this.field17798.render(var1, var2, var3, var4);
      }

      this.field17797.rotationPointY = var14;
      this.field17797.rotationPointZ = var15;
      this.field17797.rotationPointX = var13;
      double[] var31 = this.field17817.method4317(0, this.field17818);
      this.field17797.rotateAngleY = MathHelper.method37829(var31[0] - var17[0]) * (float) (Math.PI / 180.0);
      this.field17797.rotateAngleX = MathHelper.method37829((double)this.field17817.method4333(6, var17, var31)) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
      this.field17797.rotateAngleZ = -MathHelper.method37829(var31[0] - (double)var19) * (float) (Math.PI / 180.0);
      this.field17797.render(var1, var2, var3, var4);
      var1.push();
      var1.translate(0.0, 1.0, 0.0);
      var1.rotate(Vector3f.ZP.rotationDegrees(-var18 * 1.5F));
      var1.translate(0.0, -1.0, 0.0);
      this.field17800.rotateAngleZ = 0.0F;
      this.field17800.render(var1, var2, var3, var4);
      float var33 = var11 * (float) (Math.PI * 2);
      this.field17801.rotateAngleX = 0.125F - (float)Math.cos((double)var33) * 0.2F;
      this.field17801.rotateAngleY = -0.25F;
      this.field17801.rotateAngleZ = -((float)(Math.sin((double)var33) + 0.125)) * 0.8F;
      this.field17802.rotateAngleZ = (float)(Math.sin((double)(var33 + 2.0F)) + 0.5) * 0.75F;
      this.field17809.rotateAngleX = this.field17801.rotateAngleX;
      this.field17809.rotateAngleY = -this.field17801.rotateAngleY;
      this.field17809.rotateAngleZ = -this.field17801.rotateAngleZ;
      this.field17810.rotateAngleZ = -this.field17802.rotateAngleZ;
      this.method11192(
         var1, var2, var3, var4, var12, this.field17801, this.field17803, this.field17804, this.field17805, this.field17806, this.field17807, this.field17808
      );
      this.method11192(
         var1, var2, var3, var4, var12, this.field17809, this.field17811, this.field17812, this.field17813, this.field17814, this.field17815, this.field17816
      );
      var1.pop();
      float var34 = -((float)Math.sin((double)(var11 * (float) (Math.PI * 2)))) * 0.0F;
      var20 = var11 * (float) (Math.PI * 2);
      var14 = 10.0F;
      var15 = 60.0F;
      var13 = 0.0F;
      var17 = this.field17817.method4317(11, this.field17818);

      for (int var24 = 0; var24 < 12; var24++) {
         var31 = this.field17817.method4317(12 + var24, this.field17818);
         var34 = (float)((double)var34 + Math.sin((double)((float)var24 * 0.45F + var20)) * 0.05F);
         this.field17798.rotateAngleY = (MathHelper.method37829(var31[0] - var17[0]) * 1.5F + 180.0F) * (float) (Math.PI / 180.0);
         this.field17798.rotateAngleX = var34 + (float)(var31[1] - var17[1]) * (float) (Math.PI / 180.0) * 1.5F * 5.0F;
         this.field17798.rotateAngleZ = MathHelper.method37829(var31[0] - (double)var19) * (float) (Math.PI / 180.0) * 1.5F;
         this.field17798.rotationPointY = var14;
         this.field17798.rotationPointZ = var15;
         this.field17798.rotationPointX = var13;
         var14 = (float)((double)var14 + Math.sin((double)this.field17798.rotateAngleX) * 10.0);
         var15 = (float)((double)var15 - Math.cos((double)this.field17798.rotateAngleY) * Math.cos((double)this.field17798.rotateAngleX) * 10.0);
         var13 = (float)((double)var13 - Math.sin((double)this.field17798.rotateAngleY) * Math.cos((double)this.field17798.rotateAngleX) * 10.0);
         this.field17798.render(var1, var2, var3, var4);
      }

      var1.pop();
   }

   private void method11192(
      MatrixStack var1,
      IVertexBuilder var2,
      int var3,
      int var4,
      float var5,
      ModelRenderer var6,
      ModelRenderer var7,
      ModelRenderer var8,
      ModelRenderer var9,
      ModelRenderer var10,
      ModelRenderer var11,
      ModelRenderer var12
   ) {
      var10.rotateAngleX = 1.0F + var5 * 0.1F;
      var11.rotateAngleX = 0.5F + var5 * 0.1F;
      var12.rotateAngleX = 0.75F + var5 * 0.1F;
      var7.rotateAngleX = 1.3F + var5 * 0.1F;
      var8.rotateAngleX = -0.5F - var5 * 0.1F;
      var9.rotateAngleX = 0.75F + var5 * 0.1F;
      var6.render(var1, var2, var3, var4);
      var7.render(var1, var2, var3, var4);
      var10.render(var1, var2, var3, var4);
   }
}
