package remapped;

public final class class_4095 implements class_7154 {
   @Override
   public void method_32845(class_9633 var1, TextureManager var2) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.method_16387(true);
      var2.bindTexture(class_8359.field_42824);
      var1.method_44471(7, class_7985.field_40902);
   }

   @Override
   public void method_32846(class_8042 var1) {
      var1.method_36500();
   }

   @Override
   public String toString() {
      return "TERRAIN_SHEET";
   }
}
