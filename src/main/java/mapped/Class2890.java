package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2890<T extends Entity> extends Class2803<T> {
   private static String[] field17903;
   private final ModelRenderer field17904;
   private final ModelRenderer field17905;
   private final ModelRenderer field17906;
   private final ModelRenderer field17907;
   private final ModelRenderer field17908;
   private final ModelRenderer field17909;
   private final ModelRenderer field17910;

   public Class2890() {
      this(0.0F);
   }

   public Class2890(float var1) {
      byte var4 = 6;
      this.field17904 = new ModelRenderer(this, 0, 0);
      this.field17904.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.field17904.setRotationPoint(0.0F, 6.0F, 0.0F);
      this.field17905 = new ModelRenderer(this, 32, 0);
      this.field17905.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 + 0.5F);
      this.field17905.setRotationPoint(0.0F, 6.0F, 0.0F);
      this.field17906 = new ModelRenderer(this, 16, 16);
      this.field17906.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.field17906.setRotationPoint(0.0F, 6.0F, 0.0F);
      this.field17907 = new ModelRenderer(this, 0, 16);
      this.field17907.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17907.setRotationPoint(-2.0F, 18.0F, 4.0F);
      this.field17908 = new ModelRenderer(this, 0, 16);
      this.field17908.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17908.setRotationPoint(2.0F, 18.0F, 4.0F);
      this.field17909 = new ModelRenderer(this, 0, 16);
      this.field17909.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17909.setRotationPoint(-2.0F, 18.0F, -4.0F);
      this.field17910 = new ModelRenderer(this, 0, 16);
      this.field17910.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field17910.setRotationPoint(2.0F, 18.0F, -4.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17904, this.field17906, this.field17907, this.field17908, this.field17909, this.field17910);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17904.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17904.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17907.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17908.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17909.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17910.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
   }
}
