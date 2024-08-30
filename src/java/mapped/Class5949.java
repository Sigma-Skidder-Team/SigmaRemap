package mapped;

public class Class5949 extends Class5942<Class948> {
   private static String[] field25944;
   private final Class2850 field25945 = new Class2850();

   public Class5949(TileEntityRendererDispatcher var1) {
      super(var1);
   }

   public void method18462(Class948 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      BlockState var9 = var1.method3775();
      if (var9.<Boolean>method23463(Class3354.field18882)) {
         var3.push();
         var3.translate(0.5, 1.0625, 0.5);
         float var10 = var9.<Direction>method23463(Class3354.field18880).method537().method551();
         var3.rotate(Vector3f.YP.rotationDegrees(-var10));
         var3.rotate(Vector3f.field32902.rotationDegrees(67.5F));
         var3.translate(0.0, -0.125, 0.0);
         this.field25945.method11177(0.0F, 0.1F, 0.9F, 1.2F);
         Class5422 var11 = Class5951.field25950.method26200(var4, RenderType::getEntitySolid);
         this.field25945.method11176(var3, var11, var5, var6, 1.0F, 1.0F, 1.0F, 1.0F);
         var3.pop();
      }
   }
}
