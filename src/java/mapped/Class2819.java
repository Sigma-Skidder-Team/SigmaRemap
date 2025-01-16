package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2819 extends Class2803<RavagerEntity> {
   private static String[] field17556;
   private final ModelRenderer field17557;
   private final ModelRenderer field17558;
   private final ModelRenderer field17559;
   private final ModelRenderer field17560;
   private final ModelRenderer field17561;
   private final ModelRenderer field17562;
   private final ModelRenderer field17563;
   private final ModelRenderer field17564;

   public Class2819() {
      this.textureWidth = 128;
      this.textureHeight = 128;

      this.field17564 = new ModelRenderer(this);
      this.field17564.setRotationPoint(0.0F, -7.0F, -1.5F);
      this.field17564.method22671(68, 73).addBox(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F, 0.0F);
      this.field17557 = new ModelRenderer(this);
      this.field17557.setRotationPoint(0.0F, 16.0F, -17.0F);
      this.field17557.method22671(0, 0).addBox(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, 0.0F);
      this.field17557.method22671(0, 0).addBox(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, 0.0F);
      ModelRenderer var5 = new ModelRenderer(this);
      var5.setRotationPoint(-10.0F, -14.0F, -8.0F);
      var5.method22671(74, 55).addBox(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var5.rotateAngleX = 1.0995574F;
      this.field17557.method22670(var5);
      ModelRenderer var6 = new ModelRenderer(this);
      var6.mirror = true;
      var6.setRotationPoint(8.0F, -14.0F, -8.0F);
      var6.method22671(74, 55).addBox(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var6.rotateAngleX = 1.0995574F;
      this.field17557.method22670(var6);
      this.field17558 = new ModelRenderer(this);
      this.field17558.setRotationPoint(0.0F, -2.0F, 2.0F);
      this.field17558.method22671(0, 36).addBox(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F, 0.0F);
      this.field17557.method22670(this.field17558);
      this.field17564.method22670(this.field17557);
      this.field17559 = new ModelRenderer(this);
      this.field17559.method22671(0, 55).addBox(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, 0.0F);
      this.field17559.method22671(0, 91).addBox(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, 0.0F);
      this.field17559.setRotationPoint(0.0F, 1.0F, 2.0F);
      this.field17560 = new ModelRenderer(this, 96, 0);
      this.field17560.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17560.setRotationPoint(-8.0F, -13.0F, 18.0F);
      this.field17561 = new ModelRenderer(this, 96, 0);
      this.field17561.mirror = true;
      this.field17561.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17561.setRotationPoint(8.0F, -13.0F, 18.0F);
      this.field17562 = new ModelRenderer(this, 64, 0);
      this.field17562.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17562.setRotationPoint(-8.0F, -13.0F, -5.0F);
      this.field17563 = new ModelRenderer(this, 64, 0);
      this.field17563.mirror = true;
      this.field17563.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17563.setRotationPoint(8.0F, -13.0F, -5.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17564, this.field17559, this.field17560, this.field17561, this.field17562, this.field17563);
   }

   public void setRotationAngles(RavagerEntity var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17557.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17557.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17559.rotateAngleX = (float) (Math.PI / 2);
      float var9 = 0.4F * var3;
      this.field17560.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * var9;
      this.field17561.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var9;
      this.field17562.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var9;
      this.field17563.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * var9;
   }

   public void setLivingAnimations(RavagerEntity var1, float var2, float var3, float var4) {
      super.setLivingAnimations(var1, var2, var3, var4);
      int var7 = var1.method4586();
      int var8 = var1.method4587();

      int var10 = var1.method4585();
      if (var10 <= 0) {
         float var12 = -1.0F;
         float var13 = -1.0F * MathHelper.sin(this.field17564.rotateAngleX);
         this.field17564.rotationPointX = 0.0F;
         this.field17564.rotationPointY = -7.0F - var13;
         this.field17564.rotationPointZ = 5.5F;
         boolean var14 = var7 > 0;
         this.field17564.rotateAngleX = !var14 ? 0.0F : 0.21991149F;
         this.field17558.rotateAngleX = (float) Math.PI * (!var14 ? 0.01F : 0.05F);
         if (!var14) {
            if (var8 > 0) {
               float var15 = MathHelper.sin(((float)(20 - var8) - var4) / 20.0F * (float) Math.PI * 0.25F);
               this.field17558.rotateAngleX = (float) (Math.PI / 2) * var15;
            }
         } else {
            double var17 = (double)var7 / 40.0;
            this.field17564.rotationPointX = (float)Math.sin(var17 * 10.0) * 3.0F;
         }
      } else {
         float var19 = MathHelper.method37830((float)var10 - var4, 10.0F);
         float var20 = (1.0F + var19) * 0.5F;
         float var21 = var20 * var20 * var20 * 12.0F;
         float var22 = var21 * MathHelper.sin(this.field17564.rotateAngleX);
         this.field17564.rotationPointZ = -6.5F + var21;
         this.field17564.rotationPointY = -7.0F - var22;
         float var16 = MathHelper.sin(((float)var10 - var4) / 10.0F * (float) Math.PI * 0.25F);
         this.field17558.rotateAngleX = (float) (Math.PI / 2) * var16;
         if (var10 <= 5) {
            this.field17558.rotateAngleX = (float) (Math.PI / 20) * MathHelper.sin((float) Math.PI * ((float)var10 - var4) / 10.0F);
         } else {
            this.field17558.rotateAngleX = MathHelper.sin(((float)(-4 + var10) - var4) / 4.0F) * (float) Math.PI * 0.4F;
         }
      }
   }
}
