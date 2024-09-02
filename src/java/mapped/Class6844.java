package mapped;

public final class Class6844 implements Class6843 {
   @Override
   public void method20824(BufferBuilder var1, TextureManager var2) {
      RenderSystem.depthMask(true);
      var2.bindTexture(AtlasTexture.field1103);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.field15997, DestFactor.field12932, GlStateManager.SourceFactor.field15990, DestFactor.field12932);
      RenderSystem.method27819(516, 0.003921569F);
      var1.begin(7, DefaultVertexFormats.field43340);
   }

   @Override
   public void method20825(Tessellator var1) {
      var1.draw();
   }

   @Override
   public String toString() {
      return "PARTICLE_SHEET_TRANSLUCENT";
   }
}
