package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2810<T extends Entity> extends Class2808<T> {
   private static String[] field17486;
   private final ModelRenderer field17487;
   private final ModelRenderer field17488;
   private final ModelRenderer field17489;
   private final ModelRenderer field17490;
   private final ModelRenderer field17491;
   private final ModelRenderer field17492;

   public Class2810(float var1) {
      this.textureWidth = 32;
      this.textureHeight = 32;
      byte var4 = 19;
      this.field17487 = new ModelRenderer(this, 0, 20);
      this.field17487.addBox(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, var1);
      this.field17487.setRotationPoint(0.0F, 19.0F, 0.0F);
      this.field17488 = new ModelRenderer(this, 21, 16);
      this.field17488.addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, var1);
      this.field17488.setRotationPoint(0.0F, 19.0F, 3.0F);
      this.field17489 = new ModelRenderer(this, 2, 16);
      this.field17489.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17489.setRotationPoint(-1.0F, 20.0F, 0.0F);
      this.field17489.rotateAngleY = (float) (Math.PI / 4);
      this.field17490 = new ModelRenderer(this, 2, 12);
      this.field17490.addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17490.setRotationPoint(1.0F, 20.0F, 0.0F);
      this.field17490.rotateAngleY = (float) (-Math.PI / 4);
      this.field17491 = new ModelRenderer(this, 20, 11);
      this.field17491.addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.field17491.setRotationPoint(0.0F, 16.0F, -3.0F);
      this.field17492 = new ModelRenderer(this, 20, 21);
      this.field17492.addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.field17492.setRotationPoint(0.0F, 22.0F, -3.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17487, this.field17488, this.field17489, this.field17490, this.field17491, this.field17492);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.isInWater()) {
         var9 = 1.5F;
      }

      this.field17488.rotateAngleY = -var9 * 0.45F * MathHelper.sin(0.6F * var4);
   }
}
