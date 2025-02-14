package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2809<T extends Entity> extends Class2808<T> {
   private static String[] field17480;
   private final ModelRenderer field17481;
   private final ModelRenderer field17482;
   private final ModelRenderer field17483;
   private final ModelRenderer field17484;
   private final ModelRenderer field17485;

   public Class2809(float var1) {
      this.textureWidth = 32;
      this.textureHeight = 32;
      byte var4 = 22;
      this.field17481 = new ModelRenderer(this, 0, 0);
      this.field17481.addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, var1);
      this.field17481.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.field17482 = new ModelRenderer(this, 22, -6);
      this.field17482.addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, var1);
      this.field17482.setRotationPoint(0.0F, 22.0F, 3.0F);
      this.field17483 = new ModelRenderer(this, 2, 16);
      this.field17483.addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17483.setRotationPoint(-1.0F, 22.5F, 0.0F);
      this.field17483.rotateAngleY = (float) (Math.PI / 4);
      this.field17484 = new ModelRenderer(this, 2, 12);
      this.field17484.addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17484.setRotationPoint(1.0F, 22.5F, 0.0F);
      this.field17484.rotateAngleY = (float) (-Math.PI / 4);
      this.field17485 = new ModelRenderer(this, 10, -5);
      this.field17485.addBox(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, var1);
      this.field17485.setRotationPoint(0.0F, 20.5F, -3.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17481, this.field17482, this.field17483, this.field17484, this.field17485);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.isInWater()) {
         var9 = 1.5F;
      }

      this.field17482.rotateAngleY = -var9 * 0.45F * MathHelper.sin(0.6F * var4);
   }
}
