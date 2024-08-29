package mapped;

public class Class2852 extends Class2828 {
   public Class7219 field17670;
   public Class7219 field17671;
   public Class7219 field17672;

   public Class2852() {
      super(RenderType::getEntityCutoutNoCull);
      TileEntityRendererDispatcher var3 = TileEntityRendererDispatcher.instance;
      Class5948 var4 = new Class5948(var3);
      this.field17670 = (Class7219)Class9299.field43153.method36565(var4, 0);
      this.field17671 = (Class7219)Class9299.field43153.method36565(var4, 1);
      this.field17672 = (Class7219)Class9299.field43153.method36565(var4, 2);
   }

   public Class5942 method11180(Class5942 var1) {
      if (Class9299.field43153.method36567()) {
         Class9299.field43153.method36566(var1, 0, this.field17670);
         Class9299.field43153.method36566(var1, 1, this.field17671);
         Class9299.field43153.method36566(var1, 2, this.field17672);
         return var1;
      } else {
         Class7944.method26811("Field not found: TileEntityBannerRenderer.modelRenderers");
         return null;
      }
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
