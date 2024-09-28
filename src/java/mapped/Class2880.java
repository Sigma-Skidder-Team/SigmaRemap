package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2880<T extends Class1058> extends Class2803<T> {
   private static String[] field17855;
   private final ModelRenderer field17856;
   private final ModelRenderer field17857;
   private final ModelRenderer field17858;
   private final ModelRenderer field17859;
   private final ModelRenderer field17860;
   private final ModelRenderer field17861;

   public Class2880() {
      short var3 = 128;
      short var4 = 128;
      this.field17856 = new ModelRenderer(this).setTextureSize(128, 128);
      this.field17856.setRotationPoint(0.0F, -7.0F, -2.0F);
      this.field17856.method22671(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F);
      this.field17856.method22671(24, 0).addBox(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F);
      this.field17857 = new ModelRenderer(this).setTextureSize(128, 128);
      this.field17857.setRotationPoint(0.0F, -7.0F, 0.0F);
      this.field17857.method22671(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F);
      this.field17857.method22671(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F);
      this.field17858 = new ModelRenderer(this).setTextureSize(128, 128);
      this.field17858.setRotationPoint(0.0F, -7.0F, 0.0F);
      this.field17858.method22671(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.field17859 = new ModelRenderer(this).setTextureSize(128, 128);
      this.field17859.setRotationPoint(0.0F, -7.0F, 0.0F);
      this.field17859.method22671(60, 58).addBox(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.field17860 = new ModelRenderer(this, 0, 22).setTextureSize(128, 128);
      this.field17860.setRotationPoint(-4.0F, 11.0F, 0.0F);
      this.field17860.method22671(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
      this.field17861 = new ModelRenderer(this, 0, 22).setTextureSize(128, 128);
      this.field17861.mirror = true;
      this.field17861.method22671(60, 0).setRotationPoint(5.0F, 11.0F, 0.0F);
      this.field17861.addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17856, this.field17857, this.field17860, this.field17861, this.field17858, this.field17859);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17856.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17856.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17860.rotateAngleX = -1.5F * MathHelper.method37830(var2, 13.0F) * var3;
      this.field17861.rotateAngleX = 1.5F * MathHelper.method37830(var2, 13.0F) * var3;
      this.field17860.rotateAngleY = 0.0F;
      this.field17861.rotateAngleY = 0.0F;
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      int var7 = var1.method4866();
      if (var7 <= 0) {
         int var8 = var1.method4868();
         if (var8 <= 0) {
            this.field17858.rotateAngleX = (-0.2F + 1.5F * MathHelper.method37830(var2, 13.0F)) * var3;
            this.field17859.rotateAngleX = (-0.2F - 1.5F * MathHelper.method37830(var2, 13.0F)) * var3;
         } else {
            this.field17858.rotateAngleX = -0.8F + 0.025F * MathHelper.method37830((float)var8, 70.0F);
            this.field17859.rotateAngleX = 0.0F;
         }
      } else {
         this.field17858.rotateAngleX = -2.0F + 1.5F * MathHelper.method37830((float)var7 - var4, 10.0F);
         this.field17859.rotateAngleX = -2.0F + 1.5F * MathHelper.method37830((float)var7 - var4, 10.0F);
      }
   }

   public ModelRenderer method11198() {
      return this.field17858;
   }
}
