package remapped;

public class class_8385 extends class_5348 {
   private final String field_42900;
   private final int field_42899;

   public class_8385(String var1, int var2) {
      super("depth_test", () -> {
         if (var2 != 519) {
            RenderSystem.enableDepthTest();
            RenderSystem.method_16457(var2);
         }
      }, () -> {
         if (var2 != 519) {
            RenderSystem.method_16491();
            RenderSystem.method_16457(515);
         }
      });
      this.field_42900 = var1;
      this.field_42899 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_8385 var4 = (class_8385)var1;
            return this.field_42899 == var4.field_42899;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.field_42899);
   }

   @Override
   public String toString() {
      return this.field_27283 + '[' + this.field_42900 + ']';
   }
}
