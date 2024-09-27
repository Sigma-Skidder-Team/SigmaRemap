package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2860<T extends Entity> extends Class2855<T> {
   public final ModelRenderer field17722;
   public final ModelRenderer field17723;
   public final ModelRenderer field17724;
   public final ModelRenderer field17725;
   public final ModelRenderer field17726;
   public final ModelRenderer field17727;
   public final ModelRenderer field17728;
   public final ModelRenderer field17729;
   public int field17730 = 1;

   public Class2860(float var1) {
      super(true, 10.0F, 4.0F);
      this.field17728 = new ModelRenderer(this);
      this.field17728.method22672("main", -2.5F, -2.0F, -3.0F, 5, 4, 5, var1, 0, 0);
      this.field17728.method22672("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2, var1, 0, 24);
      this.field17728.method22672("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, var1, 0, 10);
      this.field17728.method22672("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, var1, 6, 10);
      this.field17728.setRotationPoint(0.0F, 15.0F, -9.0F);
      this.field17729 = new ModelRenderer(this, 20, 0);
      this.field17729.addBox(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, var1);
      this.field17729.setRotationPoint(0.0F, 12.0F, -10.0F);
      this.field17726 = new ModelRenderer(this, 0, 15);
      this.field17726.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.field17726.rotateAngleX = 0.9F;
      this.field17726.setRotationPoint(0.0F, 15.0F, 8.0F);
      this.field17727 = new ModelRenderer(this, 4, 15);
      this.field17727.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.field17727.setRotationPoint(0.0F, 20.0F, 14.0F);
      this.field17722 = new ModelRenderer(this, 8, 13);
      this.field17722.addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.field17722.setRotationPoint(1.1F, 18.0F, 5.0F);
      this.field17723 = new ModelRenderer(this, 8, 13);
      this.field17723.addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.field17723.setRotationPoint(-1.1F, 18.0F, 5.0F);
      this.field17724 = new ModelRenderer(this, 40, 0);
      this.field17724.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.field17724.setRotationPoint(1.2F, 14.1F, -5.0F);
      this.field17725 = new ModelRenderer(this, 40, 0);
      this.field17725.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.field17725.setRotationPoint(-1.2F, 14.1F, -5.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11001() {
      return ImmutableList.of(this.field17728);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(this.field17729, this.field17722, this.field17723, this.field17724, this.field17725, this.field17726, this.field17727);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17728.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17728.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      if (this.field17730 != 3) {
         this.field17729.rotateAngleX = (float) (Math.PI / 2);
         if (this.field17730 != 2) {
            this.field17722.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * var3;
            this.field17723.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field17724.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field17725.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * var3;
            if (this.field17730 != 1) {
               this.field17727.rotateAngleX = 1.7278761F + 0.47123894F * MathHelper.cos(var2) * var3;
            } else {
               this.field17727.rotateAngleX = 1.7278761F + (float) (Math.PI / 4) * MathHelper.cos(var2) * var3;
            }
         } else {
            this.field17722.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * var3;
            this.field17723.rotateAngleX = MathHelper.cos(var2 * 0.6662F + 0.3F) * var3;
            this.field17724.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI + 0.3F) * var3;
            this.field17725.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var3;
            this.field17727.rotateAngleX = 1.7278761F + (float) (Math.PI / 10) * MathHelper.cos(var2) * var3;
         }
      }
   }

   @Override
   public void method10997(T var1, float var2, float var3, float var4) {
      this.field17729.rotationPointY = 12.0F;
      this.field17729.rotationPointZ = -10.0F;
      this.field17728.rotationPointY = 15.0F;
      this.field17728.rotationPointZ = -9.0F;
      this.field17726.rotationPointY = 15.0F;
      this.field17726.rotationPointZ = 8.0F;
      this.field17727.rotationPointY = 20.0F;
      this.field17727.rotationPointZ = 14.0F;
      this.field17724.rotationPointY = 14.1F;
      this.field17724.rotationPointZ = -5.0F;
      this.field17725.rotationPointY = 14.1F;
      this.field17725.rotationPointZ = -5.0F;
      this.field17722.rotationPointY = 18.0F;
      this.field17722.rotationPointZ = 5.0F;
      this.field17723.rotationPointY = 18.0F;
      this.field17723.rotationPointZ = 5.0F;
      this.field17726.rotateAngleX = 0.9F;
      if (!var1.isCrouching()) {
         if (!var1.isSprinting()) {
            this.field17730 = 1;
         } else {
            this.field17727.rotationPointY = this.field17726.rotationPointY;
            this.field17727.rotationPointZ += 2.0F;
            this.field17726.rotateAngleX = (float) (Math.PI / 2);
            this.field17727.rotateAngleX = (float) (Math.PI / 2);
            this.field17730 = 2;
         }
      } else {
         this.field17729.rotationPointY++;
         this.field17728.rotationPointY += 2.0F;
         this.field17726.rotationPointY++;
         this.field17727.rotationPointY += -4.0F;
         this.field17727.rotationPointZ += 2.0F;
         this.field17726.rotateAngleX = (float) (Math.PI / 2);
         this.field17727.rotateAngleX = (float) (Math.PI / 2);
         this.field17730 = 0;
      }
   }
}
