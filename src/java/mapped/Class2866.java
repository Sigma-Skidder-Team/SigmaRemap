package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2866<T extends Entity> extends Class2855<T> {
   private static String[] field17771;
   public ModelRenderer field17772 = new ModelRenderer(this, 0, 0);
   public ModelRenderer field17773;
   public ModelRenderer field17774;
   public ModelRenderer field17775;
   public ModelRenderer field17776;
   public ModelRenderer field17777;

   public Class2866(int var1, float var2, boolean var3, float var4, float var5, float var6, float var7, int var8) {
      super(var3, var4, var5, var6, var7, (float)var8);
      this.field17772.addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, var2);
      this.field17772.setRotationPoint(0.0F, (float)(18 - var1), -6.0F);
      this.field17773 = new ModelRenderer(this, 28, 8);
      this.field17773.addBox(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, var2);
      this.field17773.setRotationPoint(0.0F, (float)(17 - var1), 2.0F);
      this.field17774 = new ModelRenderer(this, 0, 16);
      this.field17774.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17774.setRotationPoint(-3.0F, (float)(24 - var1), 7.0F);
      this.field17775 = new ModelRenderer(this, 0, 16);
      this.field17775.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17775.setRotationPoint(3.0F, (float)(24 - var1), 7.0F);
      this.field17776 = new ModelRenderer(this, 0, 16);
      this.field17776.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17776.setRotationPoint(-3.0F, (float)(24 - var1), -5.0F);
      this.field17777 = new ModelRenderer(this, 0, 16);
      this.field17777.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field17777.setRotationPoint(3.0F, (float)(24 - var1), -5.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11001() {
      return ImmutableList.of(this.field17772);
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(this.field17773, this.field17774, this.field17775, this.field17776, this.field17777);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17772.rotateAngleX = var6 * (float) (Math.PI / 180.0);
      this.field17772.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17773.rotateAngleX = (float) (Math.PI / 2);
      this.field17774.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field17775.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17776.rotateAngleX = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field17777.rotateAngleX = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
   }
}
