package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;

import java.util.List;

public class Class2850 extends Class2828 {
   private static String[] field17655;
   private final Class7219 field17656 = new Class7219(64, 32, 0, 0).method22673(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final Class7219 field17657 = new Class7219(64, 32, 16, 0).method22673(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final Class7219 field17658;
   private final Class7219 field17659;
   private final Class7219 field17660;
   private final Class7219 field17661;
   private final Class7219 field17662 = new Class7219(64, 32, 12, 0).method22673(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F);
   private final List<Class7219> field17663;

   public Class2850() {
      super(RenderType::getEntitySolid);
      this.field17658 = new Class7219(64, 32, 0, 10).method22673(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F);
      this.field17659 = new Class7219(64, 32, 12, 10).method22673(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F);
      this.field17660 = new Class7219(64, 32, 24, 10).method22673(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.field17661 = new Class7219(64, 32, 24, 10).method22673(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.field17663 = ImmutableList.of(this.field17656, this.field17657, this.field17662, this.field17658, this.field17659, this.field17660, this.field17661);
      this.field17656.method22679(0.0F, 0.0F, -1.0F);
      this.field17657.method22679(0.0F, 0.0F, 1.0F);
      this.field17662.field31036 = (float) (Math.PI / 2);
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.method11176(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method11176(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17663.forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void method11177(float var1, float var2, float var3, float var4) {
      float var7 = (MathHelper.sin(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.field17656.field31036 = (float) Math.PI + var7;
      this.field17657.field31036 = -var7;
      this.field17658.field31036 = var7;
      this.field17659.field31036 = -var7;
      this.field17660.field31036 = var7 - var7 * 2.0F * var2;
      this.field17661.field31036 = var7 - var7 * 2.0F * var3;
      this.field17658.field31032 = MathHelper.sin(var7);
      this.field17659.field31032 = MathHelper.sin(var7);
      this.field17660.field31032 = MathHelper.sin(var7);
      this.field17661.field31032 = MathHelper.sin(var7);
   }
}
