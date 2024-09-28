package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class Class2896 extends BipedModel<Class1100> {
   private static String[] field17431;
   private final ModelRenderer field17934;
   private final ModelRenderer field17935;

   public Class2896() {
      super(0.0F, 0.0F, 64, 64);
      this.bipedLeftLeg.showModel = false;
      this.bipedHeadwear.showModel = false;
      this.bipedRightLeg = new ModelRenderer(this, 32, 0);
      this.bipedRightLeg.addBox(-1.0F, -1.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
      this.field17935 = new ModelRenderer(this, 0, 32);
      this.field17935.method22673(-20.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
      this.field17934 = new ModelRenderer(this, 0, 32);
      this.field17934.mirror = true;
      this.field17934.method22673(0.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return Iterables.concat(super.getBodyParts(), ImmutableList.of(this.field17935, this.field17934));
   }

   public void setRotationAngles(Class1100 var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles(var1, var2, var3, var4, var5, var6);
      if (var1.method5275()) {
         if (!var1.getHeldItemMainhand().isEmpty()) {
            if (var1.getPrimaryHand() != HandSide.RIGHT) {
               this.bipedLeftArm.rotateAngleX = 3.7699115F;
            } else {
               this.bipedRightArm.rotateAngleX = 3.7699115F;
            }
         } else {
            this.bipedRightArm.rotateAngleX = (float) (Math.PI * 3.0 / 2.0);
            this.bipedLeftArm.rotateAngleX = (float) (Math.PI * 3.0 / 2.0);
         }
      }

      this.bipedRightLeg.rotateAngleX += (float) (Math.PI / 5);
      this.field17935.rotationPointZ = 2.0F;
      this.field17934.rotationPointZ = 2.0F;
      this.field17935.rotationPointY = 1.0F;
      this.field17934.rotationPointY = 1.0F;
      this.field17935.rotateAngleY = 0.47123894F + MathHelper.cos(var4 * 0.8F) * (float) Math.PI * 0.05F;
      this.field17934.rotateAngleY = -this.field17935.rotateAngleY;
      this.field17934.rotateAngleZ = -0.47123894F;
      this.field17934.rotateAngleX = 0.47123894F;
      this.field17935.rotateAngleX = 0.47123894F;
      this.field17935.rotateAngleZ = 0.47123894F;
   }
}
