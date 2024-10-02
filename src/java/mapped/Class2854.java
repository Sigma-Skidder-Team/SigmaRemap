package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Class2854<T extends Class1066> extends Class2827<T> {
   private static String[] field17676;
   private final ModelRenderer field17677;
   private final ModelRenderer field17678;
   private final ModelRenderer field17679;
   private final ModelRenderer field17680;
   private final ModelRenderer field17681;
   private final ModelRenderer field17682;
   private final ModelRenderer field17683;
   private final ModelRenderer field17684;

   public Class2854(float var1) {
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.field17677 = new ModelRenderer(this, 0, 0);
      this.field17677.addBox(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, var1);
      this.field17677.setRotationPoint(0.0F, 7.0F, -6.0F);
      this.field17677.method22671(0, 14).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, var1);
      this.field17677.method22671(17, 0).addBox(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.field17677.method22671(17, 0).addBox(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.field17678 = new ModelRenderer(this, 29, 0);
      this.field17678.addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, var1);
      this.field17678.setRotationPoint(0.0F, 5.0F, 2.0F);
      this.field17683 = new ModelRenderer(this, 45, 28);
      this.field17683.addBox(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.field17683.setRotationPoint(-8.5F, 3.0F, 3.0F);
      this.field17683.rotateAngleY = (float) (Math.PI / 2);
      this.field17684 = new ModelRenderer(this, 45, 41);
      this.field17684.addBox(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.field17684.setRotationPoint(5.5F, 3.0F, 3.0F);
      this.field17684.rotateAngleY = (float) (Math.PI / 2);
      byte var4 = 4;
      byte var5 = 14;
      this.field17679 = new ModelRenderer(this, 29, 29);
      this.field17679.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17679.setRotationPoint(-2.5F, 10.0F, 6.0F);
      this.field17680 = new ModelRenderer(this, 29, 29);
      this.field17680.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17680.setRotationPoint(2.5F, 10.0F, 6.0F);
      this.field17681 = new ModelRenderer(this, 29, 29);
      this.field17681.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17681.setRotationPoint(-2.5F, 10.0F, -4.0F);
      this.field17682 = new ModelRenderer(this, 29, 29);
      this.field17682.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field17682.setRotationPoint(2.5F, 10.0F, -4.0F);
      this.field17679.rotationPointX--;
      this.field17680.rotationPointX++;
      this.field17679.rotationPointZ += 0.0F;
      this.field17680.rotationPointZ += 0.0F;
      this.field17681.rotationPointX--;
      this.field17682.rotationPointX++;
      this.field17681.rotationPointZ--;
      this.field17682.rotationPointZ--;
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17677.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17677.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17678.rotateAngleX = (float) (Math.PI / 2);
      this.field17679.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17680.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17681.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17682.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      boolean var9 = !var1.isChild() && var1.method4927();
      this.field17683.showModel = var9;
      this.field17684.showModel = var9;
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (!this.field17602) {
         ImmutableList.of(
               this.field17677, this.field17678, this.field17679, this.field17680, this.field17681, this.field17682, this.field17683, this.field17684
            )
            .forEach(var8x -> var8x.render(var1, var2, var3, var4, var5, var6, var7, var8));
      } else {
         float var11 = 2.0F;
         var1.push();
         float var12 = 0.7F;
         var1.scale(0.71428573F, 0.64935064F, 0.7936508F);
         var1.translate(0.0, 1.3125, 0.22F);
         this.field17677.render(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.pop();
         var1.push();
         float var13 = 1.1F;
         var1.scale(0.625F, 0.45454544F, 0.45454544F);
         var1.translate(0.0, 2.0625, 0.0);
         this.field17678.render(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.pop();
         var1.push();
         var1.scale(0.45454544F, 0.41322312F, 0.45454544F);
         var1.translate(0.0, 2.0625, 0.0);
         ImmutableList.of(this.field17679, this.field17680, this.field17681, this.field17682, this.field17683, this.field17684)
            .forEach(var8x -> var8x.render(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.pop();
      }
   }
}
