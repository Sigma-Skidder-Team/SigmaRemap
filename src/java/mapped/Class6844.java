package mapped;

public final class Class6844 implements Class6843 {
   @Override
   public void method20824(Class5425 var1, TextureManager var2) {
      RenderSystem.depthMask(true);
      var2.bindTexture(Class289.field1103);
      RenderSystem.enableBlend();
      RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12932);
      RenderSystem.method27819(516, 0.003921569F);
      var1.method17063(7, Class9337.field43340);
   }

   @Override
   public void method20825(Class9352 var1) {
      var1.method35410();
   }

   @Override
   public String toString() {
      return "PARTICLE_SHEET_TRANSLUCENT";
   }
}
