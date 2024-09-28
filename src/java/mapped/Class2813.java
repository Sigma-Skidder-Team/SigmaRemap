package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2813<T extends Entity> extends Class2803<T> {
   private static String[] field17514;
   private final ModelRenderer field17515;
   private final ModelRenderer field17516;
   private final ModelRenderer field17517;
   private final ModelRenderer field17518;
   private final ModelRenderer field17519;
   private final ModelRenderer field17520;
   private final ModelRenderer field17521;
   private final ModelRenderer field17522;
   private final ModelRenderer field17523;
   private final ModelRenderer field17524;
   private final ModelRenderer field17525;

   public Class2813() {
      this.field17515 = new ModelRenderer(this, 32, 4);
      this.field17515.addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.field17515.setRotationPoint(0.0F, 15.0F, -3.0F);
      this.field17516 = new ModelRenderer(this, 0, 0);
      this.field17516.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F);
      this.field17516.setRotationPoint(0.0F, 15.0F, 0.0F);
      this.field17517 = new ModelRenderer(this, 0, 12);
      this.field17517.addBox(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F);
      this.field17517.setRotationPoint(0.0F, 15.0F, 9.0F);
      this.field17518 = new ModelRenderer(this, 18, 0);
      this.field17518.addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17518.setRotationPoint(-4.0F, 15.0F, 2.0F);
      this.field17519 = new ModelRenderer(this, 18, 0);
      this.field17519.addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17519.setRotationPoint(4.0F, 15.0F, 2.0F);
      this.field17520 = new ModelRenderer(this, 18, 0);
      this.field17520.addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17520.setRotationPoint(-4.0F, 15.0F, 1.0F);
      this.field17521 = new ModelRenderer(this, 18, 0);
      this.field17521.addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17521.setRotationPoint(4.0F, 15.0F, 1.0F);
      this.field17522 = new ModelRenderer(this, 18, 0);
      this.field17522.addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17522.setRotationPoint(-4.0F, 15.0F, 0.0F);
      this.field17523 = new ModelRenderer(this, 18, 0);
      this.field17523.addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17523.setRotationPoint(4.0F, 15.0F, 0.0F);
      this.field17524 = new ModelRenderer(this, 18, 0);
      this.field17524.addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17524.setRotationPoint(-4.0F, 15.0F, -1.0F);
      this.field17525 = new ModelRenderer(this, 18, 0);
      this.field17525.addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17525.setRotationPoint(4.0F, 15.0F, -1.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(
         this.field17515,
         this.field17516,
         this.field17517,
         this.field17518,
         this.field17519,
         this.field17520,
         this.field17521,
         this.field17522,
         this.field17523,
         this.field17524,
         this.field17525
      );
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17515.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17515.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      float var9 = (float) (Math.PI / 4);
      this.field17518.rotateAngleZ = (float) (-Math.PI / 4);
      this.field17519.rotateAngleZ = (float) (Math.PI / 4);
      this.field17520.rotateAngleZ = -0.58119464F;
      this.field17521.rotateAngleZ = 0.58119464F;
      this.field17522.rotateAngleZ = -0.58119464F;
      this.field17523.rotateAngleZ = 0.58119464F;
      this.field17524.rotateAngleZ = (float) (-Math.PI / 4);
      this.field17525.rotateAngleZ = (float) (Math.PI / 4);
      float var10 = -0.0F;
      float var11 = (float) (Math.PI / 8);
      this.field17518.rotateAngleY = (float) (Math.PI / 4);
      this.field17519.rotateAngleY = (float) (-Math.PI / 4);
      this.field17520.rotateAngleY = (float) (Math.PI / 8);
      this.field17521.rotateAngleY = (float) (-Math.PI / 8);
      this.field17522.rotateAngleY = (float) (-Math.PI / 8);
      this.field17523.rotateAngleY = (float) (Math.PI / 8);
      this.field17524.rotateAngleY = (float) (-Math.PI / 4);
      this.field17525.rotateAngleY = (float) (Math.PI / 4);
      float var12 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var3;
      float var13 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * var3;
      float var14 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var15 = -(MathHelper.cos(var2 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      float var16 = Math.abs(MathHelper.sin(var2 * 0.6662F + 0.0F) * 0.4F) * var3;
      float var17 = Math.abs(MathHelper.sin(var2 * 0.6662F + (float) Math.PI) * 0.4F) * var3;
      float var18 = Math.abs(MathHelper.sin(var2 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var19 = Math.abs(MathHelper.sin(var2 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      this.field17518.rotateAngleY += var12;
      this.field17519.rotateAngleY += -var12;
      this.field17520.rotateAngleY += var13;
      this.field17521.rotateAngleY += -var13;
      this.field17522.rotateAngleY += var14;
      this.field17523.rotateAngleY += -var14;
      this.field17524.rotateAngleY += var15;
      this.field17525.rotateAngleY += -var15;
      this.field17518.rotateAngleZ += var16;
      this.field17519.rotateAngleZ += -var16;
      this.field17520.rotateAngleZ += var17;
      this.field17521.rotateAngleZ += -var17;
      this.field17522.rotateAngleZ += var18;
      this.field17523.rotateAngleZ += -var18;
      this.field17524.rotateAngleZ += var19;
      this.field17525.rotateAngleZ += -var19;
   }
}
