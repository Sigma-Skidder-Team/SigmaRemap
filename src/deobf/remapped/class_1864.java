package remapped;

public final class class_1864 implements class_7154 {
   @Override
   public void method_32845(class_9633 var1, TextureManager var2) {
      RenderSystem.method_16387(true);
      var2.bindTexture(class_8359.field_42805);
      RenderSystem.enableBlend();
      RenderSystem.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43697);
      RenderSystem.method_16442(516, 0.003921569F);
      var1.method_44471(7, class_7985.field_40902);
   }

   @Override
   public void method_32846(class_8042 var1) {
      var1.method_36500();
   }

   @Override
   public String toString() {
      return "PARTICLE_SHEET_TRANSLUCENT";
   }
}
