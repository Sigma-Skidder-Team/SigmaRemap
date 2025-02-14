package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class Class2823<T extends Class1025> extends Class2803<T> implements IHasArm, IHasHead {
   private static String[] field17586;
   private final ModelRenderer field17587;
   private final ModelRenderer field17588;
   private final ModelRenderer field17589;
   private final ModelRenderer field17590;
   private final ModelRenderer field17591;
   private final ModelRenderer field17592;
   private final ModelRenderer field17593;
   private final ModelRenderer field17594;

   public Class2823(float var1, float var2, int var3, int var4) {
      this.field17587 = new ModelRenderer(this).setTextureSize(var3, var4);
      this.field17587.setRotationPoint(0.0F, 0.0F + var2, 0.0F);
      this.field17587.method22671(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.field17588 = new ModelRenderer(this, 32, 0).setTextureSize(var3, var4);
      this.field17588.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, var1 + 0.45F);
      this.field17587.method22670(this.field17588);
      this.field17588.showModel = false;
      ModelRenderer var7 = new ModelRenderer(this).setTextureSize(var3, var4);
      var7.setRotationPoint(0.0F, var2 - 2.0F, 0.0F);
      var7.method22671(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.field17587.method22670(var7);
      this.field17589 = new ModelRenderer(this).setTextureSize(var3, var4);
      this.field17589.setRotationPoint(0.0F, 0.0F + var2, 0.0F);
      this.field17589.method22671(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.field17589.method22671(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.field17590 = new ModelRenderer(this).setTextureSize(var3, var4);
      this.field17590.setRotationPoint(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.field17590.method22671(44, 22).addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      ModelRenderer var8 = new ModelRenderer(this, 44, 22).setTextureSize(var3, var4);
      var8.mirror = true;
      var8.addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.field17590.method22670(var8);
      this.field17590.method22671(40, 38).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.field17591 = new ModelRenderer(this, 0, 22).setTextureSize(var3, var4);
      this.field17591.setRotationPoint(-2.0F, 12.0F + var2, 0.0F);
      this.field17591.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17592 = new ModelRenderer(this, 0, 22).setTextureSize(var3, var4);
      this.field17592.mirror = true;
      this.field17592.setRotationPoint(2.0F, 12.0F + var2, 0.0F);
      this.field17592.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17593 = new ModelRenderer(this, 40, 46).setTextureSize(var3, var4);
      this.field17593.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17593.setRotationPoint(-5.0F, 2.0F + var2, 0.0F);
      this.field17594 = new ModelRenderer(this, 40, 46).setTextureSize(var3, var4);
      this.field17594.mirror = true;
      this.field17594.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17594.setRotationPoint(5.0F, 2.0F + var2, 0.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17587, this.field17589, this.field17591, this.field17592, this.field17590, this.field17593, this.field17594);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17587.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17587.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17590.rotationPointY = 3.0F;
      this.field17590.rotationPointZ = -1.0F;
      this.field17590.rotateAngleX = -0.75F;
      if (!this.isSitting) {
         this.field17593.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 2.0F * var3 * 0.5F;
         this.field17593.rotateAngleY = 0.0F;
         this.field17593.rotateAngleZ = 0.0F;
         this.field17594.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 2.0F * var3 * 0.5F;
         this.field17594.rotateAngleY = 0.0F;
         this.field17594.rotateAngleZ = 0.0F;
         this.field17591.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
         this.field17591.rotateAngleY = 0.0F;
         this.field17591.rotateAngleZ = 0.0F;
         this.field17592.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
         this.field17592.rotateAngleY = 0.0F;
         this.field17592.rotateAngleZ = 0.0F;
      } else {
         this.field17593.rotateAngleX = (float) (-Math.PI / 5);
         this.field17593.rotateAngleY = 0.0F;
         this.field17593.rotateAngleZ = 0.0F;
         this.field17594.rotateAngleX = (float) (-Math.PI / 5);
         this.field17594.rotateAngleY = 0.0F;
         this.field17594.rotateAngleZ = 0.0F;
         this.field17591.rotateAngleX = -1.4137167F;
         this.field17591.rotateAngleY = (float) (Math.PI / 10);
         this.field17591.rotateAngleZ = 0.07853982F;
         this.field17592.rotateAngleX = -1.4137167F;
         this.field17592.rotateAngleY = (float) (-Math.PI / 10);
         this.field17592.rotateAngleZ = -0.07853982F;
      }

      Class2117 var9 = var1.method4543();
      if (var9 != Class2117.field13795) {
         if (var9 != Class2117.field13796) {
            if (var9 != Class2117.field13797) {
               if (var9 != Class2117.field13798) {
                  if (var9 != Class2117.field13799) {
                     if (var9 == Class2117.field13800) {
                        this.field17593.rotationPointZ = 0.0F;
                        this.field17593.rotationPointX = -5.0F;
                        this.field17593.rotateAngleX = MathHelper.cos(var4 * 0.6662F) * 0.05F;
                        this.field17593.rotateAngleZ = 2.670354F;
                        this.field17593.rotateAngleY = 0.0F;
                        this.field17594.rotationPointZ = 0.0F;
                        this.field17594.rotationPointX = 5.0F;
                        this.field17594.rotateAngleX = MathHelper.cos(var4 * 0.6662F) * 0.05F;
                        this.field17594.rotateAngleZ = (float) (-Math.PI * 3.0 / 4.0);
                        this.field17594.rotateAngleY = 0.0F;
                     }
                  } else {
                     ModelHelper.func_239102_a_(this.field17593, this.field17594, var1, true);
                  }
               } else {
                  ModelHelper.func_239104_a_(this.field17593, this.field17594, this.field17587, true);
               }
            } else {
               this.field17593.rotateAngleY = -0.1F + this.field17587.rotateAngleY;
               this.field17593.rotateAngleX = (float) (-Math.PI / 2) + this.field17587.rotateAngleX;
               this.field17594.rotateAngleX = -0.9424779F + this.field17587.rotateAngleX;
               this.field17594.rotateAngleY = this.field17587.rotateAngleY - 0.4F;
               this.field17594.rotateAngleZ = (float) (Math.PI / 2);
            }
         } else {
            this.field17593.rotationPointZ = 0.0F;
            this.field17593.rotationPointX = -5.0F;
            this.field17594.rotationPointZ = 0.0F;
            this.field17594.rotationPointX = 5.0F;
            this.field17593.rotateAngleX = MathHelper.cos(var4 * 0.6662F) * 0.25F;
            this.field17594.rotateAngleX = MathHelper.cos(var4 * 0.6662F) * 0.25F;
            this.field17593.rotateAngleZ = (float) (Math.PI * 3.0 / 4.0);
            this.field17594.rotateAngleZ = (float) (-Math.PI * 3.0 / 4.0);
            this.field17593.rotateAngleY = 0.0F;
            this.field17594.rotateAngleY = 0.0F;
         }
      } else if (!var1.getHeldItemMainhand().isEmpty()) {
         ModelHelper.method27107(this.field17593, this.field17594, var1, this.swingProgress, var4);
      } else {
         ModelHelper.method27109(this.field17594, this.field17593, true, this.swingProgress, var4);
      }

      boolean var10 = var9 == Class2117.field13794;
      this.field17590.showModel = var10;
      this.field17594.showModel = !var10;
      this.field17593.showModel = !var10;
   }

   private ModelRenderer method11025(HandSide var1) {
      return var1 != HandSide.LEFT ? this.field17593 : this.field17594;
   }

   public ModelRenderer method11026() {
      return this.field17588;
   }

   @Override
   public ModelRenderer getModelHead() {
      return this.field17587;
   }

   @Override
   public void translateHand(HandSide var1, MatrixStack var2) {
      this.method11025(var1).translateRotate(var2);
   }
}
