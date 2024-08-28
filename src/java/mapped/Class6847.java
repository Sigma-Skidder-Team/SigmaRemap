package mapped;

public final class Class6847 implements Class6843 {
   @Override
   public void method20824(Class5425 var1, TextureManager var2) {
      RenderSystem.enableBlend();
      RenderSystem.method27938();
      RenderSystem.depthMask(true);
      var2.bindTexture(Class289.field1102);
      var1.method17063(7, Class9337.field43340);
   }

   @Override
   public void method20825(Class9352 var1) {
      var1.method35410();
   }

   @Override
   public String toString() {
      return "TERRAIN_SHEET";
   }
}
