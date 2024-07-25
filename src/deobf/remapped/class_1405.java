package remapped;

public class class_1405<T extends Throwable> {
   private static String[] field_7638;
   private T field_7639;

   public void method_6485(T var1) {
      if (this.field_7639 != null) {
         this.field_7639.addSuppressed(var1);
      } else {
         this.field_7639 = (T)var1;
      }
   }

   public void method_6483() throws T {
      if (this.field_7639 != null) {
         throw this.field_7639;
      }
   }
}
