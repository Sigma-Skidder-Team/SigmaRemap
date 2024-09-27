package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public class Class7954 {
   private static String[] field34194;
   private int field34195 = 0;
   private ModelRenderer field34196 = null;

   public Class7954(int var1, ModelRenderer var2) {
      this.field34195 = var1;
      this.field34196 = var2;
   }

   public ModelRenderer method27043() {
      return this.field34196;
   }

   public void method27044(BipedModel var1, MatrixStack var2, IVertexBuilder var3, int var4, int var5) {
      ModelRenderer var8 = Class7078.method21992(var1, this.field34195);
      if (var8 != null) {
         var8.translateRotate(var2);
      }

      this.field34196.render(var2, var3, var4, var5);
   }
}
