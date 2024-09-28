package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2811 extends Class2803<Class1114> {
   private static String[] field17493;
   private final ModelRenderer field17494;
   private final ModelRenderer field17495;
   private final ModelRenderer field17496;
   private final ModelRenderer field17497;
   private final ModelRenderer field17498;
   private final ModelRenderer field17499;

   public Class2811() {
      this.textureWidth = 64;
      this.textureHeight = 64;
      this.field17494 = new ModelRenderer(this, 0, 0);
      this.field17494.method22673(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      ModelRenderer var3 = new ModelRenderer(this, 24, 0);
      var3.method22673(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.field17494.method22670(var3);
      ModelRenderer var4 = new ModelRenderer(this, 24, 0);
      var4.mirror = true;
      var4.method22673(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.field17494.method22670(var4);
      this.field17495 = new ModelRenderer(this, 0, 16);
      this.field17495.method22673(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F);
      this.field17495.method22671(0, 34).method22673(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F);
      this.field17496 = new ModelRenderer(this, 42, 0);
      this.field17496.method22673(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.field17498 = new ModelRenderer(this, 24, 16);
      this.field17498.setRotationPoint(-12.0F, 1.0F, 1.5F);
      this.field17498.method22673(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.field17497 = new ModelRenderer(this, 42, 0);
      this.field17497.mirror = true;
      this.field17497.method22673(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.field17499 = new ModelRenderer(this, 24, 16);
      this.field17499.mirror = true;
      this.field17499.setRotationPoint(12.0F, 1.0F, 1.5F);
      this.field17499.method22673(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.field17495.method22670(this.field17496);
      this.field17495.method22670(this.field17497);
      this.field17496.method22670(this.field17498);
      this.field17497.method22670(this.field17499);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17494, this.field17495);
   }

   public void setRotationAngles(Class1114 var1, float var2, float var3, float var4, float var5, float var6) {
      if (!var1.method5364()) {
         this.field17494.rotateAngleX = var6 * (float) (Math.PI / 180.0);
         this.field17494.rotateAngleY = var5 * (float) (Math.PI / 180.0);
         this.field17494.rotateAngleZ = 0.0F;
         this.field17494.setRotationPoint(0.0F, 0.0F, 0.0F);
         this.field17496.setRotationPoint(0.0F, 0.0F, 0.0F);
         this.field17497.setRotationPoint(0.0F, 0.0F, 0.0F);
         this.field17495.rotateAngleX = (float) (Math.PI / 4) + MathHelper.cos(var4 * 0.1F) * 0.15F;
         this.field17495.rotateAngleY = 0.0F;
         this.field17496.rotateAngleY = MathHelper.cos(var4 * 1.3F) * (float) Math.PI * 0.25F;
         this.field17497.rotateAngleY = -this.field17496.rotateAngleY;
         this.field17498.rotateAngleY = this.field17496.rotateAngleY * 0.5F;
         this.field17499.rotateAngleY = -this.field17496.rotateAngleY * 0.5F;
      } else {
         this.field17494.rotateAngleX = var6 * (float) (Math.PI / 180.0);
         this.field17494.rotateAngleY = (float) Math.PI - var5 * (float) (Math.PI / 180.0);
         this.field17494.rotateAngleZ = (float) Math.PI;
         this.field17494.setRotationPoint(0.0F, -2.0F, 0.0F);
         this.field17496.setRotationPoint(-3.0F, 0.0F, 3.0F);
         this.field17497.setRotationPoint(3.0F, 0.0F, 3.0F);
         this.field17495.rotateAngleX = (float) Math.PI;
         this.field17496.rotateAngleX = (float) (-Math.PI / 20);
         this.field17496.rotateAngleY = (float) (-Math.PI * 2.0 / 5.0);
         this.field17498.rotateAngleY = -1.7278761F;
         this.field17497.rotateAngleX = this.field17496.rotateAngleX;
         this.field17497.rotateAngleY = -this.field17496.rotateAngleY;
         this.field17499.rotateAngleY = -this.field17498.rotateAngleY;
      }
   }
}
