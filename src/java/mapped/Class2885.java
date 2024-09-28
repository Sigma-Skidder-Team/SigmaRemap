package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2885<T extends Entity> extends Class2803<T> {
   private static String[] field17876;
   private final ModelRenderer field17877;
   private final ModelRenderer field17878;
   private final ModelRenderer field17879;
   private final ModelRenderer field17880;
   private final ModelRenderer field17881;
   private final ModelRenderer field17882;

   public Class2885() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      this.field17877 = new ModelRenderer(this, 0, 27);
      this.field17877.method22673(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F);
      this.field17877.setRotationPoint(0.0F, 23.0F, 0.0F);
      this.field17878 = new ModelRenderer(this, 24, 6);
      this.field17878.method22673(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.field17878.setRotationPoint(0.0F, 20.0F, 0.0F);
      this.field17879 = new ModelRenderer(this, 28, 6);
      this.field17879.method22673(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.field17879.setRotationPoint(0.0F, 20.0F, 0.0F);
      this.field17882 = new ModelRenderer(this, -3, 0);
      this.field17882.method22673(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F);
      this.field17882.setRotationPoint(0.0F, 22.0F, 1.5F);
      this.field17880 = new ModelRenderer(this, 25, 0);
      this.field17880.method22673(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.field17880.setRotationPoint(-1.5F, 22.0F, -1.5F);
      this.field17881 = new ModelRenderer(this, 25, 0);
      this.field17881.method22673(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.field17881.setRotationPoint(1.5F, 22.0F, -1.5F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17877, this.field17878, this.field17879, this.field17882, this.field17880, this.field17881);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17880.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(var4 * 0.2F);
      this.field17881.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(var4 * 0.2F);
   }
}
