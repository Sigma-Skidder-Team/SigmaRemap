package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2888<T extends Class1070> extends Class2803<T> {
   private static String[] field17891;
   private final ModelRenderer field17892;
   private final ModelRenderer field17893;
   private final ModelRenderer field17894;
   private final ModelRenderer field17895;
   private final ModelRenderer field17896;
   private final ModelRenderer field17897;
   private final ModelRenderer field17898;
   private final ModelRenderer field17899;
   private final ModelRenderer field17900;

   public Class2888() {
      this.field17604 = 64;
      this.field17605 = 128;
      this.field17892 = new ModelRenderer(this, 0, 32);
      this.field17892.setRotationPoint(-4.0F, 8.0F, 0.0F);
      this.field17892.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.field17893 = new ModelRenderer(this, 0, 55);
      this.field17893.setRotationPoint(4.0F, 8.0F, 0.0F);
      this.field17893.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.field17894 = new ModelRenderer(this, 0, 0);
      this.field17894.setRotationPoint(0.0F, 1.0F, 0.0F);
      this.field17894.addBox(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F);
      this.field17895 = new ModelRenderer(this, 16, 65);
      this.field17895.setRotationPoint(-8.0F, 4.0F, -8.0F);
      this.field17895.method22677(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method11205(this.field17895, 0.0F, 0.0F, -1.2217305F);
      this.field17896 = new ModelRenderer(this, 16, 49);
      this.field17896.setRotationPoint(-8.0F, -1.0F, -8.0F);
      this.field17896.method22677(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method11205(this.field17896, 0.0F, 0.0F, -1.134464F);
      this.field17897 = new ModelRenderer(this, 16, 33);
      this.field17897.setRotationPoint(-8.0F, -5.0F, -8.0F);
      this.field17897.method22677(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method11205(this.field17897, 0.0F, 0.0F, -0.87266463F);
      this.field17898 = new ModelRenderer(this, 16, 33);
      this.field17898.setRotationPoint(8.0F, -6.0F, -8.0F);
      this.field17898.addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method11205(this.field17898, 0.0F, 0.0F, 0.87266463F);
      this.field17899 = new ModelRenderer(this, 16, 49);
      this.field17899.setRotationPoint(8.0F, -2.0F, -8.0F);
      this.field17899.addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method11205(this.field17899, 0.0F, 0.0F, 1.134464F);
      this.field17900 = new ModelRenderer(this, 16, 65);
      this.field17900.setRotationPoint(8.0F, 3.0F, -8.0F);
      this.field17900.addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method11205(this.field17900, 0.0F, 0.0F, 1.2217305F);
      this.field17894.method22670(this.field17895);
      this.field17894.method22670(this.field17896);
      this.field17894.method22670(this.field17897);
      this.field17894.method22670(this.field17898);
      this.field17894.method22670(this.field17899);
      this.field17894.method22670(this.field17900);
   }

   public void setRotationAngles(Class1070 var1, float var2, float var3, float var4, float var5, float var6) {
      var3 = Math.min(0.25F, var3);
      if (var1.getPassengers().size() > 0) {
         this.field17894.rotateAngleX = 0.0F;
         this.field17894.rotateAngleY = 0.0F;
      } else {
         this.field17894.rotateAngleX = var6 * (float) (Math.PI / 180.0);
         this.field17894.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      }

      float var9 = 1.5F;
      this.field17894.field31037 = 0.1F * MathHelper.sin(var2 * 1.5F) * 4.0F * var3;
      this.field17894.rotationPointY = 2.0F;
      this.field17894.rotationPointY = this.field17894.rotationPointY - 2.0F * MathHelper.cos(var2 * 1.5F) * 2.0F * var3;
      this.field17893.rotateAngleX = MathHelper.sin(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.field17892.rotateAngleX = MathHelper.sin(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.field17893.field31037 = (float) (Math.PI / 18) * MathHelper.cos(var2 * 1.5F * 0.5F) * var3;
      this.field17892.field31037 = (float) (Math.PI / 18) * MathHelper.cos(var2 * 1.5F * 0.5F + (float) Math.PI) * var3;
      this.field17893.rotationPointY = 8.0F + 2.0F * MathHelper.sin(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.field17892.rotationPointY = 8.0F + 2.0F * MathHelper.sin(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.field17895.field31037 = -1.2217305F;
      this.field17896.field31037 = -1.134464F;
      this.field17897.field31037 = -0.87266463F;
      this.field17898.field31037 = 0.87266463F;
      this.field17899.field31037 = 1.134464F;
      this.field17900.field31037 = 1.2217305F;
      float var10 = MathHelper.cos(var2 * 1.5F + (float) Math.PI) * var3;
      this.field17895.field31037 += var10 * 1.3F;
      this.field17896.field31037 += var10 * 1.2F;
      this.field17897.field31037 += var10 * 0.6F;
      this.field17898.field31037 += var10 * 0.6F;
      this.field17899.field31037 += var10 * 1.2F;
      this.field17900.field31037 += var10 * 1.3F;
      float var11 = 1.0F;
      float var12 = 1.0F;
      this.field17895.field31037 = this.field17895.field31037 + 0.05F * MathHelper.sin(var4 * 1.0F * -0.4F);
      this.field17896.field31037 = this.field17896.field31037 + 0.1F * MathHelper.sin(var4 * 1.0F * 0.2F);
      this.field17897.field31037 = this.field17897.field31037 + 0.1F * MathHelper.sin(var4 * 1.0F * 0.4F);
      this.field17898.field31037 = this.field17898.field31037 + 0.1F * MathHelper.sin(var4 * 1.0F * 0.4F);
      this.field17899.field31037 = this.field17899.field31037 + 0.1F * MathHelper.sin(var4 * 1.0F * 0.2F);
      this.field17900.field31037 = this.field17900.field31037 + 0.05F * MathHelper.sin(var4 * 1.0F * -0.4F);
   }

   public void method11205(ModelRenderer var1, float var2, float var3, float var4) {
      var1.rotateAngleX = var2;
      var1.rotateAngleY = var3;
      var1.field31037 = var4;
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17894, this.field17893, this.field17892);
   }
}
