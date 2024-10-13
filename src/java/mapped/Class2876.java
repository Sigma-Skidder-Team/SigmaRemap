package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Class2876<T extends Class1094> extends Class2827<T> {
   private static String[] field17819;
   private final ModelRenderer field17820 = new ModelRenderer(this, 26, 24);
   private final ModelRenderer field17821;
   private final ModelRenderer field17822;
   private final ModelRenderer field17823;
   private final ModelRenderer field17824;
   private final ModelRenderer field17825;
   private final ModelRenderer field17826;
   private final ModelRenderer field17827;
   private final ModelRenderer field17828;
   private final ModelRenderer field17829;
   private final ModelRenderer field17830;
   private final ModelRenderer field17831;
   private float field17832;

   public Class2876() {
      this.field17820.method22673(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F);
      this.field17820.setRotationPoint(3.0F, 17.5F, 3.7F);
      this.field17820.mirror = true;
      this.method11193(this.field17820, 0.0F, 0.0F, 0.0F);
      this.field17821 = new ModelRenderer(this, 8, 24);
      this.field17821.method22673(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F);
      this.field17821.setRotationPoint(-3.0F, 17.5F, 3.7F);
      this.field17821.mirror = true;
      this.method11193(this.field17821, 0.0F, 0.0F, 0.0F);
      this.field17822 = new ModelRenderer(this, 30, 15);
      this.field17822.method22673(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F);
      this.field17822.setRotationPoint(3.0F, 17.5F, 3.7F);
      this.field17822.mirror = true;
      this.method11193(this.field17822, (float) (-Math.PI / 9), 0.0F, 0.0F);
      this.field17823 = new ModelRenderer(this, 16, 15);
      this.field17823.method22673(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F);
      this.field17823.setRotationPoint(-3.0F, 17.5F, 3.7F);
      this.field17823.mirror = true;
      this.method11193(this.field17823, (float) (-Math.PI / 9), 0.0F, 0.0F);
      this.field17824 = new ModelRenderer(this, 0, 0);
      this.field17824.method22673(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F);
      this.field17824.setRotationPoint(0.0F, 19.0F, 8.0F);
      this.field17824.mirror = true;
      this.method11193(this.field17824, (float) (-Math.PI / 9), 0.0F, 0.0F);
      this.field17825 = new ModelRenderer(this, 8, 15);
      this.field17825.method22673(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F);
      this.field17825.setRotationPoint(3.0F, 17.0F, -1.0F);
      this.field17825.mirror = true;
      this.method11193(this.field17825, (float) (-Math.PI / 18), 0.0F, 0.0F);
      this.field17826 = new ModelRenderer(this, 0, 15);
      this.field17826.method22673(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F);
      this.field17826.setRotationPoint(-3.0F, 17.0F, -1.0F);
      this.field17826.mirror = true;
      this.method11193(this.field17826, (float) (-Math.PI / 18), 0.0F, 0.0F);
      this.field17827 = new ModelRenderer(this, 32, 0);
      this.field17827.method22673(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F);
      this.field17827.setRotationPoint(0.0F, 16.0F, -1.0F);
      this.field17827.mirror = true;
      this.method11193(this.field17827, 0.0F, 0.0F, 0.0F);
      this.field17828 = new ModelRenderer(this, 52, 0);
      this.field17828.method22673(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F);
      this.field17828.setRotationPoint(0.0F, 16.0F, -1.0F);
      this.field17828.mirror = true;
      this.method11193(this.field17828, 0.0F, (float) (-Math.PI / 12), 0.0F);
      this.field17829 = new ModelRenderer(this, 58, 0);
      this.field17829.method22673(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F);
      this.field17829.setRotationPoint(0.0F, 16.0F, -1.0F);
      this.field17829.mirror = true;
      this.method11193(this.field17829, 0.0F, (float) (Math.PI / 12), 0.0F);
      this.field17830 = new ModelRenderer(this, 52, 6);
      this.field17830.method22673(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F);
      this.field17830.setRotationPoint(0.0F, 20.0F, 7.0F);
      this.field17830.mirror = true;
      this.method11193(this.field17830, -0.3490659F, 0.0F, 0.0F);
      this.field17831 = new ModelRenderer(this, 32, 9);
      this.field17831.method22673(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F);
      this.field17831.setRotationPoint(0.0F, 16.0F, -1.0F);
      this.field17831.mirror = true;
      this.method11193(this.field17831, 0.0F, 0.0F, 0.0F);
   }

   private void method11193(ModelRenderer var1, float var2, float var3, float var4) {
      var1.rotateAngleX = var2;
      var1.rotateAngleY = var3;
      var1.rotateAngleZ = var4;
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (!this.isChild) {
         var1.push();
         var1.scale(0.6F, 0.6F, 0.6F);
         var1.translate(0.0, 1.0, 0.0);
         ImmutableList.of(
               this.field17820,
               this.field17821,
               this.field17822,
               this.field17823,
               this.field17824,
               this.field17825,
               this.field17826,
               this.field17827,
               this.field17828,
               this.field17829,
               this.field17830,
               this.field17831,
               new ModelRenderer[0]
            )
            .forEach(var8x -> var8x.render(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.pop();
      } else {
         float var11 = 1.5F;
         var1.push();
         var1.scale(0.56666666F, 0.56666666F, 0.56666666F);
         var1.translate(0.0, 1.375, 0.125);
         ImmutableList.of(this.field17827, this.field17829, this.field17828, this.field17831)
            .forEach(var8x -> var8x.render(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.pop();
         var1.push();
         var1.scale(0.4F, 0.4F, 0.4F);
         var1.translate(0.0, 2.25, 0.0);
         ImmutableList.of(
               this.field17820, this.field17821, this.field17822, this.field17823, this.field17824, this.field17825, this.field17826, this.field17830
            )
            .forEach(var8x -> var8x.render(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.pop();
      }
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var4 - (float)var1.ticksExisted;
      this.field17831.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17827.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17828.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17829.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17831.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17827.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17828.rotateAngleY = this.field17831.rotateAngleY - (float) (Math.PI / 12);
      this.field17829.rotateAngleY = this.field17831.rotateAngleY + (float) (Math.PI / 12);
      this.field17832 = MathHelper.sin(var1.method5103(var9) * (float) Math.PI);
      this.field17822.rotateAngleX = (this.field17832 * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.field17823.rotateAngleX = (this.field17832 * 50.0F - 21.0F) * (float) (Math.PI / 180.0);
      this.field17820.rotateAngleX = this.field17832 * 50.0F * (float) (Math.PI / 180.0);
      this.field17821.rotateAngleX = this.field17832 * 50.0F * (float) (Math.PI / 180.0);
      this.field17825.rotateAngleX = (this.field17832 * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
      this.field17826.rotateAngleX = (this.field17832 * -40.0F - 11.0F) * (float) (Math.PI / 180.0);
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      super.setLivingAnimations((T)var1, var2, var3, var4);
      this.field17832 = MathHelper.sin(var1.method5103(var4) * (float) Math.PI);
   }
}
