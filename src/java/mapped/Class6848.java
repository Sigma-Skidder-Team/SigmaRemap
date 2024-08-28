package mapped;

public final class Class6848 implements Class6843 {
   @Override
   public void method20824(Class5425 var1, TextureManager var2) {
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      var2.bindTexture(Class289.field1103);
      var1.method17063(7, Class9337.field43340);
   }

   @Override
   public void method20825(Class9352 var1) {
      var1.method35410();
   }

   @Override
   public String toString() {
      return "PARTICLE_SHEET_LIT";
   }
}
