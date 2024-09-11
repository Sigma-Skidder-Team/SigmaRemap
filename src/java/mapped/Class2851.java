package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public class Class2851 extends Class2828 {
   public Class7219 field17664;
   public Class7219 field17665;
   public Class7219 field17666;
   public Class7219 field17667;
   public Class7219 field17668;
   public Class7219 field17669;

   public Class2851() {
      super(RenderType::getEntityCutout);
      TileEntityRendererDispatcher var3 = TileEntityRendererDispatcher.instance;
      Class5953 var4 = new Class5953(var3);
      this.field17664 = (Class7219)Class9299.field43161.method36565(var4, 3);
      this.field17665 = (Class7219)Class9299.field43161.method36565(var4, 4);
      this.field17666 = (Class7219)Class9299.field43161.method36565(var4, 5);
      this.field17667 = (Class7219)Class9299.field43161.method36565(var4, 6);
      this.field17668 = (Class7219)Class9299.field43161.method36565(var4, 7);
      this.field17669 = (Class7219)Class9299.field43161.method36565(var4, 8);
   }

   public Class5942 method11179(Class5942 var1) {
      if (Class9299.field43161.method36567()) {
         Class9299.field43161.method36566(var1, 3, this.field17664);
         Class9299.field43161.method36566(var1, 4, this.field17665);
         Class9299.field43161.method36566(var1, 5, this.field17666);
         Class9299.field43161.method36566(var1, 6, this.field17667);
         Class9299.field43161.method36566(var1, 7, this.field17668);
         Class9299.field43161.method36566(var1, 8, this.field17669);
         return var1;
      } else {
         Class7944.method26811("Field not found: TileEntityChestRenderer.modelRenderers");
         return null;
      }
   }

   @Override
   public void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
