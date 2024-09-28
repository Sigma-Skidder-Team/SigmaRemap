package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2874<T extends Entity> extends AgeableModel<T> {
   private static String[] field17788;
   private final ModelRenderer field17789;
   private final ModelRenderer field17790;
   private final ModelRenderer field17791;
   private final ModelRenderer field17792;
   private final ModelRenderer field17793;
   private final ModelRenderer field17794;
   private final ModelRenderer field17795;
   private final ModelRenderer field17796;

   public Class2874() {
      byte var3 = 16;
      this.field17789 = new ModelRenderer(this, 0, 0);
      this.field17789.addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F);
      this.field17789.setRotationPoint(0.0F, 15.0F, -4.0F);
      this.field17795 = new ModelRenderer(this, 14, 0);
      this.field17795.addBox(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F);
      this.field17795.setRotationPoint(0.0F, 15.0F, -4.0F);
      this.field17796 = new ModelRenderer(this, 14, 4);
      this.field17796.addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F);
      this.field17796.setRotationPoint(0.0F, 15.0F, -4.0F);
      this.field17790 = new ModelRenderer(this, 0, 9);
      this.field17790.addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.field17790.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.field17791 = new ModelRenderer(this, 26, 0);
      this.field17791.method22673(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.field17791.setRotationPoint(-2.0F, 19.0F, 1.0F);
      this.field17792 = new ModelRenderer(this, 26, 0);
      this.field17792.method22673(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.field17792.setRotationPoint(1.0F, 19.0F, 1.0F);
      this.field17793 = new ModelRenderer(this, 24, 13);
      this.field17793.method22673(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.field17793.setRotationPoint(-4.0F, 13.0F, 0.0F);
      this.field17794 = new ModelRenderer(this, 24, 13);
      this.field17794.method22673(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.field17794.setRotationPoint(4.0F, 13.0F, 0.0F);
   }

   @Override
   public Iterable<ModelRenderer> getHeadParts() {
      return ImmutableList.of(this.field17789, this.field17795, this.field17796);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(this.field17790, this.field17791, this.field17792, this.field17793, this.field17794);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17789.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17789.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17795.rotateAngleX = this.field17789.rotateAngleX;
      this.field17795.rotateAngleY = this.field17789.rotateAngleY;
      this.field17796.rotateAngleX = this.field17789.rotateAngleX;
      this.field17796.rotateAngleY = this.field17789.rotateAngleY;
      this.field17790.rotateAngleX = (float) (Math.PI / 2);
      this.field17791.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17792.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17793.rotateAngleZ = var4;
      this.field17794.rotateAngleZ = -var4;
   }
}
