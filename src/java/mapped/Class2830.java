package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.optifine.Config;

public class Class2830 extends Class2828 {
   public ModelRenderer field17607;
   public ModelRenderer field17608;
   public ModelRenderer field17609;

   public Class2830() {
      super(RenderType::getEntityCutout);
      TileEntityRendererDispatcher var3 = TileEntityRendererDispatcher.instance;
      Class5953 var4 = new Class5953(var3);
      this.field17607 = (ModelRenderer) Reflector.field43161.method36565(var4, 0);
      this.field17608 = (ModelRenderer) Reflector.field43161.method36565(var4, 1);
      this.field17609 = (ModelRenderer) Reflector.field43161.method36565(var4, 2);
   }

   public Class5942 method11029(Class5942 var1) {
      if (Reflector.field43161.method36567()) {
         Reflector.field43161.method36566(var1, 0, this.field17607);
         Reflector.field43161.method36566(var1, 1, this.field17608);
         Reflector.field43161.method36566(var1, 2, this.field17609);
         return var1;
      } else {
         Config.method26811("Field not found: TileEntityChestRenderer.modelRenderers");
         return null;
      }
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
