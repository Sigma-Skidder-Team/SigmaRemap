package remapped;

public class class_954<T> {
   private static String[] field_4912;
   private final class_6910 field_4911;
   private final T field_4913;

   public class_954(class_6910 var1, T var2) {
      this.field_4911 = var1;
      this.field_4913 = (T)var2;
   }

   public class_6910 method_4204() {
      return this.field_4911;
   }

   public T method_4203() {
      return this.field_4913;
   }

   public static <T> class_954<T> method_4205(T var0) {
      return new class_954<T>(class_6910.field_35520, (T)var0);
   }

   public static <T> class_954<T> method_4206(T var0) {
      return new class_954<T>(class_6910.field_35518, (T)var0);
   }

   public static <T> class_954<T> method_4207(T var0) {
      return new class_954<T>(class_6910.field_35521, (T)var0);
   }

   public static <T> class_954<T> method_4202(T var0) {
      return new class_954<T>(class_6910.field_35517, (T)var0);
   }

   public static <T> class_954<T> method_4208(T var0, boolean var1) {
      return !var1 ? method_4206((T)var0) : method_4205((T)var0);
   }
}
