package remapped;

public abstract class class_2255<T extends class_3757> {
   public final class_3569 field_11222;
   private class_133 field_11223 = null;
   private class_4639 field_11224 = null;

   public class_2255(class_3569 var1) {
      this.field_11222 = var1;
   }

   public abstract void method_10364(T var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6);

   public boolean method_10369(T var1) {
      return false;
   }

   public class_222<class_6629, class_133> method_10365() {
      return this.field_11223 != null ? class_222.method_941(this.field_11223) : null;
   }

   public void method_10370(class_222<class_6629, class_133> var1) {
      this.field_11223 = (class_133)var1.method_942().get();
   }

   public class_4639 method_10368() {
      return this.field_11224;
   }

   public void method_10367(class_4639 var1) {
      this.field_11224 = var1;
   }
}
