package remapped;

public class class_9659<T> {
   private static String[] field_49197;
   private final class_7821<T> field_49198;
   private T field_49199;
   private boolean field_49200;

   public class_9659(class_7821<T> var1, T var2) {
      this.field_49198 = var1;
      this.field_49199 = (T)var2;
      this.field_49200 = true;
   }

   public class_7821<T> method_44582() {
      return this.field_49198;
   }

   public void method_44588(T var1) {
      this.field_49199 = (T)var1;
   }

   public T method_44585() {
      return this.field_49199;
   }

   public boolean method_44587() {
      return this.field_49200;
   }

   public void method_44581(boolean var1) {
      this.field_49200 = var1;
   }

   public class_9659<T> method_44583() {
      return new class_9659<T>(this.field_49198, this.field_49198.method_35421().method_7709(this.field_49199));
   }
}
