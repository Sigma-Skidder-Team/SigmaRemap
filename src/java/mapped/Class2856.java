package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2856<T extends AbstractHorseEntity> extends Class2855<T> {
   private static String[] field17691;
   public final ModelRenderer field17692;
   public final ModelRenderer field17693;
   private final ModelRenderer field17694;
   private final ModelRenderer field17695;
   private final ModelRenderer field17696;
   private final ModelRenderer field17697;
   private final ModelRenderer field17698;
   private final ModelRenderer field17699;
   private final ModelRenderer field17700;
   private final ModelRenderer field17701;
   private final ModelRenderer field17702;
   private final ModelRenderer[] field17703;
   private final ModelRenderer[] field17704;

   public Class2856(float var1) {
      super(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F);
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17692 = new ModelRenderer(this, 0, 32);
      this.field17692.addBox(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, 0.05F);
      this.field17692.setRotationPoint(0.0F, 11.0F, 5.0F);
      this.field17693 = new ModelRenderer(this, 0, 35);
      this.field17693.method22673(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F);
      this.field17693.rotateAngleX = (float) (Math.PI / 6);
      ModelRenderer var4 = new ModelRenderer(this, 0, 13);
      var4.addBox(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, var1);
      ModelRenderer var5 = new ModelRenderer(this, 56, 36);
      var5.addBox(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, var1);
      ModelRenderer var6 = new ModelRenderer(this, 0, 25);
      var6.addBox(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, var1);
      this.field17693.method22670(var4);
      this.field17693.method22670(var5);
      this.field17693.method22670(var6);
      this.method11189(this.field17693);
      this.field17694 = new ModelRenderer(this, 48, 21);
      this.field17694.field31038 = true;
      this.field17694.addBox(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1);
      this.field17694.setRotationPoint(4.0F, 14.0F, 7.0F);
      this.field17695 = new ModelRenderer(this, 48, 21);
      this.field17695.addBox(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1);
      this.field17695.setRotationPoint(-4.0F, 14.0F, 7.0F);
      this.field17696 = new ModelRenderer(this, 48, 21);
      this.field17696.field31038 = true;
      this.field17696.addBox(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1);
      this.field17696.setRotationPoint(4.0F, 6.0F, -12.0F);
      this.field17697 = new ModelRenderer(this, 48, 21);
      this.field17697.addBox(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1);
      this.field17697.setRotationPoint(-4.0F, 6.0F, -12.0F);
      float var7 = 5.5F;
      this.field17698 = new ModelRenderer(this, 48, 21);
      this.field17698.field31038 = true;
      this.field17698.method22676(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17698.setRotationPoint(4.0F, 14.0F, 7.0F);
      this.field17699 = new ModelRenderer(this, 48, 21);
      this.field17699.method22676(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17699.setRotationPoint(-4.0F, 14.0F, 7.0F);
      this.field17700 = new ModelRenderer(this, 48, 21);
      this.field17700.field31038 = true;
      this.field17700.method22676(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17700.setRotationPoint(4.0F, 6.0F, -12.0F);
      this.field17701 = new ModelRenderer(this, 48, 21);
      this.field17701.method22676(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field17701.setRotationPoint(-4.0F, 6.0F, -12.0F);
      this.field17702 = new ModelRenderer(this, 42, 36);
      this.field17702.addBox(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, var1);
      this.field17702.setRotationPoint(0.0F, -5.0F, 2.0F);
      this.field17702.rotateAngleX = (float) (Math.PI / 6);
      this.field17692.method22670(this.field17702);
      ModelRenderer var8 = new ModelRenderer(this, 26, 0);
      var8.addBox(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, 0.5F);
      this.field17692.method22670(var8);
      ModelRenderer var9 = new ModelRenderer(this, 29, 5);
      var9.addBox(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, var1);
      this.field17693.method22670(var9);
      ModelRenderer var10 = new ModelRenderer(this, 29, 5);
      var10.addBox(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, var1);
      this.field17693.method22670(var10);
      ModelRenderer var11 = new ModelRenderer(this, 32, 2);
      var11.addBox(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, var1);
      var11.rotateAngleX = (float) (-Math.PI / 6);
      this.field17693.method22670(var11);
      ModelRenderer var12 = new ModelRenderer(this, 32, 2);
      var12.addBox(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, var1);
      var12.rotateAngleX = (float) (-Math.PI / 6);
      this.field17693.method22670(var12);
      ModelRenderer var13 = new ModelRenderer(this, 1, 1);
      var13.addBox(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, 0.2F);
      this.field17693.method22670(var13);
      ModelRenderer var14 = new ModelRenderer(this, 19, 0);
      var14.addBox(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.2F);
      this.field17693.method22670(var14);
      this.field17703 = new ModelRenderer[]{var8, var9, var10, var13, var14};
      this.field17704 = new ModelRenderer[]{var11, var12};
   }

   public void method11189(ModelRenderer var1) {
      ModelRenderer var4 = new ModelRenderer(this, 19, 16);
      var4.addBox(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      ModelRenderer var5 = new ModelRenderer(this, 19, 16);
      var5.addBox(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      var1.method22670(var4);
      var1.method22670(var5);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = var1.method4943();
      boolean var10 = var1.isBeingRidden();

      for (ModelRenderer var14 : this.field17703) {
         var14.showModel = var9;
      }

      for (ModelRenderer var18 : this.field17704) {
         var18.showModel = var10 && var9;
      }

      this.field17692.rotationPointY = 11.0F;
   }

   @Override
   public Iterable<ModelRenderer> method11001() {
      return ImmutableList.of(this.field17693);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(
         this.field17692,
         this.field17694,
         this.field17695,
         this.field17696,
         this.field17697,
         this.field17698,
         this.field17699,
         this.field17700,
         this.field17701
      );
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      super.method10997(var1, var2, var3, var4);
      float var7 = MathHelper.method37828(var1.prevRenderYawOffset, var1.renderYawOffset, var4);
      float var8 = MathHelper.method37828(var1.prevRotationYawHead, var1.rotationYawHead, var4);
      float var9 = MathHelper.lerp(var4, var1.prevRotationPitch, var1.rotationPitch);
      float var10 = var8 - var7;
      float var11 = var9 * (float) (Math.PI / 180.0);
      if (var10 > 20.0F) {
         var10 = 20.0F;
      }

      if (var10 < -20.0F) {
         var10 = -20.0F;
      }

      if (var3 > 0.2F) {
         var11 += MathHelper.cos(var2 * 0.4F) * 0.15F * var3;
      }

      float var12 = var1.method4963(var4);
      float var13 = var1.method4964(var4);
      float var14 = 1.0F - var13;
      float var15 = var1.method4965(var4);
      boolean var16 = var1.field5887 != 0;
      float var17 = (float)var1.ticksExisted + var4;
      this.field17693.rotationPointY = 4.0F;
      this.field17693.rotationPointZ = -12.0F;
      this.field17692.rotateAngleX = 0.0F;
      this.field17693.rotateAngleX = (float) (Math.PI / 6) + var11;
      this.field17693.rotateAngleY = var10 * (float) (Math.PI / 180.0);
      float var18 = !var1.isInWater() ? 1.0F : 0.2F;
      float var19 = MathHelper.cos(var18 * var2 * 0.6662F + (float) Math.PI);
      float var20 = var19 * 0.8F * var3;
      float var21 = (1.0F - Math.max(var13, var12)) * ((float) (Math.PI / 6) + var11 + var15 * MathHelper.sin(var17) * 0.05F);
      this.field17693.rotateAngleX = var13 * ((float) (Math.PI / 12) + var11) + var12 * (2.1816616F + MathHelper.sin(var17) * 0.05F) + var21;
      this.field17693.rotateAngleY = var13 * var10 * (float) (Math.PI / 180.0) + (1.0F - Math.max(var13, var12)) * this.field17693.rotateAngleY;
      this.field17693.rotationPointY = var13 * -4.0F + var12 * 11.0F + (1.0F - Math.max(var13, var12)) * this.field17693.rotationPointY;
      this.field17693.rotationPointZ = var13 * -4.0F + var12 * -12.0F + (1.0F - Math.max(var13, var12)) * this.field17693.rotationPointZ;
      this.field17692.rotateAngleX = var13 * (float) (-Math.PI / 4) + var14 * this.field17692.rotateAngleX;
      float var22 = (float) (Math.PI / 12) * var13;
      float var23 = MathHelper.cos(var17 * 0.6F + (float) Math.PI);
      this.field17696.rotationPointY = 2.0F * var13 + 14.0F * var14;
      this.field17696.rotationPointZ = -6.0F * var13 - 10.0F * var14;
      this.field17697.rotationPointY = this.field17696.rotationPointY;
      this.field17697.rotationPointZ = this.field17696.rotationPointZ;
      float var24 = ((float) (-Math.PI / 3) + var23) * var13 + var20 * var14;
      float var25 = ((float) (-Math.PI / 3) - var23) * var13 - var20 * var14;
      this.field17694.rotateAngleX = var22 - var19 * 0.5F * var3 * var14;
      this.field17695.rotateAngleX = var22 + var19 * 0.5F * var3 * var14;
      this.field17696.rotateAngleX = var24;
      this.field17697.rotateAngleX = var25;
      this.field17702.rotateAngleX = (float) (Math.PI / 6) + var3 * 0.75F;
      this.field17702.rotationPointY = -5.0F + var3;
      this.field17702.rotationPointZ = 2.0F + var3 * 2.0F;
      if (!var16) {
         this.field17702.rotateAngleY = 0.0F;
      } else {
         this.field17702.rotateAngleY = MathHelper.cos(var17 * 0.7F);
      }

      this.field17698.rotationPointY = this.field17694.rotationPointY;
      this.field17698.rotationPointZ = this.field17694.rotationPointZ;
      this.field17698.rotateAngleX = this.field17694.rotateAngleX;
      this.field17699.rotationPointY = this.field17695.rotationPointY;
      this.field17699.rotationPointZ = this.field17695.rotationPointZ;
      this.field17699.rotateAngleX = this.field17695.rotateAngleX;
      this.field17700.rotationPointY = this.field17696.rotationPointY;
      this.field17700.rotationPointZ = this.field17696.rotationPointZ;
      this.field17700.rotateAngleX = this.field17696.rotateAngleX;
      this.field17701.rotationPointY = this.field17697.rotationPointY;
      this.field17701.rotationPointZ = this.field17697.rotationPointZ;
      this.field17701.rotateAngleX = this.field17697.rotateAngleX;
      boolean var26 = var1.isChild();
      this.field17694.showModel = !var26;
      this.field17695.showModel = !var26;
      this.field17696.showModel = !var26;
      this.field17697.showModel = !var26;
      this.field17698.showModel = var26;
      this.field17699.showModel = var26;
      this.field17700.showModel = var26;
      this.field17701.showModel = var26;
      this.field17692.rotationPointY = !var26 ? 0.0F : 10.8F;
   }
}
