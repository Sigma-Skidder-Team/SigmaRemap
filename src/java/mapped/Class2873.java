package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class Class2873<T extends TurtleEntity> extends Class2866<T> {
   private static String[] field17771;
   private final ModelRenderer field17787;

   public Class2873(float var1) {
      super(12, var1, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.field17772 = new ModelRenderer(this, 3, 0);
      this.field17772.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F);
      this.field17772.setRotationPoint(0.0F, 19.0F, -10.0F);
      this.field17773 = new ModelRenderer(this);
      this.field17773.method22671(7, 37).addBox(-9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F, 0.0F);
      this.field17773.method22671(31, 1).addBox(-5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F, 0.0F);
      this.field17773.setRotationPoint(0.0F, 11.0F, -10.0F);
      this.field17787 = new ModelRenderer(this);
      this.field17787.method22671(70, 33).addBox(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F, 0.0F);
      this.field17787.setRotationPoint(0.0F, 11.0F, -10.0F);
      boolean var4 = true;
      this.field17774 = new ModelRenderer(this, 1, 23);
      this.field17774.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.field17774.setRotationPoint(-3.5F, 22.0F, 11.0F);
      this.field17775 = new ModelRenderer(this, 1, 12);
      this.field17775.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.field17775.setRotationPoint(3.5F, 22.0F, 11.0F);
      this.field17776 = new ModelRenderer(this, 27, 30);
      this.field17776.addBox(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.field17776.setRotationPoint(-5.0F, 21.0F, -4.0F);
      this.field17777 = new ModelRenderer(this, 27, 24);
      this.field17777.addBox(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.field17777.setRotationPoint(5.0F, 21.0F, -4.0F);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return Iterables.concat(super.getBodyParts(), ImmutableList.of(this.field17787));
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      this.field17774.rotateAngleX = MathHelper.cos(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.field17775.rotateAngleX = MathHelper.cos(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.field17776.rotateAngleZ = MathHelper.cos(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.field17777.rotateAngleZ = MathHelper.cos(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.field17776.rotateAngleX = 0.0F;
      this.field17777.rotateAngleX = 0.0F;
      this.field17776.rotateAngleY = 0.0F;
      this.field17777.rotateAngleY = 0.0F;
      this.field17774.rotateAngleY = 0.0F;
      this.field17775.rotateAngleY = 0.0F;
      this.field17787.rotateAngleX = (float) (Math.PI / 2);
      if (!var1.isInWater() && var1.isOnGround()) {
         float var9 = !var1.method5047() ? 1.0F : 4.0F;
         float var10 = !var1.method5047() ? 1.0F : 2.0F;
         float var11 = 5.0F;
         this.field17776.rotateAngleY = MathHelper.cos(var9 * var2 * 5.0F + (float) Math.PI) * 8.0F * var3 * var10;
         this.field17776.rotateAngleZ = 0.0F;
         this.field17777.rotateAngleY = MathHelper.cos(var9 * var2 * 5.0F) * 8.0F * var3 * var10;
         this.field17777.rotateAngleZ = 0.0F;
         this.field17774.rotateAngleY = MathHelper.cos(var2 * 5.0F + (float) Math.PI) * 3.0F * var3;
         this.field17774.rotateAngleX = 0.0F;
         this.field17775.rotateAngleY = MathHelper.cos(var2 * 5.0F) * 3.0F * var3;
         this.field17775.rotateAngleX = 0.0F;
      }

      this.field17787.showModel = !this.isChild && var1.method5045();
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      boolean var11 = this.field17787.showModel;
      if (var11) {
         var1.push();
         var1.translate(0.0, -0.08F, 0.0);
      }

      super.render(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var11) {
         var1.pop();
      }
   }
}
