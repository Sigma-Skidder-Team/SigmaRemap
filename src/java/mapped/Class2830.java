package mapped;

public class Class2830 extends Class2828 {
   public Class7219 field17607;
   public Class7219 field17608;
   public Class7219 field17609;

   public Class2830() {
      super(Class4520::method14310);
      Class8086 var3 = Class8086.field34743;
      Class5953 var4 = new Class5953(var3);
      this.field17607 = (Class7219)Class9299.field43161.method36565(var4, 0);
      this.field17608 = (Class7219)Class9299.field43161.method36565(var4, 1);
      this.field17609 = (Class7219)Class9299.field43161.method36565(var4, 2);
   }

   public Class5942 method11029(Class5942 var1) {
      if (Class9299.field43161.method36567()) {
         Class9299.field43161.method36566(var1, 0, this.field17607);
         Class9299.field43161.method36566(var1, 1, this.field17608);
         Class9299.field43161.method36566(var1, 2, this.field17609);
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