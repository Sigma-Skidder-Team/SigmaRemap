package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public class Class2846 extends Class2844 {
   private final Class7219 field17646;
   private final Class7219 field17647;

   public Class2846(float var1) {
      this.field17604 = 256;
      this.field17605 = 256;
      float var4 = -16.0F;
      this.field17646 = new Class7219(this);
      this.field17646.method22672("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, var1, 176, 44);
      this.field17646.method22672("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, var1, 112, 30);
      this.field17646.field31038 = true;
      this.field17646.method22672("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.field17646.method22672("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.field17646.field31038 = false;
      this.field17646.method22672("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.field17646.method22672("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.field17647 = new Class7219(this);
      this.field17647.method22679(0.0F, 4.0F, -8.0F);
      this.field17647.method22672("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, var1, 176, 65);
      this.field17646.method22670(this.field17647);
   }

   @Override
   public void method11174(float var1, float var2, float var3) {
      this.field17647.field31035 = (float)(Math.sin((double)(var1 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
      this.field17646.field31036 = var2 * (float) (Math.PI / 180.0);
      this.field17646.field31035 = var3 * (float) (Math.PI / 180.0);
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      var1.push();
      var1.translate(0.0, -0.374375F, 0.0);
      var1.method35292(0.75F, 0.75F, 0.75F);
      this.field17646.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
      var1.pop();
   }
}
