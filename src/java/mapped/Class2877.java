package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2877<T extends Entity> extends Class2803<T> {
   private static String[] field17833;
   private final ModelRenderer field17834;
   private final ModelRenderer field17835;
   private final ModelRenderer field17836;
   private final ModelRenderer field17837;
   private final ModelRenderer field17838;
   private final ModelRenderer field17839;
   private final ModelRenderer field17840;
   private final ModelRenderer field17841;
   private final ModelRenderer field17842;
   private final ModelRenderer field17843;
   private final ModelRenderer field17844;

   public Class2877() {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var3 = 22;
      this.field17834 = new ModelRenderer(this, 12, 22);
      this.field17834.method22673(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F);
      this.field17834.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.field17835 = new ModelRenderer(this, 24, 0);
      this.field17835.method22673(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17835.setRotationPoint(-2.5F, 17.0F, -1.5F);
      this.field17836 = new ModelRenderer(this, 24, 3);
      this.field17836.method22673(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17836.setRotationPoint(2.5F, 17.0F, -1.5F);
      this.field17837 = new ModelRenderer(this, 15, 16);
      this.field17837.method22673(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.field17837.setRotationPoint(0.0F, 17.0F, -2.5F);
      this.field17837.rotateAngleX = (float) (Math.PI / 4);
      this.field17838 = new ModelRenderer(this, 10, 16);
      this.field17838.method22673(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F);
      this.field17838.setRotationPoint(0.0F, 17.0F, 2.5F);
      this.field17838.rotateAngleX = (float) (-Math.PI / 4);
      this.field17839 = new ModelRenderer(this, 8, 16);
      this.field17839.method22673(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17839.setRotationPoint(-2.5F, 22.0F, -2.5F);
      this.field17839.rotateAngleY = (float) (-Math.PI / 4);
      this.field17840 = new ModelRenderer(this, 8, 16);
      this.field17840.method22673(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17840.setRotationPoint(-2.5F, 22.0F, 2.5F);
      this.field17840.rotateAngleY = (float) (Math.PI / 4);
      this.field17841 = new ModelRenderer(this, 4, 16);
      this.field17841.method22673(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17841.setRotationPoint(2.5F, 22.0F, 2.5F);
      this.field17841.rotateAngleY = (float) (-Math.PI / 4);
      this.field17842 = new ModelRenderer(this, 0, 16);
      this.field17842.method22673(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17842.setRotationPoint(2.5F, 22.0F, -2.5F);
      this.field17842.rotateAngleY = (float) (Math.PI / 4);
      this.field17843 = new ModelRenderer(this, 8, 22);
      this.field17843.method22673(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.field17843.setRotationPoint(0.5F, 22.0F, 2.5F);
      this.field17843.rotateAngleX = (float) (Math.PI / 4);
      this.field17844 = new ModelRenderer(this, 17, 21);
      this.field17844.method22673(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.field17844.setRotationPoint(0.0F, 22.0F, -2.5F);
      this.field17844.rotateAngleX = (float) (-Math.PI / 4);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(
         this.field17834,
         this.field17835,
         this.field17836,
         this.field17837,
         this.field17838,
         this.field17839,
         this.field17840,
         this.field17841,
         this.field17842,
         this.field17843,
         this.field17844
      );
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17835.field31037 = -0.2F + 0.4F * MathHelper.sin(var4 * 0.2F);
      this.field17836.field31037 = 0.2F - 0.4F * MathHelper.sin(var4 * 0.2F);
   }
}
