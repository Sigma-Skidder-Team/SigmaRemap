package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2806<T extends Entity> extends Class2803<T> {
   private static String[] field17464;
   private final ModelRenderer field17465;
   private final ModelRenderer field17466;
   private final ModelRenderer field17467;
   private final ModelRenderer field17468;
   private final ModelRenderer field17469;
   private final ModelRenderer field17470;
   private final ModelRenderer field17471;

   public Class2806() {
      this.textureWidth = 64;
      this.textureHeight = 64;
      this.field17465 = new ModelRenderer(this, 0, 8);
      this.field17465.method22673(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F);
      this.field17470 = new ModelRenderer(this, 3, 20);
      this.field17470.method22673(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F);
      this.field17470.setRotationPoint(0.0F, -2.0F, 1.0F);
      this.field17465.method22670(this.field17470);
      this.field17471 = new ModelRenderer(this, 4, 29);
      this.field17471.method22673(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F);
      this.field17471.setRotationPoint(0.0F, 0.5F, 6.0F);
      this.field17470.method22670(this.field17471);
      this.field17466 = new ModelRenderer(this, 23, 12);
      this.field17466.method22673(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.field17466.setRotationPoint(2.0F, -2.0F, -8.0F);
      this.field17467 = new ModelRenderer(this, 16, 24);
      this.field17467.method22673(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.field17467.setRotationPoint(6.0F, 0.0F, 0.0F);
      this.field17466.method22670(this.field17467);
      this.field17468 = new ModelRenderer(this, 23, 12);
      this.field17468.mirror = true;
      this.field17468.method22673(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.field17468.setRotationPoint(-3.0F, -2.0F, -8.0F);
      this.field17469 = new ModelRenderer(this, 16, 24);
      this.field17469.mirror = true;
      this.field17469.method22673(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.field17469.setRotationPoint(-6.0F, 0.0F, 0.0F);
      this.field17468.method22670(this.field17469);
      this.field17466.rotateAngleZ = 0.1F;
      this.field17467.rotateAngleZ = 0.1F;
      this.field17468.rotateAngleZ = -0.1F;
      this.field17469.rotateAngleZ = -0.1F;
      this.field17465.rotateAngleX = -0.1F;
      ModelRenderer var3 = new ModelRenderer(this, 0, 0);
      var3.method22673(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F);
      var3.setRotationPoint(0.0F, 1.0F, -7.0F);
      var3.rotateAngleX = 0.2F;
      this.field17465.method22670(var3);
      this.field17465.method22670(this.field17466);
      this.field17465.method22670(this.field17468);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17465);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = ((float)(var1.getEntityId() * 3) + var4) * 0.13F;
      float var10 = 16.0F;
      this.field17466.rotateAngleZ = MathHelper.cos(var9) * 16.0F * (float) (Math.PI / 180.0);
      this.field17467.rotateAngleZ = MathHelper.cos(var9) * 16.0F * (float) (Math.PI / 180.0);
      this.field17468.rotateAngleZ = -this.field17466.rotateAngleZ;
      this.field17469.rotateAngleZ = -this.field17467.rotateAngleZ;
      this.field17470.rotateAngleX = -(5.0F + MathHelper.cos(var9 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.field17471.rotateAngleX = -(5.0F + MathHelper.cos(var9 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
