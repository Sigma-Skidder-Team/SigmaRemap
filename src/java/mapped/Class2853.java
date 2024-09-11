package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public class Class2853 extends Class2828 {
   private static String[] field17673;
   private final Class7219 field17674;
   private final Class7219 field17675;

   public Class2853() {
      super(RenderType::getEntitySolid);
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17674 = new Class7219(this, 0, 0);
      this.field17674.method22675(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F, 0.0F);
      this.field17675 = new Class7219(this, 26, 0);
      this.field17675.method22675(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F, 0.0F);
   }

   public Class7219 method11181() {
      return this.field17674;
   }

   public Class7219 method11182() {
      return this.field17675;
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field17674.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field17675.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
