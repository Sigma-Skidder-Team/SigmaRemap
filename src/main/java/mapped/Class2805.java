package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2805<T extends Entity> extends Class2803<T> {
   private static String[] field17460;
   private final ModelRenderer field17461;
   private final ModelRenderer field17462;
   private final ModelRenderer field17463;

   public Class2805() {
      this.textureWidth = 64;
      this.textureHeight = 64;
      float var3 = 18.0F;
      float var4 = -8.0F;
      this.field17461 = new ModelRenderer(this, 22, 0);
      this.field17461.method22673(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F);
      this.field17461.setRotationPoint(0.0F, 22.0F, -5.0F);
      ModelRenderer var5 = new ModelRenderer(this, 51, 0);
      var5.method22673(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F);
      var5.rotateAngleX = (float) (Math.PI / 3);
      this.field17461.method22670(var5);
      ModelRenderer var6 = new ModelRenderer(this, 48, 20);
      var6.mirror = true;
      var6.method22673(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var6.setRotationPoint(2.0F, -2.0F, 4.0F);
      var6.rotateAngleX = (float) (Math.PI / 3);
      var6.rotateAngleZ = (float) (Math.PI * 2.0 / 3.0);
      this.field17461.method22670(var6);
      ModelRenderer var7 = new ModelRenderer(this, 48, 20);
      var7.method22673(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var7.setRotationPoint(-2.0F, -2.0F, 4.0F);
      var7.rotateAngleX = (float) (Math.PI / 3);
      var7.rotateAngleZ = (float) (-Math.PI * 2.0 / 3.0);
      this.field17461.method22670(var7);
      this.field17462 = new ModelRenderer(this, 0, 19);
      this.field17462.method22673(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F);
      this.field17462.setRotationPoint(0.0F, -2.5F, 11.0F);
      this.field17462.rotateAngleX = -0.10471976F;
      this.field17461.method22670(this.field17462);
      this.field17463 = new ModelRenderer(this, 19, 20);
      this.field17463.method22673(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F);
      this.field17463.setRotationPoint(0.0F, 0.0F, 9.0F);
      this.field17463.rotateAngleX = 0.0F;
      this.field17462.method22670(this.field17463);
      ModelRenderer var8 = new ModelRenderer(this, 0, 0);
      var8.method22673(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F);
      var8.setRotationPoint(0.0F, -4.0F, -3.0F);
      ModelRenderer var9 = new ModelRenderer(this, 0, 13);
      var9.method22673(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F);
      var8.method22670(var9);
      this.field17461.method22670(var8);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17461);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17461.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17461.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      if (Entity.horizontalMag(var1.getMotion()) > 1.0E-7) {
         this.field17461.rotateAngleX = this.field17461.rotateAngleX + -0.05F + -0.05F * MathHelper.cos(var4 * 0.3F);
         this.field17462.rotateAngleX = -0.1F * MathHelper.cos(var4 * 0.3F);
         this.field17463.rotateAngleX = -0.2F * MathHelper.cos(var4 * 0.3F);
      }
   }
}
