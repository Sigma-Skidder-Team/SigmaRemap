package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2816<T extends Entity> extends Class2803<T> {
   private static String[] field17545;
   private final ModelRenderer field17546;
   private final ModelRenderer field17547;
   private final ModelRenderer field17548;
   private final ModelRenderer field17549;
   private final ModelRenderer field17550;

   public Class2816() {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var3 = 20;
      this.field17546 = new ModelRenderer(this, 0, 0);
      this.field17546.method22673(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.field17546.setRotationPoint(0.0F, 20.0F, 0.0F);
      this.field17547 = new ModelRenderer(this, 0, 13);
      this.field17547.method22673(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.field17547.setRotationPoint(0.0F, 20.0F, 8.0F);
      this.field17548 = new ModelRenderer(this, 22, 0);
      this.field17548.method22673(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.field17548.setRotationPoint(0.0F, 20.0F, 0.0F);
      ModelRenderer var4 = new ModelRenderer(this, 20, 10);
      var4.method22673(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F);
      var4.setRotationPoint(0.0F, 0.0F, 8.0F);
      this.field17547.method22670(var4);
      ModelRenderer var5 = new ModelRenderer(this, 2, 1);
      var5.method22673(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F);
      var5.setRotationPoint(0.0F, -4.5F, 5.0F);
      this.field17546.method22670(var5);
      ModelRenderer var6 = new ModelRenderer(this, 0, 2);
      var6.method22673(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F);
      var6.setRotationPoint(0.0F, -4.5F, -1.0F);
      this.field17547.method22670(var6);
      this.field17549 = new ModelRenderer(this, -4, 0);
      this.field17549.method22673(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17549.setRotationPoint(-1.5F, 21.5F, 0.0F);
      this.field17549.field31037 = (float) (-Math.PI / 4);
      this.field17550 = new ModelRenderer(this, 0, 0);
      this.field17550.method22673(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17550.setRotationPoint(1.5F, 21.5F, 0.0F);
      this.field17550.field31037 = (float) (Math.PI / 4);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17546, this.field17547, this.field17548, this.field17549, this.field17550);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      float var10 = 1.0F;
      if (!var1.isInWater()) {
         var9 = 1.3F;
         var10 = 1.7F;
      }

      this.field17547.rotateAngleY = -var9 * 0.25F * MathHelper.sin(var10 * 0.6F * var4);
   }
}
