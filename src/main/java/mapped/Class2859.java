package mapped;

import net.minecraft.entity.passive.WolfEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2859<T extends WolfEntity> extends Class2858<T> {
   private static String[] field17711;
   private final ModelRenderer field17712;
   private final ModelRenderer field17713;
   private final ModelRenderer field17714;
   private final ModelRenderer field17715;
   private final ModelRenderer field17716;
   private final ModelRenderer field17717;
   private final ModelRenderer field17718;
   private final ModelRenderer field17719;
   private final ModelRenderer field17720;
   private final ModelRenderer field17721;

   public Class2859() {
      float var3 = 0.0F;
      float var4 = 13.5F;
      this.field17712 = new ModelRenderer(this, 0, 0);
      this.field17712.setRotationPoint(-1.0F, 13.5F, -7.0F);
      this.field17713 = new ModelRenderer(this, 0, 0);
      this.field17713.addBox(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F);
      this.field17712.method22670(this.field17713);
      this.field17714 = new ModelRenderer(this, 18, 14);
      this.field17714.addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F);
      this.field17714.setRotationPoint(0.0F, 14.0F, 2.0F);
      this.field17721 = new ModelRenderer(this, 21, 0);
      this.field17721.addBox(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F);
      this.field17721.setRotationPoint(-1.0F, 14.0F, 2.0F);
      this.field17715 = new ModelRenderer(this, 0, 18);
      this.field17715.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17715.setRotationPoint(-2.5F, 16.0F, 7.0F);
      this.field17716 = new ModelRenderer(this, 0, 18);
      this.field17716.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17716.setRotationPoint(0.5F, 16.0F, 7.0F);
      this.field17717 = new ModelRenderer(this, 0, 18);
      this.field17717.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17717.setRotationPoint(-2.5F, 16.0F, -4.0F);
      this.field17718 = new ModelRenderer(this, 0, 18);
      this.field17718.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17718.setRotationPoint(0.5F, 16.0F, -4.0F);
      this.field17719 = new ModelRenderer(this, 9, 18);
      this.field17719.setRotationPoint(-1.0F, 12.0F, 8.0F);
      this.field17720 = new ModelRenderer(this, 9, 18);
      this.field17720.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field17719.method22670(this.field17720);
      this.field17713.method22671(16, 14).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field17713.method22671(16, 14).addBox(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field17713.method22671(0, 10).addBox(-0.5F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F);
   }

   @Override
   public Iterable<ModelRenderer> getHeadParts() {
      return ImmutableList.of(this.field17712);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(this.field17714, this.field17715, this.field17716, this.field17717, this.field17718, this.field17719, this.field17721);
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      if (!var1.method4369()) {
         this.field17719.rotateAngleY = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      } else {
         this.field17719.rotateAngleY = 0.0F;
      }

      if (!var1.method4395()) {
         this.field17714.setRotationPoint(0.0F, 14.0F, 2.0F);
         this.field17714.rotateAngleX = (float) (Math.PI / 2);
         this.field17721.setRotationPoint(-1.0F, 14.0F, -3.0F);
         this.field17721.rotateAngleX = this.field17714.rotateAngleX;
         this.field17719.setRotationPoint(-1.0F, 12.0F, 8.0F);
         this.field17715.setRotationPoint(-2.5F, 16.0F, 7.0F);
         this.field17716.setRotationPoint(0.5F, 16.0F, 7.0F);
         this.field17717.setRotationPoint(-2.5F, 16.0F, -4.0F);
         this.field17718.setRotationPoint(0.5F, 16.0F, -4.0F);
         this.field17715.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
         this.field17716.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.field17717.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.field17718.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      } else {
         this.field17721.setRotationPoint(-1.0F, 16.0F, -3.0F);
         this.field17721.rotateAngleX = (float) (Math.PI * 2.0 / 5.0);
         this.field17721.rotateAngleY = 0.0F;
         this.field17714.setRotationPoint(0.0F, 18.0F, 0.0F);
         this.field17714.rotateAngleX = (float) (Math.PI / 4);
         this.field17719.setRotationPoint(-1.0F, 21.0F, 6.0F);
         this.field17715.setRotationPoint(-2.5F, 22.7F, 2.0F);
         this.field17715.rotateAngleX = (float) (Math.PI * 3.0 / 2.0);
         this.field17716.setRotationPoint(0.5F, 22.7F, 2.0F);
         this.field17716.rotateAngleX = (float) (Math.PI * 3.0 / 2.0);
         this.field17717.rotateAngleX = 5.811947F;
         this.field17717.setRotationPoint(-2.49F, 17.0F, -4.0F);
         this.field17718.rotateAngleX = 5.811947F;
         this.field17718.setRotationPoint(0.51F, 17.0F, -4.0F);
      }

      this.field17713.rotateAngleZ = var1.method4378(var4) + var1.method4377(var4, 0.0F);
      this.field17721.rotateAngleZ = var1.method4377(var4, -0.08F);
      this.field17714.rotateAngleZ = var1.method4377(var4, -0.16F);
      this.field17720.rotateAngleZ = var1.method4377(var4, -0.2F);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17712.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17712.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17719.rotateAngleX = var4;
   }
}
