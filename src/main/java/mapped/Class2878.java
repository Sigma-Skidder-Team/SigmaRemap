package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2878<T extends Entity> extends Class2803<T> {
   private static String[] field17845;
   private final ModelRenderer field17846;
   private final ModelRenderer field17847;
   private final ModelRenderer field17848;
   private final ModelRenderer field17849;
   private final ModelRenderer field17850;

   public Class2878() {
      float var3 = 4.0F;
      float var4 = 0.0F;
      this.field17848 = new ModelRenderer(this, 0, 0).setTextureSize(64, 64);
      this.field17848.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F);
      this.field17848.setRotationPoint(0.0F, 4.0F, 0.0F);
      this.field17849 = new ModelRenderer(this, 32, 0).setTextureSize(64, 64);
      this.field17849.addBox(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.field17849.setRotationPoint(0.0F, 6.0F, 0.0F);
      this.field17850 = new ModelRenderer(this, 32, 0).setTextureSize(64, 64);
      this.field17850.addBox(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.field17850.setRotationPoint(0.0F, 6.0F, 0.0F);
      this.field17846 = new ModelRenderer(this, 0, 16).setTextureSize(64, 64);
      this.field17846.addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F);
      this.field17846.setRotationPoint(0.0F, 13.0F, 0.0F);
      this.field17847 = new ModelRenderer(this, 0, 36).setTextureSize(64, 64);
      this.field17847.addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F);
      this.field17847.setRotationPoint(0.0F, 24.0F, 0.0F);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17848.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17848.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17846.rotateAngleY = var5 * (float) (Math.PI / 180.0) * 0.25F;
      float var9 = MathHelper.sin(this.field17846.rotateAngleY);
      float var10 = MathHelper.cos(this.field17846.rotateAngleY);
      this.field17849.rotateAngleZ = 1.0F;
      this.field17850.rotateAngleZ = -1.0F;
      this.field17849.rotateAngleY = 0.0F + this.field17846.rotateAngleY;
      this.field17850.rotateAngleY = (float) Math.PI + this.field17846.rotateAngleY;
      this.field17849.rotationPointX = var10 * 5.0F;
      this.field17849.rotationPointZ = -var9 * 5.0F;
      this.field17850.rotationPointX = -var10 * 5.0F;
      this.field17850.rotationPointZ = var9 * 5.0F;
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17846, this.field17847, this.field17848, this.field17849, this.field17850);
   }

   public ModelRenderer method11197() {
      return this.field17848;
   }
}
