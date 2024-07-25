package remapped;

public final class class_6279 {
   private static String[] field_32091;
   private final class_8107 field_32092;
   private final class_6555 field_32090;

   private class_6279(class_8107 var1, class_6555 var2) {
      this.field_32092 = var1;
      this.field_32090 = var2;
   }

   public class_8107 method_28620() {
      return this.field_32092;
   }

   public class_6555 method_28618() {
      return this.field_32090;
   }

   @Override
   public String toString() {
      return this.field_32092.toString() + this.field_32090.toString();
   }
}
