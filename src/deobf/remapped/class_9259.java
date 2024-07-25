package remapped;

public class class_9259 implements Comparable<class_9259> {
   private static String[] field_47247;
   private final int field_47248;
   private final class_1331 field_47249;
   private int field_47251;
   private int field_47250;

   public class_9259(int var1, class_1331 var2) {
      this.field_47248 = var1;
      this.field_47249 = var2;
   }

   public class_1331 method_42661() {
      return this.field_47249;
   }

   public void method_42659(int var1) {
      if (var1 > 10) {
         var1 = 10;
      }

      this.field_47251 = var1;
   }

   public int method_42656() {
      return this.field_47251;
   }

   public void method_42657(int var1) {
      this.field_47250 = var1;
   }

   public int method_42660() {
      return this.field_47250;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_9259 var4 = (class_9259)var1;
            return this.field_47248 == var4.field_47248;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.field_47248);
   }

   public int compareTo(class_9259 var1) {
      return this.field_47251 == var1.field_47251 ? Integer.compare(this.field_47248, var1.field_47248) : Integer.compare(this.field_47251, var1.field_47251);
   }
}
