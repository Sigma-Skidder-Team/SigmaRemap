package mapped;

public final class Class6848 implements Class6843 {
   @Override
   public void method20824(BufferBuilder var1, TextureManager var2) {
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      var2.bindTexture(AtlasTexture.field1103);
      var1.begin(7, DefaultVertexFormats.field43340);
   }

   @Override
   public void method20825(Tessellator var1) {
      var1.draw();
   }

   @Override
   public String toString() {
      return "PARTICLE_SHEET_LIT";
   }
}
