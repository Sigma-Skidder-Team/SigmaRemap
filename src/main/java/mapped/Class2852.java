package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.tileentity.BannerTileEntityRenderer;
import net.optifine.Config;

public class Class2852 extends Class2828 {
   public ModelRenderer field17670;
   public ModelRenderer field17671;
   public ModelRenderer field17672;

   public Class2852() {
      super(RenderType::getEntityCutoutNoCull);
      TileEntityRendererDispatcher var3 = TileEntityRendererDispatcher.instance;
      BannerTileEntityRenderer var4 = new BannerTileEntityRenderer(var3);
      this.field17670 = (ModelRenderer) Reflector.field43153.method36565(var4, 0);
      this.field17671 = (ModelRenderer) Reflector.field43153.method36565(var4, 1);
      this.field17672 = (ModelRenderer) Reflector.field43153.method36565(var4, 2);
   }

   public Class5942 method11180(Class5942 var1) {
      if (Reflector.field43153.method36567()) {
         Reflector.field43153.method36566(var1, 0, this.field17670);
         Reflector.field43153.method36566(var1, 1, this.field17671);
         Reflector.field43153.method36566(var1, 2, this.field17672);
         return var1;
      } else {
         Config.method26811("Field not found: TileEntityBannerRenderer.modelRenderers");
         return null;
      }
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
