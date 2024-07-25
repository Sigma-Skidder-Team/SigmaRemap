package remapped;

public final class class_7716 extends class_4696 {
   private final float field_39131;
   private final float field_39132;

   public class_7716(float var1, float var2) {
      super("offset_texturing", () -> {
         RenderSystem.method_16463(5890);
         RenderSystem.method_16438();
         RenderSystem.method_16476();
         RenderSystem.translatef(var1, var2, 0.0F);
         RenderSystem.method_16463(5888);
      }, () -> {
         RenderSystem.method_16463(5890);
         RenderSystem.method_16489();
         RenderSystem.method_16463(5888);
      });
      this.field_39131 = var1;
      this.field_39132 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_7716 var4 = (class_7716)var1;
         return Float.compare(var4.field_39131, this.field_39131) == 0 && Float.compare(var4.field_39132, this.field_39132) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return class_5129.method_23519(this.field_39131, this.field_39132);
   }
}
