package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2865<T extends MobEntity & Class1092> extends AgeableModel<T> {
   private static String[] field17761;
   private final ModelRenderer field17762;
   private final ModelRenderer field17763;
   private final ModelRenderer field17764;
   private final ModelRenderer field17765;
   private final ModelRenderer field17766;
   private final ModelRenderer field17767;
   private final ModelRenderer field17768;
   private final ModelRenderer field17769;
   private final ModelRenderer field17770;

   public Class2865() {
      super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.field17765 = new ModelRenderer(this);
      this.field17765.setRotationPoint(0.0F, 7.0F, 0.0F);
      this.field17765.method22671(1, 1).method22673(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F);
      this.field17770 = new ModelRenderer(this);
      this.field17770.setRotationPoint(0.0F, -14.0F, -5.0F);
      this.field17770.method22671(90, 33).addBox(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, 0.001F);
      this.field17765.method22670(this.field17770);
      this.field17762 = new ModelRenderer(this);
      this.field17762.setRotationPoint(0.0F, 2.0F, -12.0F);
      this.field17762.method22671(61, 1).method22673(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F);
      this.field17763 = new ModelRenderer(this);
      this.field17763.setRotationPoint(-6.0F, -2.0F, -3.0F);
      this.field17763.method22671(1, 1).method22673(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.field17763.rotateAngleZ = (float) (-Math.PI * 2.0 / 9.0);
      this.field17762.method22670(this.field17763);
      this.field17764 = new ModelRenderer(this);
      this.field17764.setRotationPoint(6.0F, -2.0F, -3.0F);
      this.field17764.method22671(1, 6).method22673(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.field17764.rotateAngleZ = (float) (Math.PI * 2.0 / 9.0);
      this.field17762.method22670(this.field17764);
      ModelRenderer var3 = new ModelRenderer(this);
      var3.setRotationPoint(-7.0F, 2.0F, -12.0F);
      var3.method22671(10, 13).method22673(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.field17762.method22670(var3);
      ModelRenderer var4 = new ModelRenderer(this);
      var4.setRotationPoint(7.0F, 2.0F, -12.0F);
      var4.method22671(1, 13).method22673(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.field17762.method22670(var4);
      this.field17762.rotateAngleX = 0.87266463F;
      byte var5 = 14;
      byte var6 = 11;
      this.field17766 = new ModelRenderer(this);
      this.field17766.setRotationPoint(-4.0F, 10.0F, -8.5F);
      this.field17766.method22671(66, 42).method22673(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.field17767 = new ModelRenderer(this);
      this.field17767.setRotationPoint(4.0F, 10.0F, -8.5F);
      this.field17767.method22671(41, 42).method22673(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.field17768 = new ModelRenderer(this);
      this.field17768.setRotationPoint(-5.0F, 13.0F, 10.0F);
      this.field17768.method22671(21, 45).method22673(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
      this.field17769 = new ModelRenderer(this);
      this.field17769.setRotationPoint(5.0F, 13.0F, 10.0F);
      this.field17769.method22671(0, 45).method22673(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
   }

   @Override
   public Iterable<ModelRenderer> getHeadParts() {
      return ImmutableList.of(this.field17762);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(this.field17765, this.field17766, this.field17767, this.field17768, this.field17769);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17763.rotateAngleZ = (float) (-Math.PI * 2.0 / 9.0) - var3 * MathHelper.sin(var2);
      this.field17764.rotateAngleZ = (float) (Math.PI * 2.0 / 9.0) + var3 * MathHelper.sin(var2);
      this.field17762.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      int var9 = ((Class1092)var1).method5082();
      float var10 = 1.0F - (float) MathHelper.abs(10 - 2 * var9) / 10.0F;
      this.field17762.rotateAngleX = MathHelper.lerp(var10, 0.87266463F, (float) (-Math.PI / 9));
      if (!var1.isChild()) {
         this.field17762.rotationPointY = 2.0F;
         this.field17770.rotationPointZ = -7.0F;
      } else {
         this.field17762.rotationPointY = MathHelper.lerp(var10, 2.0F, 5.0F);
         this.field17770.rotationPointZ = -3.0F;
      }

      float var11 = 1.2F;
      this.field17766.rotateAngleX = MathHelper.cos(var2) * 1.2F * var3;
      this.field17767.rotateAngleX = MathHelper.cos(var2 + (float) Math.PI) * 1.2F * var3;
      this.field17768.rotateAngleX = this.field17767.rotateAngleX;
      this.field17769.rotateAngleX = this.field17766.rotateAngleX;
   }
}
