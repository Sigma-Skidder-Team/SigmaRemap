package remapped;

public class class_5950 {
   public static class_1299 field_30338 = class_3980.method_18363();
   private Runnable field_30339;
   private int field_30336 = -1;

   public class_5950(Runnable var1) {
      this.field_30339 = var1;
      this.method_27195();
   }

   private void method_27195() {
      if (this.field_30336 != -1) {
         throw new RuntimeException("Attempt to build the display list more than once in CachedRender");
      } else {
         this.field_30336 = field_30338.method_5915(1);
         class_3390.method_15660();
         field_30338.method_5928(this.field_30336, 4864);
         this.field_30339.run();
         field_30338.method_5930();
         class_3390.method_15663();
      }
   }

   public void method_27194() {
      if (this.field_30336 != -1) {
         class_3390.method_15660();
         field_30338.method_5936(this.field_30336);
         class_3390.method_15663();
      } else {
         throw new RuntimeException("Attempt to render cached operations that have been destroyed");
      }
   }

   public void method_27193() {
      field_30338.method_5907(this.field_30336, 1);
      this.field_30336 = -1;
   }
}
