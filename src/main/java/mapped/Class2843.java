package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.optifine.Config;

public class Class2843 extends Class2828 {
   public ModelRenderer field17640;
   public ModelRenderer field17641;
   public ModelRenderer[] field17642 = new ModelRenderer[4];

   public Class2843() {
      super(RenderType::getEntityCutoutNoCull);
      TileEntityRendererDispatcher var3 = TileEntityRendererDispatcher.instance;
      Class5950 var4 = new Class5950(var3);
      this.field17640 = (ModelRenderer) Reflector.field43155.method20235(var4);
      this.field17641 = (ModelRenderer) Reflector.field43156.method20235(var4);
      this.field17642 = (ModelRenderer[]) Reflector.field43157.method20235(var4);
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }

   public Class5942 method11173(Class5942 var1) {
      if (Reflector.field43155.exists()) {
         if (Reflector.field43156.exists()) {
            if (Reflector.field43157.exists()) {
               Reflector.method35082(var1, Reflector.field43155, this.field17640);
               Reflector.method35082(var1, Reflector.field43156, this.field17641);
               Reflector.method35082(var1, Reflector.field43157, this.field17642);
               return var1;
            } else {
               Config.method26811("Field not found: TileEntityBedRenderer.legModels");
               return null;
            }
         } else {
            Config.method26811("Field not found: TileEntityBedRenderer.footModel");
            return null;
         }
      } else {
         Config.method26811("Field not found: TileEntityBedRenderer.head");
         return null;
      }
   }
}
