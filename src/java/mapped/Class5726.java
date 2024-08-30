package mapped;

public class Class5726 extends Class5715<Class888> {
   private static String[] field25133;
   private final ItemRenderer field25134;

   public Class5726(EntityRendererManager var1, ItemRenderer var2) {
      super(var1);
      this.field25134 = var2;
   }

   public void method17853(Class888 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.rotate(this.field25097.method32230());
      var4.rotate(Vector3f.YP.rotationDegrees(180.0F));
      if (var1.method3508()) {
         var4.rotate(Vector3f.field32902.rotationDegrees(180.0F));
         var4.rotate(Vector3f.YP.rotationDegrees(180.0F));
         var4.rotate(Vector3f.field32898.rotationDegrees(90.0F));
      }

      this.field25134.method789(var1.method3509(), Class2327.field15931, var6, Class213.field798, var4, var5);
      var4.pop();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class888 var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }
}
